package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import crud.Users;
import entities.User;

public class MongoTest {

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

}
