import java.util.Date;

/**
 * The class stores information about a Mobile contract
 */
public class Mobile_contract extends Contract{
    private int minute, sms, internet;

    /**
     * Mobile_contract class constructor
     * @param ID Contract ID
     * @param contract_number Contract number
     * @param start_date Contract start date
     * @param end_date Contract end date
     * @param owner Contract owner
     * @param minute Minutes package in the contract
     * @param sms Sms package in the contract
     * @param internet Internet package in the contract
     */
    public Mobile_contract(int ID, int contract_number, Date start_date, Date end_date, Human owner, int minute, int sms, int internet) {
        super(ID, contract_number, start_date, end_date, owner);
        this.minute = minute;
        this.sms = sms;
        this.internet = internet;
    }

    /**
     * Get minutes package in the contract
     * @return Minute value
     */
    public int getMinute() {
        return minute;
    }

    /**
     * Set new minute value
     * @param minute Minutes package in the contract
     */
    public void setMinute(int minute) {
        this.minute = minute;
    }

    /**
     * Get sms package in the contract
     * @return Sms value
     */
    public int getSms() {
        return sms;
    }

    /**
     * Set new sms value
     * @param sms Sms package in the contract
     */
    public void setSms(int sms) {
        this.sms = sms;
    }

    /**
     * Get internet package in the contract
     * @return Internet value
     */
    public int getInternet() {
        return internet;
    }

    /**
     * Set new internet value
     * @param internet Internet package in the contract
     */
    public void setInternet(int internet) {
        this.internet = internet;
    }

    /**
     * The method allows you to get information about the Mobile_contract class object
     * @return String with information about mobile contract
     */
    @Override
    public String toString() {
        return super.toString() +
                "\nInternet = " + internet +
                "\nSms = " + sms +
                "\nMinute = " + minute;
    }
}
