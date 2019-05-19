/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Entities.*;
import Facade.*;
import Settings.*;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author anild
 */
public class VCars {
    
    
    public static Boolean addToVCars(VCar hc)
    {
        try {
            Connection con = DBSetting.openTocan();
            PreparedStatement ps = con.prepareStatement("exec dbo.AddToVCars ?, ?, ?, ?");
            ps.setInt(1, hc.getVisitorID());
            ps.setInt(2, hc.getPersonalID());
            ps.setString(3, hc.getPlate());
            ps.setString(4, hc.getDetail());
            
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
          //  JOptionPane.showMessageDialog(null, "Bir hata oluştu"+e.getMessage(),"SecurityX",JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    public static Boolean deleteHCar(VCar h)
    {
        
        try {
            Connection con = DBSetting.openTocan();
            PreparedStatement ps = con.prepareStatement("delete from VCars where CarID=?");
            ps.setInt(1, h.getCarıd());
            ps.executeQuery();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Bir hata oluştu\n"+e.getMessage());
            return false;
        }
    }
}
