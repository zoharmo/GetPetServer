package crud;

import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import entities.User;

public class Users {

	public void saveUser(User user) {
		mongoManger.mongoOperation.save(user);
	}
	
	public void getUserByUserName(String username) {
		Query searchUserQuery = new Query(Criteria.where("userName").is(username));
		User savedUser = mongoManger.mongoOperation.findOne(searchUserQuery, User.class);
	}
	
}
