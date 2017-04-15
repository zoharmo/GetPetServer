import java.util.ArrayList;

import enums.*;

public class Dog {
	
	private String name;
	private String color;
	private int age;
	private Area area;
	private User owner;
	private ArrayList<String> beerd = new ArrayList<>();

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public User getOwner() {
		return owner;
	}
	public void setOwner(User owner) {
		this.owner = owner;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Area getArea() {
		return area;
	}
	public void setArea(Area area) {
		this.area = area;
	}
	public ArrayList<String> getBeerd() {
		return beerd;
	}
	public void setBeerd(ArrayList<String> beerd) {
		this.beerd = beerd;
	}
}
