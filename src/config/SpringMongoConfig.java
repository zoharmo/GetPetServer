package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import com.mongodb.MongoClient;

public class SpringMongoConfig {
	private boolean DB_SERVER_LOCAL = true;
	public @Bean
	MongoDbFactory mongoDbFactory() throws Exception {
		if (DB_SERVER_LOCAL){
			return new SimpleMongoDbFactory(new MongoClient(), "getpetdb");
		}
		else{
			return new SimpleMongoDbFactory(new MongoClient("mongodb://193.106.55.72:27017/"), "project72db");

		}
	}

	public @Bean
	MongoTemplate mongoTemplate() throws Exception {
		
		MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory());
				
		return mongoTemplate;
		
	}	

}