package enums;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum Size {
	BIG ("גדול","big","001"),
	MEDIUM("בינוני","medium","010"),
	SMALL("קטן","small","100");

	private String hebrewName;
	private String englishName;
	private String knnValue;

	Size(String hebrewName, String englishName,  String knnValue) {
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
	@JsonIgnore
	public void setKnnValue(String knnValue) {
		this.knnValue = knnValue;
	}
	
}
	
