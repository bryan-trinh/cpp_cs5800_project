package model.dataccess;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.entities.User;

public class LoginDataAccess {
	private static LoginDataAccess lda = new LoginDataAccess();
	private LoginDataAccess() {}
	public Boolean verifyCredentials(User user) throws ClassNotFoundException, SQLException {
		String c = "postgres";
		ConnectionFactory cfactory = new ConnectionFactory();
		Connection conection = cfactory.getConnection(c);
		
		final PreparedStatement stmt = conection.prepareStatement("SELECT * FROM users WHERE username=? and password=?");
		
		stmt.setString(1, user.getUserName());
		stmt.setString(2, user.getPassword());

		ResultSet rs = stmt.executeQuery();

		return rs.next();
		
	}
	
	public static LoginDataAccess getInstance() {
		return lda;
	}

}

