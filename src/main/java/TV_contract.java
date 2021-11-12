import java.util.Date;

/**
 * The class stores information about a TV contract
 */
public class TV_contract extends Contract{
    private int number_of_channel;

    /**
     * TV_contract class constructor
     * @param ID Contract ID
     * @param contract_number Contract number
     * @param start_date Contract start date
     * @param end_date Contract end date
     * @param owner Contract owner
     * @param number_of_channel Number of channel in contract
     */
    public TV_contract(int ID, int contract_number, Date start_date, Date end_date, Human owner, int number_of_channel) {
        super(ID, contract_number, start_date, end_date, owner);
        this.number_of_channel = number_of_channel;
    }

    /**
     * Get channel package in the contract
     * @return number_of_channel value
     */
    public int getNumber_of_channel() {
        return number_of_channel;
    }

    /**
     * Ste new number_of_channel value
     * @param number_of_channel Channel package in the contract
     */
    public void setNumber_of_channel(int number_of_channel) {
        this.number_of_channel = number_of_channel;
    }

    /**
     * The method allows you to get information about the TV_contract class object
     * @return String with information about TV contract
     */
    @Override
    public String toString() {
        return super.toString() +
                "\nChannel = " + number_of_channel;
    }
}