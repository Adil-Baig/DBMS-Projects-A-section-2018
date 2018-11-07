import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StudentDao {

        public static int save(String name,String college,int age, String gender, int tournamentID, int matchesPlayed, int matchesWon){
	int status=0;
	try{
		Connection con=DB.getConnection();
				
		PreparedStatement ps=con.prepareStatement("insert into student(sname,college,age,gender,tid) values(?,?,?,?,?);");
		ps.setString(1,name);
                ps.setString(2,college);
		ps.setInt(3,age);
		ps.setString(4,gender);
		ps.setInt(5,tournamentID);
		status=ps.executeUpdate();
                ps=con.prepareStatement("select sid from student where sname='" +name+"';");
                ResultSet rs=ps.executeQuery();
                rs.next();
                int sid=rs.getInt(1);
                System.out.println("sid"+sid);
                ps=con.prepareStatement("insert into stats(sid,mplayed,mwon,grade) values(?,?,?,?);");
                ps.setInt(1,sid);
                ps.setInt(2,matchesPlayed);
                ps.setInt(3,matchesWon);
                ps.setString(4,calcGrade(matchesPlayed,matchesWon));
                status=ps.executeUpdate();
		con.close();
	}catch(Exception e){System.out.println(e);}
	return status;
}

    private static String calcGrade(int mplayed,int mwon) {
        float percent=(((float)mwon/mplayed)*100);
        if(percent>90)
            return "A";
        if(percent>80)
            return "B";
        if(percent>70)
            return "C";
        if(percent>60)
            return "D";
        else
            return "F";
    }
        
}
