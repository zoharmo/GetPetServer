package enums;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum Relation {
	CLEANING ("מכור לניקיון","cleaning","001"),
	CARING_TO_PROPERTY("אכפתיות לרכוש","carring ti property","010"),
	LANDSCAPED_GARDEN("גינה מטופחת","landscaped garden","100");

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