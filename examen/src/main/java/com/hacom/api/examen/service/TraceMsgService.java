package com.hacom.api.examen.service;

import com.hacom.api.examen.dto.TraceMsgDto;
import com.hacom.api.examen.dto.TraceMsgRequest;
import com.hacom.api.examen.entity.TraceMsg;
import com.hacom.api.examen.input.DateRangeRequest;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface TraceMsgService {


	Mono<TraceMsgDto> saveTrace(TraceMsgRequest traceMsg);

	Flux<TraceMsgDto> searchDateRange(DateRangeRequest rangeRequest);

}
