package enums;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum HouseType {
	SMALL_APARTMENT("דירה קטנה","SMALL_APARTMENT","001"),
	BIG_APARTMENT("דירה גדולה","BIG_APARTMENT","010"),
	GARDEN("בית עם גינה","GARDEN","100");
	
	private String hebrewName;
	private String englishName;
	private String knnValue;

	HouseType(String hebrewName, String englishName,  String knnValue) {
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