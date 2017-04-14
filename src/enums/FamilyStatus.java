package enums;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum FamilyStatus {

	single("����","single","001"),
	married("����","married","010"),
	marriedWithChildren("���� �� �����","married with children","100");
	
	private String hebrewName;
	private String englishName;
	private String knnValue; 

	FamilyStatus(String hebrewName, String englishName,  String knnValue) {
		this.setHebrewName(hebrewName);
		this.setEnglishName(englishName);
		this.setKnnValue(knnValue);
	}
	
	 public int getId() {
		return ordinal();
	}
	 public String getHebrewName() {
		return hebrewName;
	}

	public void setHebrewName(String hebrewName) {
		this.hebrewName = hebrewName;
	}

	 public String getEnglishName() {
		return englishName;
	}

	public void setEnglishName(String englishName) {
		this.englishName = englishName;
	}

	 public String getKnnValue() {
		return knnValue;
	}

	public void setKnnValue(String knnValue) {
		this.knnValue = knnValue;
	}
	
	

}
