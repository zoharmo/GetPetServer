package enums;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.JsonNode;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum DogBreeds {
	Affenpinscher("אפנפיצ'ר","Affenpinscher"),
	AfghanHound("אפגני","AfghanHound"),
	AfghanShepherd("רועה אפגני","AfghanShepherd"),
	Aidi("אידי","Aidi"),
	AiredaleTerrier("איירדייל טרייר","AiredaleTerrier"),
	Akbash("אקבש","Akbash"),
	AkitaInu("אקיטה","AkitaInu"),
	AlanoEspanol("אלאנו","AlanoEspanol"),
	AlaskanHusky("האסקי אלסקי","AlaskanHusky"),
	AlaskanKleeKai("אלסרן קליי קאי","AlaskanKleeKai"),
	AlaskanMalamute("מלמוט אלסקי","AlaskanMalamute"),
	AlpineDachsbracke("דאצ'סברייק אלפיני","AlpineDachsbracke"),
	AlpineSpaniel("ספנייל אלפיני","AlpineSpaniel"),
	AmericanAkita("אקיטה אמריקאי","AmericanAkita"),
	AmericanBulldog("בולדוג אמריקאי","AmericanBulldog"),
	AmericanCockerSpaniel("קוקר ספניאל אמריקאי","AmericanCockerSpaniel"),
	AmericanEskimo("אמריקן אסקימו","AmericanEskimoDog"),
	AmericanFoxhound("כלב ציד אמריקני","AmericanFoxhound"),
	AmericanHairlessTerrier("טרייר אמריקאי חסר שיער","AmericanHairlessTerrier"),
	AmericanPitBullTerrier("אמריקן פיטבול טרייר","AmericanPitBullTerrier"),
	AmericanStaffordshireTerrier("סטאפורדשייר טרייר אמריקאי","AmericanStaffordshireTerrier"),
	AmericanWaterSpaniel("ספניאל מים אמריקאי","AmericanWaterSpaniel"),
	AnatolianShepherd("רועה אנטולי","AnatolianShepherd"),
	AndalusianHound("אנדלוסי","Andalusian Hound"),
	AngloFrancaisDePetiteVenerie("כלב ציד אנגלי-צרפתי בינוני","AngloFrancaisDePetiteVenerie"),
	AppenzellerSennenhund("אפנצלר זננהונד","AppenzellerSennenhund"),
	AriegePointer("פוינטר ארייג'","AriegePointer"),
	Ariegeois("ארייג'ואיס","Ariegeois"),
	Armant("ארמנט","Armant"),
	ArmenianGampr("גמפר ארמני","ArmenianGamprdog"),
	ArtoisHound("כלב ציד ארטואה","ArtoisHound"),
	AustralianCattle("כלב בקר אוסטרלי","AustralianCattleDog"),
	AustralianKelpie("קלפי אוסטרלי","AustralianKelpie"),
	AustralianShepherd("רועה אוסטרלי","AustralianShepherd"),
	AustralianSilkyTerrier("טרייר סילקי אוסטרלי","AustralianSilkyTerrier"),
	AustralianStumpyTailCattle("כלב בקר גידם-זנב אוסטרלי","AustralianStumpyTailCattleDog"),
	AustralianTerrier("טרייר אוסטרלי","AustralianTerrier"),
	AustrianBlackAndTanHound("כלב ציד שחור וחום אוסטרי","AustrianBlackandTanHound"),
	AustrianPinscher("פינצ'ר אוסטרי","AustrianPinscher"),
	Azawakh("אזוואק","Azawakh"),
	BelgianShepherdMalinois("מלינואה","BelgianShepherdMalinois"),
	BelgianShepherd("רועה בלגי","BelgianShepherd"),
	Pomeranian("פומרניאן","Pomeranian"),
	Labrador("לברדור","Labrador"),
	LabradorRetriever("לברדור רטריוור","LabradorRetriever"),
	BullTerrier("בול טרייר","BullTerrier"),
	CaneCorso("קאנה קורסו","CaneCorso"),
	Chihuahua("צ'יוואווה","Chihuahua"),
	Canaan("רועה כנעני","Canaan"),
	ChineseCrestedDog("סיני מצויץ","ChineseCrestedDog"),
	CavalierKingCharlesSpaniel("קבליר קינג צ'ארלס","CavalierKingCharlesSpaniel"),
	GoldenRetriever("גולדן רטריוור","GoldenRetriever"),
	GermanShepherd("רועה גרמני","GermanShepherd"),
	Basenji("בסנג'י","Basenji"),
	BorderCollie("בורדר קולי","BorderCollie"),
	MiniaturePinscher("פינצ'ר","MiniaturePinscher"),
	Greyhound("גרייהאונד","Greyhound"),
	Pekingese("פקינז","Pekingese"),
	Poodle("פודל","Poodle"),
	Maltese("מלטזי","Maltese"),
	JackRussellTerrier("ג'ק ראסל","JackRussellTerrier"),
	SiberianHusky("האסקי סיבירי","SiberianHusky"),
	FrenchBulldog("בולדוג צרפתי","FrenchBulldog"),
	WhiteShepherd("רועה שוויצרי","WhiteShepherd"),
	RhodesianRidgeback("רידג'בק רודזי", "RhodesianRidgeback"),
	GreatPyrenees("פרינאי","GreatPyrenees"),
	ChowChow("צ'או צ'או", "ChowChow"),
	Saluki("סלוקי","Saluki");

	//@JsonIgnore
	//test1("בדיקה1","test1"),
	//@JsonIgnore
	//test2("בדיקה2","test2");

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
			return this.name();
	}
	 @JsonCreator
	 public DogBreeds create(JsonNode json) {
		return DogBreeds.valueOf(json.get("englishName").asText());
	 }
}