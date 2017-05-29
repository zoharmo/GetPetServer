package enums;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.JsonNode;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum DogBreeds {
	Affenpinscher("אפנפיצ'ר","Affenpinscher"),
	AfghanHound("אפגני","Afghan Hound"),
	AfghanShepherd("רועה אפגני","Afghan Shepherd"),
	Aidi("אידי","Aidi"),
	AiredaleTerrier("איירדייל טרייר","Airedale Terrier"),
	Akbash("אקבש","Akbash"),
	AkitaInu("אקיטה","Akita Inu"),
	AlanoEspanol("אלאנו","Alano Espanol"),
	AlaskanHusky("האסקי אלסקי","Alaskan Husky"),
	AlaskanKleeKai("אלסרן קליי קאי","Alaskan Klee Kai"),
	AlaskanMalamute("מלמוט אלסקי","Alaskan Malamute"),
	AlpineDachsbracke("דאצ'סברייק אלפיני","Alpine Dachsbracke"),
	AlpineSpaniel("ספנייל אלפיני","Alpine Spaniel"),
	AmericanAkita("אקיטה אמריקאי","American Akita"),
	AmericanBulldog("בולדוג אמריקאי","American Bulldog"),
	AmericanCockerSpaniel("קוקר ספניאל אמריקאי","American Cocker Spaniel"),
	AmericanEskimo("אמריקן אסקימו","American Eskimo Dog"),
	AmericanFoxhound("כלב ציד אמריקני","American Foxhound"),
	AmericanHairlessTerrier("טרייר אמריקאי חסר שיער","American Hairless Terrier"),
	AmericanPitBullTerrier("אמריקן פיטבול טרייר","American Pit Bull Terrier"),
	AmericanStaffordshireTerrier("סטאפורדשייר טרייר אמריקאי","American Staffordshire Terrier"),
	AmericanWaterSpaniel("ספניאל מים אמריקאי","American Water Spaniel"),
	AnatolianShepherd("רועה אנטולי","Anatolian Shepherd"),
	AndalusianHound("אנדלוסי","Andalusian Hound"),
	AngloFrancaisDePetiteVenerie("כלב ציד אנגלי-צרפתי בינוני","Anglo-Francais de Petite Venerie"),
	AppenzellerSennenhund("אפנצלר זננהונד","Appenzeller Sennenhund"),
	AriegePointer("פוינטר ארייג'","Ariege Pointer"),
	Ariegeois("ארייג'ואיס","Ariegeois"),
	Armant("ארמנט","Armant"),
	ArmenianGampr("גמפר ארמני","Armenian Gampr dog"),
	ArtoisHound("כלב ציד ארטואה","Artois Hound"),
	AustralianCattle("כלב בקר אוסטרלי","AustralianCattleDog"),
	AustralianKelpie("קלפי אוסטרלי","Australian Kelpie"),
	AustralianShepherd("רועה אוסטרלי","Australian Shepherd"),
	AustralianSilkyTerrier("טרייר סילקי אוסטרלי","Australian Silky Terrier"),
	AustralianStumpyTailCattle("כלב בקר גידם-זנב אוסטרלי","Australian Stumpy Tail Cattle Dog"),
	AustralianTerrier("טרייר אוסטרלי","Australian Terrier"),
	AustrianBlackAndTanHound("כלב ציד שחור וחום אוסטרי","Austrian Black and Tan Hound"),
	AustrianPinscher("פינצ'ר אוסטרי","Austrian Pinscher"),
	Azawakh("אזוואק","Azawakh"),
	Pomeranian("פומרניאן","Pomeranian"),
	LabradorRetriever("לברדור רטריוור","Labrador Retriever"),
	BullTerrier("בול טרייר","Bull Terrier"),
	GoldenRetriever("גולדן רטריוור","Golden Retriever"),
	GermanShepherd("רועה גרמני","German Shepherd"),
	Basenji("בסנג'י","Basenji"),
	BorderCollie("בורדר קולי","Border Collie"),
	MiniaturePinscher("פינצ'ר","Miniature Pinscher"),
	Greyhound("גרייהאונד","Greyhound"),
	Pekingese("פקינז","Pekingese"),
	Poodle("פודל","Poodle"),
	Maltese("מלטזי","Maltese");
		
	private String hebrewName;
	private String englishName;

	DogBreeds(String hebrewName, String englishName) {
		this.hebrewName = hebrewName;
		this.englishName = englishName;
	}

	public int getId() {
		return ordinal();
	}
	
	 public String getHebrewName() {
		return hebrewName;
	}

	 public String getEnglishName() {
		return englishName;
	}
	 @JsonCreator
	 public DogBreeds create(JsonNode json) {
		return DogBreeds.valueOf(json.get("englishName").asText());
	 }
}