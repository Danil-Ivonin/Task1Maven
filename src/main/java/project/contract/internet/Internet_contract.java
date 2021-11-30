package project.contract.internet;

import project.contract.Contract;
import project.Human.Human;

import java.util.Date;

/**
 * The class stores information about an Internet project.contract
 */
public class Internet_contract extends Contract {
    private int speed;

    /**
     * project.contract.internet.Internet_contract class constructor
     * @param ID project.contract.Contract ID
     * @param contract_number project.contract.Contract number
     * @param start_date project.contract.Contract start date
     * @param end_date project.contract.Contract end date
     * @param owner project.contract.Contract owner
     * @param speed Internet speed
     */
    public Internet_contract(int ID, int contract_number, Date start_date, Date end_date, Human owner, int speed) {
        super(ID, contract_number, start_date, end_date, owner);
        this.speed = speed;
    }

    /**
     * Get speed value
     * @return Internet speed
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * Set new speed value
     * @param speed Internet speed
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * The method allows you to get information about the project.contract.internet.Internet_contract class object
     * @return String with information about internet project.contract
     */
    @Override
    public String toString() {
        return super.toString() +
                "\nSpeed = " + speed;
    }
}
