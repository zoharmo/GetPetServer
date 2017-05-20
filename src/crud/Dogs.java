package crud;


import java.util.ArrayList;

import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import entities.Dog;
import enums.DogBreeds;

public class Dogs {

	public static void save(Dog dog) {
		mongoManger.mongoOperation.save(dog);
	}
	
	public static Dog getDogById(String id) {
		Query query = new Query(Criteria.where("id").is(id));
		return(mongoManger.mongoOperation.findOne(query, Dog.class));
	}
	public static ArrayList<Dog> getDogByBreedArray(ArrayList<DogBreeds> breed) {
		Query query = new Query(Criteria.where("breed").in(breed));
		return((ArrayList<Dog>) mongoManger.mongoOperation.find(query, Dog.class));
	}
	
	public static ArrayList<Dog> getDogByBreed(DogBreeds breed) {
		Query query = new Query(Criteria.where("breed").in(breed));
		return((ArrayList<Dog>) mongoManger.mongoOperation.find(query, Dog.class));	
	}
	
	public static void remove(Dog dog){
		mongoManger.mongoOperation.remove(dog);
	}
}
