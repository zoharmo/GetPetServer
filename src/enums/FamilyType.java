package enums;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum FamilyType {
	SMALL_CHILDREN("ילדים קטנים","small children","00000"),
	BIG_CHILDREN("ילדים גדולים","big children","00001"),
	LOAD("משפחה רעשנית","load family","00010"),
	FRIENDLY("משפחה חברותית","friendly family","00100"),
	MULTIPLE_FAMILY("משפחה מרובה","multiple family people","01000"),
	QUIET("משפחה שקטה","quiet family","10000");

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