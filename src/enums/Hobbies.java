package enums;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum Hobbies {
	SPORT ("�����","SPORT","000001"),
	WATCHING_TV("����� ��������","WATCHING_TV","000010"),
	TRAVELING("������","TRAVELING","000100"),
	SLEEPING("�����","SLEEPING","001000"),
	STAYING_HOME("������ ����","STAYING_HOME","010000"),
	SWIMMING("�����","SWIMMING","100000");

	private String hebrewName;
	private String englishName;
	private String knnValue;

	Hobbies(String hebrewName, String englishName,  String knnValue) {
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
