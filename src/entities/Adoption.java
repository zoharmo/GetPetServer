package entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import enums.DogBreeds;
@Document(collection = "dataset")
public class Adoption {
	@Id
	private String id;
	private DogAdopter adopterDetails;
	private DogBreeds adoptionDogBreed;
	
	public Adoption() {
		super();
	}
	public Adoption(DogAdopter adoptionDetails, DogBreeds breed){
		this.adopterDetails = adoptionDetails;
		this.adoptionDogBreed = breed;
	}
	
	public String getId() {
		return id;
	}

	public DogAdopter getAdopterDetails() {
		return adopterDetails;
	}
	public void setAdopterDetails(DogAdopter adopterDetails) {
		this.adopterDetails = adopterDetails;
	}
	public DogBreeds getAdoptionDogBreed() {
		return adoptionDogBreed;
	}
	public void setAdoptionDogBreed(DogBreeds adoptionDogBreed) {
		this.adoptionDogBreed = adoptionDogBreed;
	}
}
