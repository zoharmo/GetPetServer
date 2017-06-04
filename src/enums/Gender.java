package enums;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.JsonNode;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum Gender {
	MALE("זכר","MALE","0"),
	FEMALE("נקבה","FEMALE","1");
	
	private String hebrewName;
	private String englishName;
	private String knnValue;

	Gender(String hebrewName, String englishName,  String knnValue) {
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
	 @JsonCreator
	 public Gender create(JsonNode json) {
		return Gender.valueOf(json.get("englishName").asText());
	 }

}