package com.darkhorse.getsporty.util;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.URL;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.UUID;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.bson.types.ObjectId;
import org.springframework.http.HttpHeaders;
import org.springframework.security.crypto.encrypt.Encryptors;
import org.springframework.security.crypto.encrypt.TextEncryptor;
import org.springframework.web.multipart.MultipartFile;

import flexjson.JSONSerializer;
import flexjson.transformer.CharacterTransformer;


public class Utils {

    private static final Pattern rfc2822 = Pattern.compile("^[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?$");

    private static final Pattern domainPattern = Pattern.compile("[a-z0-9\\-][a-z0-9\\-\\.]+[a-z0-9]");

    private static JSONSerializer serializer = null;

    public static String encrypt(String value) {
	if (encryptor == null)
	    encryptor = Encryptors.text("aswedfrg", "anchnjhu");

	return encryptor.encrypt(value);
    }

    public static String decrypt(String value) {
	if (encryptor == null)
	    encryptor = Encryptors.text("aswedfrg", "anchnjhu");
	return encryptor.decrypt(value);
    }

    public static TextEncryptor encryptor = null;

    public static boolean isEmpty(String str) {
	return (str == null || str.equals("") || str.trim().equals(""));
    }

    public static boolean isMobileValid(String mobile) {
	if (isEmpty(mobile))
	    return false;
	mobile = mobile.trim();

	if (mobile.startsWith("+")) {
	    if (mobile.length() != 13) {
		return false;
	    }
	} else if (mobile.startsWith("00")) {
	    if (mobile.length() != 14) {
		return false;
	    }
	} else if (mobile.startsWith("0")) {
	    if (mobile.length() != 11) {
		return false;
	    }
	} else if (mobile.length() != 10) {
	    return false;
	}

	for (int i = 0; i < mobile.length(); ++i) {
	    char c = mobile.charAt(i);
	    if (!Character.isDigit(c) && c != '+')
		return false;
	}

	return true;
    }

    public static boolean isEmailValid(String email) {
	if (isEmpty(email))
	    return false;
	email = email.trim();

	if (StringUtils.containsWhitespace(email))
	    return false;

	if (email.indexOf('@') <= 0 || email.indexOf('@') != email.lastIndexOf('@'))
	    return false;
	return true;
    }

    public static boolean isPinCodeValid(String pincode) {

	if (isEmpty(pincode))
	    return false;
	pincode = pincode.trim();

	if (StringUtils.containsWhitespace(pincode))
	    return false;

	for (int i = 0; i < pincode.length(); ++i) {
	    char c = pincode.charAt(i);
	    if (!Character.isDigit(c))
		return false;
	}

	return true;
    }

    public static String getRandomString(int length) {
	String str = UUID.randomUUID().toString();
	str.replaceAll("-", "");
	if (length <= 0 || length > str.length())
	    return str;
	return str.substring(0, length);
    }





    public static JSONSerializer getJSONSerializerWithType() {
	if (serializer == null) {
	    serializer = new JSONSerializer().transform(new CharacterTransformer(), BigInteger.class).exclude("passwd");
	}
	return serializer;
    }

    public static JSONSerializer getJSONSerializer() {
	if (serializer == null) {
	    serializer = new JSONSerializer().transform(new CharacterTransformer(), BigInteger.class).exclude(
		    "*.class", "passwd", "password");
	}
	return serializer;
    }



    public static void saveImageFile(MultipartFile image, String fileName, String location) {

	String fileUrl = location + fileName;
	FileOutputStream fos = null;
	InputStream fis = null;

	try {
	    File loc = new File(location);
	    if (!loc.exists()) {
		loc.mkdirs();
	    }
	    File imageFile = new File(fileUrl);
	    imageFile.createNewFile();
	    fos = new FileOutputStream(imageFile);
	    fis = image.getInputStream();
	    fos.write(image.getBytes());
	} catch (IOException e) {
	    e.printStackTrace();
	} finally {
	    try {
		fos.flush();
		fos.close();
		fis.close();
	    } catch (IOException ex) {
		ex.printStackTrace();
	    }
	}
    }

