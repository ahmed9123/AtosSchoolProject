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
	
	public void create(School s) {
		String crtState = "INSERT INTO staff(name, position, age, years_teaching, salary) VALUES('" + s.getName() + "','" + s.getPosition() + "',"
				+ s.getAge() + "," + s.getYears_teaching() + "," + s.getSalary() + ");";
		
		try {
			state.executeUpdate(crtState);
			System.out.println("Staff been added");
		}
		catch(SQLException e) {
			System.out.println("Create statement not executed");
			e.printStackTrace();
		}
	}
	
	public void read(int staff_id)
	{
		String rdState = "SELECT * FROM staff WHERE staff_id=" + staff_id + ";";
		try {
			results = state.executeQuery(rdState);
			while(results.next()) {
				System.out.println("Staff_id-" + results.getInt("staff_id"));
				System.out.println("Name-"+ results.getString("name"));
				System.out.println("Position-" + results.getString("position"));
				System.out.println("Age-" + results.getInt("age"));
				System.out.println("Years_teaching-" + results.getInt("years_teaching"));
				System.out.println("Salary-" + results.getInt("salary"));
			}
		}catch(SQLException e) {
			System.out.println("Query Error");
			e.printStackTrace();
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
