package enums;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum Features {
	NEED_PROTECTION("���� �����","need protection","100000000000"),
	AFRAID("���� �����","afraid","000000000001"),
	IGNORE("���� ������ ������","ignore","000000000010"),
	NEGLECT("���� ������ �����","neglect","000000000100"),
	ATTENTION("���� ����","attention","000000001000"),
	ANGRY("���� ������","angry","000000010000"),
	FRIENDLY("������","friendly","000000100000"),
	TOLERANT("�����","tolerant","000001000000"),
	SENSITIVE("����","sensitive","000010000000"),
	SURRENDER("���� �����","surrender","000100000000"),
	IMPULSIVE("����������","impulsive","001000000000"),
	STUBBORN("���� ������� ���� �����","stubborn","010000000000");

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
		return englishName;
	}
	 @JsonIgnore
	 public String getKnnValue() {
		return knnValue;
	}
}