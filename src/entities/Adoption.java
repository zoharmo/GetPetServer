package entities;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import KNN.Utils;
import enums.DogBreeds;
@Document(collection = "dataset")
public class Adoption {

	@Id
	private String id;
	private ArrayList<Integer> adopterDetailsBytes;
	private double normalizeAge;
	private DogBreeds adoptionDogBreed;
	
	public Adoption() {
		super();
	}
	public Adoption( ArrayList<Integer> adopterDetailsBytes, DogBreeds breed, double normalizeAge){
		this.adopterDetailsBytes = adopterDetailsBytes;
		this.adoptionDogBreed = breed;
		this.normalizeAge = normalizeAge;
	}
	
	public Adoption( DogAdopter dogAdopt, DogBreeds breed) throws Exception{
		this.adopterDetailsBytes = dogAdopt.convertFeaturesToBinaryArray();
		this.adoptionDogBreed = breed;
		this.normalizeAge = Utils.normalize(dogAdopt.getAge());
		
	}
	
	public ArrayList<Integer> getAdopterDetailsBytes() {
		return adopterDetailsBytes;
	}
	public void setAdopterDetailsBytes(ArrayList<Integer> adopterDetailsBytes) {
		this.adopterDetailsBytes = adopterDetailsBytes;
	}
	public double getNormalizeAge() {
		return normalizeAge;
	}
	public void setNormalizeAge(double normalizeAge) {
		this.normalizeAge = normalizeAge;
	}
	public DogBreeds getAdoptionDogBreed() {
		return adoptionDogBreed;
	}
	public void setAdoptionDogBreed(DogBreeds adoptionDogBreed) {
		this.adoptionDogBreed = adoptionDogBreed;
	}	
}
