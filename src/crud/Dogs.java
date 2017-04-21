package crud;


import java.util.ArrayList;

import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import entities.Dog;

public class Dogs {

	public static void saveDog(Dog dog) {
		mongoManger.mongoOperation.save(dog);
	}
	
	public static Dog getDogById(String id) {
		Query query = new Query(Criteria.where("id").is(id));
		return(mongoManger.mongoOperation.findOne(query, Dog.class));
	}
	public static ArrayList<Dog> getDogByBreedArray(ArrayList<String> breed) {
		Query query = new Query(Criteria.where("breed").in(breed));
		return((ArrayList<Dog>) mongoManger.mongoOperation.find(query, Dog.class));
	}
	
	public static ArrayList<Dog> getDogByBreed(String breed) {
		ArrayList<String> s = new ArrayList<>();
		s.add("1");
		s.add("2");
		Query query = new Query(Criteria.where("breed").regex("1"));
	
		return((ArrayList<Dog>) mongoManger.mongoOperation.find(query, Dog.class));
	}

}
