package enums;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum HealthStatus {
	HEALTHY ("בריא","healthy","0000"),
	ALLERGIC("אלרגי","allergic","0001"),
	CRIPPLE("נכה","cripple","0010"),
	SENIOR("קשיש","senior","0100"),
	PATIENT("חולה","patient","1000");

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