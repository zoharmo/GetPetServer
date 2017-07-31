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
import enums.Animals;

public class GetPetServicesTest {
	private ObjectMapper objectMapper = new ObjectMapper();
	private Gson gson = new Gson();	

	@Test
	public void getEnumtest() {
		String response = null;
		User user = null;
		String enumlist=null;
		try {
	
			String url = "GetPet/getPetServer/GetPetServices/getEnum?enumName=Animals";

			System.out.println("getEnum Test. url: " + url);
			response = TestUtils.createRequest(url, null);	
			enumlist = objectMapper.writeValueAsString(Animals.values());
		} catch (Exception e) {
			fail(e.getMessage());	
			System.out.println(e.getMessage());
			response = e.getMessage();
		}
		
		System.out.println("response: " + response);
		assertEquals(enumlist, response);

	}
	@Test
	public void testMatchDogsToUser() {
		String url = "GetPet/getPetServer/GetPetServices/matchDogsToUser";
		String response = null;
		User user = null;
		try {
			user = TestUtils.createUserForTest();
			TestUtils.addDogAdopterForTest(user);
	
			System.out.println("matchDogsToUser Test. input: " + gson.toJson(user));
			response = TestUtils.createRequest(url, gson.toJson(user));
		} catch (Exception e) {
			fail(e.getMessage());	
			response = e.getMessage();
		}
		System.out.println("response: "+ response);

		assertEquals("OK" ,"OK");
		
		try {
			Users.removeByUserName(user.getUserName());
		} catch (Exception e) {
			System.out.println(e.getMessage());	
		}
	}
}
