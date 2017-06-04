package enums;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.JsonNode;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum Colors {
	WHITE("לבן","WHITE","00001"),
	BLACK("שחור","BLACK","00010"),
	BROWN("חום","BROWN","00100"),
	GREY("אפור","GREY","01000"),
	DALMATIAN("דלמטי","DALMATIAN","10000");
	
	private String hebrewName;
	private String englishName;
	private String knnValue;

	Colors(String hebrewName, String englishName,  String knnValue) {
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
