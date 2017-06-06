package InitDB;

import org.junit.Test;

import crud.Dogs;
import data.Utils;
import entities.Dog;
import enums.Area;
import enums.Colors;
import enums.DogBreeds;
import enums.Gender;
import enums.Size;

public class InitDBDogs {
	@Test
	public void addDogs() {	
		
		Dog dog1 = new Dog("פו", new Colors[]{Colors.BROWN}, 1.5, Area.CENTER, Gender.FEMALE, Size.SMALL, DogBreeds.Pomeranian,
				Utils.encodeFileToBase64Binary("1"), "פו ,כלבת פומרניאן מלאכית ומיוחדת. פו חברותית ומסתדרת מצוין עם כלבים ובני אדם, בת כשנה וחצי ובגודל קטן. פו מעוקרת ומחוסנת מלא. נמצאת באומנה באיזור המרכז.",
				"","","");
		Dogs.save(dog1);
		
		Dog dog2 = new Dog("פו", new Colors[]{Colors.WHITE}, 0.4, Area.CENTER, Gender.FEMALE, Size.MEDIUM, DogBreeds.BullTerrier,
				Utils.encodeFileToBase64Binary("2"), "לאימוץ!!! טופי בת ה-4 חודשים. טופי תגדל לגודל בינוני ותימסר תמורת סל אימוץ. טופי מתוקה ומסתדרת עם כולם ובייחוד עם ילדים. טופי יודעת לעשות צרכים על עיתון. היא טובה ומקסימה ותתאים לכולם.",
				"","","");
		Dogs.save(dog2);
		
		Dog dog3 = new Dog("סולי", new Colors[]{Colors.WHITE}, 3.5, Area.NORTH, Gender.MALE, Size.BIG, DogBreeds.LabradorRetriever,
				Utils.encodeFileToBase64Binary("3"), 
				"סולי שמו, וכשמו כן הוא - כלב נשמה. כשהוא אוהב זה מכל הלב, מסירות ללא גבול ונאמנות עד אין קץ. סולי עבר קורס אילוף ומתאים להובלת אנשים בעלי מוגבלויות. אז איך זה שמהיותו גור הוא רק מתחנן שמישהו יבחין בו? "
				+ "אני לא אוותר ואמשיך להפיץ אותו עד שיגיע האחד שירים את הכפפה ויציל את סולי ויזכה בחבר מושלם ואוהב. סולי מסורס, משובב מחוסן בכל החיסונים, מחונך לצרכים. מסתדר עם כל הכלבים. אינו כלב שמירה, ולא מתאים למשפחה עם ילדים קטנים.",
				"","","");
		Dogs.save(dog3);
		
		Dog dog4 = new Dog("לאון", new Colors[]{Colors.WHITE}, 9.0, Area.CENTER, Gender.MALE, Size.BIG, DogBreeds.GoldenRetriever,
				Utils.encodeFileToBase64Binary("4"), 
				"מדובר בליאון- כלב גולדן מעורב, בן כמעט 9, מסורס ומחוסן. עושה צרכים בחוץ, מאולף לאחר קורס מותאם לאנשים בעלי מוגבלויות. חמוד חמוד חמוד, אוהב חיבוקים ופינוקים!! בגלל רילוקשיין מחפשים לו בית חם ואוהב..",
				"","","");
		Dogs.save(dog4);
		
		Dog dog5 = new Dog("ג'וי", new Colors[]{Colors.BROWN}, 4.0, Area.CENTER, Gender.FEMALE, Size.MEDIUM, DogBreeds.AnatolianShepherd,
				Utils.encodeFileToBase64Binary("5"), 
				"לא תושיטו גם לג'וי יד? ג'וי ננטשה בהסגר אחרי שהיתה בבית 4 שנים... עברה אילוף דרך העמותה והיא אידאלית לבית עם זוג צעיר. בת 4 שנים, מעוקרת ומחוסנת, ועם לב גדול ורחב.. אוהבת לשחק ואוהבת לאהוב!!!..",
				"","","");
		Dogs.save(dog5);
		
		Dog dog6 = new Dog("רודי", new Colors[]{Colors.BROWN}, 0.2, Area.NORTH, Gender.MALE, Size.MEDIUM, DogBreeds.GermanShepherd,
				Utils.encodeFileToBase64Binary("6"), "רודי. רודי חמודי התינוק המתוק בן חודשיים. מתלטף ואוהב. מסתדר עם כולם. יהיה בינוני פלוס. נמצא באומנה בחיפה...",
				"","","");
		Dogs.save(dog6);
		
		Dog dog7 = new Dog("בונו", new Colors[]{Colors.WHITE}, 0.5, Area.CENTER, Gender.MALE, Size.SMALL, DogBreeds.Basenji,
				Utils.encodeFileToBase64Binary("7"),
				"בונו גור בן חמישה חודשים משוטט באחד המושבים. "
				+ "המשפחה ששמה לו קולר מאכילה אותו פעם ביום אבל הוא לא יכול להכנס אליהם כי יש להם כלב תוקפן אז הוא ישן מתחת למבנה. מתאים למשפחה עם ילדים!! הוא עדין ומעט חששן אבל טוב. כל כך טוב ועדין שהוא לא ישרוד את החיים המחוספסים בחוץ.",
				"","","");
		Dogs.save(dog7);
		
		Dog dog8 = new Dog("לאקי", new Colors[]{Colors.BLACK}, 10.0, Area.SOUTH, Gender.MALE, Size.BIG, DogBreeds.BorderCollie,
				Utils.encodeFileToBase64Binary("8"), 
				"לאקי בן 10, כלב מדהים מחונך ונאמן. אנרגטי מאוד. לצערי לי ולמשפחתי אין את היכולת לטפל בו ואנחנו לא רוצים להחזיר אותו לעמותה אם תוכלי לאמץ אותו ולהפוך אותו לחלק מהמשפחה שלך הוא יהיה המאושר בכלבים! הוא כלב מדהים שיודע להעניק חום ואהבה",
				"","","");
		Dogs.save(dog8);
		
		Dog dog9 = new Dog("כורכום", new Colors[]{Colors.BROWN}, 4.0, Area.CENTER, Gender.MALE, Size.SMALL, DogBreeds.MiniaturePinscher,
				Utils.encodeFileToBase64Binary("9"), 
				"כורכום, עוד שנה ועוד שנה ועוד שנה ואין לך בית. פינצ'ר קטן ומתוק שלא עשה שום דבר רע בחייו ונאלץ לחכות שוב ושוב לבית המתאים. כורכום הקטן בן 4 וחווה נטישה ששברה לו את הלב."
				+ " עכשיו אחרי כל כך הרבה זמן, גם תורו הגיע. הוא מחונך, מחוסן ומסורס. מסתדר עם כלבים וחתולים. כל מה שהוא רוצה זה אהבה! מה יותר מזה? **נמצא כרגע ברמת גן",
				"","","");
		Dogs.save(dog9);
		
		Dog dog10 = new Dog("מלאני", new Colors[]{Colors.BROWN}, 10.0, Area.SOUTH, Gender.FEMALE, Size.BIG, DogBreeds.AmericanPitBullTerrier,
				Utils.encodeFileToBase64Binary("10"),
				"מלאני ,כלבת פיטבול מלאכית ומיוחדת. מלאני חברותית ומסתדרת מצוין עם כלבים ובני אדם, בת כשנה וחצי ובגודל בינוני . מלאני מעוקרת ומחוסנת מלא ותמסר בסל אימוץ. נמצאת באומנה באיזור הצפון . !!!!",
				"","","");
		Dogs.save(dog10);
		
		Dog dog11 = new Dog("דונאט", new Colors[]{Colors.BLACK}, 0.10, Area.SOUTH, Gender.MALE, Size.BIG, DogBreeds.Greyhound,
				Utils.encodeFileToBase64Binary("11"),
				"דונאט, הכלב הכי הכי מתוק שיש- יותר מסופגנייה. חמודיק כזה בן 10 חודשים. גורון מתבגר מקסים מקסים מקסים. "
				+ "7אוהב פינוקים וחיבוקים ונישוקים, אוהב לשחק עם כלבים אחרים, יש לו מבט ממיס עם שתי העיניים הקרובות והמצחיקות שלו והנביחות הכי חמודות שתשמעו. דונאט חייב בית מאמץ  או אומנה מיידית ",
				"","","");
		Dogs.save(dog11);
		
		Dog dog12 = new Dog("טאקו", new Colors[]{Colors.GREY}, 10.0, Area.SOUTH, Gender.MALE, Size.SMALL, DogBreeds.Pekingese,
				Utils.encodeFileToBase64Binary("12"), "טאקו בן 10 יפיוף מתוק שצריך להיזהר לא למעוך אותו מרוב שהוא מתוק. ימסר לבית ללא ילדים כי עלול לנשוך..",
				"","","");
		Dogs.save(dog12);
		
		Dog dog13 = new Dog("מישמיש", new Colors[]{Colors.WHITE}, 13.0, Area.SOUTH, Gender.MALE, Size.SMALL, DogBreeds.Poodle,
				Utils.encodeFileToBase64Binary("13"), 
				"לאקי בן 10, כלב מדהים מחונך ונאמן. אנרגטי מאוד. לצערי לי ולמשפחתי אין את היכולת לטפל בו ואנחנו לא רוצים להחזיר אותו לעמותה אם תוכלי לאמץ אותו ולהפוך אותו לחלק מהמשפחה שלך הוא יהיה המאושר בכלבים!"
				+ " הוא כלב מדהים שיודע להעניק חום ואהבה, אם את בעניין את מוזמנת לשלוח הודעה או להתקשר",
				"","","");
		Dogs.save(dog13);
		
		Dog dog14 = new Dog("בלאנקה", new Colors[]{Colors.WHITE}, 3.5, Area.SOUTH, Gender.FEMALE, Size.SMALL, DogBreeds.Maltese,
				Utils.encodeFileToBase64Binary("14"), 
				"בלאנקה המתוקה מחכה לבית משלה, היא בת שלוש וחצי, פצפונת ומתוקה מאוד. נמצאת במשפחת אומנה ומחכה למשפחה האמיתית שלה, היא מסתדרת עם אנשים לאחר היכרות ראשונית ותעדיף להיות בת יחידה בבית ללא כלבים נוספים. איך אפשר לסרב למבט כזה? :)",
				"","","");
		Dogs.save(dog14);
		
		Dog dog15 = new Dog("לינדה", new Colors[]{Colors.BROWN}, 2.0, Area.CENTER, Gender.FEMALE, Size.SMALL, DogBreeds.MiniaturePinscher,
				Utils.encodeFileToBase64Binary("15"), "לינדה - פינצ'רית מעורבת, בת כשנתיים, מחוסנת ומעוקרת, מאוד חברותית, טובה עם חתולים ופעלתנית במיוחד. לינדה היא תוססת ומתוקה ואוהבת את כולם.",
				"","","");
		Dogs.save(dog15);
		
		Dog dog16 = new Dog("שלג", new Colors[]{Colors.WHITE}, 2.0, Area.SOUTH, Gender.MALE, Size.BIG, DogBreeds.LabradorRetriever,
				Utils.encodeFileToBase64Binary("16"), "לברדור מעורב בצבע לבן בן שנתיים, חזק ומסיבי. כלב יפה וחתיך שזקוק למישהו עם הרבה כוח שיוכל להשתלט עליו ולהכניס לחייו קצת משמעת וגבולות",
				"","","");
		Dogs.save(dog16);
	}
}
