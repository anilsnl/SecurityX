
package Facade;
import Entities.*;
import Settings.*;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author anild
 */
public class Visitors {
    
    public static Boolean deleteVisitor(Visitor v)
    {
        try {
            Connection con = DBSetting.openTocan();
            PreparedStatement ps = con.prepareStatement("delete from Visitors where VisitorID=?");
            ps.setInt(1, v.getVisitorID());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            return null;
        }
    }
    
    public static Boolean updateToVisitor(Visitor v)
    {
        try {
            Connection con = DBSetting.openTocan();
            PreparedStatement ps = con.prepareStatement("update Visitors set Name=?,Surname=?,isTRS=?,TRIDNo=?,BirthYear=?,isTRIDVerified=? where VisitorID=?");
            ps.setString(1, v.getName());
            ps.setString(2, v.getSurname());
            ps.setInt(3, DBSetting.getBoolAsInt(v.getIsTRS()));
            ps.setLong(4, v.getTRIDNo());
            ps.setInt(5, v.getBirthYear());
            ps.setInt(6, DBSetting.getBoolAsInt(v.getIsTRIDVerified()));
            ps.setInt(7, v.getVisitorID());
            ps.executeUpdate();
            
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ziyaretci güncelleme hatası\n"+e.getMessage(),"SecurityX",JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    public static Visitor getVisitorByVisitorID(int ID)
    {
        Visitor v = new Visitor();
        try {
            Connection con = DBSetting.openTocan();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM Visitors where VisitorID=?");
            ps.setInt(1, ID);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                v.setVisitorID(rs.getInt(1));
                v.setName(rs.getString(2));
                v.setSurname(rs.getString(3));
                v.setIsTRS(rs.getBoolean(4));
                v.setTRIDNo(rs.getLong(5));
                v.setBirthYear(rs.getInt(6));
                v.setIsTRIDVerified(rs.getBoolean(7));
                v.setPersonalID(rs.getInt(8));
                v.setSaveDate(DBSetting.getStringAsDatetime(rs.getString(9)));
                
            }
            return v;
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ziyaretci erişim hatası!\n"+e.getMessage(),"SecurityX",JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public static Visitor getVisitorByTRIDNo(long valuse)
    {
        Visitor v = new Visitor();
        try {
            Connection con = DBSetting.openTocan();
            PreparedStatement ps = con.prepareStatement("select * from Visitors where TRIDNo=?");
            ps.setLong(1, valuse);
            ResultSet rs = ps.executeQuery();
            if(rs.next())
            {
                v.setVisitorID(rs.getInt(1));
                v.setName(rs.getString(2));
                v.setSurname(rs.getString(3));
                v.setIsTRS(rs.getBoolean(4));
                v.setTRIDNo(rs.getLong(5));
                v.setBirthYear(rs.getInt(6));
                v.setIsTRIDVerified(rs.getBoolean(7));
                v.setPersonalID(rs.getInt(8));
                v.setSaveDate(rs.getTimestamp(9));
                return v;
            }
            else
            {
                return null;
            }
            
            
            
        } catch (Exception e) {
            return null;
        }
    }
    
    public static Boolean addToVisitors(Visitor vs)
    {
        try
        {
            Connection cnn = DBSetting.openTocan();
            PreparedStatement ps = cnn.prepareStatement("exec dbo.NewVisitor ?, ?, ?, ?, ?, ?, ?");
            ps.setString(1, vs.getName());
            ps.setString(2, vs.getSurname());
            ps.setInt(3, DBSetting.getBoolAsInt(vs.getIsTRS()));
            ps.setLong(4, vs.getTRIDNo());
            ps.setInt(5, vs.getBirthYear());
            ps.setInt(6, DBSetting.getBoolAsInt(vs.getIsTRIDVerified()));
            ps.setInt(7, vs.getPersonalID());
            
            ps.executeUpdate();
            return true;
        }
        catch(SQLException e)
        {
            return false;
        }
    }
    
}
