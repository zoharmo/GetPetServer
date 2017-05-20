
import static org.junit.Assert.fail;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import crud.Users;
import entities.Dog;
import entities.User;
import enums.Area;
import enums.DogBreeds;
import enums.Gender;
import enums.Size;
import javassist.bytecode.ByteArray;
public class testJSON {

	
	public static void main(String[] args) throws JsonProcessingException {
		//System.out.println(new ObjectMapper().writeValueAsString(DogBreeds.values()));

		
		System.out.println(new ObjectMapper().writeValueAsString(Size.values()));
	//	System.out.println(new ObjectMapper().writeValueAsString(DogBreeds.values()));

/*		System.out.println(new ObjectMapper().writeValueAsString(Area.values()));
		System.out.println(new ObjectMapper().writeValueAsString(CommunityType.values()));
		System.out.println(new ObjectMapper().writeValueAsString(DogCare.values()));
		System.out.println(new ObjectMapper().writeValueAsString(Gender.values()));
		System.out.println(new ObjectMapper().writeValueAsString(HouseType.values()));
		System.out.println(new ObjectMapper().writeValueAsString(Location.values()));
		System.out.println(new ObjectMapper().writeValueAsString(Availability.values()));
		System.out.println(new ObjectMapper().writeValueAsString(HealthStatus.values()));
		System.out.println(new ObjectMapper().writeValueAsString(FamilyType.values()));
		System.out.println(new ObjectMapper().writeValueAsString(Relation.values()));
		System.out.println(new ObjectMapper().writeValueAsString(Hobbies.values()));
		System.out.println(new ObjectMapper().writeValueAsString(Features.values()));
<<<<<<< HEAD
	
		
		try {
//			URL url = new URL("http://localhost:8080/GetPet/getPetServer/GetPetServices/getDogAfterUpload");
		//	URL url = new URL("http://localhost:8080/GetPet/getPetServer/GetPetServices/getDogsByAdoptionDetails");
			URL url = new URL("http://localhost:8080/GetPet/getPetServer/GetPetServices/userRegistration");
			URLConnection connection = url.openConnection();
			connection.setDoOutput(true);
			connection.setRequestProperty("Content-Type", "application/json");
			connection.setConnectTimeout(500000);
			connection.setReadTimeout(500000);
			OutputStreamWriter out = new OutputStreamWriter(connection.getOutputStream());
//			out.write("{'id':'1234','name':'lasi','age':3,'breed':[]}");
			out.write("{'id':'12','userName':'barbe','firstName':'bar','secondName':'ben tolila'}");
			out.close();
			BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			
			StringBuilder s = new StringBuilder();
			String line = null;
			
			while ((line = in.readLine()) != null) {
				
					s.append(line);
					System.out.println(s);
			}
			
			in.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	
		/*
	try{	 Gson gson = new Gson();

		User user = new User("UserNameTest", "123", "test@gmail.com","testFirstName", "testLastName", 050,null, null,null);
		Users.remove(user);
		Users.save(user);
		
		Dog dog = new Dog("Pit", "����", 7,  Area.CENTER, user, Gender.FEMALE, Size.MEDIUM,null, null,"discription");
		dog.setBreed(DogBreeds.AkitaInu);
		URL url = new URL("http://localhost:8080/GetPet/getPetServer/GetPetServices/addDogForAdoption");
		URLConnection connection = url.openConnection();
		connection.setDoOutput(true);
		connection.setRequestProperty("Content-Type", "application/json");
		connection.setConnectTimeout(500000);
		connection.setReadTimeout(500000);
		OutputStreamWriter out = new OutputStreamWriter(connection.getOutputStream());
		System.out.println(gson.toJson(dog, Dog.class));
		out.write(gson.toJson(dog, Dog.class));
		System.out.println(new ObjectMapper().writeValueAsString(dog));
		out.close();
		BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
		
		StringBuilder s = new StringBuilder();
		String line = null;
		
		while ((line = in.readLine()) != null) {
			
				s.append(line);
				System.out.println(s);
		}

	}catch (Exception e) {
		System.out.println(e.getMessage());
	}
		ArrayList<Dog> dogs = new ArrayList<>();
		Dog d1 = new Dog();
		d1.setId("1");
		d1.setName("��");
		d1.setColor("���");
		d1.setAge((short)1.5);
		d1.setArea(Area.CENTER);
		d1.setBreed(DogBreeds.Pomeranian);
		//User user1 = new User("����","������");		
		//d1.setOwner(user1);
		d1.setPicture("../../assets/images/1.jpg");
		d1.setDescription("�� ,���� �������� ������ �������. ����� ������� ������� ����� �� ����� ���� ���, �� ���� ���� ������ ���. ����� ������ ������� ��� ����� ��� �����. ����� ������ ������ �����.");
		d1.setGender(Gender.FEMALE);
		d1.setSize(Size.SMALL);
		dogs.add(d1);
		
		Dog d2 = new Dog();
		d2.setId("2");
		d2.setName("����");
		d2.setColor("���");
		d2.setAge((short)0.4);
		d2.setArea(Area.CENTER);
		d2.setBreed(DogBreeds.BullTerrier);
		//User user2 = new User("���������","������");		
		//d2.setOwner(user2);
		d2.setPicture("../../assets/images/2.jpg");
		d2.setDescription("������!!! ���� �� �-4 ������. ���� ���� ����� ������ ������ ����� �� �����. ���� ����� ������� �� ���� ������� �� �����. ���� ����� ����� ����� �� �����. ��� ���� ������� ������ �����.");
		d2.setGender(Gender.FEMALE);
		d2.setSize(Size.MEDIUM);
		dogs.add(d2);
		
		Dog d5 = new Dog();
		d5.setId("5");
		d5.setName("�'��");
		d5.setColor("���");
		d5.setAge((short)4);
		d5.setArea(Area.CENTER);
		d5.setBreed(DogBreeds.AnatolianShepherd);
		//User user5 = new User("����","����");		
		//d5.setOwner(user5);
		d5.setPicture("../../assets/images/5.jpg");
		d5.setDescription("�� ������ �� ��'�� ��? �'�� ����� ����� ���� ����� ���� 4 ����... ���� ����� ��� ������ ���� ������� ���� �� ��� ����. �� 4 ����, ������ �������, ��� �� ���� ����.. ����� ���� ������ �����!!! �� ����� ����� �����..");
		d5.setGender(Gender.FEMALE);
		d5.setSize(Size.MEDIUM);
		dogs.add(d5);
		
		Dog d7 = new Dog();
		d7.setId("7");
		d7.setName("����");
		d7.setColor("���");
		d7.setAge((short)0.5);
		d7.setArea(Area.CENTER);
		d7.setBreed(DogBreeds.Basenji);
		//User user7 = new User("����","����");		
		//d7.setOwner(user7);
		d7.setPicture("../../assets/images/7.jpg");
		d7.setDescription("���� ��� �� ����� ������ ����� ���� �������. ������ ���� �� ���� ������ ���� ��� ���� ��� ��� �� ���� ����� ����� �� �� ��� ��� ����� �� ��� ��� ���� �����. ����� ������ �� �����!! ��� ���� ���� ���� ��� ���. �� �� ��� ����� ���� �� ����� �� ����� ��������� ����.");
		d7.setGender(Gender.MALE);
		d7.setSize(Size.SMALL);
		dogs.add(d7);
		
		Dog d9 = new Dog();
		d9.setId("9");
		d9.setName("������");
		d9.setColor("���");
		d9.setAge((short)4);
		d9.setArea(Area.CENTER);
		d9.setBreed(DogBreeds.MiniaturePinscher);
		//User user9 = new User("������","���");		
		//d9.setOwner(user9);
		d9.setPicture("../../assets/images/9.jpg");
		d9.setDescription("������, ��� ��� ���� ��� ���� ��� ���� �� ���. ����'� ��� ����� ��� ��� ��� ��� �� ����� ����� ����� ��� ���� ���� ������. ������ ���� �� 4 ����� ����� ����� �� �� ���. ����� ���� �� �� ���� ���, �� ���� ����. ��� �����, ����� ������. ����� �� ����� �������. �� �� ���� ���� �� ����! �� ���� ���? **���� ���� ���� ��");
		d9.setGender(Gender.MALE);
		d9.setSize(Size.SMALL);
		dogs.add(d9);
		
		Dog d12 = new Dog();
		d12.setId("12");
		d12.setName("����");
		d12.setColor("����");
		d12.setAge((short)10);
		d12.setArea(Area.SOUTH);
		d12.setBreed(DogBreeds.Pekingese);
		//User user8 = new User("����","����");		
		//d12.setOwner(user8);
		d12.setPicture("../../assets/images/12.jpg");
		d12.setDescription("���� �� 10 ����� ���� ����� ������ �� ����� ���� ���� ���� ����. ���� ���� ��� ����� �� ���� �����. ����� ����� �� �����.");
		d12.setGender(Gender.MALE);
		d12.setSize(Size.SMALL);
		dogs.add(d12);
		
		Dog d13 = new Dog();
		d13.setId("13");
		d13.setName("������");
		d13.setColor("���");
		d13.setAge((short)13);
		d13.setArea(Area.SOUTH);
		d13.setBreed(DogBreeds.Poodle);
		//User user8 = new User("����","����");		
		//d13.setOwner(user8);
		d13.setPicture("../../assets/images/13.jpg");
		d13.setDescription("���� �� 10, ��� ����� ����� �����. ������ ����. ����� �� �������� ��� �� ������ ���� �� ������ �� ����� ������ ���� ������ �� ����� ���� ���� ������ ���� ���� ������� ��� ��� ���� ������ ������! ��� ��� ����� ����� ������ ��� �����, �� �� ������ �� ������ ����� ����� �� ������");
		d13.setGender(Gender.MALE);
		d13.setSize(Size.SMALL);
		dogs.add(d13);
		
		Dog d14 = new Dog();
		d14.setId("14");
		d14.setName("������");
		d14.setColor("���");
		d14.setAge((short)3.5);
		d14.setArea(Area.SOUTH);
		d14.setBreed(DogBreeds.Maltese);
		//User user8 = new User("����","����");		
		//d14.setOwner(user8);
		d14.setPicture("../../assets/images/14.jpg");
		d14.setDescription("������ ������ ���� ���� ����, ��� �� ���� ����, ������ ������ ����. ����� ������ ����� ����� ������ ������� ���, ��� ������ �� ����� ���� ������ ������� ������ ����� �� ����� ���� ��� ����� ������. ��� ���� ���� ���� ���? :)");
		d14.setGender(Gender.FEMALE);
		d14.setSize(Size.SMALL);
		dogs.add(d14);
		
		Dog d15 = new Dog();
		d15.setId("15");
		d15.setName("�����");
		d15.setColor("���");
		d15.setAge((short)2);
		d15.setArea(Area.CENTER);
		d15.setBreed(DogBreeds.MiniaturePinscher);
		//User user8 = new User("����","����");		
		//d15.setOwner(user8);
		d15.setPicture("../../assets/images/15.jpg");
		d15.setDescription("����� - ����'��� ������, �� �������, ������ �������, ���� �������, ���� �� ������ �������� ������. ����� ��� ����� ������ ������ �� ����.");
		d15.setGender(Gender.FEMALE);
		d15.setSize(Size.SMALL);
		dogs.add(d15);
		
		System.out.println(new ObjectMapper().writeValueAsString(dogs));
		dogs.clear();
		//----------------------
		
		
		Dog d3 = new Dog();
		d3.setId("3");
		d3.setName("����");
		d3.setColor("���");
		d3.setAge((short)3.5);
		d3.setArea(Area.NORTH);
		d3.setBreed(DogBreeds.LabradorRetriever);
		//User user3 = new User("�����","����");		
		//d3.setOwner(user3);
		d3.setPicture("../../assets/images/3.jpg");
		d3.setDescription("���� ���, ����� �� ��� - ��� ����. ����� ���� �� ��� ���, ������ ��� ���� ������� �� ��� ��. ���� ��� ���� ����� ������ ������ ����� ���� ���������. �� ��� �� ������� ��� ��� �� ����� ������ ����� ��? ��� �� ����� ������ ����� ���� �� ����� ���� ����� �� ����� ����� �� ���� ����� ���� ����� �����. ���� �����, ����� ����� ��� ��������, ����� ������. ����� �� �� ������. ���� ��� �����, ��� ����� ������ �� ����� �����.");
		d3.setGender(Gender.MALE);
		d3.setSize(Size.BIG);
		dogs.add(d3);
		
		Dog d4 = new Dog();
		d4.setId("4");
		d4.setName("����");
		d4.setColor("���");
		d4.setAge((short)9);
		d4.setArea(Area.CENTER);
		d4.setBreed(DogBreeds.GoldenRetriever);
		//User user4 = new User("����","�����");		
		//d4.setOwner(user4);
		d4.setPicture("../../assets/images/4.jpg");
		d4.setDescription("����� ������- ��� ����� �����, �� ���� 9, ����� ������. ���� ����� ����, ����� ���� ���� ����� ������ ���� ���������. ���� ���� ����, ���� ������� ��������!! ���� ��������� ������ �� ��� �� �����..");
		d4.setGender(Gender.MALE);
		d4.setSize(Size.BIG);
		dogs.add(d4);
		
		Dog d6 = new Dog();
		d6.setId("6");
		d6.setName("����");
		d6.setColor("���");
		d6.setAge((short)0.2);
		d6.setArea(Area.NORTH);
		d6.setBreed(DogBreeds.GermanShepherd);
		//User user6 = new User("�����","��");		
		//d6.setOwner(user6);
		d6.setPicture("../../assets/images/6.jpg");
		d6.setDescription("����. ���� ����� ������ ����� �� �������. ����� �����. ����� �� ����. ���� ������ ����. ���� ������ �����...");
		d6.setGender(Gender.MALE);
		d6.setSize(Size.MEDIUM);
		dogs.add(d6);
		
		Dog d8 = new Dog();
		d8.setId("8");
		d8.setName("����");
		d8.setColor("����");
		d8.setAge((short)10);
		d8.setArea(Area.SOUTH);
		d8.setBreed(DogBreeds.BorderCollie);
		//User user8 = new User("����","����");		
		//d8.setOwner(user8);
		d8.setPicture("../../assets/images/8.jpg");
		d8.setDescription("���� �� 10, ��� ����� ����� �����. ������ ����. ����� �� �������� ��� �� ������ ���� �� ������ �� ����� ������ ���� ������ �� ����� ���� ���� ������ ���� ���� ������� ��� ��� ���� ������ ������! ��� ��� ����� ����� ������ ��� �����");
		d8.setGender(Gender.MALE);
		d8.setSize(Size.BIG);
		dogs.add(d8);
			
		Dog d10 = new Dog();
		d10.setId("10");
		d10.setName("�����");
		d10.setColor("���");
		d10.setAge((short)10);
		d10.setArea(Area.SOUTH);
		d10.setBreed(DogBreeds.AmericanPitBullTerrier);
		//User user10 = new User("������","���'�");		
		//d10.setOwner(user10);
		d10.setPicture("../../assets/images/10.jpg");
		d10.setDescription("����� ,���� ������ ������ �������. ����� ������� ������� ����� �� ����� ���� ���, �� ���� ���� ������ ������ . ����� ������ ������� ��� ����� ��� �����. ����� ������ ������ ����� .� !!!!");
		d10.setGender(Gender.FEMALE);
		d10.setSize(Size.BIG);
		dogs.add(d10);
		
		Dog d11 = new Dog();
		d11.setId("11");
		d11.setName("�����");
		d11.setColor("����");
		d11.setAge((short)0.10);
		d11.setArea(Area.SOUTH);
		d11.setBreed(DogBreeds.Greyhound);
		//User user11 = new User("������","������");		
		//d11.setOwner(user11);
		d11.setPicture("../../assets/images/11.jpg");
		d11.setDescription("�����, ���� ��� ��� ���� ���- ���� ���������. ������ ��� �� 10 ������. ����� ����� ����� ����� �����. ���� ������� �������� ��������, ���� ���� �� ����� �����, �� �� ��� ���� �� ��� ������� ������� ��������� ��� �������� ��� ������ ������. ����� ���� ��� ����  �� ����� ������ ");
		d11.setGender(Gender.MALE);
		d11.setSize(Size.BIG);
		dogs.add(d11);
		
		Dog d16 = new Dog();
		d16.setId("16");
		d16.setName("���");
		d16.setColor("���");
		d16.setAge((short)2);
		d16.setArea(Area.SOUTH);
		d16.setBreed(DogBreeds.LabradorRetriever);
		//User user8 = new User("����","����");		
		//d16.setOwner(user8);
		d16.setPicture("../../assets/images/16.jpg");
		d16.setDescription("������ ����� ���� ��� �� ������, ��� ������. ��� ��� ����� ����� ������ �� ���� ��� ����� ������ ���� ������� ����� ��� ����� �������");
		d16.setGender(Gender.MALE);
		d16.setSize(Size.BIG);
		dogs.add(d16);
		
		System.out.println(new ObjectMapper().writeValueAsString(dogs));*/
	}
}
