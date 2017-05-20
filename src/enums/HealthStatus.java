package enums;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum HealthStatus {
	HEALTHY ("����","healthy","0000"),
	ALLERGIC("�����","allergic","0001"),
	CRIPPLE("���","cripple","0010"),
	SENIOR("����","senior","0100"),
	PATIENT("����","patient","1000");

	private String hebrewName;
	private String englishName;
	private String knnValue;

	HealthStatus(String hebrewName, String englishName,  String knnValue) {
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