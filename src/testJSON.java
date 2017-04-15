
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import enums.Animals;
import enums.Area;
import enums.Availability;
import enums.CommunityType;
import enums.DogCare;
import enums.FamilyStatus;
import enums.FamilyType;
import enums.Features;
import enums.Gender;
import enums.HealthStatus;
import enums.Hobbies;
import enums.HouseType;
import enums.Location;
import enums.Relation;

public class testJSON {

	
	public static void main(String[] args) throws JsonProcessingException {
		System.out.println(new ObjectMapper().writeValueAsString(FamilyStatus.values()));
		System.out.println(new ObjectMapper().writeValueAsString(Animals.values()));
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
	}
}
