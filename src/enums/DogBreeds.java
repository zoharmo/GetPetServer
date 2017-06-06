package enums;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.JsonNode;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum DogBreeds {
	Affenpinscher("������'�","Affenpinscher"),
	AfghanHound("�����","AfghanHound"),
	AfghanShepherd("���� �����","AfghanShepherd"),
	Aidi("����","Aidi"),
	AiredaleTerrier("�������� �����","AiredaleTerrier"),
	Akbash("����","Akbash"),
	AkitaInu("�����","AkitaInu"),
	AlanoEspanol("�����","AlanoEspanol"),
	AlaskanHusky("����� �����","AlaskanHusky"),
	AlaskanKleeKai("����� ���� ���","AlaskanKleeKai"),
	AlaskanMalamute("����� �����","AlaskanMalamute"),
	AlpineDachsbracke("���'������ ������","AlpineDachsbracke"),
	AlpineSpaniel("������ ������","AlpineSpaniel"),
	AmericanAkita("����� �������","AmericanAkita"),
	AmericanBulldog("������ �������","AmericanBulldog"),
	AmericanCockerSpaniel("���� ������ �������","AmericanCockerSpaniel"),
	AmericanEskimo("������ ������","AmericanEskimoDog"),
	AmericanFoxhound("��� ��� �������","AmericanFoxhound"),
	AmericanHairlessTerrier("����� ������� ��� ����","AmericanHairlessTerrier"),
	AmericanPitBullTerrier("������ ������ �����","AmericanPitBullTerrier"),
	AmericanStaffordshireTerrier("����������� ����� �������","AmericanStaffordshireTerrier"),
	AmericanWaterSpaniel("������ ��� �������","AmericanWaterSpaniel"),
	AnatolianShepherd("���� ������","AnatolianShepherd"),
	AndalusianHound("�������","Andalusian Hound"),
	AngloFrancaisDePetiteVenerie("��� ��� �����-����� ������","AngloFrancaisDePetiteVenerie"),
	AppenzellerSennenhund("������ �������","AppenzellerSennenhund"),
	AriegePointer("������ �����'","AriegePointer"),
	Ariegeois("�����'����","Ariegeois"),
	Armant("�����","Armant"),
	ArmenianGampr("���� �����","ArmenianGamprdog"),
	ArtoisHound("��� ��� ������","ArtoisHound"),
	AustralianCattle("��� ��� �������","AustralianCattleDog"),
	AustralianKelpie("���� �������","AustralianKelpie"),
	AustralianShepherd("���� �������","AustralianShepherd"),
	AustralianSilkyTerrier("����� ����� �������","AustralianSilkyTerrier"),
	AustralianStumpyTailCattle("��� ��� ����-��� �������","AustralianStumpyTailCattleDog"),
	AustralianTerrier("����� �������","AustralianTerrier"),
	AustrianBlackAndTanHound("��� ��� ���� ���� ������","AustrianBlackandTanHound"),
	AustrianPinscher("����'� ������","AustrianPinscher"),
	Azawakh("������","Azawakh"),
	BelgianShepherdMalinois("�������","Belgian Shepherd Dog (Malinois)"),
	Pomeranian("��������","Pomeranian"),
	LabradorRetriever("������ �������","Labrador Retriever"),
	BullTerrier("��� �����","Bull Terrier"),
	CaneCorso("���� �����","Cane Corso"),
	Chihuahua("�'�������","Chihuahua"),
	Canaan("���� �����","Canaan Dog"),
	ChineseCrestedDog("���� �����","Chinese Crested Dog"),
	CavalierKingCharlesSpaniel("����� ���� �'����","Cavalier King Charles Spaniel"),
	GoldenRetriever("����� �������","Golden Retriever"),
	GermanShepherd("���� �����","German Shepherd"),
	LabradorRetriever("������ �������","LabradorRetriever"),
	BullTerrier("��� �����","BullTerrier"),
	GoldenRetriever("����� �������","GoldenRetriever"),
	GermanShepherd("���� �����","GermanShepherd"),
	Basenji("����'�","Basenji"),
	BorderCollie("����� ����","BorderCollie"),
	MiniaturePinscher("����'�","MiniaturePinscher"),
	Greyhound("���������","Greyhound"),
	Pekingese("�����","Pekingese"),
	Poodle("����","Poodle"),
	Maltese("�����","Maltese"),
	JackRussellTerrier("�'� ����","Jack Russell Terrier"),
	SiberianHusky("����� ������","Siberian Husky"),
	FrenchBulldog("������ �����","French Bulldog"),
	WhiteShepherd("���� �������","White Shepherd"),
	RhodesianRidgeback("����'�� �����", "RhodesianRidgeback");

	//@JsonIgnore
	//test1("�����1","test1"),
	//@JsonIgnore
	//test2("�����2","test2");

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