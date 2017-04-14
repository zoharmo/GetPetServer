
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.lang.reflect.Type;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import enums.FamilyStatus;

public class tt {

	
	public static void main(String[] args) throws JsonProcessingException {
		/*Gson gson = new Gson();
		Type listType = new TypeToken<ArrayList<FamilyStatus>>(){}.getType();
		String s = gson.toJson( Arrays.asList(FamilyStatus.values()),   listType);
		System.out.println(s);
	*/

		
		String s = new ObjectMapper().writeValueAsString(FamilyStatus.values());
		System.out.println(s);
		
		System.out.println("test after first upload to github");

	}
}
