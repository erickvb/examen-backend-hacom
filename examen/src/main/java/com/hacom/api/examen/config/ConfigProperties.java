package com.hacom.api.examen.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.Setter;

@Configuration
@Setter
@Getter
@ConfigurationProperties() 
public class ConfigProperties {
	private String mongodbDatabase;
	private String mongodbUri;
	private String apiPort;

}
