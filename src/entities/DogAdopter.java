package entities;
import java.awt.List;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

import org.springframework.data.mongodb.core.aggregation.ArrayOperators.In;

import enums.*;

public class DogAdopter {
	
	private Gender gender;
	private int age;
	private FamilyStatus familyStatus;
	private CommunityType communityType;
	private Area area;
	private HouseType houseType;
	private DogCare dogCare;
	private Animals[] otherAnimals;
	private Location dogLocation;
	private Availability[] availability;
	private HealthStatus[] healthStatus;
	private FamilyType[] familyType;
	private Relation[] relationToProperty;
	private Hobbies[] familyHobbies;
	private Features[] familyFeature;
	
	public DogAdopter(){
		super();
	}
	
	public DogAdopter(Gender gender, int age, FamilyStatus familyStatus, CommunityType communityType, Area area,
			HouseType houseType, DogCare dogCare, Animals[] otherAnimals, Location dogLocation, Availability[] availability,
			HealthStatus[] healthStatus, FamilyType[] familyType, Relation[] relationToProperty, Hobbies[] familyHobbies,
			Features[] familyFeature) {
		super();
		this.gender = gender;
		this.age = age;
		this.familyStatus = familyStatus;
		this.communityType = communityType;
		this.area = area;
		this.houseType = houseType;
		this.dogCare = dogCare;
		this.otherAnimals = otherAnimals;
		this.dogLocation = dogLocation;
		this.availability = availability;
		this.healthStatus = healthStatus;
		this.familyType = familyType;
		this.relationToProperty = relationToProperty;
		this.familyHobbies = familyHobbies;
		this.familyFeature = familyFeature;
	}

	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public FamilyStatus getFamilyStatus() {
		return familyStatus;
	}
	public void setFamilyStatus(FamilyStatus familyStatus) {
		this.familyStatus = familyStatus;
	}
	public CommunityType getCommunityType() {
		return communityType;
	}
	public void setCommunityType(CommunityType communityType) {
		this.communityType = communityType;
	}
	public Area getArea() {
		return area;
	}
	public void setArea(Area area) {
		this.area = area;
	}
	public HouseType getHouseType() {
		return houseType;
	}
	public void setHouseType(HouseType houseType) {
		this.houseType = houseType;
	}
	public DogCare getDogCare() {
		return dogCare;
	}
	public void setDogCare(DogCare dogCare) {
		this.dogCare = dogCare;
	}
	public Animals[] getOtherAnimals() {
		return otherAnimals;
	}
	public void setOtherAnimals(Animals[] otherAnimals) {
		this.otherAnimals = otherAnimals;
	}
	public Location getDogLocation() {
		return dogLocation;
	}
	public void setDogLocation(Location dogLocation) {
		this.dogLocation = dogLocation;
	}
	public Availability[] getAvailability() {
		return availability;
	}
	public void setAvailability(Availability[] availability) {
		this.availability = availability;
	}
	public HealthStatus[] getHealthStatus() {
		return healthStatus;
	}
	public void setHealthStatus(HealthStatus[] healthStatus) {
		this.healthStatus = healthStatus;
	}
	public FamilyType[] getFamilyType() {
		return familyType;
	}
	public void setFamilyType(FamilyType[] familyType) {
		this.familyType = familyType;
	}
	public Relation[] getRelationToProperty() {
		return relationToProperty;
	}
	public void setRelationToProperty(Relation[] relationToProperty) {
		this.relationToProperty = relationToProperty;
	}
	public Hobbies[] getFamilyHobbies() {
		return familyHobbies;
	}
	public void setFamilyHobbies(Hobbies[] familyHobbies) {
		this.familyHobbies = familyHobbies;
	}
	public Features[] getFamilyFeature() {
		return familyFeature;
	}
	public void setFamilyFeature(Features[] familyFeature) {
		this.familyFeature = familyFeature;
	}
	
	public ArrayList<Integer> convertFeaturesToBinaryArray() throws Exception{
		ArrayList<Integer> list = new ArrayList();
		list.add(toKnnIntValue(this.gender.getKnnValue()));
		list.add(toKnnIntValue(this.familyStatus.getKnnValue()));
		list.add(toKnnIntValue(this.communityType.getKnnValue()));
		list.add(toKnnIntValue(this.area.getKnnValue()));
		list.add(toKnnIntValue(this.houseType.getKnnValue()));
		list.add(toKnnIntValue(this.dogCare.getKnnValue()));
		list.add(listToKnnIntValue(this.otherAnimals));
		list.add(toKnnIntValue(this.dogLocation.getKnnValue()));
		list.add(listToKnnIntValue(this.availability));
		list.add(listToKnnIntValue(this.healthStatus));
		list.add(listToKnnIntValue(this.familyType));
		list.add(listToKnnIntValue(this.relationToProperty));
		list.add(listToKnnIntValue(this.healthStatus));
		list.add(listToKnnIntValue(this.familyHobbies));
		list.add(listToKnnIntValue(this.familyFeature));

		return list;
	}

	private byte[] enumListToByteArray(Enum[] list) throws Exception{
		byte[] b = new byte[enumSize(list[0])];
	
		for (Enum e : list) {
			b[e.ordinal()] = 1; 
		}
		return b;
	}
	
	 
	 private byte[] enumToByteArray(Enum e) throws Exception {
		 byte[] b = new byte[enumSize(e)];
		 b[e.ordinal()] = 1;
			return b;
		}
	 private int enumSize(Enum e) throws Exception {
			return((Enum[])e.getClass().getMethod("values").invoke("values")).length;
	 }
	 
	 public int listToKnnIntValue(Enum[] enums) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException{
		 int featuresBits = 0;
		 Method m = enums[0].getClass().getMethod("getKnnValue");
		 for (Enum e : enums) {
			 int s = Integer.parseInt((String)m.invoke(e), 2);
			 featuresBits |= s;
		 }		 
		 return featuresBits;
	 }
	 private int toKnnIntValue(String s){
		 return Integer.parseInt(s, 2);
	 }
}
