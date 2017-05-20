package enums;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum FamilyType {
	SMALL_CHILDREN("����� �����","small children","00000"),
	BIG_CHILDREN("����� ������","big children","00001"),
	LOAD("����� ������","load family","00010"),
	FRIENDLY("����� �������","friendly family","00100"),
	MULTIPLE_FAMILY("����� �����","multiple family people","01000"),
	QUIET("����� ����","quiet family","10000");

	private String hebrewName;
	private String englishName;
	private String knnValue;

	FamilyType(String hebrewName, String englishName,  String knnValue) {
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