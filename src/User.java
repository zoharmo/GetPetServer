import java.util.ArrayList;

public class User {

	String userName;
	String password;
	String emailAdress;
	String firstName;
	String secondName;
	int phoneNumber;
	
	ArrayList<Dog> dogsForAdoption = new ArrayList<>();

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

	public ArrayList<Dog> getDogsForAdoption() {
		return dogsForAdoption;
	}

	public void setDogsForAdoption(ArrayList<Dog> dogsForAdoption) {
		this.dogsForAdoption = dogsForAdoption;
	}
}