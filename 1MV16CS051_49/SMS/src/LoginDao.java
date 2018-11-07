
import java.sql.*;


public class LoginDao {
    public static boolean validate(String name,String password,String utype){
		boolean status=false;
		try{
			Connection con=DB.getConnection();
                        System.out.println("con " + con);
			PreparedStatement ps=con.prepareStatement("select * from user where uname=? and upass=? and utype=?");
			ps.setString(1,name);
			ps.setString(2,password);
                        ps.setString(3,utype);
			ResultSet rs=ps.executeQuery();
                        System.out.println("RS " + rs);
			status=rs.next();
			con.close();
		}catch(Exception e){System.out.println(e + "In LoginDAO");}
		return status;
	}
}
