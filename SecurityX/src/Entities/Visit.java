
package Entities;


public class Visit {

    /**
     * @return the VisitID
     */
    public int getVisitID() {
        return VisitID;
    }

    /**
     * @param VisitID the VisitID to set
     */
    public void setVisitID(int VisitID) {
        this.VisitID = VisitID;
    }

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
     * @return the Company
     */
    public String getCompany() {
        return Company;
    }

    /**
     * @param Company the Company to set
     */
    public void setCompany(String Company) {
        this.Company = Company;
    }

    /**
     * @return the Detail
     */
    public String getDetail() {
        return Detail;
    }

    /**
     * @param Detail the Detail to set
     */
    public void setDetail(String Detail) {
        this.Detail = Detail;
    }

    /**
     * @return the VisitDate
     */
    public java.sql.Timestamp getVisitDate() {
        return VisitDate;
    }

    /**
     * @param VisitDate the VisitDate to set
     */
    public void setVisitDate(java.sql.Timestamp VisitDate) {
        this.VisitDate = VisitDate;
    }
    
    private int VisitID;
    private int VisitorID;
    private int PersonalID;
    private int HabitantID;
    private String Company;
    private String Detail;
    private java.sql.Timestamp VisitDate;
    
    
}
