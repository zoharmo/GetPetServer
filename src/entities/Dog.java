package entities;
import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import enums.*;
@Document(collection = "dogs")
public class Dog {
	
	@Id
	private String id;
	private String name;
	private String color;
	private int age;
	private Area area;
	private User owner;
	private Gender gender;
	private ArrayList<DogBreeds> breed = new ArrayList<>();
	
	private byte[] picture;
	private String description;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
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
	
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	@Override
	    public String toString() {
		  return "Dog: id :" + id + " name: " + name;
	 
	  }
	  
	  public byte[] getPicture() {
			return picture;
		}
		public void setPicture(byte[] picture) {
			this.picture = picture;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public ArrayList<DogBreeds> getBreed() {
			return breed;
		}
		public void setBreed(ArrayList<DogBreeds> breed) {
			this.breed = breed;
		}
		
}
