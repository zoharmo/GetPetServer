package crud;

import java.util.ArrayList;

import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import entities.Adoption;
import entities.Dog;

public class Adoptions {
	public static void save(Adoption adoption) {
		mongoManager.mongoOperation.save(adoption);
	}
	
	public static Adoption getAdoptionById(String id) {
		Query query = new Query(Criteria.where("id").is(id));
		return(mongoManager.mongoOperation.findOne(query, Adoption.class));
	}
	
	public static Adoption getAdoptionByUserName(String UserName){
		Query query = new Query(Criteria.where("user.userName").is(UserName));
		return(mongoManager.mongoOperation.findOne(query, Adoption.class));
	}
	
	public static void removeByUserName(String UserName){
		Query query = new Query(Criteria.where("user.userName").is(UserName));
		mongoManager.mongoOperation.remove(query, Adoption.class);
	}
	
	public static ArrayList<Adoption> getDataSet(){
		ArrayList<Adoption> dataset = (ArrayList<Adoption>) mongoManager.mongoOperation.findAll(Adoption.class);
		return dataset;
	}

}
