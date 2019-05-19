
package Facade;
import Entities.*;
import java.sql.*;
import Settings.*;

public class Logs {
    
    
    public static Boolean addToLog(Log el)
    {
        try
        {
            Connection con = DBSetting.openTocan();
            PreparedStatement ps = con.prepareStatement("EXEC dbo.AddToLog ?, ?, ?");
            ps.setInt(1, el.getPersonalID());
            ps.setString(2, el.getOperation());
            ps.setString(3, el.getDetail());
            
            ps.executeUpdate();
            DBSetting.closeToCan();
            return true;
        }
        catch(SQLException e)
        {
            DBSetting.closeToCan();
            return false;
        }
    }
    public static Log getLogByID(int id) throws SQLException
    {
        
        try {
            Log l = new Log();
            Connection con = DBSetting.openTocan();
            PreparedStatement ps = con.prepareStatement("select * from Log where LogID=?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {                
                l.setLogID(id);
                l.setDate(rs.getTimestamp(5));
                l.setPersonalID(rs.getInt(2));
                l.setOperation(rs.getString(3));
                l.setDetail(rs.getString(4));
            }
            return l;
        } catch (SQLException e) {
            return null;
        }
    }
}
