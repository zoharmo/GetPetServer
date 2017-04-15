package enums;
import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum FamilyStatus {
	SINGLE("רווק","single","001"),
	MARRIED("נשוי","married","010"),
	MARRIED_WITH_CHILDREN("נשוי עם ילדים","married with children","100");
	
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
		return englishName;
	}

	 public String getKnnValue() {
		return knnValue;
	}
}
