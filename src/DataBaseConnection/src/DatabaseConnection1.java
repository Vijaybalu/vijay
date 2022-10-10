import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class DatabaseConnection1  {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/automobile";
		String username="root";
		String password="8179719094";
		Connection con = DriverManager.getConnection(url,username,password);
		PreparedStatement ps=con.prepareStatement("delete from cars where no=?");
	    ps.setInt(1, 9999);
	    int a=ps.executeUpdate();
	    if(a!=0) {
	    	System.out.println("Deleted");
	    }
	    	
	}
}
