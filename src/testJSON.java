
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
		
		Dog dog = new Dog("Pit", "שחור", 7,  Area.CENTER, user, Gender.FEMALE, Size.MEDIUM,null, null,"discription");
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
		d1.setName("פו");
		d1.setColor("חום");
		d1.setAge((short)1.5);
		d1.setArea(Area.CENTER);
		d1.setBreed(DogBreeds.Pomeranian);
		//User user1 = new User("לוקה","מודריץ");		
		//d1.setOwner(user1);
		d1.setPicture("../../assets/images/1.jpg");
		d1.setDescription("פו ,כלבת פומרניאן מלאכית ומיוחדת. מלאני חברותית ומסתדרת מצוין עם כלבים ובני אדם, בת כשנה וחצי ובגודל קטן. מלאני מעוקרת ומחוסנת מלא ותמסר בסל אימוץ. נמצאת באומנה באיזור המרכז.");
		d1.setGender(Gender.FEMALE);
		d1.setSize(Size.SMALL);
		dogs.add(d1);
		
		Dog d2 = new Dog();
		d2.setId("2");
		d2.setName("טופי");
		d2.setColor("לבן");
		d2.setAge((short)0.4);
		d2.setArea(Area.CENTER);
		d2.setBreed(DogBreeds.BullTerrier);
		//User user2 = new User("כריסטיאנו","רונלדו");		
		//d2.setOwner(user2);
		d2.setPicture("../../assets/images/2.jpg");
		d2.setDescription("לאימוץ!!! טופי בת ה-4 חודשים. טופי תגדל לגודל בינוני ותימסר תמורת סל אימוץ. טופי מתוקה ומסתדרת עם כולם ובייחוד עם ילדים. טופי יודעת לעשות צרכים על עיתון. היא טובה ומקסימה ותתאים לכולם.");
		d2.setGender(Gender.FEMALE);
		d2.setSize(Size.MEDIUM);
		dogs.add(d2);
		
		Dog d5 = new Dog();
		d5.setId("5");
		d5.setName("ג'וי");
		d5.setColor("חום");
		d5.setAge((short)4);
		d5.setArea(Area.CENTER);
		d5.setBreed(DogBreeds.AnatolianShepherd);
		//User user5 = new User("קרוס","טוני");		
		//d5.setOwner(user5);
		d5.setPicture("../../assets/images/5.jpg");
		d5.setDescription("לא תושיטו גם לג'וי יד? ג'וי ננטשה בהסגר אחרי שהיתה בבית 4 שנים... עברה אילוף דרך העמותה והיא אידאלית לבית עם זוג צעיר. בת 4 שנים, מעוקרת ומחוסנת, ועם לב גדול ורחב.. אוהבת לשחק ואוהבת לאהוב!!! מי שיכול בבקשה לעזור..");
		d5.setGender(Gender.FEMALE);
		d5.setSize(Size.MEDIUM);
		dogs.add(d5);
		
		Dog d7 = new Dog();
		d7.setId("7");
		d7.setName("בונו");
		d7.setColor("לבן");
		d7.setAge((short)0.5);
		d7.setArea(Area.CENTER);
		d7.setBreed(DogBreeds.Basenji);
		//User user7 = new User("בייל","גארת");		
		//d7.setOwner(user7);
		d7.setPicture("../../assets/images/7.jpg");
		d7.setDescription("בונו גור בן חמישה חודשים משוטט באחד המושבים. המשפחה ששמה לו קולר מאכילה אותו פעם ביום אבל הוא לא יכול להכנס אליהם כי יש להם כלב תוקפן אז הוא ישן מתחת למבנה. מתאים למשפחה עם ילדים!! הוא עדין ומעט חששן אבל טוב. כל כך טוב ועדין שהוא לא ישרוד את החיים המחוספסים בחוץ.");
		d7.setGender(Gender.MALE);
		d7.setSize(Size.SMALL);
		dogs.add(d7);
		
		Dog d9 = new Dog();
		d9.setId("9");
		d9.setName("כורכום");
		d9.setColor("חום");
		d9.setAge((short)4);
		d9.setArea(Area.CENTER);
		d9.setBreed(DogBreeds.MiniaturePinscher);
		//User user9 = new User("קרבחאל","דני");		
		//d9.setOwner(user9);
		d9.setPicture("../../assets/images/9.jpg");
		d9.setDescription("כורכום, עוד שנה ועוד שנה ועוד שנה ואין לך בית. פינצ'ר קטן ומתוק שלא עשה שום דבר רע בחייו ונאלץ לחכות שוב ושוב לבית המתאים. כורכום הקטן בן 4 וחווה נטישה ששברה לו את הלב. עכשיו אחרי כל כך הרבה זמן, גם תורו הגיע. הוא מחונך, מחוסן ומסורס. מסתדר עם כלבים וחתולים. כל מה שהוא רוצה זה אהבה! מה יותר מזה? **נמצא כרגע ברמת גן");
		d9.setGender(Gender.MALE);
		d9.setSize(Size.SMALL);
		dogs.add(d9);
		
		Dog d12 = new Dog();
		d12.setId("12");
		d12.setName("טאקו");
		d12.setColor("אפור");
		d12.setAge((short)10);
		d12.setArea(Area.SOUTH);
		d12.setBreed(DogBreeds.Pekingese);
		//User user8 = new User("וראן","רפאל");		
		//d12.setOwner(user8);
		d12.setPicture("../../assets/images/12.jpg");
		d12.setDescription("טאקו בן 10 יפיוף מתוק שצריך להיזהר לא למעוך אותו מרוב שהוא מתוק. ימסר לבית ללא ילדים כי עלול לנשוך. יימסר תמורת סל אימוץ.");
		d12.setGender(Gender.MALE);
		d12.setSize(Size.SMALL);
		dogs.add(d12);
		
		Dog d13 = new Dog();
		d13.setId("13");
		d13.setName("מישמיש");
		d13.setColor("לבן");
		d13.setAge((short)13);
		d13.setArea(Area.SOUTH);
		d13.setBreed(DogBreeds.Poodle);
		//User user8 = new User("וראן","רפאל");		
		//d13.setOwner(user8);
		d13.setPicture("../../assets/images/13.jpg");
		d13.setDescription("לאקי בן 10, כלב מדהים מחונך ונאמן. אנרגטי מאוד. לצערי לי ולמשפחתי אין את היכולת לטפל בו ואנחנו לא רוצים להחזיר אותו לעמותה אם תוכלי לאמץ אותו ולהפוך אותו לחלק מהמשפחה שלך הוא יהיה המאושר בכלבים! הוא כלב מדהים שיודע להעניק חום ואהבה, אם את בעניין את מוזמנת לשלוח הודעה או להתקשר");
		d13.setGender(Gender.MALE);
		d13.setSize(Size.SMALL);
		dogs.add(d13);
		
		Dog d14 = new Dog();
		d14.setId("14");
		d14.setName("בלאנקה");
		d14.setColor("לבן");
		d14.setAge((short)3.5);
		d14.setArea(Area.SOUTH);
		d14.setBreed(DogBreeds.Maltese);
		//User user8 = new User("וראן","רפאל");		
		//d14.setOwner(user8);
		d14.setPicture("../../assets/images/14.jpg");
		d14.setDescription("בלאנקה המתוקה מחכה לבית משלה, היא בת שלוש וחצי, פצפונת ומתוקה מאוד. נמצאת במשפחת אומנה ומחכה למשפחה האמיתית שלה, היא מסתדרת עם אנשים לאחר היכרות ראשונית ותעדיף להיות בת יחידה בבית ללא כלבים נוספים. איך אפשר לסרב למבט כזה? :)");
		d14.setGender(Gender.FEMALE);
		d14.setSize(Size.SMALL);
		dogs.add(d14);
		
		Dog d15 = new Dog();
		d15.setId("15");
		d15.setName("לינדה");
		d15.setColor("חום");
		d15.setAge((short)2);
		d15.setArea(Area.CENTER);
		d15.setBreed(DogBreeds.MiniaturePinscher);
		//User user8 = new User("וראן","רפאל");		
		//d15.setOwner(user8);
		d15.setPicture("../../assets/images/15.jpg");
		d15.setDescription("לינדה - פינצ'רית מעורבת, בת כשנתיים, מחוסנת ומעוקרת, מאוד חברותית, טובה עם חתולים ופעלתנית במיוחד. לינדה היא תוססת ומתוקה ואוהבת את כולם.");
		d15.setGender(Gender.FEMALE);
		d15.setSize(Size.SMALL);
		dogs.add(d15);
		
		System.out.println(new ObjectMapper().writeValueAsString(dogs));
		dogs.clear();
		//----------------------
		
		
		Dog d3 = new Dog();
		d3.setId("3");
		d3.setName("סולי");
		d3.setColor("לבן");
		d3.setAge((short)3.5);
		d3.setArea(Area.NORTH);
		d3.setBreed(DogBreeds.LabradorRetriever);
		//User user3 = new User("מסיקה","מירי");		
		//d3.setOwner(user3);
		d3.setPicture("../../assets/images/3.jpg");
		d3.setDescription("סולי שמו, וכשמו כן הוא - כלב נשמה. כשהוא אוהב זה מכל הלב, מסירות ללא גבול ונאמנות עד אין קץ. סולי עבר קורס אילוף ומתאים להובלת אנשים בעלי מוגבלויות. אז איך זה שמהיותו גור הוא רק מתחנן שמישהו יבחין בו? אני לא אוותר ואמשיך להפיץ אותו עד שיגיע האחד שירים את הכפפה ויציל את סולי ויזכה בחבר מושלם ואוהב. סולי מסורס, משובב מחוסן בכל החיסונים, מחונך לצרכים. מסתדר עם כל הכלבים. אינו כלב שמירה, ולא מתאים למשפחה עם ילדים קטנים.");
		d3.setGender(Gender.MALE);
		d3.setSize(Size.BIG);
		dogs.add(d3);
		
		Dog d4 = new Dog();
		d4.setId("4");
		d4.setName("לאון");
		d4.setColor("לבן");
		d4.setAge((short)9);
		d4.setArea(Area.CENTER);
		d4.setBreed(DogBreeds.GoldenRetriever);
		//User user4 = new User("רמוס","סרחיו");		
		//d4.setOwner(user4);
		d4.setPicture("../../assets/images/4.jpg");
		d4.setDescription("מדובר בליאון- כלב גולדן מעורב, בן כמעט 9, מסורס ומחוסן. עושה צרכים בחוץ, מאולף לאחר קורס מותאם לאנשים בעלי מוגבלויות. חמוד חמוד חמוד, אוהב חיבוקים ופינוקים!! בגלל רילוקשיין מחפשים לו בית חם ואוהב..");
		d4.setGender(Gender.MALE);
		d4.setSize(Size.BIG);
		dogs.add(d4);
		
		Dog d6 = new Dog();
		d6.setId("6");
		d6.setName("רודי");
		d6.setColor("חום");
		d6.setAge((short)0.2);
		d6.setArea(Area.NORTH);
		d6.setBreed(DogBreeds.GermanShepherd);
		//User user6 = new User("מרסלו","מר");		
		//d6.setOwner(user6);
		d6.setPicture("../../assets/images/6.jpg");
		d6.setDescription("רודי. רודי חמודי התינוק המתוק בן חודשיים. מתלטף ואוהב. מסתדר עם כולם. יהיה בינוני פלוס. נמצא באומנה בחיפה...");
		d6.setGender(Gender.MALE);
		d6.setSize(Size.MEDIUM);
		dogs.add(d6);
		
		Dog d8 = new Dog();
		d8.setId("8");
		d8.setName("לאקי");
		d8.setColor("שחור");
		d8.setAge((short)10);
		d8.setArea(Area.SOUTH);
		d8.setBreed(DogBreeds.BorderCollie);
		//User user8 = new User("וראן","רפאל");		
		//d8.setOwner(user8);
		d8.setPicture("../../assets/images/8.jpg");
		d8.setDescription("לאקי בן 10, כלב מדהים מחונך ונאמן. אנרגטי מאוד. לצערי לי ולמשפחתי אין את היכולת לטפל בו ואנחנו לא רוצים להחזיר אותו לעמותה אם תוכלי לאמץ אותו ולהפוך אותו לחלק מהמשפחה שלך הוא יהיה המאושר בכלבים! הוא כלב מדהים שיודע להעניק חום ואהבה");
		d8.setGender(Gender.MALE);
		d8.setSize(Size.BIG);
		dogs.add(d8);
			
		Dog d10 = new Dog();
		d10.setId("10");
		d10.setName("מלאני");
		d10.setColor("חום");
		d10.setAge((short)10);
		d10.setArea(Area.SOUTH);
		d10.setBreed(DogBreeds.AmericanPitBullTerrier);
		//User user10 = new User("פרננדס","נאצ'ו");		
		//d10.setOwner(user10);
		d10.setPicture("../../assets/images/10.jpg");
		d10.setDescription("מלאני ,כלבת פיטבול מלאכית ומיוחדת. מלאני חברותית ומסתדרת מצוין עם כלבים ובני אדם, בת כשנה וחצי ובגודל בינוני . מלאני מעוקרת ומחוסנת מלא ותמסר בסל אימוץ. נמצאת באומנה באיזור הצפון .ד !!!!");
		d10.setGender(Gender.FEMALE);
		d10.setSize(Size.BIG);
		dogs.add(d10);
		
		Dog d11 = new Dog();
		d11.setId("11");
		d11.setName("דונאט");
		d11.setColor("שחור");
		d11.setAge((short)0.10);
		d11.setArea(Area.SOUTH);
		d11.setBreed(DogBreeds.Greyhound);
		//User user11 = new User("מוראטה","אלבארו");		
		//d11.setOwner(user11);
		d11.setPicture("../../assets/images/11.jpg");
		d11.setDescription("דונאט, הכלב הכי הכי מתוק שיש- יותר מסופגנייה. חמודיק כזה בן 10 חודשים. גורון מתבגר מקסים מקסים מקסים. אוהב פינוקים וחיבוקים ונישוקים, אוהב לשחק עם כלבים אחרים, יש לו מבט ממיס עם שתי העיניים הקרובות והמצחיקות שלו והנביחות הכי חמודות שתשמעו. דונאט חייב בית מאמץ  או אומנה מיידית ");
		d11.setGender(Gender.MALE);
		d11.setSize(Size.BIG);
		dogs.add(d11);
		
		Dog d16 = new Dog();
		d16.setId("16");
		d16.setName("שלג");
		d16.setColor("לבן");
		d16.setAge((short)2);
		d16.setArea(Area.SOUTH);
		d16.setBreed(DogBreeds.LabradorRetriever);
		//User user8 = new User("וראן","רפאל");		
		//d16.setOwner(user8);
		d16.setPicture("../../assets/images/16.jpg");
		d16.setDescription("לברדור מעורב בצבע לבן בן שנתיים, חזק ומסיבי. כלב יפה וחתיך שזקוק למישהו עם הרבה כוח שיוכל להשתלט עליו ולהכניס לחייו קצת משמעת וגבולות");
		d16.setGender(Gender.MALE);
		d16.setSize(Size.BIG);
		dogs.add(d16);
		
		System.out.println(new ObjectMapper().writeValueAsString(dogs));*/
	}
}
