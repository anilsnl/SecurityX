
package Entities;


public class HCar {

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
        return Plate.toUpperCase();
    }

    /**
     * @param Plate the Plate to set
     */
    public void setPlate(String Plate) {
        this.Plate = Plate.toUpperCase();
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
    private int HabitantID;
    private int PersonalID;
    private String Plate;
    private String Detail;
    private java.sql.Timestamp SavaDate;
    
    
}
