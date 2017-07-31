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
	

	public static void removeByDogBreed(String dogBreed){
		Query query = new Query(Criteria.where("adoptionDogBreed").is(dogBreed));
		mongoManager.mongoOperation.remove(query, Adoption.class);

	}
	public static Adoption selectByDogBreed(String dogBreed){
		Query query = new Query(Criteria.where("adoptionDogBreed").is(dogBreed));
		return mongoManager.mongoOperation.findOne(query, Adoption.class);

	}
	public static ArrayList<Adoption> getDataSet(){
		ArrayList<Adoption> dataset = (ArrayList<Adoption>) mongoManager.mongoOperation.findAll(Adoption.class);
		return dataset;
	}

}
