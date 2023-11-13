package genericUtitity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class DataBaseAPI {

	Connection connect=null;
	
	public void connectToDatabase() throws SQLException
	{
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		connect=DriverManager.getConnection(IconstantAPI.dbURL, IconstantAPI.dbUserName,IconstantAPI.dbPassword);
	}
	
	public String executeAndGet(String query,int columnNo,String Expected) throws SQLException
	{
		ResultSet result=connect.createStatement().executeQuery(query);
		boolean Flag=false;
		while(result.next())
		{
			
			String actual=result.getString(columnNo);
			if(actual.equalsIgnoreCase(Expected))
			{
				Flag=true;
				break;

			}
		}
		if(Flag==true)
		{
			System.out.println("Data is present"); 
			//return to validate for user reference
			return Expected;
		}
		else
		{
			System.out.println("data is not present");
		}
		return "";
	}
	public void closeDb() throws SQLException
	{
		connect.close();
	}
	
}
