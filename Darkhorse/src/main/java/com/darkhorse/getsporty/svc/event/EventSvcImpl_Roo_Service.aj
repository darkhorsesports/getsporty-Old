// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.darkhorse.getsporty.svc.event;

import com.darkhorse.getsporty.dao.event.EventDao;
import com.darkhorse.getsporty.domain.Event;
import com.darkhorse.getsporty.svc.event.EventSvcImpl;
import java.math.BigInteger;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

privileged aspect EventSvcImpl_Roo_Service {
    
    declare @type: EventSvcImpl: @Service;
    
    declare @type: EventSvcImpl: @Transactional;
    
    @Autowired
    EventDao EventSvcImpl.eventDao;
    
    public long EventSvcImpl.countAllEvents() {
        return eventDao.count();
    }
    
    public void EventSvcImpl.deleteEvent(Event event) {
        eventDao.delete(event);
    }
    
    public Event EventSvcImpl.findEvent(BigInteger id) {
        return eventDao.findOne(id);
    }
    
    public List<Event> EventSvcImpl.findAllEvents() {
        return eventDao.findAll();
    }
    
    public List<Event> EventSvcImpl.findEventEntries(int firstResult, int maxResults) {
        return eventDao.findAll(new org.springframework.data.domain.PageRequest(firstResult / maxResults, maxResults)).getContent();
    }
    
    public void EventSvcImpl.saveEvent(Event event) {
        eventDao.save(event);
    }
    
    public Event EventSvcImpl.updateEvent(Event event) {
        return eventDao.save(event);
    }
    
}