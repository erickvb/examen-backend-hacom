package com.hacom.api.examen.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.mongodb.config.AbstractReactiveMongoConfiguration;
import org.springframework.data.mongodb.core.convert.MongoCustomConversions;

import com.hacom.api.examen.converter.OffsetDateTimeReadConverter;
import com.hacom.api.examen.converter.OffsetDateTimeWriteConverter;
import com.mongodb.reactivestreams.client.MongoClient;
import com.mongodb.reactivestreams.client.MongoClients;

@Configuration
public class MongoReactiveConfig  extends AbstractReactiveMongoConfiguration {
	
	private final List<Converter<?, ?>> converters = new ArrayList<Converter<?, ?>>();
	
	@Autowired
	private ConfigProperties configProp;
	 @Bean
	 public MongoClient mongoClient() {
	    return MongoClients.create(configProp.getMongodbUri());
	}
	 
	@Override
	protected String getDatabaseName() {
		System.out.println("Nombre db:"+ configProp.getMongodbDatabase());
		return configProp.getMongodbDatabase();
	}
	
	 @Override
	 public MongoCustomConversions customConversions() {
	     converters.add(new OffsetDateTimeReadConverter());
	     converters.add(new OffsetDateTimeWriteConverter());
	     return new MongoCustomConversions(converters);
	 }

}
