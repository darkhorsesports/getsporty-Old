// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.darkhorse.getsporty.dao.job;

import com.darkhorse.getsporty.dao.job.JobDao;
import com.darkhorse.getsporty.domain.Job;
import java.math.BigInteger;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

privileged aspect JobDao_Roo_Mongo_Repository {
    
    declare parents: JobDao extends PagingAndSortingRepository<Job, BigInteger>;
    
    declare @type: JobDao: @Repository;
    
}
