
package Entities;



/**
 *
 * @author anild
 */
public class Visitor {

    /**
     * @return the VisitorID
     */
    public int getVisitorID() {
        return VisitorID;
    }

    /**
     * @param VisitorID the VisitorID to set
     */
    public void setVisitorID(int VisitorID) {
        this.VisitorID = VisitorID;
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
     * @return the BirthYear
     */
    public int getBirthYear() {
        return BirthYear;
    }

    /**
     * @param BirthYear the BirthYear to set
     */
    public void setBirthYear(int BirthYear) {
        this.BirthYear = BirthYear;
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
    
    private int VisitorID;
    private String Name;
    private String Surname;
    private Boolean isTRS;
    private long TRIDNo;
    private int BirthYear;
    private Boolean isTRIDVerified;
    private int PersonalID;
    private java.sql.Timestamp SaveDate;
    
}
