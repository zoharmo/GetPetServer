
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import config.SpringMongoConfig;
import crud.Dogs;
import crud.Users;
import entities.Dog;
import entities.*;
import enums.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
public class testJSON {

	
	public static void main(String[] args) throws JsonProcessingException {
		
/*		System.out.println(new ObjectMapper().writeValueAsString(Animals.values()));
		System.out.println(new ObjectMapper().writeValueAsString(Area.values()));
		System.out.println(new ObjectMapper().writeValueAsString(CommunityType.values()));
		System.out.println(new ObjectMapper().writeValueAsString(DogCare.values()));
		System.out.println(new ObjectMapper().writeValueAsString(Gender.values()));
		System.out.println(new ObjectMapper().writeValueAsString(HouseType.values()));
		System.out.println(new ObjectMapper().writeValueAsString(Location.values()));
		System.out.println(new ObjectMapper().writeValueAsString(Availability.values()));
		System.out.println(new ObjectMapper().writeValueAsString(HealthStatus.values()));
		System.out.println(new ObjectMapper().writeValueAsString(FamilyType.values()));
		System.out.println(new ObjectMapper().writeValueAsString(Relation.values()));
		System.out.println(new ObjectMapper().writeValueAsString(Hobbies.values()));
		System.out.println(new ObjectMapper().writeValueAsString(Features.values()));
<<<<<<< HEAD
*/
			
	User u = new User();
	u.setUserName("mor");
	u.setPassword("123");
	Users.save(u);
	System.out.println(Users.getUserByUserName("mor"));
	}
}
