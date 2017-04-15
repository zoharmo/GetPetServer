package enums;
import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum Hobbies {
	SPORT ("ספורט","sport","000001"),
	WATCHING_TV("צפייה בטלויזיה","watching television","000010"),
	TRAVELING("טיולים","traveling","000100"),
	SLEEPING("לישון","jerusalem","001000"),
	STAYING_HOME("להישאר בבית","staying home","010000"),
	SWIMMING("שחייה","swimming","100000");

	private String hebrewName;
	private String englishName;
	private String knnValue;

	Hobbies(String hebrewName, String englishName,  String knnValue) {
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
