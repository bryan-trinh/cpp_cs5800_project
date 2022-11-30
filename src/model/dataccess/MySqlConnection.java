package model.dataccess;

import java.sql.Connection;
import java.sql.SQLException;

public class MySqlConnection implements DataBaseConnection {
	public Connection getDataBaseConnection() throws ClassNotFoundException, SQLException{
		return null;
	}
}