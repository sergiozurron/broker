package business;

import persistence.UserDAO;

public class UserSA {
	
	public void registerUser(User u) {
		// TODO �A�adir l�gica?
		new UserDAO().createUser(u);
	}
	
}
