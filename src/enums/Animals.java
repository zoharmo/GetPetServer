package enums;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.JsonNode;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum Animals {
	NON("אין","NON","001"),
	DOG("כלב","DOG","001"),
	CAT("חתול","CAT","010"),
	OTHER("אחר","OTHER","100");
	
	private String hebrewName;
	private String englishName;
	private String knnValue;

	Animals(String hebrewName, String englishName,  String knnValue) {
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
	 public Animals create(JsonNode json) {
		return Animals.valueOf(json.get("englishName").asText());
	 }
}
