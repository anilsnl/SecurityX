
package Entities;

/**
 *
 * @author anild
 */
public class Log {

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
     * @return the LogID
     */
    public int getLogID() {
        return LogID;
    }

    /**
     * @param LogID the LogID to set
     */
    public void setLogID(int LogID) {
        this.LogID = LogID;
    }

    /**
     * @return the Operation
     */
    public String getOperation() {
        return Operation;
    }

    /**
     * @param Operation the Operation to set
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
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
     * @return the Date
     */
    public java.sql.Timestamp getDate() {
        return Date;
    }

    /**
     * @param Date the Date to set
     */
    public void setDate(java.sql.Timestamp Date) {
        this.Date = Date;
    }
    
    
    private int LogID;
    private int PersonalID;
    private String Operation;
    private String Detail;
    private java.sql.Timestamp Date;
    
}
