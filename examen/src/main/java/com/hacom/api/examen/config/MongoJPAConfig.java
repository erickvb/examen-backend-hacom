package com.hacom.api.examen.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractReactiveMongoConfiguration;

//@Configuration
public class MongoJPAConfig extends AbstractReactiveMongoConfiguration  {

	@Autowired
	private ConfigProperties configProp;
	@Override
	protected String getDatabaseName() {
		System.out.println("Nombre db:"+ configProp.getMongodbDatabase());
		return configProp.getMongodbDatabase();
	}

	

}
