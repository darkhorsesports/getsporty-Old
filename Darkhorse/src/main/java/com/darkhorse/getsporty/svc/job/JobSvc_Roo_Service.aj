// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.darkhorse.getsporty.svc.job;

import com.darkhorse.getsporty.domain.Job;
import com.darkhorse.getsporty.svc.job.JobSvc;
import java.math.BigInteger;
import java.util.List;

privileged aspect JobSvc_Roo_Service {
    
    public abstract long JobSvc.countAllJobs();    
    public abstract void JobSvc.deleteJob(Job job);    
    public abstract Job JobSvc.findJob(BigInteger id);    
    public abstract List<Job> JobSvc.findAllJobs();    
    public abstract List<Job> JobSvc.findJobEntries(int firstResult, int maxResults);    
    public abstract void JobSvc.saveJob(Job job);    
    public abstract Job JobSvc.updateJob(Job job);    
}
