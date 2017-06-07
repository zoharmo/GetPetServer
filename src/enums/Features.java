package enums;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum Features {
	NEED_PROTECTION("���� �����","NEED_PROTECTION","100000000000"),
	AFRAID("���� �����","AFRAID","000000000001"),
	IGNORE("���� ������ ������","IGNORE","000000000010"),
	NEGLECT("���� ������ �����","NEGLECT","000000000100"),
	ATTENTION("���� ����","ATTENTION","000000001000"),
	ANGRY("���� �������","ANGRY","000000010000"),
	FRIENDLY("������","FRIENDLY","000000100000"),
	TOLERANT("�����","TOLERANT","000001000000"),
	SENSITIVE("����","SENSITIVE","000010000000"),
	SURRENDER("���� �����","SURRENDER","000100000000"),
	IMPULSIVE("����������","IMPULSIVE","001000000000"),
	STUBBORN("���� ������� ���� �����","STUBBORN","010000000000");

	private String hebrewName;
	private String englishName;
	private String knnValue;

	Features(String hebrewName, String englishName,  String knnValue) {
		this.hebrewName = hebrewName;
		this.englishName = englishName;
		this.knnValue = knnValue;
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
	 @JsonIgnore
	 public String getKnnValue() {
		return knnValue;
	}
}