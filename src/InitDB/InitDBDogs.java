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
				"","","");
		Dogs.save(dog1);
		
		Dog dog2 = new Dog("��", new Colors[]{Colors.WHITE}, 0.4, Area.CENTER, Gender.FEMALE, Size.MEDIUM, DogBreeds.BullTerrier,
				Utils.encodeFileToBase64Binary("2"), "������!!! ���� �� �-4 ������. ���� ���� ����� ������ ������ ����� �� �����. ���� ����� ������� �� ���� ������� �� �����. ���� ����� ����� ����� �� �����. ��� ���� ������� ������ �����.",
				"","","");
		Dogs.save(dog2);
		
		Dog dog3 = new Dog("����", new Colors[]{Colors.WHITE}, 3.5, Area.NORTH, Gender.MALE, Size.BIG, DogBreeds.LabradorRetriever,
				Utils.encodeFileToBase64Binary("3"), 
				"���� ���, ����� �� ��� - ��� ����. ����� ���� �� ��� ���, ������ ��� ���� ������� �� ��� ��. ���� ��� ���� ����� ������ ������ ����� ���� ���������. �� ��� �� ������� ��� ��� �� ����� ������ ����� ��? "
				+ "��� �� ����� ������ ����� ���� �� ����� ���� ����� �� ����� ����� �� ���� ����� ���� ����� �����. ���� �����, ����� ����� ��� ��������, ����� ������. ����� �� �� ������. ���� ��� �����, ��� ����� ������ �� ����� �����.",
				"","","");
		Dogs.save(dog3);
		
		Dog dog4 = new Dog("����", new Colors[]{Colors.WHITE}, 9.0, Area.CENTER, Gender.MALE, Size.BIG, DogBreeds.GoldenRetriever,
				Utils.encodeFileToBase64Binary("4"), 
				"����� ������- ��� ����� �����, �� ���� 9, ����� ������. ���� ����� ����, ����� ���� ���� ����� ������ ���� ���������. ���� ���� ����, ���� ������� ��������!! ���� ��������� ������ �� ��� �� �����..",
				"","","");
		Dogs.save(dog4);
		
		Dog dog5 = new Dog("�'��", new Colors[]{Colors.BROWN}, 4.0, Area.CENTER, Gender.FEMALE, Size.MEDIUM, DogBreeds.AnatolianShepherd,
				Utils.encodeFileToBase64Binary("5"), 
				"�� ������ �� ��'�� ��? �'�� ����� ����� ���� ����� ���� 4 ����... ���� ����� ��� ������ ���� ������� ���� �� ��� ����. �� 4 ����, ������ �������, ��� �� ���� ����.. ����� ���� ������ �����!!!..",
				"","","");
		Dogs.save(dog5);
		
		Dog dog6 = new Dog("����", new Colors[]{Colors.BROWN}, 0.2, Area.NORTH, Gender.MALE, Size.MEDIUM, DogBreeds.GermanShepherd,
				Utils.encodeFileToBase64Binary("6"), "����. ���� ����� ������ ����� �� �������. ����� �����. ����� �� ����. ���� ������ ����. ���� ������ �����...",
				"","","");
		Dogs.save(dog6);
		
		Dog dog7 = new Dog("����", new Colors[]{Colors.WHITE}, 0.5, Area.CENTER, Gender.MALE, Size.SMALL, DogBreeds.Basenji,
				Utils.encodeFileToBase64Binary("7"),
				"���� ��� �� ����� ������ ����� ���� �������. "
				+ "������ ���� �� ���� ������ ���� ��� ���� ��� ��� �� ���� ����� ����� �� �� ��� ��� ����� �� ��� ��� ���� �����. ����� ������ �� �����!! ��� ���� ���� ���� ��� ���. �� �� ��� ����� ���� �� ����� �� ����� ��������� ����.",
				"","","");
		Dogs.save(dog7);
		
		Dog dog8 = new Dog("����", new Colors[]{Colors.BLACK}, 10.0, Area.SOUTH, Gender.MALE, Size.BIG, DogBreeds.BorderCollie,
				Utils.encodeFileToBase64Binary("8"), 
				"���� �� 10, ��� ����� ����� �����. ������ ����. ����� �� �������� ��� �� ������ ���� �� ������ �� ����� ������ ���� ������ �� ����� ���� ���� ������ ���� ���� ������� ��� ��� ���� ������ ������! ��� ��� ����� ����� ������ ��� �����",
				"","","");
		Dogs.save(dog8);
		
		Dog dog9 = new Dog("������", new Colors[]{Colors.BROWN}, 4.0, Area.CENTER, Gender.MALE, Size.SMALL, DogBreeds.MiniaturePinscher,
				Utils.encodeFileToBase64Binary("9"), 
				"������, ��� ��� ���� ��� ���� ��� ���� �� ���. ����'� ��� ����� ��� ��� ��� ��� �� ����� ����� ����� ��� ���� ���� ������. ������ ���� �� 4 ����� ����� ����� �� �� ���."
				+ " ����� ���� �� �� ���� ���, �� ���� ����. ��� �����, ����� ������. ����� �� ����� �������. �� �� ���� ���� �� ����! �� ���� ���? **���� ���� ���� ��",
				"","","");
		Dogs.save(dog9);
		
		Dog dog10 = new Dog("�����", new Colors[]{Colors.BROWN}, 10.0, Area.SOUTH, Gender.FEMALE, Size.BIG, DogBreeds.AmericanPitBullTerrier,
				Utils.encodeFileToBase64Binary("10"),
				"����� ,���� ������ ������ �������. ����� ������� ������� ����� �� ����� ���� ���, �� ���� ���� ������ ������ . ����� ������ ������� ��� ����� ��� �����. ����� ������ ������ ����� . !!!!",
				"","","");
		Dogs.save(dog10);
		
		Dog dog11 = new Dog("�����", new Colors[]{Colors.BLACK}, 0.10, Area.SOUTH, Gender.MALE, Size.BIG, DogBreeds.Greyhound,
				Utils.encodeFileToBase64Binary("11"),
				"�����, ���� ��� ��� ���� ���- ���� ���������. ������ ��� �� 10 ������. ����� ����� ����� ����� �����. "
				+ "7���� ������� �������� ��������, ���� ���� �� ����� �����, �� �� ��� ���� �� ��� ������� ������� ��������� ��� �������� ��� ������ ������. ����� ���� ��� ����  �� ����� ������ ",
				"","","");
		Dogs.save(dog11);
		
		Dog dog12 = new Dog("����", new Colors[]{Colors.GREY}, 10.0, Area.SOUTH, Gender.MALE, Size.SMALL, DogBreeds.Pekingese,
				Utils.encodeFileToBase64Binary("12"), "���� �� 10 ����� ���� ����� ������ �� ����� ���� ���� ���� ����. ���� ���� ��� ����� �� ���� �����..",
				"","","");
		Dogs.save(dog12);
		
		Dog dog13 = new Dog("������", new Colors[]{Colors.WHITE}, 13.0, Area.SOUTH, Gender.MALE, Size.SMALL, DogBreeds.Poodle,
				Utils.encodeFileToBase64Binary("13"), 
				"���� �� 10, ��� ����� ����� �����. ������ ����. ����� �� �������� ��� �� ������ ���� �� ������ �� ����� ������ ���� ������ �� ����� ���� ���� ������ ���� ���� ������� ��� ��� ���� ������ ������!"
				+ " ��� ��� ����� ����� ������ ��� �����, �� �� ������ �� ������ ����� ����� �� ������",
				"","","");
		Dogs.save(dog13);
		
		Dog dog14 = new Dog("������", new Colors[]{Colors.WHITE}, 3.5, Area.SOUTH, Gender.FEMALE, Size.SMALL, DogBreeds.Maltese,
				Utils.encodeFileToBase64Binary("14"), 
				"������ ������ ���� ���� ����, ��� �� ���� ����, ������ ������ ����. ����� ������ ����� ����� ������ ������� ���, ��� ������ �� ����� ���� ������ ������� ������ ����� �� ����� ���� ��� ����� ������. ��� ���� ���� ���� ���? :)",
				"","","");
		Dogs.save(dog14);
		
		Dog dog15 = new Dog("�����", new Colors[]{Colors.BROWN}, 2.0, Area.CENTER, Gender.FEMALE, Size.SMALL, DogBreeds.MiniaturePinscher,
				Utils.encodeFileToBase64Binary("15"), "����� - ����'��� ������, �� �������, ������ �������, ���� �������, ���� �� ������ �������� ������. ����� ��� ����� ������ ������ �� ����.",
				"","","");
		Dogs.save(dog15);
		
		Dog dog16 = new Dog("���", new Colors[]{Colors.WHITE}, 2.0, Area.SOUTH, Gender.MALE, Size.BIG, DogBreeds.LabradorRetriever,
				Utils.encodeFileToBase64Binary("16"), "������ ����� ���� ��� �� ������, ��� ������. ��� ��� ����� ����� ������ �� ���� ��� ����� ������ ���� ������� ����� ��� ����� �������",
				"","","");
		Dogs.save(dog16);
	}
}
