package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {	
	
	public Connection getConnection(){
				
		/*
		 cd C:\Users\josue\eclipse-workspace\SistemaDeArrecadacaoDeTerceiros\SistemaDeArrecadacaoDeTerceiros\libs>
		 java -jar derbyrun.jar ij
		 connect 'jdbc:derby:C:/Users/josue/eclipse-workspace/SistemaDeArrecadacaoDeTerceiros/jdbc:derby:acustrabd
		 */
		String jdbcURL = "jdbc:derby:acustrabd";	
		Connection conn = null;
	
		try {			
			conn = DriverManager.getConnection(jdbcURL);			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("conn.toString():" + conn.toString());
		return conn;
		}

}
