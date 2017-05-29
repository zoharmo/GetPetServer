package services;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import KNN.Knn;
import crud.Dogs;
import crud.Users;
import entities.Adoption;
import entities.Dog;
import entities.DogAdopter;
import entities.User;

@Path("/DogServices")
public class DogServices {
	private Gson gson = new Gson();
	private ObjectMapper objectMapper =  new ObjectMapper();

	/** Add dog for adoption 
	 *  save dog object to DB 
	 *  @param dog json
	 * **/
	@POST
    @Path("/addDogForAdoption") 
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces("application/json;charset=utf-8")
	public String addDogForAdoption(InputStream incomingData) {
		BufferedReader in = new BufferedReader(new InputStreamReader(incomingData));
		Dog dog;
		String response;
		try{
			//dog = objectMapper.readValue(in, Dog.class);
			dog = objectMapper.readValue(in, Dog.class);
			System.out.println("addDogForAdoption service. input: " + gson.toJson(dog));
			Dogs.save(dog);
			response =  "OK";
		}catch (Exception e) {
			System.out.println(e.getMessage());		
			response = "ERROR: " + e.getMessage();}
		System.out.println("response: " + response);
		return response;
	}
	
	
	@POST 
    @Path("/likedDogs") 
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces("application/json;charset=utf-8")
	public String likedDogs(InputStream incomingData) {
		BufferedReader in = new BufferedReader(new InputStreamReader(incomingData));
		String response;
		try{

		User inputUser = objectMapper.readValue(in, User.class);
		System.out.println("likedDogs service. input: "+  gson.toJson(inputUser));

			//User inputUser = gson.fromJson(in, User.class);
		User savedUser = Users.getUserByUserName(inputUser.getUserName());
		response= "OK";

		savedUser.setLikedDogs(inputUser.getLikedDogs());
		Users.save(savedUser);	}
		catch (Exception e) {
			System.out.println(e.getMessage());
			response = "ERROR" + e.getMessage();
		}
		System.out.println("response: " + response);

		return response;
	}
	
	@POST 
    @Path("/adoptDog") 
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces("application/json;charset=utf-8")
	public String adoptDog(InputStream incomingData) {
		BufferedReader in = new BufferedReader(new InputStreamReader(incomingData));
		String  respoonse;
		try{
		User user = objectMapper.readValue(in, User.class);
		System.out.println("adoptDog service. input: "+ objectMapper.writeValueAsString(user));
		Dogs.remove(user.getAdoptednDog());
		
		// save user details with chosen dog breed
	//	Adoption adopt = new Adoption(user.getAdoptionDetails(), user.getAdoptednDog().getBreed());
		respoonse = "OK";
		}catch (Exception e) {
			respoonse = e.getMessage();
		}
		return respoonse;
	}
}
