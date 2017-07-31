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
	private ObjectMapper objectMapper = new ObjectMapper();

	@POST
	@Path("/signUp")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces("application/json;charset=utf-8")
	public String signUp(InputStream incomingData) {
		BufferedReader in = new BufferedReader(new InputStreamReader(incomingData));
		User usr = gson.fromJson(in, User.class);
		String response = "OK";
		try {
			Users.save(usr);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			response = "ERROR: " + e.getMessage();
		}
		System.out.println("response: " + response);
		return response;
	}

	@GET
	@Path("/signIn")
	// @Consumes(MediaType.APPLICATION_JSON)
	@Produces("application/json;charset=utf-8")
	public String signIn(@QueryParam("userName") String userName, @QueryParam("password") String password) {
		User user = Users.getUserByUserName(userName);
		String s;
		if (user == null) {
			s = "ERROR: user name dont exist";
		} else {
			if (!user.getPassword().equals(password)) {
				s = "ERROR: wrong password";
			} else {
				try {
					s = objectMapper.writeValueAsString(user);
				} catch (Exception e) {
					System.out.println(e.getMessage());
					s = e.getMessage();
				}
			}
		}
		return s;
	}

	@POST
	@Path("/updateUser")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces("application/json;charset=utf-8")
	public String updateUser(InputStream incomingData) {
		BufferedReader in = new BufferedReader(new InputStreamReader(incomingData));
		User usr = gson.fromJson(in, User.class);
		String response = "OK";

		try {
			Users.update(usr);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			response = "ERROR: " + e.getMessage();
		}
		return response;
	}

	@POST
	@Path("/getUser")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces("application/json;charset=utf-8")
	public String getUser(@QueryParam("userName") String userName) {
		String response = null;
		try {
			User usr = Users.getUserByUserName(userName);
			if (usr == null) {
				response = "ERROR: dont exist user with userName " + usr.getUserName();
			}
			response = objectMapper.writeValueAsString(usr);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			response = "ERROR:" + e.getMessage();
		}
		return response;
	}

	@GET
	@Path("/checkUserName")
	// @Consumes(MediaType.APPLICATION_JSON)
	@Produces("application/json;charset=utf-8")
	public String checkUserName(@QueryParam("userName") String userName) {
		String response = "false";
		try {
			if (Users.doesUserNameExist(userName)) {
				response = "true";
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			response = "ERROR:" + e.getMessage();
		}
		return response;
	}

}
