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
				"אורית", "ראשון לציון","050-9546328");
		Dogs.save(dog1);
		
		Dog dog2 = new Dog("טופי", new Colors[]{Colors.WHITE}, 0.4, Area.CENTER, Gender.FEMALE, Size.MEDIUM, DogBreeds.BullTerrier,
				Utils.encodeFileToBase64Binary("2"), "לאימוץ!!! טופי בת ה-4 חודשים. טופי תגדל לגודל בינוני ותימסר תמורת סל אימוץ. טופי מתוקה ומסתדרת עם כולם ובייחוד עם ילדים. טופי יודעת לעשות צרכים על עיתון. היא טובה ומקסימה ותתאים לכולם.",
				"אורית", "ראשון לציון","050-9546328");
		Dogs.save(dog2);
		
		Dog dog3 = new Dog("סולי", new Colors[]{Colors.WHITE}, 3.5, Area.NORTH, Gender.MALE, Size.BIG, DogBreeds.LabradorRetriever,
				Utils.encodeFileToBase64Binary("3"), 
				"סולי שמו, וכשמו כן הוא - כלב נשמה. כשהוא אוהב זה מכל הלב, מסירות ללא גבול ונאמנות עד אין קץ. סולי עבר קורס אילוף ומתאים להובלת אנשים בעלי מוגבלויות. אז איך זה שמהיותו גור הוא רק מתחנן שמישהו יבחין בו? "
				+ "אני לא אוותר ואמשיך להפיץ אותו עד שיגיע האחד שירים את הכפפה ויציל את סולי ויזכה בחבר מושלם ואוהב. סולי מסורס, משובב מחוסן בכל החיסונים, מחונך לצרכים. מסתדר עם כל הכלבים. אינו כלב שמירה, ולא מתאים למשפחה עם ילדים קטנים.",
				"אריק כהן","נהריה","052-9651254");
		Dogs.save(dog3);
		
		Dog dog4 = new Dog("לאון", new Colors[]{Colors.WHITE}, 9.0, Area.CENTER, Gender.MALE, Size.BIG, DogBreeds.GoldenRetriever,
				Utils.encodeFileToBase64Binary("4"), 
				"מדובר בליאון- כלב גולדן מעורב, בן כמעט 9, מסורס ומחוסן. עושה צרכים בחוץ, מאולף לאחר קורס מותאם לאנשים בעלי מוגבלויות. חמוד חמוד חמוד, אוהב חיבוקים ופינוקים!! בגלל רילוקשיין מחפשים לו בית חם ואוהב..",
				"אריק כהן","נהריה","052-9651254");
		Dogs.save(dog4);
		
		Dog dog5 = new Dog("ג'וי", new Colors[]{Colors.BROWN}, 4.0, Area.CENTER, Gender.FEMALE, Size.MEDIUM, DogBreeds.AnatolianShepherd,
				Utils.encodeFileToBase64Binary("5"), 
				"לא תושיטו גם לג'וי יד? ג'וי ננטשה בהסגר אחרי שהיתה בבית 4 שנים... עברה אילוף דרך העמותה והיא אידאלית לבית עם זוג צעיר. בת 4 שנים, מעוקרת ומחוסנת, ועם לב גדול ורחב.. אוהבת לשחק ואוהבת לאהוב!!!..",
				"אורן", "הרצליה","050-3209755");
		Dogs.save(dog5);
		
		Dog dog6 = new Dog("רודי", new Colors[]{Colors.BROWN}, 0.2, Area.NORTH, Gender.MALE, Size.MEDIUM, DogBreeds.GermanShepherd,
				Utils.encodeFileToBase64Binary("6"), "רודי. רודי חמודי התינוק המתוק בן חודשיים. מתלטף ואוהב. מסתדר עם כולם. יהיה בינוני פלוס. נמצא באומנה בחיפה...",
				"אורן", "הרצליה","050-3209755");
		Dogs.save(dog6);
		
		Dog dog7 = new Dog("בונו", new Colors[]{Colors.WHITE}, 0.5, Area.CENTER, Gender.MALE, Size.SMALL, DogBreeds.Basenji,
				Utils.encodeFileToBase64Binary("7"),
				"בונו גור בן חמישה חודשים משוטט באחד המושבים. "
				+ "המשפחה ששמה לו קולר מאכילה אותו פעם ביום אבל הוא לא יכול להכנס אליהם כי יש להם כלב תוקפן אז הוא ישן מתחת למבנה. מתאים למשפחה עם ילדים!! הוא עדין ומעט חששן אבל טוב. כל כך טוב ועדין שהוא לא ישרוד את החיים המחוספסים בחוץ.",
				"אריק כהן","נהריה","052-9651254");
		Dogs.save(dog7);
		
		Dog dog8 = new Dog("לאקי", new Colors[]{Colors.BLACK}, 10.0, Area.SOUTH, Gender.MALE, Size.BIG, DogBreeds.BorderCollie,
				Utils.encodeFileToBase64Binary("8"), 
				"לאקי בן 10, כלב מדהים מחונך ונאמן. אנרגטי מאוד. לצערי לי ולמשפחתי אין את היכולת לטפל בו ואנחנו לא רוצים להחזיר אותו לעמותה אם תוכלי לאמץ אותו ולהפוך אותו לחלק מהמשפחה שלך הוא יהיה המאושר בכלבים! הוא כלב מדהים שיודע להעניק חום ואהבה",
				"חיים", "קרית גת","050-3209755");
		Dogs.save(dog8);
		
		Dog dog9 = new Dog("כורכום", new Colors[]{Colors.BROWN}, 4.0, Area.CENTER, Gender.MALE, Size.SMALL, DogBreeds.MiniaturePinscher,
				Utils.encodeFileToBase64Binary("9"), 
				"כורכום, עוד שנה ועוד שנה ועוד שנה ואין לך בית. פינצ'ר קטן ומתוק שלא עשה שום דבר רע בחייו ונאלץ לחכות שוב ושוב לבית המתאים. כורכום הקטן בן 4 וחווה נטישה ששברה לו את הלב."
				+ " עכשיו אחרי כל כך הרבה זמן, גם תורו הגיע. הוא מחונך, מחוסן ומסורס. מסתדר עם כלבים וחתולים. כל מה שהוא רוצה זה אהבה! מה יותר מזה? **נמצא כרגע ברמת גן",
				"אורן", "הרצליה","050-3209755");
		Dogs.save(dog9);
		
		Dog dog10 = new Dog("מלאני", new Colors[]{Colors.BROWN}, 10.0, Area.NORTH, Gender.FEMALE, Size.BIG, DogBreeds.AmericanPitBullTerrier,
				Utils.encodeFileToBase64Binary("10"),
				"מלאני ,כלבת פיטבול מלאכית ומיוחדת. מלאני חברותית ומסתדרת מצוין עם כלבים ובני אדם, בת כשנה וחצי ובגודל בינוני . מלאני מעוקרת ומחוסנת מלא ותמסר בסל אימוץ. נמצאת באומנה באיזור הצפון . !!!!",
				"ארז", "קרית מוצקין","050-3209755");
		Dogs.save(dog10);
		
		Dog dog11 = new Dog("דונאט", new Colors[]{Colors.BLACK}, 0.10, Area.SOUTH, Gender.MALE, Size.BIG, DogBreeds.Greyhound,
				Utils.encodeFileToBase64Binary("11"),
				"דונאט, הכלב הכי הכי מתוק שיש- יותר מסופגנייה. חמודיק כזה בן 10 חודשים. גורון מתבגר מקסים מקסים מקסים. "
				+ "7אוהב פינוקים וחיבוקים ונישוקים, אוהב לשחק עם כלבים אחרים, יש לו מבט ממיס עם שתי העיניים הקרובות והמצחיקות שלו והנביחות הכי חמודות שתשמעו. דונאט חייב בית מאמץ  או אומנה מיידית ",
				"אילנה", "אשקלון","050-3209755");
		Dogs.save(dog11);
		
		Dog dog12 = new Dog("טאקו", new Colors[]{Colors.GREY}, 10.0, Area.SOUTH, Gender.MALE, Size.SMALL, DogBreeds.Pekingese,
				Utils.encodeFileToBase64Binary("12"), "טאקו בן 10 יפיוף מתוק שצריך להיזהר לא למעוך אותו מרוב שהוא מתוק. ימסר לבית ללא ילדים כי עלול לנשוך..",
				"אילנה", "אשקלון","050-3209755");
		Dogs.save(dog12);
		
		Dog dog13 = new Dog("מישמיש", new Colors[]{Colors.WHITE}, 13.0, Area.SOUTH, Gender.MALE, Size.SMALL, DogBreeds.Poodle,
				Utils.encodeFileToBase64Binary("13"), 
				"לאקי בן 10, כלב מדהים מחונך ונאמן. אנרגטי מאוד. לצערי לי ולמשפחתי אין את היכולת לטפל בו ואנחנו לא רוצים להחזיר אותו לעמותה אם תוכלי לאמץ אותו ולהפוך אותו לחלק מהמשפחה שלך הוא יהיה המאושר בכלבים!"
				+ " הוא כלב מדהים שיודע להעניק חום ואהבה, אם את בעניין את מוזמנת לשלוח הודעה או להתקשר",
				"עומר", "באר שבע","050-3209755");
		Dogs.save(dog13);
		
		Dog dog14 = new Dog("בלאנקה", new Colors[]{Colors.WHITE}, 3.5, Area.SOUTH, Gender.FEMALE, Size.SMALL, DogBreeds.Maltese,
				Utils.encodeFileToBase64Binary("14"), 
				"בלאנקה המתוקה מחכה לבית משלה, היא בת שלוש וחצי, פצפונת ומתוקה מאוד. נמצאת במשפחת אומנה ומחכה למשפחה האמיתית שלה, היא מסתדרת עם אנשים לאחר היכרות ראשונית ותעדיף להיות בת יחידה בבית ללא כלבים נוספים. איך אפשר לסרב למבט כזה? :)",
				"קורל", "אשדוד","050-4752075");
		Dogs.save(dog14);
		
		Dog dog15 = new Dog("לינדה", new Colors[]{Colors.BROWN}, 2.0, Area.CENTER, Gender.FEMALE, Size.SMALL, DogBreeds.MiniaturePinscher,
				Utils.encodeFileToBase64Binary("15"), "לינדה - פינצ'רית מעורבת, בת כשנתיים, מחוסנת ומעוקרת, מאוד חברותית, טובה עם חתולים ופעלתנית במיוחד. לינדה היא תוססת ומתוקה ואוהבת את כולם.",
				"רענן", "רעננה","050-4752075");
		Dogs.save(dog15);
		
		Dog dog16 = new Dog("שלג", new Colors[]{Colors.WHITE}, 2.0, Area.SOUTH, Gender.MALE, Size.BIG, DogBreeds.LabradorRetriever,
				Utils.encodeFileToBase64Binary("16"), "לברדור מעורב בצבע לבן בן שנתיים, חזק ומסיבי. כלב יפה וחתיך שזקוק למישהו עם הרבה כוח שיוכל להשתלט עליו ולהכניס לחייו קצת משמעת וגבולות",
				"שולי", "יבנה","050-4752075");
		Dogs.save(dog16);
		
		Dog blue17 = new Dog("בלו", new Colors[]{Colors.BLACK,Colors.WHITE}, 0.25, Area.JERUSALEM, Gender.MALE, Size.MEDIUM, DogBreeds.AustralianShepherd, Utils.encodeFileToBase64Binary("17blue"), 
							"הגור בלו חכם, שובב, אוהב לשחק, אנרגטי, נאמן וחברותי. יהיה החבר הכי טוב של מי שיאמץ אותו.  זהו גור עם אופי מאוד טוב ונוח, מסתדר עם כולם ויימסר לבית חם ואחראי",
							"רינה", "שדרות אביי ורבא 1, מודיעין עילית ","052-4419906");
		Dogs.save(blue17);
		
		Dog soda18 = new Dog("סודה", new Colors[]{Colors.BROWN,Colors.WHITE}, 0.5, Area.CENTER, Gender.FEMALE, Size.MEDIUM, DogBreeds.Canaan, Utils.encodeFileToBase64Binary("18soda"), 
				"סודה גורה בת חצי שנה, עדינה, חכמה וחברותית, מחפשת משפחה חדשה שתוציא אותה מהכלוב.",
				"אבי", " תל אביב","052-9556906");
		Dogs.save(soda18);
		
		Dog marge19 = new Dog("מארג'", new Colors[]{Colors.BROWN}, 1.0, Area.CENTER, Gender.FEMALE, Size.SMALL, DogBreeds.MiniaturePinscher, Utils.encodeFileToBase64Binary("19marge"), 
				"מארג' המתוקה היא כלבת פינצ'ר מעורבת, עדינה ומתוקה שאוהבת את כולם! היא בת כשנה, קטנטונת בגודלה . היא מסתדרת מעולה עם כלבים, אוהבת המון ליטופים ופינוקים. היא מחכה לכם בפנסיון באזור נתניה",
				"מיטל", " נתניה ","050-2202938");
		Dogs.save(marge19);
		
		Dog mohak20 = new Dog("מוהק", new Colors[]{Colors.BEZ}, 7.0, Area.CENTER, Gender.MALE, Size.SMALL, DogBreeds.Labrador, Utils.encodeFileToBase64Binary("20mohak"), 
				"לברדור מתוק במיוחד שהגיע אלינו עם רגל שבורה, נותח וטופל וכעת מתרוצץ, מחלק אהבה, בלי שום בעיה",
				"רות", "כפר סבא","054-2032978");
		Dogs.save(mohak20);
		
		Dog tirena21 = new Dog("טירנה", new Colors[]{Colors.BLACK,Colors.WHITE}, 1.0, Area.SOUTH, Gender.FEMALE, Size.MEDIUM, DogBreeds.BorderCollie, Utils.encodeFileToBase64Binary("20mohak"), 
				"נשיקות חיבוקים ועוד קצת נשיקות וחיבוקים, טירנה המהממת, בורד קולי מעורב פשוט מדהימה, זכייה בלוטו לכל משפחה שתבחר לאמץ את המושלמת לבית מלא באהבה",
				"אלי", "בת ים","052-3007861");
		Dogs.save(tirena21);
		
		Dog tarios22 = new Dog("טריוס", new Colors[]{Colors.BLACK}, 1.0, Area.CENTER, Gender.MALE, Size.MEDIUM, DogBreeds.Labrador, Utils.encodeFileToBase64Binary("22tarios"), 
				"טריוס הוא כלב מדהים, ים כמות אינסופית של אהבה ורצון לחבק ולנשק :) טריוס נקשר לעץ וננטש כשהיה בן כמה חודשים. בילה כבר חצי שנה בהסגר בדרום הארץ.. ועכשיו הגיע אלינו וממש רוצה לצאת מהכלוב לבית חם ואוהב ! כלב אנרגטי ומלא שמחת חיים, שזקוק להרבה טיולים ותשומת לב. מסורס ומחוסן ! מחכה לבית המושלם בשבילו.",
				"הילה", "רמת גן","050-7795477");
		Dogs.save(tarios22);
		
		Dog tanto23 = new Dog("טנטו", new Colors[]{Colors.BEZ}, 1.0, Area.NORTH, Gender.MALE, Size.MEDIUM, DogBreeds.Chihuahua, Utils.encodeFileToBase64Binary("23tanto"), 
				"טנטו הקטנטן הוא כלב צ'יוואווה מעורב מקסים ומתוק בן כשנה. יש לו מבט משגע והוא ידידותי להפליא. הוא מחכה לכם בפנסיון באזור חיפה",
				"אלה", "חיפה","052-4549965");
		Dogs.save(tanto23);
		
		Dog lili24 = new Dog("לילי", new Colors[]{Colors.WHITE}, 1.5, Area.NORTH, Gender.FEMALE, Size.BIG, DogBreeds.GreatPyrenees, Utils.encodeFileToBase64Binary("24lili"), 
				"לילי היפיפייה היא כלב פירנאית מעורבת בת כשנה, ביתית ומחונכת, שתשמח למצוא משפחה חמה",
				"אדם", "חדרה","050-4478136");
		Dogs.save(lili24);
		
		Dog chilli25 = new Dog("צ'ילי", new Colors[]{Colors.BROWN, Colors.BLACK}, 6.0, Area.NORTH, Gender.FEMALE, Size.BIG, DogBreeds.GermanShepherd, Utils.encodeFileToBase64Binary("25chilli"), 
				"רועה גרמנית מעורבת ומתוקה, מחכה לבית חם ואוהב שיאמץ אותה",
				"אסף", "חיפה","050-4478136");
		Dogs.save(chilli25);
		
		Dog luee26 = new Dog("לואי", new Colors[]{Colors.BROWN}, 6.0, Area.NORTH, Gender.MALE, Size.SMALL, DogBreeds.Chihuahua, Utils.encodeFileToBase64Binary("26luee"), 
				"היצור הקטן והזעיר הזה מחפש בית חם.שמו לואי. הוא בן 6, מחוסן, מסורס,מטופל. הוא חולץ מבית שלא התאים לו כלל  והוא מוכן לבית חדש.",
				"איתי", "טבריה","052-6328875");
		Dogs.save(luee26);
		
		Dog prilli27 = new Dog("פרילי", new Colors[]{Colors.BROWN, Colors.WHITE}, 3.0, Area.NORTH, Gender.MALE, Size.MEDIUM, DogBreeds.AriegePointer, Utils.encodeFileToBase64Binary("27prilli"), 
				"כלבה מעוקרת ומטופלת מוכנה לבית חם. כלבה מקסימה ושקטה.",
				"קרן", "קרית אתא","052-7864129");
		Dogs.save(prilli27);
		
		Dog shuki28 = new Dog("שוקי", new Colors[]{Colors.BLACK}, 3.0, Area.NORTH, Gender.MALE, Size.BIG, DogBreeds.ChowChow, Utils.encodeFileToBase64Binary("28shuki"), 
				"צ'או צ'או מעורב, מקסים וחברותי,דובי גדול שאוהב אנשים ומת על ליטופים",
				"אתי", "עכו","058-7749653");
		Dogs.save(shuki28);
		
		Dog lizi29 = new Dog("ליזי", new Colors[]{Colors.BLACK, Colors.WHITE}, 0.5, Area.CENTER, Gender.FEMALE, Size.MEDIUM, DogBreeds.JackRussellTerrier, Utils.encodeFileToBase64Binary("29lizi"), 
				"ליזי היפה שלנו, גורונת מתוקונת, עדינה ושובבהמאוד, חכמה עוד יותר. גורה מעניינת וחברותית ומחכה לאימוץ",
				"לירז", "הרצליה","054-5662099");
		Dogs.save(lizi29);
		
		Dog jane30 = new Dog("ג'יין", new Colors[]{Colors.BLACK}, 0.25, Area.JERUSALEM, Gender.FEMALE, Size.SMALL, DogBreeds.FrenchBulldog, Utils.encodeFileToBase64Binary("30jane"), 
				"ג'יין המתוקה ננטשה בכלביה. היא כלבונת מתוקונת להפליא, וחברותית,בולדוגית צרפתיה מעורבת שתישאר קטנטנה.",
				"איילת", "ירושליים","050-9475528");
		Dogs.save(jane30);
		
		Dog milwaukee31 = new Dog("מילווקי", new Colors[]{Colors.GREY}, 0.8, Area.CENTER, Gender.MALE, Size.MEDIUM, DogBreeds.Saluki, Utils.encodeFileToBase64Binary("31milwaukee"), 
				"גור סלוקי מתוק ועדין נפש. נמצא בודד וגווע בוואדי, ניצל, שוקם והתאושש וכעת מחפש אומנה או בית מאמץ.",
				"איתן", "חולון","050-5857739");
		Dogs.save(milwaukee31);
		
		Dog muana32 = new Dog("מואנה", new Colors[]{Colors.BROWN, Colors.WHITE}, 0.15, Area.CENTER, Gender.FEMALE, Size.MEDIUM, DogBreeds.BelgianShepherd, Utils.encodeFileToBase64Binary("32muana"), 
				"גורה מסוג רועה בלגי, תגדל להיות בינונית-גדולה. מקסימה, חברותית, לכולם ומתוקה מאוד",
				"אורית", "ראשון לציון","050-9546328");
		Dogs.save(muana32);
		
		Dog chace33 = new Dog("צ'ייס", new Colors[]{Colors.BROWN, Colors.BLACK}, 0.7, Area.CENTER, Gender.MALE, Size.BIG, DogBreeds.CaneCorso, Utils.encodeFileToBase64Binary("33chace"), 
				"צ'ייס המהמם זקוק לאומנה בדחיפות! חזר לכלוב מבית לא ראוי,רזה ומפוחד, זקוק לבית מלא בחום ואהבה!",
				"אליעד", "רעננה","052-4925563");
		Dogs.save(chace33);
		
		Dog buba34 = new Dog("בובה", new Colors[]{Colors.GREY, Colors.BLACK}, 2.0, Area.CENTER, Gender.FEMALE, Size.BIG, DogBreeds.CaneCorso, Utils.encodeFileToBase64Binary("34buba"), 
				"בובה בת שנתיים, מלאה בשמחת חיים, מקסימה וחברותית לכולם, מאוד אנרגטית!",
				"אלון", "גבעתיים","052-7753821");
		Dogs.save(buba34);
		
		Dog d35 = new Dog("דובי", new Colors[] {Colors.BEZ},4.0, Area.CENTER,Gender.MALE, Size.MEDIUM,DogBreeds.GoldenRetriever,
				Utils.encodeFileToBase64Binary("35"),"דובי זקוק למישהו מיוחד, שיהיה שלו , לעד . שיקבל, ויכיל - ויהיה מוכן לתת לדובי להתאהב בו..."
				+ " ויהיה מוכן להתמודד עם כלב תוקפן כלפי חוץ. כי כרגע, הוא מבלה את חייו בכלוב ..", "אורנית","ראשלצ" ,"050-934-4563");
		Dogs.save(d35);

		Dog d36 = new Dog("בלה", new Colors[] {Colors.BROWN},0.2, Area.NORTH,Gender.FEMALE, Size.SMALL,DogBreeds.RhodesianRidgeback, 
				Utils.encodeFileToBase64Binary("36"),"מלאכית קטנה ומתוקה שרק רוצה לקבל חיבוקים ואהבה, תמסר לבית רגוע ואוהב", "תנו לחיות לחיות טבעון והעמקים", "טבעון","050-3199395");
		Dogs.save(d36);

		Dog d37 = new Dog("מסי", new Colors[] {Colors.BROWN},5.0, Area.CENTER,Gender.MALE, Size.SMALL,DogBreeds.Pomeranian, 
				Utils.encodeFileToBase64Binary("37"),"מסי המתוק מחכה לכם! כדור פרווה חייכן מחפש בית רציני ואחראי", "טל", "נתניה","050-8594716");
		Dogs.save(d37);
		
		Dog d38 = new Dog("דאפי", new Colors[]{Colors.WHITE}, 2.0, Area.CENTER, Gender.FEMALE, Size.SMALL, DogBreeds.Pomeranian, Utils.encodeFileToBase64Binary("38"), 
				"גורת פומריניאן מעורבת מתוקה ומקסימה! קטנה בגודלה ובגילה, לא מחוסנת",
				"ערן", "בני ברק","052-5574263");
		Dogs.save(d38);
		
		Dog d39 = new Dog("וויט", new Colors[]{Colors.WHITE}, 4.0, Area.CENTER, Gender.MALE, Size.BIG, DogBreeds.GoldenRetriever, Utils.encodeFileToBase64Binary("39"), 
				"נסיך יפיפה ועדין, מחפש לעצמו בית לא פחות ממדהים. וויט כלב מהמם, צמא לאהבה ומחכה שתגיעו במהרה לתת לו חום ואהבה. ",
				"דר שיינר", "הבונים 5 רמת גן","03-7527778");
		Dogs.save(d39);
		
		Dog d40 = new Dog("לולה", new Colors[]{Colors.BEZ}, 1.5, Area.CENTER, Gender.FEMALE, Size.MEDIUM, DogBreeds.GoldenRetriever, Utils.encodeFileToBase64Binary("40"), 
				"לולה גולדנית מעורבתת בינונית-גדולה, בת כשנה וחצי, עדינה,רגועה וממושמעת. ",
				"שיר", "ראשון לציון","052-6441793");
		Dogs.save(d40);
		
		Dog d41 = new Dog("שושו", new Colors[]{Colors.BEZ}, 8.0, Area.SOUTH, Gender.MALE, Size.MEDIUM, DogBreeds.GoldenRetriever, Utils.encodeFileToBase64Binary("41"), 
				"שושו היפיוף הוא גולדן מעורב עם כלב שועלי, בינוני בגודל והוא מחפש משפחה חדשה שתאהב אותו מכל הלב ולא תוותר עליו לעולם. ",
				"ענת", "ערד","052-6441793");
		Dogs.save(d41);
		
		Dog d42 = new Dog("אפרודיטה", new Colors[]{Colors.WHITE}, 4.0, Area.CENTER, Gender.FEMALE, Size.BIG, DogBreeds.GoldenRetriever, Utils.encodeFileToBase64Binary("42"), 
				"אפרודיטה - גולדנית מעורבת בת 4. גדולה , מתוקה, ממושמעת ומחונכת. ",
				"גיל", "הוד השרון","050-3080807");
		Dogs.save(d42);
		
		Dog d43 = new Dog("דבלול", new Colors[]{Colors.WHITE}, 2.0, Area.CENTER, Gender.MALE, Size.SMALL, DogBreeds.Maltese, Utils.encodeFileToBase64Binary("43"), 
				"דבלול כלב מסוג מלטז,מעורב. כלב קטן ושובב שאוהב תשומת לב. מחכה בקוצר רוח למשפחה חמה שתאמץ אותו ותעניק לו הרבה חום ואהבה. ",
				"ערן", "בת ים","050-9411582");
		Dogs.save(d43);
		
		Dog d44 = new Dog("ג'ולה", new Colors[]{Colors.WHITE}, 13.0, Area.SOUTH, Gender.FEMALE, Size.SMALL, DogBreeds.Maltese, Utils.encodeFileToBase64Binary("44"), 
				"ג'ולה הקטנטונת היא כלבה גזעית מסוג מלטז ננטשה בגיל מאוחר ומחכה לבית אוהב שיעריף עליה אהבה ללא גבולות. ",
				"עדי", "אשקלון","054-9411882");
		Dogs.save(d44);
		
		Dog d45 = new Dog("וניל", new Colors[]{Colors.WHITE}, 4.0, Area.CENTER, Gender.FEMALE, Size.MEDIUM, DogBreeds.Poodle, Utils.encodeFileToBase64Binary("45"), 
				"כלבת פודל לבנה מעורבת, מתוקה, מופנמת ועדינה מחכה לבית אוהב שיאמץ אותה. ",
				"אוסנת", "ראש העין","054-5228561");
		Dogs.save(d45);
		
		Dog d46 = new Dog("קיו", new Colors[]{Colors.WHITE}, 1.0, Area.CENTER, Gender.MALE, Size.MEDIUM, DogBreeds.Poodle, Utils.encodeFileToBase64Binary("46"), 
				"קיו הפודל המדליק הוא פודל גזעי.כלב קטן ושובב שאוהב לשחק.פודל מהמם שמחכה למשפחה המושלמת שתאמץ אותן. ",
				"עדן", "רמת השרון","054-5439972");
		Dogs.save(d46);
	}
}
