package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import crud.Dogs;
import crud.Users;
import entities.Dog;
import entities.User;
import enums.Area;
import enums.DogBreeds;
import junit.framework.Assert;

public class MongoTest {
	private ObjectMapper objectMapper = new ObjectMapper();

	@Test
	public void test() {
		User u = null ;
		try {
			u = new User("morzo","mor","zohar");
			Users.doesUserNameExist("morzo");
		} catch (Exception e) {
			fail(e.getMessage());
		}
		assertTrue(u != null);

	}
	
	@Test
	public void testGetDogByBreedAndArea() throws JsonProcessingException {
		
		Dog d1 =	TestUtils.createDogForTest("dogTest1", DogBreeds.Affenpinscher, Area.NORTH);
		Dog d2 =	TestUtils.createDogForTest("dogTest2", DogBreeds.Affenpinscher, Area.SOUTH);
		Dog d3 =	TestUtils.createDogForTest("dogTest3", DogBreeds.Basenji, Area.NORTH);

		Dogs.save(d1);
		Dogs.save(d2);
		Dogs.save(d3);

		ArrayList<Dog> list = Dogs.getDogByBreedAndArea(DogBreeds.Affenpinscher, Area.NORTH);
		
		assertEquals(1, list.size());
		assertEquals(d1.getName(), list.get(0).getName());
		System.out.println(objectMapper.writeValueAsString(list));
		//clean db
		Dogs.removeByDogName(d1.getName());
		Dogs.removeByDogName(d2.getName());
		Dogs.removeByDogName(d3.getName());

	}


}
