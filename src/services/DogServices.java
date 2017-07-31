package services;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

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
	
	@GET
    @Path("/likedDogsByIds") 
	//@Consumes(MediaType.APPLICATION_JSON)
	@Produces("application/json;charset=utf-8")
	public String likedDogsByIds(@QueryParam("userName")String userName, @QueryParam("dogId")String dogId) {
		//BufferedReader in = new BufferedReader(new InputStreamReader(incomingData));
		String response;
		try{
	
			System.out.println("likedDogs service. input useId: "+ userName + " dogId " + dogId);
			User inputUser = Users.getUserByUserName(userName);
			if (inputUser!=null){
				Dog dog = Dogs.getDogById(dogId);
				if (dog !=null){
					inputUser.addLikedDog(dog);
					
					Users.save(inputUser);		
					response= "OK";
				}else{
					response = " not Found dog with id " + dogId;
				}
				
			}else{
				response = "not Found user with user name " + userName;
			}
		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
			response = "ERROR" + e.getMessage();
		}
		System.out.println("response: " + response);

		return response;
	}	
	@GET
    @Path("/removeLikedDogsByIds") 
	//@Consumes(MediaType.APPLICATION_JSON)
	@Produces("application/json;charset=utf-8")
	public String removeLikedDogsByIds(@QueryParam("userName")String userName, @QueryParam("dogId")String dogId) {
		//BufferedReader in = new BufferedReader(new InputStreamReader(incomingData));
		String response;
		try{

		System.out.println("remove likedDogs service. input useId: "+ userName + " dogId " + dogId);
		User inputUser = Users.getUserByUserName(userName);
		if (inputUser!=null){
			Dog dog = Dogs.getDogById(dogId);
			if (dog !=null){
				inputUser.removeLikedDog(dog);
				
				Users.save(inputUser);		
				response= "OK";
			}else{
				response = " not Found dog with id " + dogId;
			}
			
		}else{
			response = "not Found user with user name " + userName;
		}
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			response = "ERROR" + e.getMessage();
		}
		System.out.println("response: " + response);

		return response;
	}	

	@GET 
    @Path("/adoptDogByIds") 
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces("application/json;charset=utf-8")
	public String adoptDogByIds(@QueryParam("userName")String userName, @QueryParam("dogId")String dogId) {
		//BufferedReader in = new BufferedReader(new InputStreamReader(incomingData));
		String  respoonse;
		try{
			System.out.println("adoptDog service. input: useId: "+ userName + "dogId" + dogId);
		User user = Users.getUserByUserName(userName);
		if (user != null){
			Dog d = Dogs.getDogById(dogId);
			
			if (d!= null){
				user.setAdoptedDog(d);
				//Remove Dog From liked dog in user 
				user.removeLikedDog(d);
				// Remove dog from dogs list for adoption
				Dogs.remove(d);
				// Save user with adopted dog
				Users.update(user);
				// save user details with chosen dog breed
			
				Adoption adopt = new Adoption(user.getAdoptionDetails(), d.getBreed());
				Adoptions.save(adopt);
				respoonse = "OK";
			}else{
				respoonse = "not found dog with id " + dogId;
			}
		}else{
				
			respoonse = "not found user with Name " + userName;
		}
		}catch (Exception e) {
			respoonse = "ERROR " + e.getMessage();
		}
		return respoonse;
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
		Dog d = Dogs.getDogById(user.getAdoptedDog().getId());
		// Remove dog from dogs list for adoption
		Dogs.removeById(user.getAdoptedDog().getId());
		//Remove Dog From liked dog in user 
		user.getLikedDogs().remove(user.getAdoptedDog());
		// Save user with adopted dog
		Users.update(user);
		// save user details with chosen dog breed
	
		Adoption adopt = new Adoption(user.getAdoptionDetails(), d.getBreed());
		Adoptions.save(adopt);
		respoonse = "OK";
		}catch (Exception e) {
			respoonse = "ERROR " + e.getMessage();
		}
		return respoonse;
	}

	
}
