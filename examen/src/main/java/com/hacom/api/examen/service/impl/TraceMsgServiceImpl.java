package com.hacom.api.examen.service.impl;

import java.time.OffsetDateTime;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hacom.api.examen.converter.OffsetDateTimeWriteConverter;
import com.hacom.api.examen.converter.TraceMsgConverter;
import com.hacom.api.examen.dto.TraceMsgDto;
import com.hacom.api.examen.dto.TraceMsgRequest;
import com.hacom.api.examen.entity.TraceMsg;
import com.hacom.api.examen.input.DateRangeRequest;
import com.hacom.api.examen.repository.TraceMsgRepository;
import com.hacom.api.examen.rest.InicioController;
import com.hacom.api.examen.service.TraceMsgService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class TraceMsgServiceImpl implements TraceMsgService{
	private static final Logger logger = LogManager.getLogger(InicioController.class);
	
	@Autowired
	private TraceMsgRepository  traceMsgRepository;
	

	@Override
	public Mono<TraceMsgDto> saveTrace(TraceMsgRequest traceMsg) {
		TraceMsgConverter  tmc = new TraceMsgConverter();
		TraceMsg  tmSave= tmc.toEntityFromRequest(traceMsg);
		OffsetDateTime offsetDateTime = OffsetDateTime.now();
		tmSave.setTs(offsetDateTime);
		logger.info("SAVDE DB : {} ",tmSave);
		Mono<TraceMsg> tmRs   =  traceMsgRepository.save(tmSave);
		return tmRs.map(g ->{ 
			logger.info("SAVDED traceMsg : {} ",g);
			return tmc.toDTO(g);
		});
		
	}

	@Override
	public Flux<TraceMsgDto> searchDateRange(DateRangeRequest rangeRequest) {
		OffsetDateTimeWriteConverter con = new OffsetDateTimeWriteConverter();
		TraceMsgConverter  tmc = new TraceMsgConverter();
		Flux<TraceMsg>  res = traceMsgRepository.findByTsBetween(con.convert(rangeRequest.getFrom()),con.convert(rangeRequest.getTo()));
		return res.map(g ->{ 
			return tmc.toDTO(g);
		});
		
	}

}
