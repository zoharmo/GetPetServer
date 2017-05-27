package services;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.print.attribute.ResolutionSyntax;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import crud.Users;
import entities.User;

@Path("/UserServices")
public class UserServices {
	private Gson gson = new Gson();
	private ObjectMapper objectMapper =  new ObjectMapper();


	/** User Registration
	 * check if user name dont exsit already,
	 * save use to DB
	 * @param user json
	 * **/
	@POST
    @Path("/userRegistration") 
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces("application/json;charset=utf-8")
	public String userRegistration(InputStream incomingData) {
		BufferedReader in = new BufferedReader(new InputStreamReader(incomingData));
		User usr = gson.fromJson(in, User.class);
		String response = "OK";
		try{
			Users.save(usr);
		}catch (Exception e) {
			System.out.println(e.getMessage());		
			response = "ERROR: " + e.getMessage();
		}
		System.out.println("response: " + response);
		return response;
	}

	@POST
    @Path("/updateUser") 
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces("application/json;charset=utf-8")
	public String updateUser(InputStream incomingData) {
		BufferedReader in = new BufferedReader(new InputStreamReader(incomingData));
		User usr = gson.fromJson(in, User.class);
		String response = "OK";

		try{
			Users.update(usr);
		}catch (Exception e) {
			System.out.println(e.getMessage());		
			response = "ERROR: " + e.getMessage();
		}
		return response;
	}
	
	@POST
    @Path("/getUser") 
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces("application/json;charset=utf-8")
	public String getUser(@QueryParam("userName")String userName) {
		
		try{
			User usr = Users.getUserByUserName(userName);
			return objectMapper.writeValueAsString(usr);
		}catch (Exception e) {
			System.out.println(e.getMessage());		
			return "ERROR:" + e.getMessage();
		}
	}
	
	/**
	 * check if user name exists
	 * @param string userName
	 * @return true - if user name exist
	 *			fasle - if not exist 
	 */
	@GET
    @Path("/checkUserName") 
	@Consumes(MediaType.TEXT_HTML)
	public Boolean checkUserName(@QueryParam("userName")String userName) {
		  return(Users.doesUserNameExist(userName));
	}
	
	@POST
    @Path("/signIn") 
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces("application/json;charset=utf-8")
	public String signIn(@QueryParam("userName")String userName, @QueryParam("password")String password) {
		User user = Users.getUserByUserName(userName);
		String s;
		if (user == null){
			s = "ERR: user name dont exist";
		}else{
			if (user.getPassword() != password){
				s = "ERR: worng password";
			}else{
				try{
					s = objectMapper.writeValueAsString(user); 
				}catch (Exception e) {
					System.out.println(e.getMessage());	
					s = e.getMessage();
				}
			}
		}
		return s;	
	}
}
