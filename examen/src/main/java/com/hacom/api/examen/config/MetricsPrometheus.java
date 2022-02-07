package com.hacom.api.examen.config;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;

@Component
public class MetricsPrometheus {
	private static final Logger logger = LogManager.getLogger(MetricsPrometheus.class);
	  private final Counter testCounter;

	  public MetricsPrometheus(MeterRegistry meterRegistry) {
	    
	   
	    testCounter = meterRegistry.counter("hacom.test.developer.insert.rx");
	  }
	  
	  public void addCountRequest() {
		  logger.info("ADD COUNTER");
		  testCounter.increment();
	  }
}
