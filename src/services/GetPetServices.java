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
		d1.setName("פו");
		d1.setColor("Brown");
		d1.setAge(1.5);
		d1.setArea(Area.CENTER.getId());
		d1.setBreed(DogBreeds.Pomeranian.getId());
		User user1 = new User("ליאו","מסי");		
		//d1.setOwner(user1);
	//	d1.setPicture("../../assets/images/1.jpg");
		d1.setDescription("פו ,כלבת פומרניאן מלאכית ומיוחדת. מלאני חברותית ומסתדרת מצוין עם כלבים ובני אדם, בת כשנה וחצי ובגודל קטן. מלאני מעוקרת ומחוסנת מלא ותמסר בסל אימוץ. נמצאת באומנה באיזור המרכז.");
		d1.setGender(Gender.FEMALE.getId());
		d1.setSize(Size.SMALL.getId());
		dogs.add(d1);
		
		Dog d2 = new Dog();
		d2.setId("2");
		d2.setName("טופי");
		d2.setColor("White");
	//	d2.setAge(0.4);
		d2.setArea(Area.CENTER.getId());
		d2.setBreed(DogBreeds.BullTerrier.getId());
		User user2 = new User("כריסטיאנו","רונלדו");		
	//	d2.setOwner(user2);
		//d2.setPicture("../../assets/images/2.jpg");
		d2.setDescription("לאימוץ!!! טופי בת ה-4 חודשים. טופי תגדל לגודל בינוני ותימסר תמורת סל אימוץ. טופי מתוקה ומסתדרת עם כולם ובייחוד עם ילדים. טופי יודעת לעשות צרכים על עיתון. היא טובה ומקסימה ותתאים לכולם.");
		d2.setGender(Gender.FEMALE.getId());
		d2.setSize(Size.MEDIUM.getId());
		dogs.add(d2);
		
		Dog d5 = new Dog();
		d5.setId("5");
		d5.setName("ג'וי");
		d5.setColor("Brown");
		//d5.ssetAge(4);
		//d5.setArea(Area.CENTER);
	//	d5.setBreed(DogBreeds.AnatolianShepherd);
		User user5 = new User("קרוס","טוני");		
	//	d5.setOwner(user5);
	//	d5.setPicture("../../assets/images/5.jpg");
		d5.setDescription("לא תושיטו גם לג'וי יד? ג'וי ננטשה בהסגר אחרי שהיתה בבית 4 שנים... עברה אילוף דרך העמותה והיא אידאלית לבית עם זוג צעיר. בת 4 שנים, מעוקרת ומחוסנת, ועם לב גדול ורחב.. אוהבת לשחק ואוהבת לאהוב!!! מי שיכול בבקשה לעזור..");
	//	d5.setGender(Gender.FEMALE);
	//	d5.setSize(Size.MEDIUM);
		dogs.add(d5);
		
		Dog d7 = new Dog();
		d7.setId("7");
		d7.setName("בונו");
		d7.setColor("White");
		//d7.setAge(0.5);
	//	d7.setArea(Area.CENTER);
	//	d7.setBreed(DogBreeds.Basenji);
		User user7 = new User("בייל","גארת");		
	//	d7.setOwner(user7);
		//d7.setPicture("../../assets/images/7.jpg");
		d7.setDescription("בונו גור בן חמישה חודשים משוטט באחד המושבים. המשפחה ששמה לו קולר מאכילה אותו פעם ביום אבל הוא לא יכול להכנס אליהם כי יש להם כלב תוקפן אז הוא ישן מתחת למבנה. מתאים למשפחה עם ילדים!! הוא עדין ומעט חששן אבל טוב. כל כך טוב ועדין שהוא לא ישרוד את החיים המחוספסים בחוץ.");
	//	d7.setGender(Gender.MALE);
//		d7.setSize(Size.SMALL);
		dogs.add(d7);
		
		Dog d9 = new Dog();
		d9.setId("9");
		d9.setName("כורכום");
		d9.setColor("Brown");
		//d9.setAge(4);
		//d9.setArea(Area.CENTER);
	//	d9.setBreed(DogBreeds.MiniaturePinscher);
		User user9 = new User("קרבחאל","דני");		
	//	d9.setOwner(user9);
	//	d9.setPicture("../../assets/images/9.jpg");
		d9.setDescription("כורכום, עוד שנה ועוד שנה ועוד שנה ואין לך בית. פינצ'ר קטן ומתוק שלא עשה שום דבר רע בחייו ונאלץ לחכות שוב ושוב לבית המתאים. כורכום הקטן בן 4 וחווה נטישה ששברה לו את הלב. עכשיו אחרי כל כך הרבה זמן, גם תורו הגיע. הוא מחונך, מחוסן ומסורס. מסתדר עם כלבים וחתולים. כל מה שהוא רוצה זה אהבה! מה יותר מזה? **נמצא כרגע ברמת גן");
	//	d9.setGender(Gender.MALE);
	//	d9.setSize(Size.SMALL);
		dogs.add(d9);
		
		//----------------------
		
		
		Dog d3 = new Dog();
		d3.setId("3");
		d3.setName("סולי");
		d3.setColor("White");
		d3.setAge(3.5);
	//	d3.setArea(Area.NORTH);
	//	d3.setBreed(DogBreeds.LabradorRetriever);
		User user3 = new User("מסיקה","מירי");		
	//	d3.setOwner(user3);
	//	d3.setPicture("../../assets/images/3.jpg");
		d3.setDescription("סולי שמו, וכשמו כן הוא - כלב נשמה. כשהוא אוהב זה מכל הלב, מסירות ללא גבול ונאמנות עד אין קץ. סולי עבר קורס אילוף ומתאים להובלת אנשים בעלי מוגבלויות. אז איך זה שמהיותו גור הוא רק מתחנן שמישהו יבחין בו? אני לא אוותר ואמשיך להפיץ אותו עד שיגיע האחד שירים את הכפפה ויציל את סולי ויזכה בחבר מושלם ואוהב. סולי מסורס, משובב מחוסן בכל החיסונים, מחונך לצרכים. מסתדר עם כל הכלבים. אינו כלב שמירה, ולא מתאים למשפחה עם ילדים קטנים.");
	//	d3.setGender(Gender.MALE);
	//	d3.setSize(Size.BIG);
		dogs.add(d3);
		
		Dog d4 = new Dog();
		d4.setId("4");
		d4.setName("לאון");
		d4.setColor("White");
	//	d4.setAge(Double.parseDouble();
	//	d4.setArea(Area.CENTER);
