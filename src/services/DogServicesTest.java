package services;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import crud.Dogs;
import crud.Users;
import entities.Dog;
import entities.DogAdopter;
import entities.User;
import enums.Animals;
import enums.Area;
import enums.Availability;
import enums.CommunityType;
import enums.DogBreeds;
import enums.DogCare;
import enums.FamilyStatus;
import enums.FamilyType;
import enums.Gender;
import enums.HealthStatus;
import enums.HouseType;
import enums.Location;
import enums.Size;
import junit.framework.Assert;

public class DogServicesTest {
	private ObjectMapper objectMapper = new ObjectMapper();
	private Gson gson = new Gson();

	/**
	 * Test 1
	 */
	@Test
	public void testAddDogForAdoption() {
		String url = "http://localhost:8080/GetPet/getPetServer/DogServices/addDogForAdoption";
		String dog = "{'id':null,"
				+  "'name':'פו',"
				+ " 'color':'Brown',"
				+ "'age':1.5,"
			+ "'area': 'NORTH',"
			+ "'gender':'MALE',"
			+ "'size':'MEDIUM',"
			+ "'breed':'Pomeranian',"
			+ "'picture':null,"
			+ "'description':'פו ,כלבת פומרניאן מלאכית ומיוחדת. מלאני חברותית ומסתדרת מצוין עם כלבים ובני אדם, בת כשנה וחצי ובגודל קטן. מלאני מעוקרת ומחוסנת מלא ותמסר בסל אימוץ. נמצאת באומנה באיזור המרכז.',"
			+ "'owenerName':'מסי',"
			+ "'address':'ראשון לציון, המשוררת רחל ',"
			+ "'phone':'0502566486'}";	
			
		// delete dog from db
		Dog d = Dogs.getDogByName("פו");
		if (d != null){
			Dogs.remove(d);
					}
		String response = null;
		try {
			response = createRequest(url, dog);
		} catch (Exception e) {
			fail(e.getMessage());			
		}

	 d = Dogs.getDogByName("פו");
		assertEquals(response ,"OK");
		assertTrue(d != null);
		
	}
	/**
	 * Test 2
	 */
	@Test
	public void testlikedDogs() {
		String url = "http://localhost:8080/GetPet/getPetServer/DogServices/likedDogs";
		User user = new User();
		user.setUserName("morzo");
		Dog dog1 = CreateDogForTest("Dog1");
		Dog dog2 = CreateDogForTest("Dog2");
		ArrayList<Dog> likedDogs = new ArrayList<>();

		String response = null;
		User savedUser = null;
		try {
			Users.removeByUsserName(user.getUserName());
			Dogs.removeByDogName(dog1.getName());
			Dogs.removeByDogName(dog2.getName());

			Users.save(user);
			Dogs.save(dog1);
			Dogs.save(dog2);
			
			likedDogs.add(dog1);
			likedDogs.add(dog2);
			user.setLikedDogs(likedDogs);
			String userWitlikedDogs =  gson.toJson(user);
			
			response = createRequest(url, userWitlikedDogs);
			savedUser = Users.getUserByUserName(user.getUserName());

		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());			
		}
		
		assertEquals(response ,"OK");
		assertEquals(likedDogs.toString() ,savedUser.getLikedDogs().toString());
		
	}
	
	/**
	 * Test 3
	 */
	@Test
	public void testAdoptDog() {
		String url = "http://localhost:8080/GetPet/getPetServer/DogServices/adoptDog";
		User user = new User();
		user.setUserName("morzo");
		//user.setAdoptionDetails(new DogAdopter(Gender.FEMALE,3,FamilyStatus.MARRIED,CommunityType.KIBBUTZ, Area.JERUSALEM, HouseType.BIG_APARTMENT,DogCare.ME, Animals.Cat, Location.INSIDE,  Availability.EVENING, HealthStatus.CRIPPLE,FamilyType.FRIENDLY,)));
		
		
		try {
			Users.removeByUsserName(user.getUserName());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
	}
	private String createRequest(String Url, String input) throws Exception{
		URL url = new URL(Url);
		URLConnection connection = url.openConnection();
		connection.setDoOutput(true);
		connection.setRequestProperty("Content-Type", "application/json");
		connection.setConnectTimeout(500000);
		connection.setReadTimeout(500000);
		OutputStreamWriter out = new OutputStreamWriter(connection.getOutputStream());
		out.write(input);
		out.close();
		
		BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
		
		StringBuilder s = new StringBuilder();
		String line = null;
		
		while ((line = in.readLine()) != null) {
			
				s.append(line);
		}
		
		in.close();
		
		return s.toString();

	}
	
	private Dog CreateDogForTest(String dogName){
		return new Dog(dogName, "Brown", 2.0, Area.SOUTH, Gender.FEMALE, Size.BIG, DogBreeds.Ariegeois, null, "very nice dog 1", "rave", "kirayt gat");

	}

}
