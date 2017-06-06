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
	
		Dog d1 = new Dog("����", new Colors[] {Colors.BEZ},4.0, Area.CENTER,Gender.MALE, Size.MEDIUM,DogBreeds.GoldenRetriever,
						Utils.encodeFileToBase64Binary("1"),"���� ���� ������ �����, ����� ��� , ��� . �����, ����� - ����� ���� ��� ����� ������ ��..."
								+ " ����� ���� ������� �� ��� ����� ���� ���. �� ����, ��� ���� �� ���� ����� ..", "������","�����" ,"050-934-4563");
		Dog d2 = new Dog("���", new Colors[] {Colors.BROWN},0.2, Area.NORTH,Gender.FEMALE, Size.SMALL,DogBreeds.RhodesianRidgeback,
				Utils.encodeFileToBase64Binary("2"),"������ ���� ������ ��� ���� ���� ������� �����, ���� ���� ���� �����", "��� ����� ����� ����� �������", "�����","050-3199395");

		Dogs.save(d2);
		Dogs.save(d1);
		
	}
	
	public void clean(){
		Dogs.removeByDogName("���");
		Dogs.removeByDogName("����");
	}
	
}
