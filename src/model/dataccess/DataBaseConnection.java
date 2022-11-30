package model.dataccess;

import java.sql.Connection;
import java.sql.SQLException;

public interface DataBaseConnection{
		public abstract Connection getDataBaseConnection() throws ClassNotFoundException, SQLException;
}