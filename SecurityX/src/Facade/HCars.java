
package Facade;
import java.sql.*;
import Entities.*;
import Settings.*;
import javax.swing.JOptionPane;
/**
 *
 * @author anild
 */
public class HCars {
    
    
    public static HCar getHCarByID(int id)
    {
        try {
            HCar H = new HCar();
            Connection con = DBSetting.openTocan();
            PreparedStatement ps = con.prepareStatement("select * from HCars where CarID=?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                H.setCarıd(rs.getInt(1));
                H.setHabitantID(rs.getInt(2));
                H.setPersonalID(rs.getInt(3));
                H.setPlate(rs.getString(4));
                H.setDetail(rs.getString(5));
                H.setSavaDate(rs.getTimestamp(6));
                
                return H;
            } else {
                return null;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        }
    }
    
    public static Boolean addToHCars(HCar hc)
    {
        try {
            Connection con = DBSetting.openTocan();
            PreparedStatement ps = con.prepareStatement("insert into HCars(HabitantID,PersonalID,Plate,CarDetail) values(?,?,?,?)");
            ps.setInt(1, hc.getHabitantID());
            ps.setInt(2, hc.getPersonalID());
            ps.setString(3, hc.getPlate());
            ps.setString(4, hc.getDetail());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
    }
    
    public static Boolean deleteHCar(HCar h)
    {
        
        try {
            Connection con = DBSetting.openTocan();
            PreparedStatement ps = con.prepareStatement("delete from HCars where CarID=?");
            ps.setInt(1, h.getCarıd());
            ps.executeQuery();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Bir hata oluştu\n"+e.getMessage());
            return false;
        }
    }
            
}
