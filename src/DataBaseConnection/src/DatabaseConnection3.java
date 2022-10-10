import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class DatabaseConnection3 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/automobile";
		String username="root";
		String password="8179719094";
		Connection con = DriverManager.getConnection(url,username,password);
		PreparedStatement ps=con.prepareStatement("select * from cars where speed<150");
		PreparedStatement ps1=con.prepareStatement("select * from cars where speed>70");
		PreparedStatement ps2=con.prepareStatement("select * from cars where speed=150");
		PreparedStatement ps3=con.prepareStatement("select * from cars where speed!=150");
		PreparedStatement ps4=con.prepareStatement("select * from cars where speed=150");
	    ResultSet gh=ps.executeQuery();
	    ResultSet gh1=ps1.executeQuery();
	    ResultSet gh2=ps2.executeQuery();
	    ResultSet gh3=ps3.executeQuery();
	    ResultSet gh4=ps4.executeQuery();
	    while(gh.next())
	    	System.out.println(gh.getInt(1)+"	"+gh.getString(2)+"	"+gh.getInt(3)+"	"+gh.getInt(4));
	    System.out.println("-------------------------------------------");
	    while(gh1.next())
	    	System.out.println(gh1.getInt(1)+"	"+gh1.getString(2)+"	"+gh1.getInt(3)+"	"+gh1.getInt(4));
	    System.out.println("-------------------------------------------");
	    while(gh2.next())
	    	System.out.println(gh2.getInt(1)+"	"+gh2.getString(2)+"	"+gh2.getInt(3)+"	"+gh2.getInt(4));
	    System.out.println("-------------------------------------------");
	    while(gh3.next())
	    	System.out.println(gh3.getInt(1)+"	"+gh3.getString(2)+"	"+gh3.getInt(3)+"	"+gh3.getInt(4));	
	    System.out.println("-------------------------------------------");
	    while(gh4.next())
	    	System.out.println(gh4.getInt(1)+"	"+gh4.getString(2)+"	"+gh4.getInt(3)+"	"+gh4.getInt(4));	
	}
}
