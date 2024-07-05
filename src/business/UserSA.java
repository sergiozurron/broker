package business;

import persistence.UserDAO;

public class UserSA {
	
	public void registerUser(User u) {
		// TODO ¿Añadir lógica?
		new UserDAO().createUser(u);
	}
	
}
