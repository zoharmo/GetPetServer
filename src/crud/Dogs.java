package crud;


import java.util.ArrayList;

import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import entities.Dog;
import enums.DogBreeds;
public class Dogs {

	public static void save(Dog dog) {
		mongoManager.mongoOperation.save(dog);
	}
	
	public static Dog getDogById(String id) {
		Query query = new Query(Criteria.where("id").is(id));
		return(mongoManager.mongoOperation.findOne(query, Dog.class));
	}
	public static ArrayList<Dog> getDogByBreedArray(ArrayList<DogBreeds> breed) {
		Query query = new Query(Criteria.where("breed").in(breed));
		return((ArrayList<Dog>) mongoManager.mongoOperation.find(query, Dog.class));
	}
	
	public static ArrayList<Dog> getDogByBreed(DogBreeds breed) {
		Query query = new Query(Criteria.where("breed").in(breed));
		return((ArrayList<Dog>) mongoManager.mongoOperation.find(query, Dog.class));	
	}
	
	public static void remove(Dog dog){
		mongoManager.mongoOperation.remove(dog);
	}
	public static void removeByDogName(String name){
		Query query = new Query(Criteria.where("name").is(name));
		mongoManager.mongoOperation.remove(query, Dog.class);
	}
	
	public static Dog getDogByName(String name) {
		Query query = new Query(Criteria.where("name").is(name));
		return(mongoManager.mongoOperation.findOne(query, Dog.class));	
	}
}
