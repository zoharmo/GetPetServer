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
	@POST
    @Path("/addDogForAdoption") 
	@Consumes(MediaType.APPLICATION_JSON)
	public void addDogForAdoption(InputStream incomingData) {
		BufferedReader in = new BufferedReader(new InputStreamReader(incomingData));
		Dog dog = gson.fromJson(in, Dog.class);
		Dogs.save(dog);
		
	}

	@POST 
    @Path("/getDogs") 
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces("application/json;charset=utf-8")
	public String getDogsTest(InputStream incomingData) {
		BufferedReader in = new BufferedReader(new InputStreamReader(incomingData));
		Gson g = new Gson();
		User usr = g.fromJson(in, User.class);
//		DogAdopter adoptionDetails = usr.getAdoptionDetails();
		System.out.println(usr.getUserName());
		
		/** knn algorithm according to adoptionDetails below **/
		
		ArrayList<Dog> dogs = new ArrayList<>();
		Dog d1 = new Dog();
		d1.setId("1");
		d1.setName("��");
		d1.setColor("Brown");
		d1.setAge(1.5);
		d1.setArea(Area.CENTER.getId());
		d1.setBreed(DogBreeds.Pomeranian.getId());
		User user1 = new User("����","���");		
		//d1.setOwner(user1);
	//	d1.setPicture("../../assets/images/1.jpg");
		d1.setDescription("�� ,���� �������� ������ �������. ����� ������� ������� ����� �� ����� ���� ���, �� ���� ���� ������ ���. ����� ������ ������� ��� ����� ��� �����. ����� ������ ������ �����.");
		d1.setGender(Gender.FEMALE.getId());
		d1.setSize(Size.SMALL.getId());
		dogs.add(d1);
		
		Dog d2 = new Dog();
		d2.setId("2");
		d2.setName("����");
		d2.setColor("White");
	//	d2.setAge(0.4);
		d2.setArea(Area.CENTER.getId());
		d2.setBreed(DogBreeds.BullTerrier.getId());
		User user2 = new User("���������","������");		
	//	d2.setOwner(user2);
		//d2.setPicture("../../assets/images/2.jpg");
		d2.setDescription("������!!! ���� �� �-4 ������. ���� ���� ����� ������ ������ ����� �� �����. ���� ����� ������� �� ���� ������� �� �����. ���� ����� ����� ����� �� �����. ��� ���� ������� ������ �����.");
		d2.setGender(Gender.FEMALE.getId());
		d2.setSize(Size.MEDIUM.getId());
		dogs.add(d2);
		
		Dog d5 = new Dog();
		d5.setId("5");
		d5.setName("�'��");
		d5.setColor("Brown");
		//d5.ssetAge(4);
		//d5.setArea(Area.CENTER);
	//	d5.setBreed(DogBreeds.AnatolianShepherd);
		User user5 = new User("����","����");		
	//	d5.setOwner(user5);
	//	d5.setPicture("../../assets/images/5.jpg");
		d5.setDescription("�� ������ �� ��'�� ��? �'�� ����� ����� ���� ����� ���� 4 ����... ���� ����� ��� ������ ���� ������� ���� �� ��� ����. �� 4 ����, ������ �������, ��� �� ���� ����.. ����� ���� ������ �����!!! �� ����� ����� �����..");
	//	d5.setGender(Gender.FEMALE);
	//	d5.setSize(Size.MEDIUM);
		dogs.add(d5);
		
		Dog d7 = new Dog();
		d7.setId("7");
		d7.setName("����");
		d7.setColor("White");
		//d7.setAge(0.5);
	//	d7.setArea(Area.CENTER);
	//	d7.setBreed(DogBreeds.Basenji);
		User user7 = new User("����","����");		
	//	d7.setOwner(user7);
		//d7.setPicture("../../assets/images/7.jpg");
		d7.setDescription("���� ��� �� ����� ������ ����� ���� �������. ������ ���� �� ���� ������ ���� ��� ���� ��� ��� �� ���� ����� ����� �� �� ��� ��� ����� �� ��� ��� ���� �����. ����� ������ �� �����!! ��� ���� ���� ���� ��� ���. �� �� ��� ����� ���� �� ����� �� ����� ��������� ����.");
	//	d7.setGender(Gender.MALE);
//		d7.setSize(Size.SMALL);
		dogs.add(d7);
		
		Dog d9 = new Dog();
		d9.setId("9");
		d9.setName("������");
		d9.setColor("Brown");
		//d9.setAge(4);
		//d9.setArea(Area.CENTER);
	//	d9.setBreed(DogBreeds.MiniaturePinscher);
		User user9 = new User("������","���");		
	//	d9.setOwner(user9);
	//	d9.setPicture("../../assets/images/9.jpg");
		d9.setDescription("������, ��� ��� ���� ��� ���� ��� ���� �� ���. ����'� ��� ����� ��� ��� ��� ��� �� ����� ����� ����� ��� ���� ���� ������. ������ ���� �� 4 ����� ����� ����� �� �� ���. ����� ���� �� �� ���� ���, �� ���� ����. ��� �����, ����� ������. ����� �� ����� �������. �� �� ���� ���� �� ����! �� ���� ���? **���� ���� ���� ��");
	//	d9.setGender(Gender.MALE);
	//	d9.setSize(Size.SMALL);
		dogs.add(d9);
		
		//----------------------
		
		
		Dog d3 = new Dog();
		d3.setId("3");
		d3.setName("����");
		d3.setColor("White");
		d3.setAge(3.5);
	//	d3.setArea(Area.NORTH);
	//	d3.setBreed(DogBreeds.LabradorRetriever);
		User user3 = new User("�����","����");		
	//	d3.setOwner(user3);
	//	d3.setPicture("../../assets/images/3.jpg");
		d3.setDescription("���� ���, ����� �� ��� - ��� ����. ����� ���� �� ��� ���, ������ ��� ���� ������� �� ��� ��. ���� ��� ���� ����� ������ ������ ����� ���� ���������. �� ��� �� ������� ��� ��� �� ����� ������ ����� ��? ��� �� ����� ������ ����� ���� �� ����� ���� ����� �� ����� ����� �� ���� ����� ���� ����� �����. ���� �����, ����� ����� ��� ��������, ����� ������. ����� �� �� ������. ���� ��� �����, ��� ����� ������ �� ����� �����.");
	//	d3.setGender(Gender.MALE);
	//	d3.setSize(Size.BIG);
		dogs.add(d3);
		
		Dog d4 = new Dog();
		d4.setId("4");
		d4.setName("����");
		d4.setColor("White");
	//	d4.setAge(Double.parseDouble();
	//	d4.setArea(Area.CENTER);
//		d4.setBreed(DogBreeds.GoldenRetriever);
		User user4 = new User("����","�����");		
//		d4.setOwner(user4);
	//	d4.setPicture("../../assets/images/4.jpg");
		d4.setDescription("����� ������- ��� ����� �����, �� ���� 9, ����� ������. ���� ����� ����, ����� ���� ���� ����� ������ ���� ���������. ���� ���� ����, ���� ������� ��������!! ���� ��������� ������ �� ��� �� �����..");
	//	d4.setGender(Gender.MALE);
	//	d4.setSize(Size.BIG);
		dogs.add(d4);
		
		Dog d6 = new Dog();
		d6.setId("6");
		d6.setName("����");
		d6.setColor("Brown");
	//	d6.setAge(0.2);
//		d6.setArea(Area.NORTH);
	//	d6.setBreed(DogBreeds.GermanShepherd);
	//	User user6 = new User("�����","��");		
	//	d6.setOwner(user6);
	//	d6.setPicture("../../assets/images/6.jpg");
		d6.setDescription("����. ���� ����� ������ ����� �� �������. ����� �����. ����� �� ����. ���� ������ ����. ���� ������ �����...");
	//	d6.setGender(Gender.MALE);
	//	d6.setSize(Size.MEDIUM);
		dogs.add(d6);
		
		Dog d8 = new Dog();
		d8.setId("8");
		d8.setName("����");
		d8.setColor("Black");
	//	d8.setAge(10);
//		d8.setArea(Area.SOUTH);
	//	d8.setBreed(DogBreeds.BorderCollie);
		User user8 = new User("����","����");		
//		d8.setOwner(user8);
	//	d8.setPicture("../../assets/images/8.jpg");
		d8.setDescription("���� �� 10, ��� ����� ����� �����. ������ ����. ����� �� �������� ��� �� ������ ���� �� ������ �� ����� ������ ���� ������ �� ����� ���� ���� ������ ���� ���� ������� ��� ��� ���� ������ ������! ��� ��� ����� ����� ������ ��� �����");
	//	d8.setGender(Gender.MALE);
	//	d8.setSize(Size.BIG);
		dogs.add(d8);
			
		Dog d10 = new Dog();
		d10.setId("10");
		d10.setName("�����");
		d10.setColor("Brown");
		//d10.setAge(10);
	//	d10.setArea(Area.SOUTH);
		//d10.setBreed(DogBreeds.AmericanPitBullTerrier);
		User user10 = new User("������","���'�");		
//		d10.setOwner(user10);
//		d10.setPicture("../../assets/images/10.jpg");
		d10.setDescription("����� ,���� ������ ������ �������. ����� ������� ������� ����� �� ����� ���� ���, �� ���� ���� ������ ������ . ����� ������ ������� ��� ����� ��� �����. ����� ������ ������ ����� . !!!!");
		//d10.setGender(Gender.FEMALE);
	//	d10.setSize(Size.BIG);
		dogs.add(d10);
		
		Dog d11 = new Dog();
		d11.setId("11");
		d11.setName("�����");
		d11.setColor("Black");
		d11.setAge(0.10);
		//d11.setArea(Area.SOUTH);
		//d11.setBreed(DogBreeds.Greyhound);
		User user11 = new User("������","������");		
	//	d11.setOwner(user11);
		//d11.setPicture("../../assets/images/11.jpg");
		d11.setDescription("�����, ���� ��� ��� ���� ���- ���� ���������. ������ ��� �� 10 ������. ����� ����� ����� ����� �����. ���� ������� �������� ��������, ���� ���� �� ����� �����, �� �� ��� ���� �� ��� ������� ������� ��������� ��� �������� ��� ������ ������. ����� ���� ��� ����  �� ����� ������");
	//	d11.setGender(Gender.MALE);
	//	d11.setSize(Size.BIG);
		dogs.add(d11);
		
		String s = g.toJson(dogs);
		return s;
	}
	
	@GET 
    @Path("/getEnum") 
	@Produces("application/json;charset=utf-8")
	public String getEnum(@QueryParam("enumName")String enumName) throws ClassNotFoundException {
		String s = null;

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
			s= e.getMessage();
		}
		
		return s;
	}
}