//		d4.setBreed(DogBreeds.GoldenRetriever);
		User user4 = new User("רמוס","סרחיו");		
//		d4.setOwner(user4);
	//	d4.setPicture("../../assets/images/4.jpg");
		d4.setDescription("מדובר בליאון- כלב גולדן מעורב, בן כמעט 9, מסורס ומחוסן. עושה צרכים בחוץ, מאולף לאחר קורס מותאם לאנשים בעלי מוגבלויות. חמוד חמוד חמוד, אוהב חיבוקים ופינוקים!! בגלל רילוקשיין מחפשים לו בית חם ואוהב..");
	//	d4.setGender(Gender.MALE);
	//	d4.setSize(Size.BIG);
		dogs.add(d4);
		
		Dog d6 = new Dog();
		d6.setId("6");
		d6.setName("רודי");
		d6.setColor("Brown");
	//	d6.setAge(0.2);
//		d6.setArea(Area.NORTH);
	//	d6.setBreed(DogBreeds.GermanShepherd);
	//	User user6 = new User("מרסלו","מר");		
	//	d6.setOwner(user6);
	//	d6.setPicture("../../assets/images/6.jpg");
		d6.setDescription("רודי. רודי חמודי התינוק המתוק בן חודשיים. מתלטף ואוהב. מסתדר עם כולם. יהיה בינוני פלוס. נמצא באומנה בחיפה...");
	//	d6.setGender(Gender.MALE);
	//	d6.setSize(Size.MEDIUM);
		dogs.add(d6);
		
		Dog d8 = new Dog();
		d8.setId("8");
		d8.setName("לאקי");
		d8.setColor("Black");
	//	d8.setAge(10);
//		d8.setArea(Area.SOUTH);
	//	d8.setBreed(DogBreeds.BorderCollie);
		User user8 = new User("וראן","רפאל");		
//		d8.setOwner(user8);
	//	d8.setPicture("../../assets/images/8.jpg");
		d8.setDescription("לאקי בן 10, כלב מדהים מחונך ונאמן. אנרגטי מאוד. לצערי לי ולמשפחתי אין את היכולת לטפל בו ואנחנו לא רוצים להחזיר אותו לעמותה אם תוכלי לאמץ אותו ולהפוך אותו לחלק מהמשפחה שלך הוא יהיה המאושר בכלבים! הוא כלב מדהים שיודע להעניק חום ואהבה");
	//	d8.setGender(Gender.MALE);
	//	d8.setSize(Size.BIG);
		dogs.add(d8);
			
		Dog d10 = new Dog();
		d10.setId("10");
		d10.setName("מלאני");
		d10.setColor("Brown");
		//d10.setAge(10);
	//	d10.setArea(Area.SOUTH);
		//d10.setBreed(DogBreeds.AmericanPitBullTerrier);
		User user10 = new User("פרננדס","נאצ'ו");		
//		d10.setOwner(user10);
//		d10.setPicture("../../assets/images/10.jpg");
		d10.setDescription("מלאני ,כלבת פיטבול מלאכית ומיוחדת. מלאני חברותית ומסתדרת מצוין עם כלבים ובני אדם, בת כשנה וחצי ובגודל בינוני . מלאני מעוקרת ומחוסנת מלא ותמסר בסל אימוץ. נמצאת באומנה באיזור הצפון . !!!!");
		//d10.setGender(Gender.FEMALE);
	//	d10.setSize(Size.BIG);
		dogs.add(d10);
		
		Dog d11 = new Dog();
		d11.setId("11");
		d11.setName("דונאט");
		d11.setColor("Black");
		d11.setAge(0.10);
		//d11.setArea(Area.SOUTH);
		//d11.setBreed(DogBreeds.Greyhound);
		User user11 = new User("מוראטה","אלבארו");		
	//	d11.setOwner(user11);
		//d11.setPicture("../../assets/images/11.jpg");
		d11.setDescription("דונאט, הכלב הכי הכי מתוק שיש- יותר מסופגנייה. חמודיק כזה בן 10 חודשים. גורון מתבגר מקסים מקסים מקסים. אוהב פינוקים וחיבוקים ונישוקים, אוהב לשחק עם כלבים אחרים, יש לו מבט ממיס עם שתי העיניים הקרובות והמצחיקות שלו והנביחות הכי חמודות שתשמעו. דונאט חייב בית מאמץ  או אומנה מיידית");
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