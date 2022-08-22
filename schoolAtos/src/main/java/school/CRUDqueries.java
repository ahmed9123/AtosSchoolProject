package school;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CRUDqueries {

	
	private Connection connection;
	private Statement state;
	private ResultSet results; 
	
	
	public CRUDqueries() {
		try {
			connection = DriverManager.getConnection(DBConfig.URL, DBConfig.USER, DBConfig.PASS );
			this.state = connection.createStatement();
			System.out.println("You have connected!!!");			
		} catch(SQLException except) {
			except.printStackTrace();
		}
	}
	
	
	public void endConnection() {
		try {
			connection.close();
			System.out.println("connection has been closed!!!");
		}
		catch (SQLException except) {
			System.out.println("Attempting to close.");
			except.printStackTrace();
		}
	}
	
	
}
