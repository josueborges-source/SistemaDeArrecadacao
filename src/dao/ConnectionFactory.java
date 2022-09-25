package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	
	public Connection getConnection(){
		
		String jdbcURL = "jdbc:derby:acustrabd";	
		
		Connection conn = null;
		try {			
			conn = DriverManager.getConnection(jdbcURL);			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
		}

}
