import java.sql.DriverManager; //* shouldnt be used much bcoz memory management
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class LoginDemo {
	public static void main (String[] args)
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/javademo","root","");
			System.out.println("Connection established");
		}
		catch(Exception e)
		{
			System.out.println("Error" + e.getMessage());
		}
	}
}
