// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.darkhorse.getsporty.svc.job;

import com.darkhorse.getsporty.dao.job.JobDao;
import com.darkhorse.getsporty.domain.Job;
import com.darkhorse.getsporty.svc.job.JobSvcImpl;
import java.math.BigInteger;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

privileged aspect JobSvcImpl_Roo_Service {
    
    declare @type: JobSvcImpl: @Service;
    
    declare @type: JobSvcImpl: @Transactional;
    
    @Autowired
    JobDao JobSvcImpl.jobDao;
    
    public long JobSvcImpl.countAllJobs() {
        return jobDao.count();
    }
    
    public void JobSvcImpl.deleteJob(Job job) {
        jobDao.delete(job);
    }
    
    public Job JobSvcImpl.findJob(BigInteger id) {
        return jobDao.findOne(id);
    }
    
    public List<Job> JobSvcImpl.findAllJobs() {
        return jobDao.findAll();
    }
    
    public List<Job> JobSvcImpl.findJobEntries(int firstResult, int maxResults) {
        return jobDao.findAll(new org.springframework.data.domain.PageRequest(firstResult / maxResults, maxResults)).getContent();
    }
    
    public void JobSvcImpl.saveJob(Job job) {
        jobDao.save(job);
    }
    
    public Job JobSvcImpl.updateJob(Job job) {
        return jobDao.save(job);
    }
    
}
