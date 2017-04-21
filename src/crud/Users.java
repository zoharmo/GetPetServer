package crud;

import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import entities.User;

public class Users {

	public static int save(User user) {
		if(!doesUserNameExist(user.getUserName())){
			mongoManger.mongoOperation.save(user);
			return 0;}
		else{
			return -1;
		}
	}
	public static User getUserByUserName(String username) {
		Query searchUserQuery = new Query(Criteria.where("userName").is(username));
		return(mongoManger.mongoOperation.findOne(searchUserQuery, User.class));
	}
	
	public static boolean doesUserNameExist(String username) {
		return(getUserByUserName(username) != null);
	}	
}
