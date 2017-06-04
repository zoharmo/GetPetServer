package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;

import javax.validation.constraints.AssertTrue;

import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import crud.Adoptions;
import crud.Dogs;
import crud.Users;
import entities.Adoption;
import entities.Dog;
import entities.User;

public class DogServicesTest {
	private ObjectMapper objectMapper = new ObjectMapper();
	private Gson gson = new Gson();	

	/**
	 * Test 1
	 */
	@Test
	public void testAddDogForAdoption() {
		String url = "http://localhost:8080/GetPet/getPetServer/DogServices/addDogForAdoption";
		Dog dog = TestUtils.createDogForTest("фе");
		String response = null;
		try {
			System.out.println("addDogForAdoption Test. input: " + gson.toJson(dog));
			response = TestUtils.createRequest(url, gson.toJson(dog));
		} catch (Exception e) {
			fail(e.getMessage());	
			response = e.getMessage();
		}
		System.out.println(response);

		Dog d = Dogs.getDogByName("фе");
		assertEquals(response ,"OK");
		assertTrue(d != null);
		try {
			Dogs.removeByDogName(dog.getName());
		} catch (Exception e) {
			System.out.println(e.getMessage());	
		}
	}
	/**
	 * Test 2
	 */
	@Test
	public void testlikedDogs() {
		String url = "http://localhost:8080/GetPet/getPetServer/DogServices/likedDogs";
		
		ArrayList<Dog> likedDogs = new ArrayList<>();

		String response = null;
		User savedUser = null;
		Dog dog1 = null;
		Dog dog2 = null;
		try {
			User user = TestUtils.createUserForTest();
			dog1 = TestUtils.createDogForTest("Dog1");
			dog2 = TestUtils.createDogForTest("Dog2");
			
			Users.save(user);
			Dogs.save(dog1);
			Dogs.save(dog2);
			
			likedDogs.add(dog1);
			likedDogs.add(dog2);
			user.setLikedDogs(likedDogs);
			String userWitlikedDogs =  gson.toJson(user);
			System.out.println("likedDogs Test. input: "+  gson.toJson(user));
			response = TestUtils.createRequest(url, userWitlikedDogs);
			savedUser = Users.getUserByUserName(user.getUserName());

		} catch (Exception e) {
			System.out.println(e.getMessage());
			fail(e.getMessage());			
		}
		System.out.println(response);
		assertEquals(response ,"OK");
		assertEquals(likedDogs.toString() ,savedUser.getLikedDogs().toString());
		// Clean db
		try {
			Users.removeByUserName(savedUser.getUserName());
			Dogs.removeByDogName(dog1.getName());
			Dogs.removeByDogName(dog2.getName());
		} catch (Exception e) {
			System.out.println(e.getMessage());	
		}
			
	}
	
	/*
	 * Test 3
	 * */
	@Test
	public void testAdoptDog() {
		String url = "http://localhost:8080/GetPet/getPetServer/DogServices/adoptDog";
		String response =null;
		Dog dogAfterAdop = new Dog();
		User userAfterAdoption = new User();
		Dog dogForAdoption = null;
		int datasetSizeBefor= Adoptions.getDataSet().size();

		try {
			User user = TestUtils.createUserForTest();
			user = TestUtils.addDogAdopterForTest(user);
			Users.save(user);
			
			dogForAdoption =	TestUtils.createDogForTest("dogForAdoption");
			Dogs.save(dogForAdoption);
			
			user.setAdoptedDog(dogForAdoption);
			
			System.out.println("adoptDog Test. input: "+  gson.toJson(user));
			response = TestUtils.createRequest(url, gson.toJson(user));
			
			dogAfterAdop = Dogs.getDogByName(dogForAdoption.getName());
			userAfterAdoption = Users.getUserByUserName(user.getUserName());
		} catch (Exception e) {
			response = "ERROR" + e.getMessage();
			}
		System.out.println(response);
		int datasetSizeAfter= Adoptions.getDataSet().size();

		assertEquals(response ,"OK");
		assertTrue(dogAfterAdop == null);
		assertEquals(userAfterAdoption.getAdoptedDog().getBreed(), dogForAdoption.getBreed());
		assertEquals(datasetSizeAfter,datasetSizeBefor+1);

		// Clean db
		try {
			Users.removeByUserName(userAfterAdoption.getUserName());
			Adoptions.removeByDogBreed(userAfterAdoption.getAdoptedDog().getBreed().getEnglishName());

		} catch (Exception e) {
			System.out.println(e.getMessage());	
		}
	
	}
}
