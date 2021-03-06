// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.darkhorse.getsporty.svc.player;

import com.darkhorse.getsporty.dao.player.PlayerDao;
import com.darkhorse.getsporty.domain.Player;
import com.darkhorse.getsporty.svc.player.PlayerSvcImpl;
import java.math.BigInteger;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

privileged aspect PlayerSvcImpl_Roo_Service {
    
    declare @type: PlayerSvcImpl: @Service;
    
    declare @type: PlayerSvcImpl: @Transactional;
    
    @Autowired
    PlayerDao PlayerSvcImpl.playerDao;
    
    public long PlayerSvcImpl.countAllPlayers() {
        return playerDao.count();
    }
    
    public void PlayerSvcImpl.deletePlayer(Player player) {
        playerDao.delete(player);
    }
    
    public Player PlayerSvcImpl.findPlayer(BigInteger id) {
        return playerDao.findOne(id);
    }
    
    public List<Player> PlayerSvcImpl.findAllPlayers() {
        return playerDao.findAll();
    }
    
    public List<Player> PlayerSvcImpl.findPlayerEntries(int firstResult, int maxResults) {
        return playerDao.findAll(new org.springframework.data.domain.PageRequest(firstResult / maxResults, maxResults)).getContent();
    }
    
    public void PlayerSvcImpl.savePlayer(Player player) {
        playerDao.save(player);
    }
    
    public Player PlayerSvcImpl.updatePlayer(Player player) {
        return playerDao.save(player);
    }
    
}
