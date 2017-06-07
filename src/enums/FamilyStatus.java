package enums;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum FamilyStatus {
	SINGLE("רווק","SINGLE","001"),
	MARRIED("נשוי","MARRIED","010"),
	MARRIED_WITH_CHILDREN("נשוי עם ילדים","MARRIED_WITH_CHILDREN","100");
	
	private String hebrewName;
	private String englishName;
	private String knnValue;

	FamilyStatus(String hebrewName, String englishName,  String knnValue) {
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
