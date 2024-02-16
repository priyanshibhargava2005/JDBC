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
			Statement stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery("select * from login");
			System.out.println("Username\tPassword");
			while(rs.next())
			{
				System.out.println(rs.getString(1)+"\t\t"+rs.getString(2));
			}
		}
		catch(Exception e)
		{
			System.out.println("Error" + e.getMessage());
		}
	}
}
