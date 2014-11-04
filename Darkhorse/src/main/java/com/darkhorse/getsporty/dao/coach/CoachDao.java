package com.darkhorse.getsporty.dao.coach;

import com.darkhorse.getsporty.domain.Coach;
import java.util.List;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoRepository;

@RooMongoRepository(domainType = Coach.class)
public interface CoachDao {

    List<com.darkhorse.getsporty.domain.Coach> findAll();
}
