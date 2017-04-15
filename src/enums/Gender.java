package enums;
import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum Gender {
	MALE("זכר","male","0"),
	FEMALE("נקבה","female","1");
	
	private String hebrewName;
	private String englishName;
	private String knnValue;

	Gender(String hebrewName, String englishName,  String knnValue) {
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

	 public String getKnnValue() {
		return knnValue;
	}
}