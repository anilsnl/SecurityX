
package Facade;
import Entities.*;
import Settings.*;
import Facade.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.StyledEditorKit;
/**
 *
 * @author anild
 */
public class Habitants {
    
    
    

    public static String[] getHEMailsAsA()
    {
        try {
            Connection con = DBSetting.openTocan();
            PreparedStatement ps = con.prepareStatement("select EMail from Habitants");
            ResultSet rs = ps.executeQuery();
            String ary[] = new String[rs.getRow()];
            int a = 0;
            while (rs.next()) {                
                ary[a]=rs.getString(1);
                a++;
            }
            return ary;
        } catch (SQLException e) {
            return null;
        }
    }
    
    
    
    public static ArrayList<String> getHEMails()
    {
        try {
            Connection con = DBSetting.openTocan();
            PreparedStatement ps = con.prepareStatement("select EMail from Habitants");
            ArrayList<String> ary = new ArrayList<String>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                ary.add(rs.getString(1));
            }
            return ary;
        } catch (SQLException e) {
            return null;
        }
    }
    
    public static Boolean updateToHabitant(Habitant h)
    {
        try {
            Connection con = DBSetting.openTocan();
            PreparedStatement ps = con.prepareStatement("UPDATE Habitants SET Name=?,Surname=?,TRIDNo=?,BirthDate=?,isTRS=?,isTRIDVerified=?,EMail=?,PhoneNumber=?,ApartmentID=?,isHost=?"+
                    " WHERE HabitantID=?");
            ps.setString(1, h.getName());
            ps.setString(2, h.getSurname());
            ps.setLong(3, h.getTRIDNo());
            ps.setDate(4, h.getBirthDate());
            ps.setInt(5, DBSetting.getBoolAsInt(h.getIsTRS()));
            ps.setInt(6, DBSetting.getBoolAsInt(h.getIsTRIDVerified()));
            ps.setString(7, h.getEMail());
            ps.setLong(8, h.getPhoneNumber());
            ps.setString(9, h.getApartmentID());
            ps.setInt(10, DBSetting.getBoolAsInt(h.getIsHost()));
            ps.setInt(11, h.getHabitantID());
            
            return ps.executeUpdate()>0;
            
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
    }
    
    public static Habitant getHabitantByID(int ID)
    {
        try {
            Habitant h = new Habitant();
            
            Connection con = DBSetting.openTocan();
            PreparedStatement ps = con.prepareCall("select HabitantID,Name,Surname,TRIDNo,BirthDate,isTRS,isTRIDVerified,EMail,PhoneNumber"
                    + ",ApartmentID,isHost,SaveDate,isLeft from Habitants where HabitantID=?");
            ps.setInt(1, ID);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                h.setHabitantID(rs.getInt(1));
                h.setName(rs.getString(2));
                h.setSurname(rs.getString(3));
                h.setTRIDNo(rs.getLong(4));
                h.setBirthDate(rs.getDate(5));
                h.setIsTRS(rs.getBoolean(6));
                h.setIsTRIDVerified(rs.getBoolean(7));
                h.setEMail(rs.getString(8));
                h.setPhoneNumber(rs.getLong(9));
                h.setApartmentID(rs.getString(10));
                h.setIsHost(rs.getBoolean(11));
                h.setSaveDate(rs.getTimestamp(12));
                h.setIsLeft(rs.getBoolean(13));
                
            }
            
            return h;
           
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Sakin erişim hatası!\n"+e.getMessage(),"SecurityX",JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    
    
    
    
    
    
    public static Habitant getHabitantMyID(Habitant h)
    {
        try {
            Connection con = DBSetting.openTocan();
            PreparedStatement ps = con.prepareCall("select * from Habitants where HabitantID=?");
            ps.setInt(1, h.getHabitantID());
            ResultSet rs = ps.executeQuery();
            if(rs.next())
            {
                h.setHabitantID(rs.getInt(1));
                h.setName(rs.getString(2));
                h.setSurname(rs.getString(3));
                h.setTRIDNo(rs.getLong(4));
                h.setBirthDate(rs.getDate(5));
                h.setIsTRS(rs.getBoolean(6));
                h.setIsTRIDVerified(rs.getBoolean(7));
                h.setEMail(rs.getString(8));
                h.setPhoneNumber(rs.getLong(9));
                h.setApartmentID(rs.getString(10));
                h.setIsHost(rs.getBoolean(11));
                h.setSaveDate(rs.getTimestamp(12));
                h.setIsLeft(rs.getBoolean(13));
                return  h;
            }
            else
            {
                return null;
            }
            
           
        } catch (SQLException e) {
            return null;
        }
    }
    public static Boolean setAsisLeseft(Habitant h)
    {
        try {
            Connection con = DBSetting.openTocan();
            PreparedStatement ps = con.prepareStatement("update Habitants set isLeft=1 where HabitantID=?");
            ps.setInt(1, h.getHabitantID());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
    
    public static Boolean setAsisHost(Habitant h)
    {
        try {
            Connection con = DBSetting.openTocan();
            PreparedStatement ps = con.prepareStatement("update Habitants set isHost=1 where HabitantID=?");
            ps.setInt(1, h.getHabitantID());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
    
    public static Boolean addToHabitants(Habitant h)
    {
        try {
            String SQLQ = "insert into Habitants(Name,Surname,TRIDNo,BirthDate,isTRS,isTRIDVerified,EMail,PhoneNumber,ApartmentID,isHost,PersonalID) values(?,?,?,?,?,?,?,?,?,?,?)";
            Connection con = DBSetting.openTocan();
            PreparedStatement ps = con.prepareStatement(SQLQ);
            ps.setString(1, h.getName());
            ps.setString(2, h.getSurname());
            ps.setLong(3, h.getTRIDNo());
            ps.setString(4, h.getBirthDate().toString());
            ps.setInt(5, DBSetting.getBoolAsInt(h.getIsTRS()));
            ps.setInt(6, DBSetting.getBoolAsInt(h.getIsTRIDVerified()));    
            ps.setString(7, h.getEMail());
            ps.setLong(8, h.getPhoneNumber());
            ps.setString(9, h.getApartmentID());
            ps.setInt(10, DBSetting.getBoolAsInt(h.getIsHost()));
            ps.setInt(11, h.getPersonalID());
            
            
            ps.executeUpdate();
        //    DBSetting.closeToCan();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Bir hata oluştu!\n"+e.getMessage());
            DBSetting.closeToCan();
            return false;
        }
    }
    
    public static int getHabitantIDByEmail(String Email)
    {
        try {
            Connection con = DBSetting.openTocan();
            PreparedStatement ps = con.prepareStatement("select * from Habitants where EMail=?");
            ps.setString(1, Email);
            ResultSet rs = ps.executeQuery();
            if(rs.next())
                return rs.getInt(1);
            else
                return 0;
            
        } catch (SQLException e) {
            return 0;
        }
    }
}
