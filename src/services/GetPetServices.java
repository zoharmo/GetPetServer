package services;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import KNN.Knn;
import crud.Adoptions;
import crud.Dogs;
import crud.Users;
import entities.Adoption;
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
import enums.Features;
import enums.Gender;
import enums.HealthStatus;
import enums.Hobbies;
import enums.HouseType;
import enums.Location;
import enums.Relation;
import enums.Size;
import tests.TestUtils;

@Path("/GetPetServices")
public class GetPetServices {
	private Gson gson = new Gson();
	private ObjectMapper objectMapper =  new ObjectMapper();

	@GET
    @Path("/getEnum") 
//	@Consumes(MediaType.APPLICATION_JSON)
	@Produces("application/json;charset=UTF-8")
	public String getUser(@QueryParam("enumName")String enumName) {
		String response = null;
		try{
			Class<?> c = Class.forName("enums." + enumName);
			Method m = c.getMethod("values");		
			response = objectMapper.writeValueAsString(m.invoke(c));
			
		}catch (Exception e) {
			System.out.println(e.getMessage());		
			response = "ERROR:" + e.getMessage();
		}
		return response;
	}

	@POST 
    @Path("/matchDogsToUser") 
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces("application/json;charset=utf-8")
	public String matchDogsToUser(InputStream incomingData) {
		BufferedReader in = new BufferedReader(new InputStreamReader(incomingData));
		
		String response;
		try{
			User usr = objectMapper.readValue(in, User.class);
			System.out.println("matchDogsToUser service. input: "+  objectMapper.writeValueAsString(usr));
			
		//	ArrayList<Dog> dogs =  Knn.run(usr);
			
			// FOR TEST:
			ArrayList<Dog> dogs = TestUtils.getDogsList();
			response = objectMapper.writeValueAsString(dogs);
		}catch (Exception e) {
			System.out.println(e.getMessage());
			response = "ERROR" +e.getMessage();
		}
		System.out.println("response: " + response);

		return response;
	}
	
}