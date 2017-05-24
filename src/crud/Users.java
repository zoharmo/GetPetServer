package crud;

import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import entities.User;

public class Users {

	public static void save(User user) throws Exception{
			mongoManger.mongoOperation.save(user);
	}
	
	public static void update(User user) throws Exception {
		if (user.getId() == null){
			User userToUpdate = getUserByUserName(user.getUserName()) ;
			if (userToUpdate !=null ){
					user.setId(userToUpdate.getId());
			}else{
				throw new Exception("not found user with user name " + user.getUserName());
			}
		}
		mongoManger.mongoOperation.save(user);
	}
	
	public static void remove(User user) throws Exception {
		if (user.getId() == null){
			user = getUserByUserName(user.getUserName()) ;
		}
		mongoManger.mongoOperation.remove(user);
	}
	public static void removeByUsserName(String userName) throws Exception{
		User user = getUserByUserName(userName);
		if (user != null){
			remove(user);
		}
	}
	public static User getUserById(String userId) throws Exception{
		Query searchUserQuery = new Query(Criteria.where("id").is(userId));
		return(mongoManger.mongoOperation.findOne(searchUserQuery, User.class));
	}
	
	public static User getUserByUserName(String username){
		Query searchUserQuery = new Query(Criteria.where("userName").is(username));
		return(mongoManger.mongoOperation.findOne(searchUserQuery, User.class));
	}
	
	public static boolean doesUserNameExist(String username) {
		return(getUserByUserName(username) != null);
	}
	
}
