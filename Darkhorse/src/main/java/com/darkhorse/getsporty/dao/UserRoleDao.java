package com.darkhorse.getsporty.dao;

import com.darkhorse.getsporty.domain.UserRole;
import java.util.List;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoRepository;

@RooMongoRepository(domainType = UserRole.class)
public interface UserRoleDao {

    List<com.darkhorse.getsporty.domain.UserRole> findAll();
}
