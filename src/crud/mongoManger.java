package crud;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;

import config.SpringMongoConfig;

public class mongoManger {
	public static ApplicationContext ctx =
            new AnnotationConfigApplicationContext(SpringMongoConfig.class);
	public static MongoOperations mongoOperation = (MongoOperations) ctx.getBean("mongoTemplate");

}
