// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.darkhorse.getsporty.dao.event;

import com.darkhorse.getsporty.dao.event.EventDao;
import com.darkhorse.getsporty.domain.Event;
import java.math.BigInteger;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

privileged aspect EventDao_Roo_Mongo_Repository {
    
    declare parents: EventDao extends PagingAndSortingRepository<Event, BigInteger>;
    
    declare @type: EventDao: @Repository;
    
}
