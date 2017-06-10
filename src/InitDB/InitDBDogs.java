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
		
		Dog dog1 = new Dog("��", new Colors[]{Colors.BROWN}, 1.5, Area.CENTER, Gender.FEMALE, Size.SMALL, DogBreeds.Pomeranian,
				Utils.encodeFileToBase64Binary("1"), "�� ,���� �������� ������ �������. �� ������� ������� ����� �� ����� ���� ���, �� ���� ���� ������ ���. �� ������ ������� ���. ����� ������ ������ �����.",
				"�����", "����� �����","050-9546328");
		Dogs.save(dog1);
		
		Dog dog2 = new Dog("����", new Colors[]{Colors.WHITE}, 0.4, Area.CENTER, Gender.FEMALE, Size.MEDIUM, DogBreeds.BullTerrier,
				Utils.encodeFileToBase64Binary("2"), "������!!! ���� �� �-4 ������. ���� ���� ����� ������ ������ ����� �� �����. ���� ����� ������� �� ���� ������� �� �����. ���� ����� ����� ����� �� �����. ��� ���� ������� ������ �����.",
				"�����", "����� �����","050-9546328");
		Dogs.save(dog2);
		
		Dog dog3 = new Dog("����", new Colors[]{Colors.WHITE}, 3.5, Area.NORTH, Gender.MALE, Size.BIG, DogBreeds.LabradorRetriever,
				Utils.encodeFileToBase64Binary("3"), 
				"���� ���, ����� �� ��� - ��� ����. ����� ���� �� ��� ���, ������ ��� ���� ������� �� ��� ��. ���� ��� ���� ����� ������ ������ ����� ���� ���������. �� ��� �� ������� ��� ��� �� ����� ������ ����� ��? "
				+ "��� �� ����� ������ ����� ���� �� ����� ���� ����� �� ����� ����� �� ���� ����� ���� ����� �����. ���� �����, ����� ����� ��� ��������, ����� ������. ����� �� �� ������. ���� ��� �����, ��� ����� ������ �� ����� �����.",
				"���� ���","�����","052-9651254");
		Dogs.save(dog3);
		
		Dog dog4 = new Dog("����", new Colors[]{Colors.WHITE}, 9.0, Area.CENTER, Gender.MALE, Size.BIG, DogBreeds.GoldenRetriever,
				Utils.encodeFileToBase64Binary("4"), 
				"����� ������- ��� ����� �����, �� ���� 9, ����� ������. ���� ����� ����, ����� ���� ���� ����� ������ ���� ���������. ���� ���� ����, ���� ������� ��������!! ���� ��������� ������ �� ��� �� �����..",
				"���� ���","�����","052-9651254");
		Dogs.save(dog4);
		
		Dog dog5 = new Dog("�'��", new Colors[]{Colors.BROWN}, 4.0, Area.CENTER, Gender.FEMALE, Size.MEDIUM, DogBreeds.AnatolianShepherd,
				Utils.encodeFileToBase64Binary("5"), 
				"�� ������ �� ��'�� ��? �'�� ����� ����� ���� ����� ���� 4 ����... ���� ����� ��� ������ ���� ������� ���� �� ��� ����. �� 4 ����, ������ �������, ��� �� ���� ����.. ����� ���� ������ �����!!!..",
				"����", "������","050-3209755");
		Dogs.save(dog5);
		
		Dog dog6 = new Dog("����", new Colors[]{Colors.BROWN}, 0.2, Area.NORTH, Gender.MALE, Size.MEDIUM, DogBreeds.GermanShepherd,
				Utils.encodeFileToBase64Binary("6"), "����. ���� ����� ������ ����� �� �������. ����� �����. ����� �� ����. ���� ������ ����. ���� ������ �����...",
				"����", "������","050-3209755");
		Dogs.save(dog6);
		
		Dog dog7 = new Dog("����", new Colors[]{Colors.WHITE}, 0.5, Area.CENTER, Gender.MALE, Size.SMALL, DogBreeds.Basenji,
				Utils.encodeFileToBase64Binary("7"),
				"���� ��� �� ����� ������ ����� ���� �������. "
				+ "������ ���� �� ���� ������ ���� ��� ���� ��� ��� �� ���� ����� ����� �� �� ��� ��� ����� �� ��� ��� ���� �����. ����� ������ �� �����!! ��� ���� ���� ���� ��� ���. �� �� ��� ����� ���� �� ����� �� ����� ��������� ����.",
				"���� ���","�����","052-9651254");
		Dogs.save(dog7);
		
		Dog dog8 = new Dog("����", new Colors[]{Colors.BLACK}, 10.0, Area.SOUTH, Gender.MALE, Size.BIG, DogBreeds.BorderCollie,
				Utils.encodeFileToBase64Binary("8"), 
				"���� �� 10, ��� ����� ����� �����. ������ ����. ����� �� �������� ��� �� ������ ���� �� ������ �� ����� ������ ���� ������ �� ����� ���� ���� ������ ���� ���� ������� ��� ��� ���� ������ ������! ��� ��� ����� ����� ������ ��� �����",
				"����", "���� ��","050-3209755");
		Dogs.save(dog8);
		
		Dog dog9 = new Dog("������", new Colors[]{Colors.BROWN}, 4.0, Area.CENTER, Gender.MALE, Size.SMALL, DogBreeds.MiniaturePinscher,
				Utils.encodeFileToBase64Binary("9"), 
				"������, ��� ��� ���� ��� ���� ��� ���� �� ���. ����'� ��� ����� ��� ��� ��� ��� �� ����� ����� ����� ��� ���� ���� ������. ������ ���� �� 4 ����� ����� ����� �� �� ���."
				+ " ����� ���� �� �� ���� ���, �� ���� ����. ��� �����, ����� ������. ����� �� ����� �������. �� �� ���� ���� �� ����! �� ���� ���? **���� ���� ���� ��",
				"����", "������","050-3209755");
		Dogs.save(dog9);
		
		Dog dog10 = new Dog("�����", new Colors[]{Colors.BROWN}, 10.0, Area.NORTH, Gender.FEMALE, Size.BIG, DogBreeds.AmericanPitBullTerrier,
				Utils.encodeFileToBase64Binary("10"),
				"����� ,���� ������ ������ �������. ����� ������� ������� ����� �� ����� ���� ���, �� ���� ���� ������ ������ . ����� ������ ������� ��� ����� ��� �����. ����� ������ ������ ����� . !!!!",
				"���", "���� ������","050-3209755");
		Dogs.save(dog10);
		
		Dog dog11 = new Dog("�����", new Colors[]{Colors.BLACK}, 0.10, Area.SOUTH, Gender.MALE, Size.BIG, DogBreeds.Greyhound,
				Utils.encodeFileToBase64Binary("11"),
				"�����, ���� ��� ��� ���� ���- ���� ���������. ������ ��� �� 10 ������. ����� ����� ����� ����� �����. "
				+ "7���� ������� �������� ��������, ���� ���� �� ����� �����, �� �� ��� ���� �� ��� ������� ������� ��������� ��� �������� ��� ������ ������. ����� ���� ��� ����  �� ����� ������ ",
				"�����", "������","050-3209755");
		Dogs.save(dog11);
		
		Dog dog12 = new Dog("����", new Colors[]{Colors.GREY}, 10.0, Area.SOUTH, Gender.MALE, Size.SMALL, DogBreeds.Pekingese,
				Utils.encodeFileToBase64Binary("12"), "���� �� 10 ����� ���� ����� ������ �� ����� ���� ���� ���� ����. ���� ���� ��� ����� �� ���� �����..",
				"�����", "������","050-3209755");
		Dogs.save(dog12);
		
		Dog dog13 = new Dog("������", new Colors[]{Colors.WHITE}, 13.0, Area.SOUTH, Gender.MALE, Size.SMALL, DogBreeds.Poodle,
				Utils.encodeFileToBase64Binary("13"), 
				"���� �� 10, ��� ����� ����� �����. ������ ����. ����� �� �������� ��� �� ������ ���� �� ������ �� ����� ������ ���� ������ �� ����� ���� ���� ������ ���� ���� ������� ��� ��� ���� ������ ������!"
				+ " ��� ��� ����� ����� ������ ��� �����, �� �� ������ �� ������ ����� ����� �� ������",
				"����", "��� ���","050-3209755");
		Dogs.save(dog13);
		
		Dog dog14 = new Dog("������", new Colors[]{Colors.WHITE}, 3.5, Area.SOUTH, Gender.FEMALE, Size.SMALL, DogBreeds.Maltese,
				Utils.encodeFileToBase64Binary("14"), 
				"������ ������ ���� ���� ����, ��� �� ���� ����, ������ ������ ����. ����� ������ ����� ����� ������ ������� ���, ��� ������ �� ����� ���� ������ ������� ������ ����� �� ����� ���� ��� ����� ������. ��� ���� ���� ���� ���? :)",
				"����", "�����","050-4752075");
		Dogs.save(dog14);
		
		Dog dog15 = new Dog("�����", new Colors[]{Colors.BROWN}, 2.0, Area.CENTER, Gender.FEMALE, Size.SMALL, DogBreeds.MiniaturePinscher,
				Utils.encodeFileToBase64Binary("15"), "����� - ����'��� ������, �� �������, ������ �������, ���� �������, ���� �� ������ �������� ������. ����� ��� ����� ������ ������ �� ����.",
				"����", "�����","050-4752075");
		Dogs.save(dog15);
		
		Dog dog16 = new Dog("���", new Colors[]{Colors.WHITE}, 2.0, Area.SOUTH, Gender.MALE, Size.BIG, DogBreeds.LabradorRetriever,
				Utils.encodeFileToBase64Binary("16"), "������ ����� ���� ��� �� ������, ��� ������. ��� ��� ����� ����� ������ �� ���� ��� ����� ������ ���� ������� ����� ��� ����� �������",
				"����", "����","050-4752075");
		Dogs.save(dog16);
		
		Dog blue17 = new Dog("���", new Colors[]{Colors.BLACK,Colors.WHITE}, 0.25, Area.JERUSALEM, Gender.MALE, Size.MEDIUM, DogBreeds.AustralianShepherd, Utils.encodeFileToBase64Binary("17blue"), 
							"���� ��� ���, ����, ���� ����, ������, ���� �������. ���� ���� ��� ��� �� �� ����� ����.  ��� ��� �� ���� ���� ��� ����, ����� �� ���� ������ ���� �� ������",
							"����", "����� ���� ���� 1, ������� ����� ","052-4419906");
		Dogs.save(blue17);
		
		Dog soda18 = new Dog("����", new Colors[]{Colors.BROWN,Colors.WHITE}, 0.5, Area.CENTER, Gender.FEMALE, Size.MEDIUM, DogBreeds.Canaan, Utils.encodeFileToBase64Binary("18soda"), 
				"���� ���� �� ��� ���, �����, ���� ��������, ����� ����� ���� ������ ���� ������.",
				"���", " �� ����","052-9556906");
		Dogs.save(soda18);
		
		Dog marge19 = new Dog("����'", new Colors[]{Colors.BROWN}, 1.0, Area.CENTER, Gender.FEMALE, Size.SMALL, DogBreeds.MiniaturePinscher, Utils.encodeFileToBase64Binary("19marge"), 
				"����' ������ ��� ���� ����'� ������, ����� ������ ������ �� ����! ��� �� ����, ������� ������ . ��� ������ ����� �� �����, ����� ���� ������� ��������. ��� ���� ��� ������� ����� �����",
				"����", " ����� ","050-2202938");
		Dogs.save(marge19);
		
		Dog mohak20 = new Dog("����", new Colors[]{Colors.BEZ}, 7.0, Area.CENTER, Gender.MALE, Size.SMALL, DogBreeds.Labrador, Utils.encodeFileToBase64Binary("20mohak"), 
				"������ ���� ������ ����� ����� �� ��� �����, ���� ����� ���� ������, ���� ����, ��� ��� ����",
				"���", "��� ���","054-2032978");
		Dogs.save(mohak20);
		
		Dog tirena21 = new Dog("�����", new Colors[]{Colors.BLACK,Colors.WHITE}, 1.0, Area.SOUTH, Gender.FEMALE, Size.MEDIUM, DogBreeds.BorderCollie, Utils.encodeFileToBase64Binary("20mohak"), 
				"������ ������� ���� ��� ������ ��������, ����� ������, ���� ���� ����� ���� ������, ����� ����� ��� ����� ����� ���� �� ������� ���� ��� �����",
				"���", "�� ��","052-3007861");
		Dogs.save(tirena21);
		
		Dog tarios22 = new Dog("�����", new Colors[]{Colors.BLACK}, 1.0, Area.CENTER, Gender.MALE, Size.MEDIUM, DogBreeds.Labrador, Utils.encodeFileToBase64Binary("22tarios"), 
				"����� ��� ��� �����, �� ���� �������� �� ���� ����� ���� ����� :) ����� ���� ��� ����� ����� �� ��� ������. ���� ��� ��� ��� ����� ����� ����.. ������ ���� ����� ���� ���� ���� ������ ���� �� ����� ! ��� ������ ���� ���� ����, ����� ����� ������ ������ ��. ����� ������ ! ���� ���� ������ ������.",
				"����", "��� ��","050-7795477");
		Dogs.save(tarios22);
		
		Dog tanto23 = new Dog("����", new Colors[]{Colors.BEZ}, 1.0, Area.NORTH, Gender.MALE, Size.MEDIUM, DogBreeds.Chihuahua, Utils.encodeFileToBase64Binary("23tanto"), 
				"���� ������ ��� ��� �'������� ����� ����� ����� �� ����. �� �� ��� ���� ���� ������� ������. ��� ���� ��� ������� ����� ����",
				"���", "����","052-4549965");
		Dogs.save(tanto23);
		
		Dog lili24 = new Dog("����", new Colors[]{Colors.WHITE}, 1.5, Area.NORTH, Gender.FEMALE, Size.BIG, DogBreeds.GreatPyrenees, Utils.encodeFileToBase64Binary("24lili"), 
				"���� �������� ��� ��� ������� ������ �� ����, ����� �������, ����� ����� ����� ���",
				"���", "����","050-4478136");
		Dogs.save(lili24);
		
		Dog chilli25 = new Dog("�'���", new Colors[]{Colors.BROWN, Colors.BLACK}, 6.0, Area.NORTH, Gender.FEMALE, Size.BIG, DogBreeds.GermanShepherd, Utils.encodeFileToBase64Binary("25chilli"), 
				"���� ������ ������ ������, ���� ���� �� ����� ����� ����",
				"���", "����","050-4478136");
		Dogs.save(chilli25);
		
		Dog luee26 = new Dog("����", new Colors[]{Colors.BROWN}, 6.0, Area.NORTH, Gender.MALE, Size.SMALL, DogBreeds.Chihuahua, Utils.encodeFileToBase64Binary("26luee"), 
				"����� ���� ������ ��� ���� ��� ��.��� ����. ��� �� 6, �����, �����,�����. ��� ���� ���� ��� ����� �� ���  ���� ���� ���� ���.",
				"����", "�����","052-6328875");
		Dogs.save(luee26);
		
		Dog prilli27 = new Dog("�����", new Colors[]{Colors.BROWN, Colors.WHITE}, 3.0, Area.NORTH, Gender.MALE, Size.MEDIUM, DogBreeds.AriegePointer, Utils.encodeFileToBase64Binary("27prilli"), 
				"���� ������ ������� ����� ���� ��. ���� ������ �����.",
				"���", "���� ���","052-7864129");
		Dogs.save(prilli27);
		
		Dog shuki28 = new Dog("����", new Colors[]{Colors.BLACK}, 3.0, Area.NORTH, Gender.MALE, Size.BIG, DogBreeds.ChowChow, Utils.encodeFileToBase64Binary("28shuki"), 
				"�'�� �'�� �����, ����� �������,���� ���� ����� ����� ��� �� �������",
				"���", "���","058-7749653");
		Dogs.save(shuki28);
		
		Dog lizi29 = new Dog("����", new Colors[]{Colors.BLACK, Colors.WHITE}, 0.5, Area.CENTER, Gender.FEMALE, Size.MEDIUM, DogBreeds.JackRussellTerrier, Utils.encodeFileToBase64Binary("29lizi"), 
				"���� ���� ����, ������ �������, ����� ����������, ���� ��� ����. ���� ������� �������� ����� ������",
				"����", "������","054-5662099");
		Dogs.save(lizi29);
		
		Dog jane30 = new Dog("�'���", new Colors[]{Colors.BLACK}, 0.25, Area.JERUSALEM, Gender.FEMALE, Size.SMALL, DogBreeds.FrenchBulldog, Utils.encodeFileToBase64Binary("30jane"), 
				"�'��� ������ ����� ������. ��� ������ ������� ������, ��������,�������� ������ ������ ������ ������.",
				"�����", "��������","050-9475528");
		Dogs.save(jane30);
		
		Dog milwaukee31 = new Dog("�������", new Colors[]{Colors.GREY}, 0.8, Area.CENTER, Gender.MALE, Size.MEDIUM, DogBreeds.Saluki, Utils.encodeFileToBase64Binary("31milwaukee"), 
				"��� ����� ���� ����� ���. ���� ���� ����� ������, ����, ���� ������� ���� ���� ����� �� ��� ����.",
				"����", "�����","050-5857739");
		Dogs.save(milwaukee31);
		
		Dog muana32 = new Dog("�����", new Colors[]{Colors.BROWN, Colors.WHITE}, 0.15, Area.CENTER, Gender.FEMALE, Size.MEDIUM, DogBreeds.BelgianShepherd, Utils.encodeFileToBase64Binary("32muana"), 
				"���� ���� ���� ����, ���� ����� �������-�����. ������, �������, ����� ������ ����",
				"�����", "����� �����","050-9546328");
		Dogs.save(muana32);
		
		Dog chace33 = new Dog("�'���", new Colors[]{Colors.BROWN, Colors.BLACK}, 0.7, Area.CENTER, Gender.MALE, Size.BIG, DogBreeds.CaneCorso, Utils.encodeFileToBase64Binary("33chace"), 
				"�'��� ����� ���� ������ �������! ��� ����� ���� �� ����,��� ������, ���� ���� ��� ���� �����!",
				"�����", "�����","052-4925563");
		Dogs.save(chace33);
		
		Dog buba34 = new Dog("����", new Colors[]{Colors.GREY, Colors.BLACK}, 2.0, Area.CENTER, Gender.FEMALE, Size.BIG, DogBreeds.CaneCorso, Utils.encodeFileToBase64Binary("34buba"), 
				"���� �� ������, ���� ����� ����, ������ �������� �����, ���� �������!",
				"����", "�������","052-7753821");
		Dogs.save(buba34);
		
		Dog d35 = new Dog("����", new Colors[] {Colors.BEZ},4.0, Area.CENTER,Gender.MALE, Size.MEDIUM,DogBreeds.GoldenRetriever,
				Utils.encodeFileToBase64Binary("35"),"���� ���� ������ �����, ����� ��� , ��� . �����, ����� - ����� ���� ��� ����� ������ ��..."
				+ " ����� ���� ������� �� ��� ����� ���� ���. �� ����, ��� ���� �� ���� ����� ..", "������","�����" ,"050-934-4563");
		Dogs.save(d35);

		Dog d36 = new Dog("���", new Colors[] {Colors.BROWN},0.2, Area.NORTH,Gender.FEMALE, Size.SMALL,DogBreeds.RhodesianRidgeback, 
				Utils.encodeFileToBase64Binary("36"),"������ ���� ������ ��� ���� ���� ������� �����, ���� ���� ���� �����", "��� ����� ����� ����� �������", "�����","050-3199395");
		Dogs.save(d36);

		Dog d37 = new Dog("���", new Colors[] {Colors.BROWN},5.0, Area.CENTER,Gender.MALE, Size.SMALL,DogBreeds.Pomeranian, 
				Utils.encodeFileToBase64Binary("37"),"��� ����� ���� ���! ���� ����� ����� ���� ��� ����� ������", "��", "�����","050-8594716");
		Dogs.save(d37);
		
		Dog d38 = new Dog("����", new Colors[]{Colors.WHITE}, 2.0, Area.CENTER, Gender.FEMALE, Size.SMALL, DogBreeds.Pomeranian, Utils.encodeFileToBase64Binary("38"), 
				"���� ��������� ������ ����� �������! ���� ������ ������, �� ������",
				"���", "��� ���","052-5574263");
		Dogs.save(d38);
		
		Dog d39 = new Dog("����", new Colors[]{Colors.WHITE}, 4.0, Area.CENTER, Gender.MALE, Size.BIG, DogBreeds.GoldenRetriever, Utils.encodeFileToBase64Binary("39"), 
				"���� ����� �����, ���� ����� ��� �� ���� ������. ���� ��� ����, ��� ����� ����� ������ ����� ��� �� ��� �����. ",
				"�� �����", "������ 5 ��� ��","03-7527778");
		Dogs.save(d39);
		
		Dog d40 = new Dog("����", new Colors[]{Colors.BEZ}, 1.5, Area.CENTER, Gender.FEMALE, Size.MEDIUM, DogBreeds.GoldenRetriever, Utils.encodeFileToBase64Binary("40"), 
				"���� ������� ������� �������-�����, �� ���� ����, �����,����� ��������. ",
				"���", "����� �����","052-6441793");
		Dogs.save(d40);
		
		Dog d41 = new Dog("����", new Colors[]{Colors.BEZ}, 8.0, Area.SOUTH, Gender.MALE, Size.MEDIUM, DogBreeds.GoldenRetriever, Utils.encodeFileToBase64Binary("41"), 
				"���� ������ ��� ����� ����� �� ��� �����, ������ ����� ���� ���� ����� ���� ����� ���� ��� ��� ��� ����� ���� �����. ",
				"���", "���","052-6441793");
		Dogs.save(d41);
		
		Dog d42 = new Dog("��������", new Colors[]{Colors.WHITE}, 4.0, Area.CENTER, Gender.FEMALE, Size.BIG, DogBreeds.GoldenRetriever, Utils.encodeFileToBase64Binary("42"), 
				"�������� - ������� ������ �� 4. ����� , �����, ������� �������. ",
				"���", "��� �����","050-3080807");
		Dogs.save(d42);
		
		Dog d43 = new Dog("�����", new Colors[]{Colors.WHITE}, 2.0, Area.CENTER, Gender.MALE, Size.SMALL, DogBreeds.Maltese, Utils.encodeFileToBase64Binary("43"), 
				"����� ��� ���� ����,�����. ��� ��� ����� ����� ����� ��. ���� ����� ��� ������ ��� ����� ���� ������ �� ���� ��� �����. ",
				"���", "�� ��","050-9411582");
		Dogs.save(d43);
		
		Dog d44 = new Dog("�'���", new Colors[]{Colors.WHITE}, 13.0, Area.SOUTH, Gender.FEMALE, Size.SMALL, DogBreeds.Maltese, Utils.encodeFileToBase64Binary("44"), 
				"�'��� �������� ��� ���� ����� ���� ���� ����� ���� ����� ����� ���� ���� ������ ���� ���� ��� ������. ",
				"���", "������","054-9411882");
		Dogs.save(d44);
		
		Dog d45 = new Dog("����", new Colors[]{Colors.WHITE}, 4.0, Area.CENTER, Gender.FEMALE, Size.MEDIUM, DogBreeds.Poodle, Utils.encodeFileToBase64Binary("45"), 
				"���� ���� ���� ������, �����, ������ ������ ���� ���� ���� ����� ����. ",
				"�����", "��� ����","054-5228561");
		Dogs.save(d45);
		
		Dog d46 = new Dog("���", new Colors[]{Colors.WHITE}, 1.0, Area.CENTER, Gender.MALE, Size.MEDIUM, DogBreeds.Poodle, Utils.encodeFileToBase64Binary("46"), 
				"��� ����� ������ ��� ���� ����.��� ��� ����� ����� ����.���� ���� ����� ������ ������� ����� ����. ",
				"���", "��� �����","054-5439972");
		Dogs.save(d46);
	}
}
