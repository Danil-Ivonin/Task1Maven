import java.util.Date;

/**
 * Class of abstract contracts, stores information about the contract and the owner
 */
public abstract class Contract {
    private int ID;
    private int contract_number;
    private Date start_date, end_date;
    private Human owner;

    /**
     * Standard class constructor
     * @param ID Contract ID
     * @param contract_number Contract number
     * @param start_date Contract start date
     * @param end_date Contract end date
     * @param owner Contract owner
     */
    public Contract(int ID, int contract_number, Date start_date, Date end_date, Human owner) {
        this.ID = ID;
        this.contract_number = contract_number;
        this.start_date = start_date;
        this.end_date = end_date;
        this.owner = owner;
    }

    /**
     * Get ID value
     * @return Contract ID
     */
    public int getID() { return ID; }


    /**
     * Set new ID value
     * @param ID Contract ID
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * Get contract_number value
     * @return Contract number
     */
    public int getContract_number() {
        return contract_number;
    }

    /**
     * Set new contract_number value
     * @param contract_number Contract number
     */
    public void setContract_number(int contract_number) { this.contract_number = contract_number; }


    /**
     * Get start_date value
     * @return Contract start date
     */
    public Date getStart_date() {
        return start_date;
    }

    /**
     * Set new start_date value
     * @param start_date Contract start date
     */
    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    /**
     * Get end_date value
     * @return Contract end date
     */
    public Date getEnd_date() {
        return end_date;
    }

    /**
     * Set new end_date value
     * @param end_date Contract end date
     */
    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    /**
     * Get owner value
     * @return owner like human object
     */
    public Human getOwner() {
        return owner;
    }

    /**
     * Set new owner value
     * @param owner Contract owner
     */
    public void setOwner(Human owner) {
        this.owner = owner;
    }

    /**
     * The method allows you to get information about the Contract class object
     * @return String with information about contract
     */
    @Override
    public String toString() {
        return "ID = " + ID +
                "\nContract number = " + contract_number +
                "\nStart date = " + start_date +
                "\nEnd date = " + end_date +
                "\nOwner: " + owner.toString();
    }
}