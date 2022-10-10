import java.sql.*;
public class DataBaseConnection {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/automobile";
		String username="root";
		String password="8179719094";
		Connection con = DriverManager.getConnection(url,username,password);
		PreparedStatement ps=con.prepareStatement("insert into cars values(?,?,?,?)");
		ps.setInt(1, 2345);
		ps.setString(2, "DZIRE");
		ps.setInt(3, 90);
		ps.setInt(4, 1100000);
	    int a=ps.executeUpdate();
	    if(a!=0) {
	    	System.out.println("inserted");
	    }
	    	
	}
}
