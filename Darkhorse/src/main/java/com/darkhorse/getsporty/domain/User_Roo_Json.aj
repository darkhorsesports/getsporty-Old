// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.darkhorse.getsporty.domain;

import com.darkhorse.getsporty.domain.User;
import flexjson.JSONDeserializer;
import flexjson.JSONSerializer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

privileged aspect User_Roo_Json {
    
    public String User.toJson() {
        return new JSONSerializer().exclude("*.class").serialize(this);
    }
    
    public static User User.fromJsonToUser(String json) {
        return new JSONDeserializer<User>().use(null, User.class).deserialize(json);
    }
    
    public static String User.toJsonArray(Collection<User> collection) {
        return new JSONSerializer().exclude("*.class").serialize(collection);
    }
    
    public static Collection<User> User.fromJsonArrayToUsers(String json) {
        return new JSONDeserializer<List<User>>().use(null, ArrayList.class).use("values", User.class).deserialize(json);
    }
    
}
