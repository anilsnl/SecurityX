
package Settings;
import java.io.*;

public class MainSettings implements java.io.Serializable{
    
    
    //for db con
    public String DBDriver;
    public String DBHost;
    public String DBUser;
    public String DBPas;
    
    
    //for sending a mail
    public String SMTPURL;
    public String EMail;
    public String EMailPass;
    public int HostPort;

    public static MainSettings getCurentSettings()
    {
        try {
            FileInputStream fos = new FileInputStream("set.ads");
            ObjectInputStream ois = new ObjectInputStream(fos);
            return  (MainSettings)ois.readObject();
            
          
        } catch (Exception e) {
            return null;
        }
    }
}
