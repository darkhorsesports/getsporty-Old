package com.darkhorse.getsporty.dao;

import com.darkhorse.getsporty.domain.User;
import java.util.List;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoRepository;

/**
 * @author sanjeev
 *
 */
@RooMongoRepository(domainType = User.class)
public interface UserDao {

    List<com.darkhorse.getsporty.domain.User> findAll();
}
