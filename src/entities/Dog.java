package entities;

import java.awt.Color;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.databind.ObjectMapper;

import enums.*;
@Document(collection = "dogs")
public class Dog {
	
	@Id
	private String id;
	private String name;
	private String color;
	private Double age;
	private Area area;
	//@DBRef
	//private User owner;
	private Gender gender;
	private Size size;
	private DogBreeds breed;
	
	private byte[] picture;
	private String description;
	private String owenerName;
	private String address;
	private String phone;

	public Dog() {
		super();
	}
	public Dog(String name, String color, Double age, Area area, Gender gender, Size size,
			DogBreeds breed, byte[] picture, String description, String owener, String address) {
		super();
		this.name = name;
		this.color = color;
		this.age = age;
		this.area = area;
		this.gender = gender;
		this.size = size;
		this.breed = breed;
		this.picture = picture;
		this.description = description;
		this.owenerName = owener;
		this.address = address;
		
	}
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

	public Double getAge() {
		return age;
	}
	public void setAge(Double age) {
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
		try{
		  return new ObjectMapper().writeValueAsString(this);	 }
		catch (Exception e) {
			return 	id;
			}
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
		public DogBreeds getBreed() {
			return breed;
		}
		public void setBreed(DogBreeds breed) {
			this.breed = breed;
		}
		public Size getSize() {
			return size;
		}
		public void setSize(Size size) {
			this.size = size;
		}
		public String getOwenerName() {
			return owenerName;
		}
		public void setOwenerName(String owenerName) {
			this.owenerName = owenerName;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		
}
