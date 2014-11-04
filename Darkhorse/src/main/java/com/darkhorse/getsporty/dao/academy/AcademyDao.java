package com.darkhorse.getsporty.dao.academy;

import com.darkhorse.getsporty.domain.Academy;
import java.util.List;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoRepository;

@RooMongoRepository(domainType = Academy.class)
public interface AcademyDao {

    List<com.darkhorse.getsporty.domain.Academy> findAll();
}
