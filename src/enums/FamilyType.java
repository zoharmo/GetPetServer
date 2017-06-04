package enums;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum FamilyType {
	SMALL_CHILDREN("ילדים קטנים","SMALL_CHILDREN","00000"),
	BIG_CHILDREN("ילדים גדולים","BIG_CHILDREN","00001"),
	LOAD("משפחה רעשנית","LOAD","00010"),
	FRIENDLY("משפחה חברותית","FRIENDLY","00100"),
	MULTIPLE_FAMILY("משפחה מרובה","MULTIPLE_FAMILY","01000"),
	QUIET("משפחה שקטה","QUIET","10000");

	private String hebrewName;
	private String englishName;
	private String knnValue;

	FamilyType(String hebrewName, String englishName,  String knnValue) {
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