
package Entities;

import java.sql.Date;


public class Personal {

    /**
     * @return the PhoneNumber
     */
    public long getPhoneNumber() {
        return PhoneNumber;
    }

    /**
     * @param PhoneNumber the PhoneNumber to set
     */
    public void setPhoneNumber(long PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    /**
     * @return the SavaDate
     */
    public java.sql.Timestamp getSavaDate() {
        return SavaDate;
    }

    /**
     * @param SavaDate the SavaDate to set
     */
    public void setSavaDate(java.sql.Timestamp SavaDate) {
        this.SavaDate = SavaDate;
    }

    /**
     * @return the isTRS
     */
    public Boolean getIsTRS() {
        return isTRS;
    }

    /**
     * @param isTRS the isTRS to set
     */
    public void setIsTRS(Boolean isTRS) {
        this.isTRS = isTRS;
    }

    /**
     * @return the isTRIDVerified
     */
    public Boolean getIsTRIDVerified() {
        return isTRIDVerified;
    }

    /**
     * @param isTRIDVerified the isTRIDVerified to set
     */
    public void setIsTRIDVerified(Boolean isTRIDVerified) {
        this.isTRIDVerified = isTRIDVerified;
    }

    /**
     * @return the PersonalID
     */
    public int getPersonalID() {
        return PersonalID;
    }

    /**
     * @param PersonalID the PersonalID to set
     */
    public void setPersonalID(int PersonalID) {
        this.PersonalID = PersonalID;
    }

    /**
     * @return the Name
     */
    public String getName() {
        return Name.toUpperCase();
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name.toUpperCase();
    }

    /**
     * @return the Surname
     */
    public String getSurname() {
        return Surname.toUpperCase();
    }

    /**
     * @param Surname the Surname to set
     */
    public void setSurname(String Surname) {
        this.Surname = Surname.toUpperCase();
    }

    /**
     * @return the isTRS
     */


    /**
     * @return the TRIDNo
     */
    public long getTRIDNo() {
        return TRIDNo;
    }

    /**
     * @param TRIDNo the TRIDNo to set
     */
    public void setTRIDNo(long TRIDNo) {
        this.TRIDNo = TRIDNo;
    }

    /**
     * @return the BirthDate
     */
    public Date getBirthDate() {
        return BirthDate;
    }

    /**
     * @param BirthDate the BirthDate to set
     */
    public void setBirthDate(Date BirthDate) {
        this.BirthDate = BirthDate;
    }

    /**
     * @return the EMail
     */
    public String getEMail() {
        return EMail.toLowerCase().trim();
    }

    /**
     * @param EMail the EMail to set
     */
    public void setEMail(String EMail) {
        this.EMail = EMail.toLowerCase().trim();
    }

    /**
     * @return the Address
     */
    public String getAddress() {
        return Address;
    }

    /**
     * @param Address the Address to set
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * @return the isTRIDVerified
     */
 
    /**
     * @return the Status
     */
    public int getStatus() {
        return Status;
    }

    /**
     * @param Status the Status to set
     */
    public void setStatus(int Status) {
        this.Status = Status;
    }

    /**
     * @return the PortalPass
     */
    public String getPortalPass() {
        return PortalPass;
    }

    /**
     * @param PortalPass the PortalPass to set
     */
    public void setPortalPass(String PortalPass) {
        this.PortalPass = PortalPass;
    }

  
    
    private int PersonalID;
    private String Name;
    private String Surname;
    private Boolean isTRS;
    private long TRIDNo;
    private Date BirthDate;
    private String EMail;
    private String Address;
    private long PhoneNumber;
    private Boolean isTRIDVerified;
    private int Status;
    private String PortalPass;
    private java.sql.Timestamp SavaDate;
    
            
    
}
