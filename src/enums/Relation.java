package enums;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum Relation {
	CLEANING ("מכור לניקיון","CLEANING","001"),
	CARING_TO_PROPERTY("אכפתיות לרכוש","CARING_TO_PROPERTY","010"),
	LANDSCAPED_GARDEN("גינה מטופחת","LANDSCAPED_GARDEN","100");

	private String hebrewName;
	private String englishName;
	private String knnValue;

	Relation(String hebrewName, String englishName,  String knnValue) {
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