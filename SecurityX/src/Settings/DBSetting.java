
package Settings;

import java.sql.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DBSetting {
    
    
    public static Connection con;
    
    public static Connection openTocan()
    {
        try
        {
            MainSettings mySet = new MainSettings();
            //serilize olunan ayar dosyasına ulaşma
            FileInputStream fs = new FileInputStream("set.ads");
            ObjectInputStream ois = new ObjectInputStream(fs);
            mySet = (MainSettings)ois.readObject();
            //Bağlantı rtanımlama
            Class.forName(mySet.DBDriver);
            con = DriverManager.getConnection(mySet.DBHost,mySet.DBUser,mySet.DBPas);
            
            
        }
        catch(IOException | ClassNotFoundException | SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return con;
    }
    public static String getHostDaste()
    {
        try
        {
            String a1 = null;
            Connection bag = openTocan();
            PreparedStatement ps = bag.prepareStatement("SELECT dbo.GetLocalDate(3)");
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                a1 = rs.getString(1);
            }
           // closeToCan();
            return a1;
        }
        catch(Exception e)
        {
            return null;
        }
    }
            
    public static void closeToCan()
    {
        try
        {
            
            con.close();
        }
        catch(Exception e)
        {
            
        }
    }
    
    
    public static String getDatetimeAsString(Timestamp t)
    {
        return t.toString();
    }
    
    public static Timestamp getStringAsDatetime(String s)
    {
        return Timestamp.valueOf(s);
                
    }
    
    
    public static int getBoolAsInt(Boolean a)
    {
        if(a)
            return 1;
        else
            return 0;
    }
   
    
}
