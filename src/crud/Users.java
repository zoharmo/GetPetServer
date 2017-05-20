package crud;

import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import entities.User;

public class Users {

	public static void save(User user) {
		if(!doesUserNameExist(user.getUserName())){
			mongoManger.mongoOperation.save(user);
			}
		else{
			System.out.println("ERROR: failed to save user");	
		}
	}
	
	public static void update(User user) {
		User userToUpdate = getUserByUserName(user.getUserName()) ;
		if (userToUpdate != null){
			if (user.getId() == null){
				user.setId(userToUpdate.getId());
			}
			mongoManger.mongoOperation.save(user);
		}else{
			System.out.println("ERROR: failed to update user, not found user with user name" + user.getUserName());
		}

	}
	
	public static void remove(User user) {
		if (user.getId() == null){
			user = getUserByUserName(user.getUserName()) ;
		}
		mongoManger.mongoOperation.remove(user);
	}
	public static User getUserById(String userId) {
		Query searchUserQuery = new Query(Criteria.where("id").is(userId));
		return(mongoManger.mongoOperation.findOne(searchUserQuery, User.class));
	}
	
	public static User getUserByUserName(String username) {
		Query searchUserQuery = new Query(Criteria.where("userName").is(username));
		return(mongoManger.mongoOperation.findOne(searchUserQuery, User.class));
	}
	
	public static boolean doesUserNameExist(String username) {
		return(getUserByUserName(username) != null);
	}
	
}
