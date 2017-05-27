package services;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;

import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import crud.Dogs;
import crud.Users;
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
			System.out.println(e.getMessage());
		}

		Dog d = Dogs.getDogByName("фе");
		assertEquals(response ,"OK");
		assertTrue(d != null);
		
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
		try {
			User user = TestUtils.createUserForTest();
			Dog dog1 = TestUtils.createDogForTest("Dog1");
			Dog dog2 = TestUtils.createDogForTest("Dog2");
			
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
		
	}
	
	/*
	 * Test 3
	 * */
	@Test
	public void testAdoptDog() {
		String url = "http://localhost:8080/GetPet/getPetServer/DogServices/adoptDog";
		
		try {
			User user = TestUtils.createUserForTest();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
