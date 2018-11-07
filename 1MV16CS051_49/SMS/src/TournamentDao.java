import java.sql.*;
public class TournamentDao {
	

public static int save(String sport,String date, String venue){
	int status=0;
	try{
		Connection con=DB.getConnection();
		
		
		PreparedStatement ps=con.prepareStatement("insert into tournament(tdate,venue,sport) values(?,?,?);");
		ps.setString(1,date);
		ps.setString(2,venue);
		ps.setString(3,sport);
		status=ps.executeUpdate();
		con.close();
	}catch(Exception e){System.out.println(e);}
	return status;
}
}
