package KNN;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.TreeMultimap;

import crud.Adoptions;
import entities.Adoption;
import entities.Dog;
import entities.DogAdopter;
import entities.User;
import enums.DogBreeds;

public class Knn {

	public static Multimap <Double, DogBreeds> calcDatasetDistance(DogAdopter da) throws Exception{
		ArrayList<Integer> features = da.convertFeaturesToBinaryArray();
		ArrayList<Adoption> dataset = Adoptions.getDataSet();
		Multimap<Double, DogBreeds> knnResults = ArrayListMultimap.create();
		// Multimap<String, MyObj> multimap = 
			//      MultimapBuilder.treeKeys().linkedListValues().build();

		Double distance = (double) 0;
		for (Adoption adoption : dataset) {
			for (int i =0; i< features.size(); i++) {
				distance += HammingDistance(features.get(i).intValue(), adoption.getAdopterDetailsBytes().get(i).intValue());
			}
			
			knnResults.put(distance, adoption.getAdoptionDogBreed());
		System.out.println("distance "+ distance + " for breed "+ adoption.getAdoptionDogBreed() );	
		}
		
		return   knnResults;
	}
	
	public static int HammingDistance(int a, int b){
		int differntBytes = Integer.bitCount(a^b);
		//TODO: remove
		int tmp = a^b;
		System.out.println("the distance between "+ Integer.toBinaryString(a)+" and " + Integer.toBinaryString(b) +
				" is "+ Integer.toBinaryString(tmp) + " (" + differntBytes+")");
		return differntBytes;
	}
	
	public ArrayList<Dog> run(DogAdopter da) throws Exception {
		
		Multimap <Double, DogBreeds> knnDistance = calcDatasetDistance(da);
	//	SortedSet<String> keys = new TreeMultimap<String>(knnDistance.keySet());
		return null;
		
	}
	//

}
