package enums;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum Location {
	INSIDE("בפנים","INSIDE","001"),
	OUTSIDE("בחוץ","OUTSIDE","010"),
	BOTH("גם וגם","BOTH","100");
	
	private String hebrewName;
	private String englishName;
	private String knnValue;

	Location(String hebrewName, String englishName,  String knnValue) {
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