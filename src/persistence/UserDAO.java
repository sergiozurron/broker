package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import business.User;

public class UserDAO {

	private static final String URL = "jdbc:postgresql://localhost:5432/broker";
	private static final String USER = "postgres";
	private static final String PASSWORD = "root";

	public void createUser(User u) {
		try {
			String sql = "INSERT INTO users(email, first_name, last_name) VALUES (?, ?, ?)";

			Class.forName("org.postgresql.Driver");
			Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setString(1, u.getEmail());
			preparedStatement.setString(2, u.getName());
			preparedStatement.setString(3, u.getLastName());

			preparedStatement.executeUpdate();

		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
