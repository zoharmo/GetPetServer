package services;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import crud.Dogs;
import entities.Dog;
import entities.User;
import enums.Area;
import enums.DogBreeds;
import enums.Gender;
import enums.Size;
import junit.framework.Assert;

public class DogServicesTest {
	private ObjectMapper objectMapper = new ObjectMapper();

	@Test
	public void testAddDogForAdoption() {
		String url = "http://localhost:8080/GetPet/getPetServer/DogServices/addDogForAdoption";
		String dog = "{'id':null,"
				+  "'name':'פו',"
				+ " 'color':'Brown',"
				+ "'age':1.5,"
			+ "'area':2,"
			+ "'gender':1,"
			+ "'size':2,"
			+ "'breed':40,"
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
		assertTrue(d.getId() != null);
		
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

}
