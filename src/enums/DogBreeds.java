package enums;
import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum DogBreeds {
	Affenpinscher("������'�","Affenpinscher"),
	AfghanHound("�����","Afghan Hound"),
	AfghanShepherd("���� �����","Afghan Shepherd"),
	Aidi("����","Aidi"),
	AiredaleTerrier("�������� �����","Airedale Terrier"),
	Akbash("����","Akbash"),
	AkitaInu("�����","Akita Inu"),
	AlanoEspanol("�����","Alano Espanol"),
	AlaskanHusky("����� �����","Alaskan Husky"),
	AlaskanKleeKai("����� ���� ���","Alaskan Klee Kai"),
	AlaskanMalamute("����� �����","Alaskan Malamute"),
	AlpineDachsbracke("���'������ ������","Alpine Dachsbracke"),
	AlpineSpaniel("������ ������","Alpine Spaniel"),
	AmericanAkita("����� �������","American Akita"),
	AmericanBulldog("������ �������","American Bulldog"),
	AmericanCockerSpaniel("���� ������ �������","American Cocker Spaniel"),
	AmericanEskimo("������ ������","American Eskimo Dog"),
	AmericanFoxhound("��� ��� �������","American Foxhound"),
	AmericanHairlessTerrier("����� ������� ��� ����","American Hairless Terrier"),
	AmericanPitBullTerrier("������ ������ �����","American Pit Bull Terrier"),
	AmericanStaffordshireTerrier("����������� ����� �������","American Staffordshire Terrier"),
	AmericanWaterSpaniel("������ ��� �������","American Water Spaniel"),
	AnatolianShepherd("���� ������","Anatolian Shepherd"),
	AndalusianHound("�������","Andalusian Hound"),
	AngloFrancaisDePetiteVenerie("��� ��� �����-����� ������","Anglo-Francais de Petite Venerie"),
	AppenzellerSennenhund("������ �������","Appenzeller Sennenhund"),
	AriegePointer("������ �����'","Ariege Pointer"),
	Ariegeois("�����'����","Ariegeois"),
	Armant("�����","Armant"),
	ArmenianGampr("���� �����","Armenian Gampr dog"),
	ArtoisHound("��� ��� ������","Artois Hound"),
	AustralianCattle("��� ��� �������","AustralianCattleDog"),
	AustralianKelpie("���� �������","Australian Kelpie"),
	AustralianShepherd("���� �������","Australian Shepherd"),
	AustralianSilkyTerrier("����� ����� �������","Australian Silky Terrier"),
	AustralianStumpyTailCattle("��� ��� ����-��� �������","Australian Stumpy Tail Cattle Dog"),
	AustralianTerrier("����� �������","AustralianTerrier"),
	AustrianBlackAndTanHound("��� ��� ���� ���� ������","Austrian Black and Tan Hound"),
	AustrianPinscher("����'� ������","Austrian Pinscher"),
	Azawakh("������","Azawakh"),
	Pomeranian("��������","Pomeranian");
	
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
}