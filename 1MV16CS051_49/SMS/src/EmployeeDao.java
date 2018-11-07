import java.sql.*;
public class EmployeeDao {

	
	public static int save(String uname,String password,String name,String phone){
		int status=0;
		try{
			Connection con=DB.getConnection();
			PreparedStatement ps=con.prepareStatement("insert into user(uname,upass,utype,name,phone) values(?,?,'E',?,?);");
			ps.setString(1,uname);
			ps.setString(2,password);
                        ps.setString(3,name);
                        ps.setString(4,phone);
                        status=ps.executeUpdate();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}

}
