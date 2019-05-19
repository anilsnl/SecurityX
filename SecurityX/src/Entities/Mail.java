
package Entities;




/**
 *
 * @author anild
 */
public class Mail {

    public Mail()
    {
        EMails = new String[1];
    }
    /**
     * @return the EMail
     */
    public String getEMail() {
        return EMail;
    }

    /**
     * @param EMail the EMail to set
     */
    public void setEMail(String EMail) {
        this.EMail = EMail;
    }

    /**
     * @return the Subject
     */
    public String getSubject() {
        return Subject;
    }

    /**
     * @param Subject the Subject to set
     */
    public void setSubject(String Subject) {
        this.Subject = Subject;
    }

    /**
     * @return the Sing
     */
    public String getSing() {
        return Sing;
    }

    /**
     * @param Sing the Sing to set
     */
    public void setSing(String Sing) {
        this.Sing = Sing;
    }

    /**
     * @return the Body
     */
    public String getBody() {
        return Body;
    }

    /**
     * @param Body the Body to set
     */
    public void setBody(String Body) {
        this.Body = Body;
    }

    /**
     * @return the EMails
     */
    public String[] getEMails() {
        return EMails;
    }

    /**
     * @param EMails the EMails to set
     */
    public void setEMails(String[] EMails) {
        this.EMails = EMails;
    }
    
    private String EMail;
    private String Subject;
    private String Sing;
    private String Body;
    private String[] EMails;
    
}
