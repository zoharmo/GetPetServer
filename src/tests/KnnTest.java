package tests;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.google.common.collect.Multimap;

import KNN.Knn;
import crud.Adoptions;
import entities.Adoption;
import entities.DogAdopter;
import enums.*;

public class KnnTest {
	@Test
	public void testKnnCalc() throws Exception {
		DogAdopter da1 = new DogAdopter(Gender.FEMALE, 16, FamilyStatus.MARRIED, 
				CommunityType.CITY, Area.CENTER,  HouseType.BIG_APARTMENT, DogCare.ME, 
				new Animals[] {Animals.CAT}, Location.BOTH, new Availability[] { Availability.EVENING},
				new HealthStatus[]{HealthStatus.ALLERGIC}, new FamilyType[] { FamilyType.BIG_CHILDREN, FamilyType.FRIENDLY,FamilyType.LOAD},
				new Relation[] {Relation.CARING_TO_PROPERTY, Relation.LANDSCAPED_GARDEN}, new Hobbies[] { Hobbies.SLEEPING},
				new Features[] {Features.AFRAID, Features.ATTENTION, Features.STUBBORN});
		
		DogAdopter da2 = new DogAdopter(Gender.MALE, 16, FamilyStatus.SINGLE, 
				CommunityType.CITY, Area.CENTER,  HouseType.BIG_APARTMENT, DogCare.ME, 
				new Animals[] {Animals.NON}, Location.BOTH, new Availability[] {Availability.MORNING},
				new HealthStatus[]{HealthStatus.ALLERGIC}, new FamilyType[] {  FamilyType.FRIENDLY,FamilyType.LOAD},
				new Relation[] { Relation.CLEANING}, new Hobbies[] { Hobbies.SPORT,Hobbies.SWIMMING, Hobbies.TRAVELING},
				new Features[] { Features.IGNORE,Features.NEGLECT, Features.STUBBORN});
		
		DogAdopter newUser = new DogAdopter(Gender.FEMALE, 16, FamilyStatus.MARRIED, 
				CommunityType.CITY, Area.CENTER,  HouseType.BIG_APARTMENT, DogCare.ME, 
				new Animals[] {Animals.CAT}, Location.BOTH, new Availability[] { Availability.EVENING, Availability.MORNING},
				new HealthStatus[]{HealthStatus.ALLERGIC}, new FamilyType[] {  FamilyType.FRIENDLY,FamilyType.LOAD},
				new Relation[] { Relation.LANDSCAPED_GARDEN}, new Hobbies[] { Hobbies.SLEEPING},
				new Features[] { Features.ATTENTION, Features.STUBBORN});	
		Adoption adop1 = new Adoption(da1, DogBreeds.test1);
		Adoption adop2 = new Adoption(da2, DogBreeds.test2);
		
		Adoptions.save(adop1);
		Adoptions.save(adop2);
		
		Multimap<Double, DogBreeds> result = Knn.calcDatasetDistance(newUser);
		for(Map.Entry<Double,DogBreeds> entry : result.entries()) {
		    double key = entry.getKey();
		    DogBreeds value = entry.getValue();
		    System.out.println("Knn distance from " + value + " is " + key);
		    
		}
		System.out.println("test1 should be smaller");
		Adoptions.removeByDogBreed(adop1.getAdoptionDogBreed().getEnglishName());
		Adoptions.removeByDogBreed(adop2.getAdoptionDogBreed().getEnglishName());

	}

}
