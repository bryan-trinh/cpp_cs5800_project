package model.dataccess;

import java.sql.SQLException;
import java.sql.Connection;

public class ConnectionFactory{
	public Connection getConnection(String database) throws ClassNotFoundException, SQLException {
		if(database.equals("postgres")){
			return new PostgresConnection().getDataBaseConnection();
		}
		return new MySqlConnection().getDataBaseConnection();
	}
}