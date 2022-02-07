package com.hacom.api.examen.rest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.hacom.api.examen.dto.TraceMsgDto;
import com.hacom.api.examen.dto.TraceMsgRequest;
import com.hacom.api.examen.input.DateRangeRequest;
import com.hacom.api.examen.output.WrapperResponse;
import com.hacom.api.examen.service.TraceMsgService;
import com.hacom.api.examen.util.UtilEnum.STATUS_OPERATION;
import com.hacom.api.examen.config.MetricsPrometheus;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;



@RestController
@RequestMapping("trace")
public class InicioController {
	
	private static final Logger logger = LogManager.getLogger(InicioController.class);

	
	@Autowired
	private TraceMsgService traceMsgService;
	
	@Autowired
	private  MetricsPrometheus metricsPrometheus;
	
	
	@PostMapping()
	public  Mono<WrapperResponse<TraceMsgDto>>  save(@RequestBody TraceMsgRequest traceMsg) {
		logger.info("POST REQUEST {}",traceMsg);
		metricsPrometheus.addCountRequest();
		return traceMsgService.saveTrace(traceMsg).map(g ->{ 
			
			return new WrapperResponse<TraceMsgDto>(STATUS_OPERATION.SUCCESS.getStatus(),STATUS_OPERATION.SUCCESS.getMessage(), g);
		});
		
	}
	
	
	@GetMapping
	public  Flux<TraceMsgDto>  search(@RequestBody DateRangeRequest rangeRequest) {
		logger.info("GET REQUEST {}",rangeRequest);
		
		return traceMsgService.searchDateRange(rangeRequest);
	}
	

}
