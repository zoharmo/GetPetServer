package enums;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum Features {
	NEED_PROTECTION("זקוק להגנה","need protection","100000000000"),
	AFRAID("מפחד בקלות","afraid","000000000001"),
	IGNORE("נוטה להתעלם מדברים","ignore","000000000010"),
	NEGLECT("נוטה להזניח דברים","neglect","000000000100"),
	ATTENTION("מחפש צומי","attention","000000001000"),
	ANGRY("נוטה לעצבים","angry","000000010000"),
	FRIENDLY("חברותי","friendly","000000100000"),
	TOLERANT("סבלני","tolerant","000001000000"),
	SENSITIVE("רגיש","sensitive","000010000000"),
	SURRENDER("נכנע בקלות","surrender","000100000000"),
	IMPULSIVE("אימפולסיבי","impulsive","001000000000"),
	STUBBORN("נוטה לקשיחות כלפי אחרים","stubborn","010000000000");

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
		return englishName;
	}
	 @JsonIgnore
	 public String getKnnValue() {
		return knnValue;
	}
}