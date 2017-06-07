package enums;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum Features {
	NEED_PROTECTION("זקוק להגנה","NEED_PROTECTION","100000000000"),
	AFRAID("מפחד בקלות","AFRAID","000000000001"),
	IGNORE("נוטה להתעלם מדברים","IGNORE","000000000010"),
	NEGLECT("נוטה להזניח דברים","NEGLECT","000000000100"),
	ATTENTION("מחפש צומי","ATTENTION","000000001000"),
	ANGRY("נוטה לעצבנות","ANGRY","000000010000"),
	FRIENDLY("חברותי","FRIENDLY","000000100000"),
	TOLERANT("סבלני","TOLERANT","000001000000"),
	SENSITIVE("רגיש","SENSITIVE","000010000000"),
	SURRENDER("נכנע בקלות","SURRENDER","000100000000"),
	IMPULSIVE("אימפולסיבי","IMPULSIVE","001000000000"),
	STUBBORN("נוטה לקשיחות כלפי אחרים","STUBBORN","010000000000");

	private String hebrewName;
	private String englishName;
	private String knnValue;

	Features(String hebrewName, String englishName,  String knnValue) {
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