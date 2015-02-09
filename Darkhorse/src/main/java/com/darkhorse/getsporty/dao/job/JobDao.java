package com.darkhorse.getsporty.dao.job;
import com.darkhorse.getsporty.domain.Job;
import java.util.List;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoRepository;

@RooMongoRepository(domainType = Job.class)
public interface JobDao {

    List<Job> findAll();
}
