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
	private String password;
	private String emailAdress;
	private String firstName;
	private String secondName;
	private int phoneNumber;
	private DogAdopter adoptionDetails;
	//private Map<Dog, User> uploadDogs = new HashMap<>();
	@DBRef
	private Map<String, ArrayList<User>> uploadsDogs = new HashMap<>();
	@DBRef
	private ArrayList<Dog> dogsRequest = new ArrayList();
	
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

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}


	public Map<String, ArrayList<User>> getUploadDogs() {
		return uploadsDogs;
	}

	public void setUploadDogs(Map<String, ArrayList<User>> uploadDogs) {
		this.uploadsDogs = uploadDogs;
	}

	public ArrayList<Dog> getDogsRequests() {
		return dogsRequest;
	}
	  @Override
	    public String toString() {
		  return "User: id :" + id + " name: " + this.firstName + " user name " + this.userName + " Dog Req: "
				  + dogsRequest.toString() + " dog uplaods  "+ this.uploadsDogs.toString();
	 
	  }

	public void setDogsRequests(ArrayList<Dog> dogsRequests) {
		this.dogsRequest = dogsRequests;
	}

	public DogAdopter getAdoptionDetails() {
		return adoptionDetails;
	}

	public void setAdoptionDetails(DogAdopter adoptionDetails) {
		this.adoptionDetails = adoptionDetails;
	}

}