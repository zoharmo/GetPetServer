package data;

import static org.junit.Assert.*;

import org.junit.Test;

import crud.Dogs;
import entities.Dog;
import enums.*;

public class dogForAdotion {

	@Test
	public void test() {
		clean();
	
		Dog d1 = new Dog("דובי", new Colors[] {Colors.BEZ},4.0, Area.CENTER,Gender.MALE, Size.MEDIUM,DogBreeds.GoldenRetriever,
						Utils.encodeFileToBase64Binary("1"),"דובי זקוק למישהו מיוחד, שיהיה שלו , לעד . שיקבל, ויכיל - ויהיה מוכן לתת לדובי להתאהב בו..."
								+ " ויהיה מוכן להתמודד עם כלב תוקפן כלפי חוץ. כי כרגע, הוא מבלה את חייו בכלוב ..", "אורנית","ראשלצ" ,"050-934-4563");
		Dog d2 = new Dog("בלה", new Colors[] {Colors.BROWN},0.2, Area.NORTH,Gender.FEMALE, Size.SMALL,DogBreeds.RhodesianRidgeback,
				Utils.encodeFileToBase64Binary("2"),"מלאכית קטנה ומתוקה שרק רוצה לקבל חיבוקים ואהבה, תמסר לבית רגוע ואוהב", "תנו לחיות לחיות טבעון והעמקים", "טבעון","050-3199395");

		Dogs.save(d2);
		Dogs.save(d1);
		
	}
	
	public void clean(){
		Dogs.removeByDogName("בלה");
		Dogs.removeByDogName("דובי");
	}
	
}
