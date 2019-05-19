
package Entities;

public class VCar {

    /**
     * @return the Carıd
     */
    public int getCarıd() {
        return Carıd;
    }

    /**
     * @param Carıd the Carıd to set
     */
    public void setCarıd(int Carıd) {
        this.Carıd = Carıd;
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
     * @return the Plate
     */
    public String getPlate() {
        return Plate;
    }

    /**
     * @param Plate the Plate to set
     */
    public void setPlate(String Plate) {
        this.Plate = Plate;
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
    
    private int Carıd;
    private int VisitorID;
    private int PersonalID;
    private String Plate;
    private String Detail;
    private java.sql.Timestamp SavaDate;
    
}
