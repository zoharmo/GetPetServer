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

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import crud.Users;
import entities.Dog;
import entities.User;
import enums.Animals;
import enums.Features;

@Path("/GetPetServices")
public class GetPetServices {
	private Gson gson = new Gson();
	
	@POST
    @Path("/userRegistration") 
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_HTML)
	public String userRegistration(InputStream incomingData) {
		BufferedReader in = new BufferedReader(new InputStreamReader(incomingData));
		User usr = gson.fromJson(in, User.class);
		
		if (Users.getUserByUserName(usr.getUserName()) != null){
			return "ERROR: already exist user name " + usr.getUserName();
		}else{
			int returnCode = Users.save(usr);
			if(returnCode == -1){
				return "ERROR: problem with save user to db";}
		}
		return "OK";
	}
	
	@GET
    @Path("/checkUserNameValid") 
	@Consumes(MediaType.TEXT_HTML)
	public Boolean checkUserName(@QueryParam("userName")String userName) {
		  return(!Users.doesUserNameExist(userName));
	}
	
	@POST
    @Path("/getUserAfterRegistration") 
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces("application/json")
	public String getUserAfterRegistration(InputStream incomingData) {
		BufferedReader in = new BufferedReader(new InputStreamReader(incomingData));
		Gson g = new Gson();
		User usr = g.fromJson(in, User.class);
		String s = g.toJson(usr);
		return s;
	}
	

	@POST 
    @Path("/getDogAfterUpload") 
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces("application/json")
	public String getDogAfterUpload(InputStream incomingData) {
		BufferedReader in = new BufferedReader(new InputStreamReader(incomingData));
		Gson g = new Gson();
		Dog dog = g.fromJson(in, Dog.class);
		String s = g.toJson(dog);
		return s;
	}
	
	@POST 
    @Path("/getDogsByAdoptionDetails") 
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces("application/json")
	public String getDogsByAdoptionDetails(InputStream incomingData) {
		BufferedReader in = new BufferedReader(new InputStreamReader(incomingData));
		Gson g = new Gson();
		User usr = g.fromJson(in, User.class);
//		DogAdopter adoptionDetails = usr.getAdoptionDetails();
		System.out.println(usr.getUserName());
		
		/** knn algorithm according to adoptionDetails below **/
		
		ArrayList<Dog> dogs = new ArrayList<>();
		Dog d1 = new Dog();
		d1.setName("rexi");
		d1.setAge(4);
		d1.setId("123");
		
		Dog d2 = new Dog();
		d2.setName("lasi");
		d2.setAge(3);
		d2.setId("1234");
		
		dogs.add(d2);
		dogs.add(d1);
		
		String s = g.toJson(dogs);
		return s;
	}
	
	@GET 
    @Path("/getEnumAsJson") 
	@Produces("application/json")
	public String getEnumAsJson(@QueryParam("enumName")String enumName) {
		String s = new String();
		
		try {
			if ("Animals".equals(enumName))
				s = new ObjectMapper().writeValueAsString(Animals.values());
			else if ("Features".equals(enumName))
				s = new ObjectMapper().writeValueAsString(Features.values());
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
		return s;
	}
}