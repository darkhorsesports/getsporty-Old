package com.darkhorse.getsporty.dao.player;

import com.darkhorse.getsporty.domain.Player;
import java.util.List;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoRepository;

/**
 * @author sanjeev
 *
 */
@RooMongoRepository(domainType = Player.class)
public interface PlayerDao {

    List<com.darkhorse.getsporty.domain.Player> findAll();
}
