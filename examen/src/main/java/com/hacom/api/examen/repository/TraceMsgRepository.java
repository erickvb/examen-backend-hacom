package com.hacom.api.examen.repository;


import java.time.OffsetDateTime;
import java.util.Date;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import com.hacom.api.examen.entity.TraceMsg;

import reactor.core.publisher.Flux;


@Repository
public interface TraceMsgRepository extends  ReactiveMongoRepository<TraceMsg, String> {
	
	Flux<TraceMsg>  findByTsBetween(Date from, Date to);

}
