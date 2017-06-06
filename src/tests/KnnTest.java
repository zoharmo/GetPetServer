package tests;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.Multimap;

import KNN.Knn;
import KNN.Utils;
import crud.Adoptions;
import crud.Dogs;
import entities.Adoption;
import entities.Dog;
import entities.DogAdopter;
import entities.User;
import enums.*;
import junit.framework.Assert;

public class KnnTest {
	private ObjectMapper objectMapper = new ObjectMapper();

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
		Adoption adop1 = new Adoption(da1, DogBreeds.Pomeranian);
		Adoption adop2 = new Adoption(da2, DogBreeds.Pekingese);
		
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
	@Test
	public void testKnnRun() throws Exception {
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
				CommunityType.CITY, Area.NORTH,  HouseType.BIG_APARTMENT, DogCare.ME, 
				new Animals[] {Animals.CAT}, Location.BOTH, new Availability[] { Availability.EVENING, Availability.MORNING},
				new HealthStatus[]{HealthStatus.ALLERGIC}, new FamilyType[] {  FamilyType.FRIENDLY,FamilyType.LOAD},
				new Relation[] { Relation.LANDSCAPED_GARDEN}, new Hobbies[] { Hobbies.SLEEPING},
				new Features[] { Features.ATTENTION, Features.STUBBORN});	
		Adoption adop1 = new Adoption(da1, DogBreeds.Pomeranian);
		Adoption adop2 = new Adoption(da2, DogBreeds.Pekingese);
		
		Adoptions.save(adop1);
		Adoptions.save(adop2);
		
		Dog d1 =	TestUtils.createDogForTest("dogTest1", DogBreeds.Affenpinscher, Area.NORTH);
		Dog d2 =	TestUtils.createDogForTest("dogTest2", DogBreeds.Pomeranian, Area.SOUTH);
		Dog d3 =	TestUtils.createDogForTest("dogTest3", DogBreeds.Pekingese, Area.NORTH);

		Dogs.save(d1);
		Dogs.save(d2);
		Dogs.save(d3);

		User user = TestUtils.createUserForTest();
		user.setAdoptionDetails(newUser);
		ArrayList<Dog> dogslist = Knn.run(user);
		
		System.out.println(objectMapper.writeValueAsString(dogslist));
		assertEquals(1, dogslist.size());
		Adoptions.removeByDogBreed(adop1.getAdoptionDogBreed().getEnglishName());
		Adoptions.removeByDogBreed(adop2.getAdoptionDogBreed().getEnglishName());

		Dogs.removeByDogName(d1.getName());
		Dogs.removeByDogName(d2.getName());
		Dogs.removeByDogName(d3.getName());

	}

}
