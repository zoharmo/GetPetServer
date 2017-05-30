package config;

import java.awt.List;
import java.net.UnknownHostException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import com.mongodb.WriteConcern;

public class SpringMongoConfig extends AbstractMongoConfiguration{
	private boolean DB_SERVER_LOCAL = false;
	//@Value("${mongodb.dbname}")
	private String  dbName = "project72db";

	//@Value("${mongodb.host}")
	private String  host = "193.106.55.72";

//	@Value("${mongodb.port}")
	private Integer port = 27017;

	//@Value("${mongodb.username}")
	private String  userName = "project72";

	//@Value("${mongodb.password}")
	private String  password = "project3212";

	//@Value("${mongodb.authenticationdatabase}")
	private String  authenticationDatabase = "admin";

	@Override
	protected String getDatabaseName()  {
	    return this.dbName;
	}
	
	public @Bean
	MongoDbFactory mongoDbFactory() throws Exception {
			return new SimpleMongoDbFactory(new MongoClient(), "getpetdb");		
		}

	public @Bean
	MongoTemplate mongoTemplate() throws Exception {
		
		if(DB_SERVER_LOCAL){
			MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory());
			return mongoTemplate;
		}else{
			final MongoTemplate mongoTemplate = new MongoTemplate(mongo(), getDatabaseName());
	    	mongoTemplate.setWriteConcern(WriteConcern.SAFE);
	    	return mongoTemplate;
		}		
		
	}	

@Override
public MongoClient mongo() throws Exception {
    ArrayList<ServerAddress> serverAddresses = new ArrayList<ServerAddress>();
    ServerAddress address = new ServerAddress(host, port);
    serverAddresses.add(address);
    ArrayList<MongoCredential> credentials = new ArrayList<MongoCredential>();
    MongoCredential credential = MongoCredential.createScramSha1Credential(userName, dbName, password.toCharArray());
    credentials.add(credential);
    return new MongoClient(serverAddresses, credentials);
}

}