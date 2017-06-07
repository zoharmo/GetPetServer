package enums;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum Area {
	NORTH ("����","NORTH","0000"),
	SOUTH("����","SOUTH","0001"),
	CENTER("����","CENTER","0010"),
	JERUSALEM("�������� �������","JERUSALEM","0100"),
	EILAT("���� �������","EILAT","1000");

	private String hebrewName;
	private String englishName;
	private String knnValue;

	Area(String hebrewName, String englishName,  String knnValue) {
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