package tests;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Array;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

import javax.net.ssl.HttpsURLConnection;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonFactory.Feature;

import crud.Adoptions;
import crud.Dogs;
import crud.Users;
import entities.Dog;
import entities.DogAdopter;
import entities.User;
import enums.Animals;
import enums.Area;
import enums.Availability;
import enums.Colors;
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

public class TestUtils {

	public static String createRequest(String Url, String input) throws Exception{
		URL url = new URL(Url);
		HttpURLConnection connection = (HttpURLConnection)url.openConnection();
		connection.setDoOutput(true);
		connection.setRequestProperty("Content-Type", "application/json;charset=UTF-8");
		connection.setRequestProperty("Accept", "application/json;charset=UTF-8");
		connection.setConnectTimeout(500000);
		connection.setReadTimeout(500000);
		OutputStreamWriter out = new OutputStreamWriter(connection.getOutputStream());
		if(input != null){
		out.write(input);}
		out.close();
		
		
		BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream(), "utf-8"));
		
		StringBuilder s = new StringBuilder();
		String line = null;
		
		while ((line = in.readLine()) != null) {
			
				s.append(line);
		}
		
		in.close();
		
		return s.toString();
	}
	
	public static User createUserForTest() throws Exception{
		User user = new User("morzo", "123", "mor@gmail.com", "mor","zohar","0508537588", null, null,null );
		Users.removeByUserName(user.getUserName());
		return user;
	}
	
	public static Dog createDogForTest(String dogName){
		Colors[] c = {Colors.BLACK,Colors.WHITE};
		Dog dog = new Dog(dogName,c , 2.0, Area.SOUTH, Gender.FEMALE, Size.BIG, DogBreeds.Pomeranian, null, "very nice dog 1", "rave", "kirayt gat", "00");
		Dogs.removeByDogName(dog.getName());
		return dog;
	}
	
	public static Dog createDogForTest(String dogName, DogBreeds breed, Area area){
		Colors[] c = {Colors.BLACK,Colors.WHITE};
		Dog dog = new Dog(dogName,c , 2.0, area, Gender.FEMALE, Size.BIG, breed, null, "very nice dog 1", "rave", "kirayt gat", "00");
		Dogs.removeByDogName(dog.getName());
		return dog;
	}
	public static User addDogAdopterForTest(User user){
		Animals[] animals = {Animals.DOG};
		Availability[] avilabilities = {Availability.EVENING};		
		HealthStatus[] hs = {HealthStatus.HEALTHY};
		FamilyType[] ft = {FamilyType.LOAD};
		Relation[] r = {Relation.CLEANING};
		Hobbies[] h= {Hobbies.SWIMMING, Hobbies.TRAVELING};
		Features[] f = {Features.ATTENTION, Features.IMPULSIVE};
		DogAdopter da = new DogAdopter(Gender.FEMALE, 18, FamilyStatus.SINGLE, CommunityType.MOSHAV, Area.JERUSALEM, 
				HouseType.GARDEN, DogCare.ME,animals , Location.INSIDE, avilabilities,hs ,
				ft,r ,h , f);
		user.setAdoptionDetails(da);
		
		return user;
	}
	
	public static ArrayList<Dog> getDogsList(){
		
		ArrayList<Dog> dogs = new ArrayList<>();
		Dog d1 = new Dog();
		d1.setId("1");
		d1.setName("פו");
		Colors[] c = {Colors.BLACK};
		d1.setColor(c);
		d1.setAge(5.5);
		d1.setArea(Area.CENTER);
		d1.setBreed(DogBreeds.Pomeranian);
		d1.setOwenerName("לוקה מודריץ");
		d1.setPhone("050485755");
		d1.setDescription("פו ,כלבת פומרניאן מלאכית ומיוחדת. מלאני חברותית ומסתדרת מצוין עם כלבים ובני אדם, בת כשנה וחצי ובגודל קטן. מלאני מעוקרת ומחוסנת מלא ותמסר בסל אימוץ. נמצאת באומנה באיזור המרכז.");
		d1.setGender(Gender.FEMALE);
		d1.setSize(Size.SMALL);
		dogs.add(d1);
		
		Dog d2 = new Dog();
		d2.setId("2");
		d2.setName("טופי");
		Colors[] b = {Colors.DALMATIAN};
		d2.setColor(b);
		d2.setAge(0.4);
		d2.setArea(Area.CENTER);
		d2.setBreed(DogBreeds.BullTerrier);

		d1.setOwenerName("כריטסיאנו רונלדו");
		d1.setPhone("050485755");
	
		d2.setDescription("לאימוץ!!! טופי בת ה-4 חודשים. טופי תגדל לגודל בינוני ותימסר תמורת סל אימוץ. טופי מתוקה ומסתדרת עם כולם ובייחוד עם ילדים. טופי יודעת לעשות צרכים על עיתון. היא טובה ומקסימה ותתאים לכולם.");
		d2.setGender(Gender.FEMALE);
		d2.setSize(Size.MEDIUM);
		dogs.add(d2);
		
		Dog d5 = new Dog();
		d5.setId("5");
		d5.setName("ג'וי");
		Colors[] s = {Colors.GREY, Colors.BROWN};
		d5.setColor(s);
		d5.setAge(2.5);
		d5.setArea(Area.JERUSALEM);
		d5.setBreed(DogBreeds.AnatolianShepherd);

		d1.setOwenerName("מור זוהר");
		d1.setPhone("050485755");
		
		d5.setDescription("לא תושיטו גם לג'וי יד? ג'וי ננטשה בהסגר אחרי שהיתה בבית 4 שנים... עברה אילוף דרך העמותה והיא אידאלית לבית עם זוג צעיר. בת 4 שנים, מעוקרת ומחוסנת, ועם לב גדול ורחב.. אוהבת לשחק ואוהבת לאהוב!!! מי שיכול בבקשה לעזור..");
		d5.setGender(Gender.FEMALE);
		d5.setSize(Size.MEDIUM);
		dogs.add(d5);
			return dogs;
	}
}
