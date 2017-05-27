package services;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

import com.google.gson.Gson;

import crud.Users;
import entities.User;

public class UserServicesTest {
	private Gson gson = new Gson();	

	@Test
	public void testRegisteration() {
		String url = "http://localhost:8080/GetPet/getPetServer/UserServices/userRegistration";
		String response = null;

		try {
			User user = TestUtils.createUserForTest();
			System.out.println("userRegistration Test. input: " + gson.toJson(user));
			response = TestUtils.createRequest(url, gson.toJson(user));	
		} catch (Exception e) {
			fail(e.getMessage());	
			System.out.println(e.getMessage());
		}
		
		System.out.println("response: " + response);
		assertEquals(response ,"OK");
		assertTrue(Users.doesUserNameExist("mor"));
	}
	
	@Test
	public void testUpdateUser() {
		String url = "http://localhost:8080/GetPet/getPetServer/UserServices/updateUser";
		String response = null;

		try {
			User user = TestUtils.createUserForTest();
			//user.set
			System.out.println("updateUser Test. input: " + gson.toJson(user));
			response = TestUtils.createRequest(url, gson.toJson(user));	
		} catch (Exception e) {
			fail(e.getMessage());	
			System.out.println(e.getMessage());
		}
		
		System.out.println("response: " + response);
		assertEquals(response ,"OK");
		assertTrue(Users.doesUserNameExist("mor"));
	}
}
