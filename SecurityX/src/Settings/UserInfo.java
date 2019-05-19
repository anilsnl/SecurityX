/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Settings;
import static java.awt.JobAttributes.DestinationType.FILE;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author anild
 */
public class UserInfo implements  java.io.Serializable{
    
    
    public  String User;
    public String Pass;
    public UserInfo(String un, String Pass)
    {
        this.User=un;
        this.Pass=Pass;
    }
    public static void saveToFile(UserInfo usa)
    {
        try {
            FileOutputStream fis = new FileOutputStream("user.ads");
            ObjectOutputStream ois = new ObjectOutputStream(fis);
            UserInfo us = new UserInfo(usa.User,usa.Pass);
            ois.writeObject(us);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Bir hata oluştu!\n"+e.getMessage(),"SecurityX",JOptionPane.ERROR_MESSAGE);
        }
    }
    public static UserInfo readToFile()
    {
        try {
            FileInputStream fis = new FileInputStream("user.ads");
            ObjectInputStream ois = new ObjectInputStream(fis);
            UserInfo uss = (UserInfo)ois.readObject();
            return uss;
        } catch (IOException | ClassNotFoundException e) {
            return null;
        }
    }
    
    public UserInfo()
    {
        
    }
    
    public static void forgetMe()
    {
        try {
            FileOutputStream fos = new FileOutputStream("user.ads");
            ObjectOutputStream ois = new ObjectOutputStream(fos);
            UserInfo aa = null;
            ois.writeObject(aa);
        } catch (IOException e) {
        }
    }
}
