package main.java.com.broker.business;

import main.java.com.broker.data.UserDAO;

public class UserSA {
	
	public void registerUser(User u) {
		// TODO �A�adir l�gica?
		new UserDAO().createUser(u);
	}
	
}
