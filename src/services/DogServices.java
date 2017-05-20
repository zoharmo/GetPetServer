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
		try{
			dog = gson.fromJson(in, Dog.class);
			Dogs.save(dog);

		}catch (Exception e) {
			System.out.println(e.getMessage());		}
		return "OK";
	}
	
	@POST 
    @Path("/getDogsByAdoptoionDetails") 
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces("application/json;charset=utf-8")
	public String getDogsByAdoptoionDetails(InputStream incomingData) {
		BufferedReader in = new BufferedReader(new InputStreamReader(incomingData));
		User usr = gson.fromJson(in, User.class);
		
		DogAdopter details = usr.getAdoptionDetails();
		ArrayList<Dog> dogs =  Knn.run(details);
		String dogsJson;
		try{
			dogsJson = objectMapper.writeValueAsString(dogs);
		}catch (Exception e) {
			System.out.println(e.getMessage());
			dogsJson = e.getMessage();
		}
		return dogsJson;
	}
	
	@POST 
    @Path("/setLikedDogs") 
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces("application/json;charset=utf-8")
	public void setLikedDogs(InputStream incomingData) {
		BufferedReader in = new BufferedReader(new InputStreamReader(incomingData));
		User inputUser = gson.fromJson(in, User.class);
		
		User savedUser = Users.getUserByUserName(inputUser.getUserName());
		
		savedUser.setLikedDogs(inputUser.getLikedDogs());
		Users.save(savedUser);	
	}
	
	@POST 
    @Path("/adoptDog") 
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces("application/json;charset=utf-8")
	public void adoptDog(InputStream incomingData) {
		BufferedReader in = new BufferedReader(new InputStreamReader(incomingData));
		User user = gson.fromJson(in, User.class);
		
		Dogs.remove(user.getAdoptednDog());
		
		// save user details with choosen dog breed
	}
}
