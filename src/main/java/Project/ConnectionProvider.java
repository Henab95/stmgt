package Project;
import java.sql.*;
public class ConnectionProvider {
public static Connection getCon()
{
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project1","root","olibram95");
		return con;
	}
	catch(Exception e)
	{
		System.out.println(e);
		return null;
	}
}
}