    public static String getFileExt(MultipartFile image) {
	String fileName = image.getOriginalFilename();
	int dotIdx = fileName.lastIndexOf(".");
	return dotIdx == -1 ? "" : fileName.substring(dotIdx);
    }

    public static String getImageLocation(HttpServletRequest request, String reldir) {

	return request.getSession().getServletContext().getRealPath("/") + reldir;

    }


    public static String getContextURL(HttpServletRequest req) {
	return req.getScheme() + "://" + req.getServerName() + (req.getServerPort() == 80 ? "" : ":" + req.getServerPort()) + (req.getContextPath() == null || req.getContextPath().equals(
		"") ? "" : req.getContextPath());
    }

    public static HttpHeaders getJsonHttpHeaders() {
	HttpHeaders headers = new HttpHeaders();
	headers.add("Content-Type", "application/json; charset=utf-8");
	return headers;
    }




    public static ObjectId getObjectId(BigInteger id) {
	return new ObjectId(id.toString(16));
    }

    public static String inputStreamToString(InputStream ins) {
	BufferedReader br = new BufferedReader(new InputStreamReader(ins));
	StringBuilder sb = new StringBuilder();
	String order = null;
	char[] charbuf = new char[10240];
	int n = 0;
	try {
	    while ((n = br.read(charbuf, 0, 10240)) != -1) {
		sb.append(charbuf, 0, n);
	    }
	    order = sb.toString();
	} catch (IOException e1) {
	    e1.printStackTrace();
	}
	return order;
    }

    public static String maskEmail(String email) {
	if (isEmailValid(email)) {
	    email = email.charAt(0) + "*******" + email.substring(email.indexOf('@'));
	} else {
	    email = "*******@****.com";
	}
	return email;
    }

    public static String maskPhone(String phone) {
	if (!isEmpty(phone)) {
	    if (phone.length() > 4) {
		phone = phone.substring(0, 4) + "XXXXX" + phone.charAt(phone.length() - 1);
	    }
	}
	return phone;
    }



    public static boolean isdomainValid(String domain) {
	if (Utils.isEmpty(domain) || !domainPattern.matcher(domain).matches()) {
	    return false;
	}
	return true;
    }



    public static String getCountryName(String countryCode) {

	Map<String, String> countryNameAndCodeMap = new HashMap<String, String>();
	Locale[] locales = Locale.getAvailableLocales();
	try {
	    for (Locale lc : locales) {
		if (lc.getISO3Country() != null && lc.getDisplayCountry() != null && lc != null) {
		    countryNameAndCodeMap.put(lc.getISO3Country(), lc.getDisplayCountry());
		}
	    }

	} catch (MissingResourceException e) {
	    // TODO: handle exception
	}
	String name = countryNameAndCodeMap.get(countryCode);
	return name;
    }

    public static void saveImageFromUrl(String imageUrl, String destinationFile) throws IOException {
	URL url = new URL(imageUrl);
	InputStream is = url.openStream();
	OutputStream os = new FileOutputStream(destinationFile);

	byte[] b = new byte[2048];
	int length;

	while ((length = is.read(b)) != -1) {
	    os.write(b, 0, length);
	}

	is.close();
	os.close();
    }

    public static String getFieldName(Method method) {
	try {
	    Class<?> clazz = method.getDeclaringClass();
	    BeanInfo info = Introspector.getBeanInfo(clazz);
	    PropertyDescriptor[] props = info.getPropertyDescriptors();
	    for (PropertyDescriptor pd : props) {
		if (method.equals(pd.getWriteMethod()) || method.equals(pd.getReadMethod())) {
		    System.out.println(pd.getDisplayName());
		    return pd.getName();
		}
	    }
	} catch (IntrospectionException e) {
	    e.printStackTrace();
	} catch (Exception e) {
	    e.printStackTrace();
	}

	return null;
    }

}
