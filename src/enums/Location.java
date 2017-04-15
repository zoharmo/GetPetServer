package enums;
import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum Location {
	INSIDE("�����","inside","001"),
	OUTSIDE("����","outside","010"),
	BOTH("�� ���","both","100");
	
	private String hebrewName;
	private String englishName;
	private String knnValue;

	Location(String hebrewName, String englishName,  String knnValue) {
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