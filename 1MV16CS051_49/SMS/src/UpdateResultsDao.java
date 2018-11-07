
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class UpdateResultsDao {

    public static int updateTournament(String tournamentID, String firstID, String secondID, String thirdID) {
        int status = 0;
        try {
            Connection con = DB.getConnection();
            if(firstID.equals(secondID)||secondID.equals(thirdID)||firstID.equals(thirdID))
            {
                if((firstID.equals("--none--"))&&(secondID.equals("--none--"))&&(thirdID.equals("--none--")))
                return status;
            }
            if(firstID.equals("--none--"))
                firstID=null;
            else
                firstID=firstID.split(":")[0];
            if(secondID.equals("--none--"))
                secondID=null;
            else
                secondID=secondID.split(":")[0];
            if(thirdID.equals("--none--"))
                thirdID=null;
            else
                thirdID=thirdID.split(":")[0];
            PreparedStatement ps = con.prepareStatement("insert into result values(?,?,?,?);");
            ps.setString(1, tournamentID);
            ps.setString(2, firstID);
            ps.setString(3, secondID);
            ps.setString(4, thirdID);
            status=ps.executeUpdate();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }

    public static String[] getTournaments() {
        String[][] data = null;
        Connection con = null;
        String[] finalData = {};

        try {
            con = DB.getConnection();
            PreparedStatement ps = con.prepareStatement("select tid,sport,venue from tournament where tdate<curdate() and tid not in (select r.tid from result r);", ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = ps.executeQuery();

            ResultSetMetaData rsmd = rs.getMetaData();
            int cols = rsmd.getColumnCount();

            rs.last();
            int rows = rs.getRow();
            rs.beforeFirst();

            data = new String[rows][cols];
            int count = 0;
            while (rs.next()) {
                for (int i = 1; i <= cols; i++) {
                    data[count][i - 1] = rs.getString(i);
                }
                count++;
            }
            finalData = new String[rows];
            for (int i = 0; i < data.length; i++) {
                finalData[i] = data[i][0] + " : " + data[i][1] + " - " + data[i][2];
            }
            con.close();
            return finalData;

        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
    public static String[] getStudents(String tid) {
        String[][] data = null;
        Connection con = null;
        String[] finalData = {};
        try {
            con = DB.getConnection();
            PreparedStatement ps = con.prepareStatement("select sid,sname from student  where tid='"+tid+"';", ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = ps.executeQuery();

            ResultSetMetaData rsmd = rs.getMetaData();
            int cols = rsmd.getColumnCount();

            rs.last();
            int rows = rs.getRow();
            rs.beforeFirst();

            data = new String[rows][cols];
            int count = 0;
            while (rs.next()) {
                for (int i = 1; i <= cols; i++) {
                    data[count][i - 1] = rs.getString(i);
                }
                count++;
            }
            rows++;
            finalData = new String[rows];
            for (int i = 1; i < data.length+1; i++) {
                finalData[i] = data[i-1][0] + " : " + data[i-1][1];
            }
            finalData[0]="--none--";
            con.close();
            for(int i=0; i<finalData.length; i++) {
                            System.out.println(finalData[i]);

            }
            return finalData;

        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
}
