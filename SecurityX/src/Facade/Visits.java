
package Facade;
import Entities.*;
import Settings.*;
import Facade.*;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author anild
 */
public class Visits {
    public static Visit getVisitByID(int id)
    {
        try {
            Visit v = new Visit();
            Connection con = DBSetting.openTocan();
            PreparedStatement ps = con.prepareStatement("select VisitID,VisitorID,PersonalID,Company,Detail,VisitDate,HabitantID from Visits where VisitID=?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                v.setVisitID(rs.getInt(1));
                v.setVisitorID(rs.getInt(2));
                v.setPersonalID(rs.getInt(3));
                v.setCompany(rs.getString(4));
                v.setDetail(rs.getString(5));
                v.setVisitDate(DBSetting.getStringAsDatetime(rs.getString(6)));
                v.setHabitantID(rs.getInt(7));
               
            } 
            return v;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Ziyaret erişim hatası!\n"+e.getMessage(), "SecurityX",JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    public static Boolean newVisit(Visit v)
    {
        try {
            Connection con = DBSetting.openTocan();
            PreparedStatement ps = con.prepareStatement("INSERT INTO Visits(VisitorID,PersonalID,HabitantID,Detail,Company) VALUES(?,?,?,?,?)");
            ps.setInt(1, v.getVisitorID());
            ps.setInt(2, v.getPersonalID());
            ps.setInt(3, v.getHabitantID());
            ps.setString(4, v.getDetail());
            ps.setString(5, v.getCompany());
            ps.executeUpdate();
            
            return true;
                    
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Bir hata oluştu!\n"+e.getMessage());
            return false;
        }
    }
}
