package project.contract.tv;

import project.contract.Contract;
import project.Human.Human;

import java.util.Date;

/**
 * The class stores information about a TV project.contract
 */
public class TV_contract extends Contract {
    private int number_of_channel;

    /**
     * project.contract.tv.TV_contract class constructor
     * @param ID project.contract.Contract ID
     * @param contract_number project.contract.Contract number
     * @param start_date project.contract.Contract start date
     * @param end_date project.contract.Contract end date
     * @param owner project.contract.Contract owner
     * @param number_of_channel Number of channel in project.contract
     */
    public TV_contract(int contract_number, Date start_date, Date end_date, Human owner, int number_of_channel) {
        super(contract_number, start_date, end_date, owner);
        this.number_of_channel = number_of_channel;
    }

    /**
     * Get channel package in the project.contract
     * @return number_of_channel value
     */
    public int getNumber_of_channel() {
        return number_of_channel;
    }

    /**
     * Ste new number_of_channel value
     * @param number_of_channel Channel package in the project.contract
     */
    public void setNumber_of_channel(int number_of_channel) {
        this.number_of_channel = number_of_channel;
    }

    /**
     * The method allows you to get information about the project.contract.tv.TV_contract class object
     * @return String with information about TV project.contract
     */
    @Override
    public String toString() {
        return super.toString() +
                "\nChannel = " + number_of_channel;
    }
}