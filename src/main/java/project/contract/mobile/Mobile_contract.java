package project.contract.mobile;

import project.contract.Contract;
import project.Human.Human;

import java.util.Date;

/**
 * The class stores information about a Mobile project.contract
 */
public class Mobile_contract extends Contract {
    private int minute, sms, internet;

    /**
     * project.contract.mobile.Mobile_contract class constructor
     * @param ID project.contract.Contract ID
     * @param contract_number project.contract.Contract number
     * @param start_date project.contract.Contract start date
     * @param end_date project.contract.Contract end date
     * @param owner project.contract.Contract owner
     * @param minute Minutes package in the project.contract
     * @param sms Sms package in the project.contract
     * @param internet Internet package in the project.contract
     */
    public Mobile_contract(int ID, int contract_number, Date start_date, Date end_date, Human owner, int minute, int sms, int internet) {
        super(ID, contract_number, start_date, end_date, owner);
        this.minute = minute;
        this.sms = sms;
        this.internet = internet;
    }

    /**
     * Get minutes package in the project.contract
     * @return Minute value
     */
    public int getMinute() {
        return minute;
    }

    /**
     * Set new minute value
     * @param minute Minutes package in the project.contract
     */
    public void setMinute(int minute) {
        this.minute = minute;
    }

    /**
     * Get sms package in the project.contract
     * @return Sms value
     */
    public int getSms() {
        return sms;
    }

    /**
     * Set new sms value
     * @param sms Sms package in the project.contract
     */
    public void setSms(int sms) {
        this.sms = sms;
    }

    /**
     * Get internet package in the project.contract
     * @return Internet value
     */
    public int getInternet() {
        return internet;
    }

    /**
     * Set new internet value
     * @param internet Internet package in the project.contract
     */
    public void setInternet(int internet) {
        this.internet = internet;
    }

    /**
     * The method allows you to get information about the project.contract.mobile.Mobile_contract class object
     * @return String with information about mobile project.contract
     */
    @Override
    public String toString() {
        return super.toString() +
                "\nInternet = " + internet +
                "\nSms = " + sms +
                "\nMinute = " + minute;
    }
}
