<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<spring:url value="/users/changePassword" var="chgpass"/>
<spring:url value="/users/showPaymentLog" var="spl"></spring:url>
<spring:url value="/users/usageLog" var="usageLog"/>
<section class="large-12">
<div class="container">
<div class="">
	<form:form commandName="player" name="player" id="player" class="form-horizontal">
	 <form:hidden path="id" />
	 
	 <div class="col-sm-4">
	 <label>Name</label>
	 <input type="text" name="name">
	 </div>

	 <div class="col-sm-5">
	 <label>Email</label>
	 <input type="text" name="email">
	 </div>
	
	 <div class="col-sm-4">
	 <label>Password</label>
	 <input type="text" name="password">
	 </div>
	
	
	 <div class="col-sm-5">
	 <label>Level</label>
		<form:select path="playerLevel">
		<form:option value="Bigner">Bigner</form:option>
		<form:option value="Intermediate">Intermediate</form:option>
		<form:option value="Professionl">Professionl</form:option>
		</form:select>	 
	 </div>


	 <div class="col-sm-4">
	 <label>About</label>
	 <form:textarea path="about"/>
	 </div>
	 
	 <div class="col-sm-5">
	 <label>Address</label>
	 <form:textarea path="contact.area"/>
	 </div>
	 
	 <div class="col-sm-4">
	 <label>City</label>
	 <form:input path="contact.city"/>
	 </div>
	 
	 <div class="col-sm-5">
	 <label>State</label>
	 <form:input path="contact.state"/>
	 </div>
	 
	 <div class="col-sm-4">
	 <label>Pincode</label>
	 <form:input path="contact.pincode"/>
	 </div>

	 <div class="col-sm-5">
	 <label>Mobile No.</label>
	 <form:input path="contact.mobileNo"/>
	 </div>

	 <div class="col-sm-4">
	 <label>Career Heighlights</label>
	 <form:textarea path="careerHeighlights"/>
	 </div>
	 
	 <div class="col-sm-5">
	 <label>Profile Links</label>
	 <form:textarea path="profileLinks"/>
	 </div>
	 
	 <div class="col-sm-4">
	 <label>Hobbies and Intrest</label>
	 <form:textarea path="profileLinks"/>
	 </div>
	 
<%-- 	 <div class="col-sm-5">
	 <label>DOB</label>
	 <form:input path="DOB" class="datepicker" placeholder="dd M yyyy"/>
	 </div>
 --%>	 
	 <div class="col-sm-4">	
	 <label>Enable</label>
	 <input type="checkbox" checked="checked" name="checkbox"/>
	 </div>
	 
	 <div class="col-sm-5">
	 <label></label>
	 <input type="submit" value="save">
	 </div>
	 
	 
	 </form:form>
</div>
</div>
</section>
