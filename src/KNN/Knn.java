package KNN;

import java.util.ArrayList;
import java.util.HashMap;

import crud.Adoptions;
import entities.Adoption;
import entities.Dog;
import entities.DogAdopter;
import entities.User;
import enums.DogBreeds;

public class Knn {

	public static ArrayList<Dog> run(DogAdopter da) throws Exception{
		ArrayList<Integer> features = da.convertFeaturesToBinaryArray();
		ArrayList<Adoption> dataset = Adoptions.getDataSet();
		HashMap <Double, DogBreeds> knnResults = new HashMap<>();
		Double distance = null;
		for (Adoption adoption : dataset) {
			for (int i =0; i< features.size(); i++) {
				distance += HammingDistance(features.get(i), adoption.getAdopterDetailsBytes().get(i));
			}
			
			knnResults.put(distance, adoption.getAdoptionDogBreed());
		}
		
		
		return new  ArrayList<Dog>();
	}
	
	public static int HammingDistance(int a, int b){
		int differntBytes = Integer.bitCount(a^b);
		//TODO: remove
		int tmp = a^b;
		System.out.println("the distance between "+ Integer.toBinaryString(a)+" and " + Integer.toBinaryString(b) +
				" is "+ Integer.toBinaryString(tmp) + " (" + differntBytes+")");
		return differntBytes;
	}
}
