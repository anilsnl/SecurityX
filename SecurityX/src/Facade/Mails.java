/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;
import javax.mail.*;
import java.util.Properties;
import Settings.*;
import Entities.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import sun.net.smtp.SmtpClient;
/**
 *
 * @author anild
 */
public class Mails {
    
    public static Properties getProp()
    {
        try {
            MainSettings SET = MainSettings.getCurentSettings();
            Properties prs = System.getProperties();
            prs.put("mail.smtp.starttls.enable", "true");
            prs.put("mail.smtp.host", SET.SMTPURL);
            prs.put("mail.smtp.user", SET.EMail);
            prs.put("mail.smtp.passworld", SET.EMailPass);
            prs.put("mail.smtp.port", String.valueOf(SET.HostPort));
            prs.put("mail.smtp.auth", "true");
            
            return prs;
        } catch (Exception e) {
            return null;
        }
    }
    
    public static Boolean sendAMail(Mail m,String[] EMailLists, int ALength)
    {
        try {
            MainSettings SET = MainSettings.getCurentSettings();
            Session ss = Session.getDefaultInstance(getProp(),null);
            MimeMessage mm = new MimeMessage(ss);
            mm.setFrom(new InternetAddress(SET.EMail));            
            InternetAddress[] toAddesses;            
            toAddesses = new InternetAddress[ALength];
            for(int i=0;i<m.getEMails().length;i++)
            {  
                toAddesses[i] = new InternetAddress(EMailLists[i]);
            }
            for (InternetAddress toAddesse : toAddesses) {
                mm.addRecipient(Message.RecipientType.TO, toAddesse);
            }
            
            
            mm.setSubject(m.getSubject());
            mm.setText(m.getBody()+"\n\n\n"+m.getSing());
            Transport ts = ss.getTransport("smtp");
            ts.connect(SET.SMTPURL,SET.EMail,SET.EMailPass);
            ts.sendMessage(mm, mm.getAllRecipients());
            ts.close();
            return true;
        } catch (MessagingException e) {
            JOptionPane.showMessageDialog(null, "E Posta gönderme hatası\n"+e.getMessage());
            return false;
        }
    }
}
