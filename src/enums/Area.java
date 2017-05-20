package enums;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum Area {
	NORTH ("����","north","0000"),
	SOUTH("����","south","0001"),
	CENTER("����","center","0010"),
	JERUSALEM("�������� �������","jerusalem","0100"),
	EILAT("���� �������","eilat","1000");

	private String hebrewName;
	private String englishName;
	private String knnValue;

	Area(String hebrewName, String englishName,  String knnValue) {
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