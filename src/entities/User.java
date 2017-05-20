package entities;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class User {

	@Id
	private String id;
    @Indexed(unique = true)  
	private String userName;
    private String firstName;
	private String lastName;
	private String password;
	private String emailAdress;
	private String phoneNumber;
	private DogAdopter adoptionDetails;
	@DBRef
	private ArrayList<Dog> likedDogs = new ArrayList();
	private Dog adoptedDog;
	
	public User() {
		super();
	}
	
	public User(String firstName, String lastName) {
		super();
		this.userName = firstName;
		this.lastName = lastName;
		this.firstName = firstName;
		}

	public User(String userName, String password, String emailAdress, String firstName, String lastName,
			String phoneNumber, DogAdopter adoptionDetails, ArrayList<Dog> likedDogs,
			Dog adoptednDog) {
		super();
		this.userName = userName;
		this.password = password;
		this.emailAdress = emailAdress;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.adoptionDetails = adoptionDetails;
		this.likedDogs = likedDogs;
		this.adoptedDog = adoptednDog;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmailAdress() {
		return emailAdress;
	}

	public void setEmailAdress(String emailAdress) {
		this.emailAdress = emailAdress;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public DogAdopter getAdoptionDetails() {
		return adoptionDetails;
	}

	public void setAdoptionDetails(DogAdopter adoptionDetails) {
		this.adoptionDetails = adoptionDetails;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public ArrayList<Dog> getLikedDogs() {
		return likedDogs;
	}

	public void setLikedDogs(ArrayList<Dog> likedDogs) {
		this.likedDogs = likedDogs;
	}

	public Dog getAdoptednDog() {
		return adoptedDog;
	}

	public void setAdoptednDog(Dog adoptednDog) {
		this.adoptedDog = adoptednDog;
	}
	
}