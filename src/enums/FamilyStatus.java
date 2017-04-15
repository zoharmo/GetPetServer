package enums;
import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum FamilyStatus {
	SINGLE("����","single","001"),
	MARRIED("����","married","010"),
	MARRIED_WITH_CHILDREN("���� �� �����","married with children","100");
	
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
