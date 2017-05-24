package enums;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum Area {
	NORTH ("צפון","NORTH","0000"),
	SOUTH("דרום","SOUTH","0001"),
	CENTER("מרכז","CENTER","0010"),
	JERUSALEM("ירושליים והסביבה","JERUSALEM","0100"),
	EILAT("אילת והסביבה","EILAT","1000");

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
		return englishName;
	}
	 @JsonIgnore
	 public String getKnnValue() {
		return knnValue;
	}
}