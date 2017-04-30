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

import entities.Dog;
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

@Path("/GetPetServices")
public class GetPetServices {
	
	@POST
    @Path("/getUserAfterRegistration") 
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces("application/json;charset=utf-8")
	public String getUserAfterRegistration(InputStream incomingData) {
		BufferedReader in = new BufferedReader(new InputStreamReader(incomingData));
		Gson g = new Gson();
		User usr = g.fromJson(in, User.class);
		String s = g.toJson(usr);
		return s;
	}
	

	@POST 
    @Path("/getDogAfterUpload;charset=utf-8") 
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
	@Produces("application/json;charset=utf-8")
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
	@Produces("application/json;charset=utf-8")
	public String getEnumAsJson(@QueryParam("enumName")String enumName) {
		String s = new String();
		
		try {
			if ("Animals".equals(enumName))
				s = new ObjectMapper().writeValueAsString(Animals.values());
			else if ("Area".equals(enumName))
				s = new ObjectMapper().writeValueAsString(Area.values());
			else if ("Availability".equals(enumName))
				s = new ObjectMapper().writeValueAsString(Availability.values());
			else if ("CommunityType".equals(enumName))
				s = new ObjectMapper().writeValueAsString(CommunityType.values());
			else if ("DogBreeds".equals(enumName))
				s = new ObjectMapper().writeValueAsString(DogBreeds.values());
			else if ("DogCare".equals(enumName))
				s = new ObjectMapper().writeValueAsString(DogCare.values());
			else if ("FamilyStatus".equals(enumName))
				s = new ObjectMapper().writeValueAsString(FamilyStatus.values());
			else if ("FamilyType".equals(enumName))
				s = new ObjectMapper().writeValueAsString(FamilyType.values());
			else if ("Features".equals(enumName))
				s = new ObjectMapper().writeValueAsString(Features.values());
			else if ("Gender".equals(enumName))
				s = new ObjectMapper().writeValueAsString(Gender.values());
			else if ("HealthStatus".equals(enumName))
				s = new ObjectMapper().writeValueAsString(HealthStatus.values());
			else if ("Hobbies".equals(enumName))
				s = new ObjectMapper().writeValueAsString(Hobbies.values());
			else if ("HouseType".equals(enumName))
				s = new ObjectMapper().writeValueAsString(HouseType.values());
			else if ("Location".equals(enumName))
				s = new ObjectMapper().writeValueAsString(Location.values());
			else if ("Relation".equals(enumName))
				s = new ObjectMapper().writeValueAsString(Relation.values());
			
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
		return s;
	}
}