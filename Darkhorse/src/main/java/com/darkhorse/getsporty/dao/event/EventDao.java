package com.darkhorse.getsporty.dao.event;
import com.darkhorse.getsporty.domain.Event;
import java.util.List;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoRepository;

@RooMongoRepository(domainType = Event.class)
public interface EventDao {

    List<Event> findAll();
}
