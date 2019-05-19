
package Facade;

import java.sql.*;
import Entities.*;
import Settings.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.text.StyledEditorKit;

/**
 *
 * @author anild
 */
public class Personals {
    
    
    public static Boolean addToPersonals(Personal p)
    {
        try {
            Connection con = DBSetting.openTocan();
            PreparedStatement ps = con.prepareStatement("insert into Personals(Name,Surname,TRIDNo,BirthDate,isTRS,isTRIDVerified,EMail,PhoneNumber,Address,Status,PortalPass)"+
                    " values(?,?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, p.getName());
            ps.setString(2, p.getSurname());
            ps.setLong(3, p.getTRIDNo());
            ps.setDate(4, p.getBirthDate());
            ps.setInt(5, DBSetting.getBoolAsInt(p.getIsTRS()));
            ps.setInt(6, DBSetting.getBoolAsInt(p.getIsTRIDVerified()));
            ps.setString(7, p.getEMail());
            ps.setLong(8, p.getPhoneNumber());
            ps.setString(9, p.getAddress());
            ps.setInt(10, p.getStatus());
            ps.setString(11, p.getPortalPass());
            if (ps.executeUpdate()>0) {
                return true;
            } else {
                return false;
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Personel ekleme hatası!\n"+e.getMessage(),"SecurityX",JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    
      public static ArrayList<String> getPEMails()
     {
        try {
            Connection con = DBSetting.openTocan();
            PreparedStatement ps = con.prepareStatement("select EMail from Personals");
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
    
    
    public static void logOut(Personal p)
    {
        try {
            Log l = new Log();
            l.setOperation("LGOUT");
            l.setPersonalID(p.getPersonalID());
            l.setDetail(p.getSurname()+" has Loged out");
            Logs.addToLog(l);
            
            
        } catch (SQLException e) {
        }
    }
    public static Boolean changePass(String oldPass, String newPass, String EMail)
    {
        try {
            Connection con = DBSetting.openTocan();
            
                PreparedStatement ps2 = con.prepareStatement("update Personals set PortalPass=? where EMail=?");
                ps2.setString(1, newPass);
                ps2.setString(2, EMail);
                ps2.executeUpdate();
                return true;
           
                      
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Bir hata oluştu\n"+e.getMessage());
            return false;
        }
        
    }
    public static Boolean login(Personal p)
    {
        try
        {
            Connection con = DBSetting.openTocan();
            PreparedStatement ps = con.prepareStatement("EXEC dbo.Login ?,?");
            ps.setString(1, p.getEMail());
            ps.setString(2, p.getPortalPass());         
            ResultSet snc;
            snc = ps.executeQuery();
            while(snc.next())
            {
                p.setPersonalID(snc.getInt(1));
                p.setStatus(snc.getInt(2));
                switch (p.getStatus()) {
                    case -1:
                        return false;
                    case 0:
                        return true;
                    default:
                        return true;
                }
            }
            DBSetting.closeToCan();
        }
        catch(SQLException e)
        {
            JOptionPane.showConfirmDialog(null, e.getMessage());
            DBSetting.closeToCan();
            return false;
        }
        return false;
    }
    
    public static Personal getPersonalByID(int id)
    {
        try {
            Connection con = DBSetting.openTocan();
            PreparedStatement ps = con.prepareStatement("select * from Personals where PersonalID=?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if(rs.next())
            {
                Personal p = new Personal();
                p.setPersonalID(rs.getInt(1));
                p.setName(rs.getString(2));
                p.setSurname(rs.getString(3));
                p.setIsTRS(rs.getBoolean(4));
                p.setTRIDNo(rs.getLong(5));
                p.setBirthDate(rs.getDate(6));
                p.setEMail(rs.getString(7));
                p.setPhoneNumber(rs.getLong(8));
                p.setAddress(rs.getString(9));
                p.setIsTRIDVerified(rs.getBoolean(10));
                p.setStatus(rs.getInt(11));
                p.setPortalPass(rs.getString(12));
                p.setSavaDate(rs.getTimestamp(13));
                DBSetting.closeToCan();
                return p;
            }
            else
            {
                DBSetting.closeToCan();
                return null;
            }
        } catch (SQLException e) {
            
            DBSetting.closeToCan();
            return null;
        }
    }
    
    public static Boolean changePersonalStatus(Personal p)
    {
        try {
            Connection con = DBSetting.openTocan();
            PreparedStatement psSetP = con.prepareStatement("update Personals set Status=? where PersonalID=?");
            psSetP.setInt(1, p.getStatus());
            psSetP.setInt(2, p.getPersonalID());
            psSetP.executeUpdate();
            return true;
            
        } catch (SQLException e) {
            return false;
        }
    }
    
    public static Boolean updatePersonal(Personal p)
    {
        try {
            String SQLQ = "UPDATE Personals SET Name=?,Surname=?,TRIDNo=?,isTRS=?,BirthDate=?,EMail=?,PhoneNumber=?,Address=?,isTRIDVerified=?,Status=? WHERE PersonalID=?";
            Connection con = DBSetting.openTocan();
            PreparedStatement ps = con.prepareStatement(SQLQ);
            ps.setString(1, p.getName());
            ps.setString(2, p.getSurname());
            ps.setLong(3, p.getTRIDNo());
            ps.setInt(4, DBSetting.getBoolAsInt(p.getIsTRS()));
            ps.setString(5, p.getBirthDate().toString());
            ps.setString(6, p.getEMail());
            ps.setLong(7, p.getPhoneNumber());
            ps.setString(8, p.getAddress());
            ps.setInt(9, DBSetting.getBoolAsInt(p.getIsTRIDVerified()));
            ps.setInt(10, p.getStatus());
            ps.setInt(11, p.getPersonalID());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Bilgi güncelleme hatası\n"+e.getMessage());
            return false;
        }
    }
    
    
    public static ArrayList<String> getEMailList()
    {
        try {
            ArrayList<String> EMails = new ArrayList<>();
            Connection CON = DBSetting.openTocan();
            PreparedStatement ps = CON.prepareStatement("select EMail from Personals");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                EMails.add(rs.getString(1));
            }
           
            return EMails;
        } catch (SQLException e) {
            return null;
        }
    }
    
    
    public static Personal getPersonalByEMail(String id)
    {
        try {
            Connection con = DBSetting.openTocan();
            PreparedStatement ps = con.prepareStatement("select * from Personals where EMail=?");
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            if(rs.next())
            {
                Personal p = new Personal();
                p.setPersonalID(rs.getInt(1));
                p.setName(rs.getString(2));
                p.setSurname(rs.getString(3));
                p.setIsTRS(rs.getBoolean(4));
                p.setTRIDNo(rs.getLong(5));
                p.setBirthDate(rs.getDate(6));
                p.setEMail(rs.getString(7));
                p.setPhoneNumber(rs.getLong(8));
                p.setAddress(rs.getString(9));
                p.setIsTRIDVerified(rs.getBoolean(10));
                p.setStatus(rs.getInt(11));
                p.setPortalPass(rs.getString(12));
                p.setSavaDate(rs.getTimestamp(13));
                DBSetting.closeToCan();
                return p;
            }
            else
            {
                DBSetting.closeToCan();
                return null;
            }
        } catch (SQLException e) {
            
            DBSetting.closeToCan();
            return null;
        }
    }
    
    
} 