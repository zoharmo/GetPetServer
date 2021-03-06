package KNN;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeSet;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.MultimapBuilder;
import com.google.common.collect.TreeMultimap;

import crud.Adoptions;
import crud.Dogs;
import entities.Adoption;
import entities.Dog;
import entities.DogAdopter;
import entities.User;
import enums.DogBreeds;


public class Knn {
	public static int K_BREED = 3;
	public static int MIN_DOGS = 5;
	
	public static Multimap <Double, DogBreeds> calcDatasetDistance(DogAdopter da) throws Exception{
		ArrayList<Integer> features = da.convertFeaturesToBinaryArray();
		ArrayList<Adoption> dataset = Adoptions.getDataSet();
		ListMultimap<Double, DogBreeds> knnResults = MultimapBuilder.treeKeys().arrayListValues().build();

		Double distance = (double) 0;
		for (Adoption adoption : dataset) {
			for (int i =0; i< features.size(); i++) {
				distance += Utils.HammingDistance(features.get(i).intValue(), adoption.getAdopterDetailsBytes().get(i).intValue());
			}
			
			knnResults.put(distance, adoption.getAdoptionDogBreed());
			System.out.println("distance "+ distance + " for breed "+ adoption.getAdoptionDogBreed() );	
			distance = 0.0;
		}
		
		return   knnResults;
	}
	
	public static ArrayList<Dog> run(User user) throws Exception {
		System.out.println("run knn for user: " + user.getUserName());
		Multimap <Double, DogBreeds> knnDistance = calcDatasetDistance(user.getAdoptionDetails());
		HashMap<String, Dog> matchDogs = new HashMap<String, Dog>();
		ArrayList<Dog> dogsByBreed = new ArrayList<Dog>();
		int k_counter = 0;

		for(Map.Entry<Double,DogBreeds> nearest : knnDistance.entries()) {
		    DogBreeds breed = nearest.getValue();
		    dogsByBreed = Dogs.getDogByBreedAndArea(breed, user.getAdoptionDetails().getArea());
		    System.out.println("first round, Knn distance from " + breed + " is " + nearest.getKey() + ", match dogs: " + dogsByBreed.size());
		    if(dogsByBreed.size() > 0 ){
		    	k_counter++;
		    	for (Dog dog : dogsByBreed) {
					matchDogs.put(dog.getId(), dog);
				}
		    }
		    if ((k_counter == K_BREED) || (matchDogs.size() >= MIN_DOGS)){
		    	break;
		    }
		}
		
		if ((matchDogs.size() < MIN_DOGS ) && (k_counter >= K_BREED)){
			for(Map.Entry<Double,DogBreeds> nearest : knnDistance.entries()) {
			    DogBreeds breed = nearest.getValue();
			    dogsByBreed = Dogs.getDogByBreed(breed);
			    System.out.println("seconde round, Knn distance from " + breed + " is " + nearest.getKey() + ", match dogs: " + dogsByBreed.size());
			    if(dogsByBreed.size() > 0 ){
			    	k_counter++;
			    	for (Dog dog : dogsByBreed) {
			    		if (!matchDogs.containsKey(dog.getId())) {
			    			matchDogs.put(dog.getId(), dog);
			    		}
					}	
			    }
			    
			    if ((k_counter == K_BREED) || (matchDogs.size() >= MIN_DOGS)){
			    	break;
			    }
			}
		}
		
		return new ArrayList<Dog>(matchDogs.values());	
	}
}
