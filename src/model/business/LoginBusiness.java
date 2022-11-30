package model.business;
import java.sql.SQLException;

import model.dataccess.LoginDataAccess;
import model.entities.MessageException;
import model.entities.User;

public class LoginBusiness{
	private String userName;
	private String password;
	private static LoginBusiness lb = new LoginBusiness();
	
	private LoginBusiness() {}
	public static LoginBusiness getInstance() {
		return lb;
	}
	public boolean verifyCredentials() throws ClassNotFoundException, SQLException {
		if (userName.equals("")) {
			throw new MessageException("Username not informed.");
		} else if (password.equals("")) {
			throw new MessageException("Password not informed.");
		}
		
		User user = User.getInstance();
		user.setUserName(userName);
		user.setPassword(password);
		
		return LoginDataAccess.getInstance().verifyCredentials(user);
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getUserName() {
		return this.userName;
	}
	public String getPassword() {
		return this.password;
	}
}