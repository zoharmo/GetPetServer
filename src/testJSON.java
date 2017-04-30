
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

import com.fasterxml.jackson.core.JsonProcessingException;
public class testJSON {

	
	public static void main(String[] args) throws JsonProcessingException {
		
/*		System.out.println(new ObjectMapper().writeValueAsString(Animals.values()));
		System.out.println(new ObjectMapper().writeValueAsString(Area.values()));
		System.out.println(new ObjectMapper().writeValueAsString(CommunityType.values()));
		System.out.println(new ObjectMapper().writeValueAsString(DogCare.values()));
		System.out.println(new ObjectMapper().writeValueAsString(Gender.values()));
		System.out.println(new ObjectMapper().writeValueAsString(HouseType.values()));
		System.out.println(new ObjectMapper().writeValueAsString(Location.values()));
		System.out.println(new ObjectMapper().writeValueAsString(Availability.values()));
		System.out.println(new ObjectMapper().writeValueAsString(HealthStatus.values()));
		System.out.println(new ObjectMapper().writeValueAsString(FamilyType.values()));
		System.out.println(new ObjectMapper().writeValueAsString(Relation.values()));
		System.out.println(new ObjectMapper().writeValueAsString(Hobbies.values()));
		System.out.println(new ObjectMapper().writeValueAsString(Features.values()));
<<<<<<< HEAD
*/
		try {
//			URL url = new URL("http://localhost:8080/GetPet/getPetServer/GetPetServices/getDogAfterUpload");
		//	URL url = new URL("http://localhost:8080/GetPet/getPetServer/GetPetServices/getDogsByAdoptionDetails");
			URL url = new URL("http://localhost:8080/GetPet/getPetServer/GetPetServices/userRegistration");
			URLConnection connection = url.openConnection();
			connection.setDoOutput(true);
			connection.setRequestProperty("Content-Type", "application/json");
			connection.setConnectTimeout(500000);
			connection.setReadTimeout(500000);
			OutputStreamWriter out = new OutputStreamWriter(connection.getOutputStream());
//			out.write("{'id':'1234','name':'lasi','age':3,'breed':[]}");
			out.write("{'id':'12','userName':'barbe','firstName':'bar','secondName':'ben tolila'}");
			out.close();
			BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			
			StringBuilder s = new StringBuilder();
			String line = null;
			
			while ((line = in.readLine()) != null) {
				
					s.append(line);
					System.out.println(s);
			}
			
			in.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	
	}
}
