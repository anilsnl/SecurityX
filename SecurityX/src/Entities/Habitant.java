
package Entities;


public class Habitant {

    /**
     * @return the HabitantID
     */
    public int getHabitantID() {
        return HabitantID;
    }

    /**
     * @param HabitantID the HabitantID to set
     */
    public void setHabitantID(int HabitantID) {
        this.HabitantID = HabitantID;
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
    public java.sql.Date getBirthDate() {
        return BirthDate;
    }

    /**
     * @param BirthDate the BirthDate to set
     */
    public void setBirthDate(java.sql.Date BirthDate) {
        this.BirthDate = BirthDate;
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
     * @return the EMail
     */
    public String getEMail() {
        return EMail.toLowerCase();
    }

    /**
     * @param EMail the EMail to set
     */
    public void setEMail(String EMail) {
        this.EMail = EMail.toLowerCase();
    }

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
     * @return the ApartmentID
     */
    public String getApartmentID() {
        return ApartmentID;
    }

    /**
     * @param ApartmentID the ApartmentID to set
     */
    public void setApartmentID(String ApartmentID) {
        this.ApartmentID = ApartmentID;
    }

    /**
     * @return the isHost
     */
    public Boolean getIsHost() {
        return isHost;
    }

    /**
     * @param isHost the isHost to set
     */
    public void setIsHost(Boolean isHost) {
        this.isHost = isHost;
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
     * @return the SaveDate
     */
    public java.sql.Timestamp getSaveDate() {
        return SaveDate;
    }

    /**
     * @param SaveDate the SaveDate to set
     */
    public void setSaveDate(java.sql.Timestamp SaveDate) {
        this.SaveDate = SaveDate;
    }

    /**
     * @return the isLeft
     */
    public Boolean getIsLeft() {
        return isLeft;
    }

    /**
     * @param isLeft the isLeft to set
     */
    public void setIsLeft(Boolean isLeft) {
        this.isLeft = isLeft;
    }

    
    
    private int HabitantID;
    private String Name;
    private String Surname;
    private long TRIDNo;
    private java.sql.Date BirthDate;
    private Boolean isTRS;
    private Boolean isTRIDVerified;
    private String EMail;
    private long PhoneNumber;
    private String ApartmentID;
    private Boolean isHost;
    private int PersonalID;
    private java.sql.Timestamp SaveDate;
    private Boolean isLeft;
            
    
}
