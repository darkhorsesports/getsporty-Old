// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.darkhorse.getsporty.svc;

import com.darkhorse.getsporty.domain.User;
import com.darkhorse.getsporty.svc.UserSvc;
import java.math.BigInteger;
import java.util.List;

privileged aspect UserSvc_Roo_Service {
    
    public abstract long UserSvc.countAllUsers();    
    public abstract void UserSvc.deleteUser(User user);    
    public abstract User UserSvc.findUser(BigInteger id);    
    public abstract List<User> UserSvc.findAllUsers();    
    public abstract List<User> UserSvc.findUserEntries(int firstResult, int maxResults);    
    public abstract void UserSvc.saveUser(User user);    
    public abstract User UserSvc.updateUser(User user);    
}
