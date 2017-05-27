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
import enums.Features;
import enums.Gender;
import enums.HealthStatus;
import enums.Hobbies;
import enums.HouseType;
import enums.Location;
import enums.Relation;
import enums.Size;

@Path("/GetPetServices")
public class GetPetServices {
	private Gson gson = new Gson();

	@GET 
    @Path("/getEnum") 
	@Produces("application/json;charset=utf-8")
	public String getEnum(@QueryParam("enumName")String enumName) throws ClassNotFoundException {
		String response = null;

		try {			
			Class<?> c = Class.forName("enums." + enumName);
			Method m = c.getMethod("values");		
			response = new ObjectMapper().writeValueAsString(m.invoke(c));
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			response = "ERROR: " + e.getMessage();
		} 
		
		return response;
	}
}