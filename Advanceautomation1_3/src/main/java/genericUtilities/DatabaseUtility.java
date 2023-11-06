package genericUtilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.mysql.cj.protocol.Resultset;
import com.mysql.jdbc.Driver;

public class DatabaseUtility implements IAutoConstants {
	Driver dbDriver;
	Connection connection;
	Statement statement;
	ResultSet Resultset;
	
	/**
	 * this method is use to establish the connection between database
	 */
	public void establishingTheConnection() {
		try {
			dbDriver=new Driver();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			DriverManager.registerDriver(dbDriver);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			connection = DriverManager.getConnection(DATABASE_URL, DATABASE_UN, DATABASE_PWD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * this method is use to reading the from database
	 * @param query
	 * @param columnname
	 * @return
	 */
	public ArrayList readingDataFromDatabase(String query,String columnname) {
		ArrayList list=new ArrayList();
		try {
			statement = connection.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			Resultset = statement.executeQuery(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			while(Resultset.next()) {
				list.add(Resultset.getString(columnname));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	/**
	 * this method is use to close the connection between the database
	 */
	public void closingConnection() {
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
