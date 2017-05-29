package tests;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

import crud.Dogs;
import crud.Users;
import entities.Dog;
import entities.User;
import enums.Area;
import enums.Colors;
import enums.DogBreeds;
import enums.Gender;
import enums.Size;

public class TestUtils {
	
	public static String createRequest(String Url, String input) throws Exception{
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
	
	public static User createUserForTest() throws Exception{
		User user = new User("morzo", "123", "mor@gmail.com", "mor","zohar","0508537588", null, null,null );
		Users.removeByUserName(user.getUserName());
		return user;
	}
	
	public static Dog createDogForTest(String dogName){
		Colors[] c = {Colors.BLACK,Colors.WHITE};
		Dog dog = new Dog(dogName,c , 2.0, Area.SOUTH, Gender.FEMALE, Size.BIG, DogBreeds.Ariegeois, null, "very nice dog 1", "rave", "kirayt gat");
		Dogs.removeByDogName(dog.getName());
		return dog;
	}
}
