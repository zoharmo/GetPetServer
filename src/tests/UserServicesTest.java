package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;

import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import crud.Users;
import entities.User;

public class UserServicesTest {
	private Gson gson = new Gson();	
	private ObjectMapper objectMapper =  new ObjectMapper();

	@Test
	public void testSignUp() {
		String url = "GetPet/getPetServer/UserServices/signUp";
		String response = null;
		User user = null;

		try {
			user = TestUtils.createUserForTest();
			System.out.println("signUp Test. input: " + gson.toJson(user));
			response = TestUtils.createRequest(url, gson.toJson(user));	
		} catch (Exception e) {
			fail(e.getMessage());	
			System.out.println(e.getMessage());
			response = e.getMessage();
		}
		
		System.out.println("response: " + response);
		assertEquals(response ,"OK");
		assertTrue(Users.doesUserNameExist(user.getUserName()));
		
		//cleanDB
		try {
			Users.removeByUserName(user.getUserName());
		} catch (Exception e) {
			System.out.println(e.getMessage());		
		}
	}
	
	@Test
	public void testSignIn() {
		String response = null;
		User user = null;
		String userAssert=null;
		try {
			user = TestUtils.createUserForTest();
			Users.save(user);
			String url = "GetPet/getPetServer/UserServices/signIn?userName=" + user.getUserName() +
					"&password="+user.getPassword();

			System.out.println("SignIn Test. url: " + url);
			response = TestUtils.sendGet(url);	
			
			user.setLikedDogs(new ArrayList<>());
			userAssert =objectMapper.writeValueAsString(user);
		} catch (Exception e) {
			fail(e.getMessage());	
			System.out.println(e.getMessage());
			response = e.getMessage();
		}
		
		System.out.println("response: " + response);
		assertEquals(response ,userAssert );
		
		//cleanDB
		try {
			Users.removeByUserName(user.getUserName());
		} catch (Exception e) {
			System.out.println(e.getMessage());		
		}
	}
	
	@Test
	public void testGetUser() {
		String response = null;
		User user = null;
		String userAssert=null;
		try {
			user = TestUtils.createUserForTest();
			Users.save(user);
			String url = "GetPet/getPetServer/UserServices/getUser?userName=" + user.getUserName() ;

			System.out.println("GetUser Test. url: " + url);
			response = TestUtils.createRequest(url,null);	
			
			user.setLikedDogs(new ArrayList<>());
			userAssert =objectMapper.writeValueAsString(user);
		} catch (Exception e) {
			fail(e.getMessage());	
			System.out.println(e.getMessage());
			response = e.getMessage();
		}
		
		System.out.println("response: " + response);
		assertEquals(response ,userAssert);
		
		//cleanDB
		try {
			Users.removeByUserName(user.getUserName());
		} catch (Exception e) {
			System.out.println(e.getMessage());		
		}
	}
	@Test
	public void testUpdateUser() {
		String response = null;
		User user = null;
		String userAssert=null;
		User savedUser = null;
		try {
			user = TestUtils.createUserForTest();
			Users.save(user);
			String url = "GetPet/getPetServer/UserServices/updateUser" ;
			user.setFirstName("coral");
			System.out.println("updateUser Test. input: " + gson.toJson(user));
			response = TestUtils.createRequest(url, gson.toJson(user));	
			savedUser = Users.getUserByUserName(user.getUserName());
		} catch (Exception e) {
			fail(e.getMessage());	
			System.out.println(e.getMessage());
			response = e.getMessage();
		}
		
		System.out.println("response: " + response);
		assertEquals(response ,"OK");
		assertEquals(user.getFirstName(), savedUser.getFirstName());	

//cleanDB
		try {
			Users.removeByUserName(user.getUserName());
		} catch (Exception e) {
			System.out.println(e.getMessage());		
		}
	}
	@Test
	public void testCheckUserName() {
		String response = null;
		User user = null;
		String userAssert=null;
		try {
			user = TestUtils.createUserForTest();
			Users.save(user);
			String url = "GetPet/getPetServer/UserServices/checkUserName?userName=" + user.getUserName() ;

			System.out.println("check User Test. url: " + url);
			response = TestUtils.sendGet(url);	
			
		} catch (Exception e) {
			fail(e.getMessage());	
			System.out.println(e.getMessage());
			response = e.getMessage();
		}
		
		System.out.println("response: " + response);
		assertEquals(response ,"true");
		
		//cleanDB
		try {
			Users.removeByUserName(user.getUserName());
		} catch (Exception e) {
			System.out.println(e.getMessage());		
		}
	}

}
