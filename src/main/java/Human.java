import java.util.Date;

/**
 * The class stores basic information about a person
 */
public class Human {

    private int ID;
    private int pas_series;
    private int pas_number;
    private String name;
    private String surname;
    private String patronymic;
    private String sex;
    private Date date_of_birth;

    /**
     * Standard class constructor
     * @param ID Person's ID
     * @param pas_series Person's passport series
     * @param pas_number Person's passport number
     * @param name Person's name
     * @param surname Person's surname
     * @param patronymic Person's patronymic
     * @param sex Human gender
     * @param date_of_birth Person's date of birth
     */
    public Human(int ID, int pas_series, int pas_number, String name, String surname, String patronymic, String sex, Date date_of_birth) {
        this.ID = ID;
        this.pas_series = pas_series;
        this.pas_number = pas_number;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.sex = sex;
        this.date_of_birth = date_of_birth;
    }

    /**
     * Get ID value
     * @return Person's ID
     */
    public int getID() {
        return ID;
    }

    /**
     * Set new ID value
     * @param ID Person's ID
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * Get pas_series value
     * @return Person's passport series value
     */
    public int getPas_series() {
        return pas_series;
    }

    /**
     * Set new pas_series value
     * @param pas_series Person's passport series value
     */
    public void setPas_series(int pas_series) {
        this.pas_series = pas_series;
    }

    /**
     * Get pas_number value
     * @return Person's passport number value
     */
    public int getPas_number() {
        return pas_number;
    }

    /**
     * Set new pas_number value
     * @param pas_number Person's passport number value
     */
    public void setPas_number(int pas_number) {
        this.pas_number = pas_number;
    }

    /**
     * Get name value
     * @return Person's name value
     */
    public String getName() {
        return name;
    }

    /**
     * Set name value
     * @param name  Person's name value
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get surname value
     * @return Person's surname value
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Set surname value
     * @param surname  Person's surname value
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * Get patronymic value
     * @return Person's patronymic value
     */
    public String getPatronymic() {
        return patronymic;
    }

    /**
     * Set patronymic value
     * @param patronymic  Person's patronymic value
     */
    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    /**
     * Get person's gender
     * @return Person's sex value
     */
    public String getSex() {
        return sex;
    }

    /**
     * Set sex value
     * @param sex  Person's person's gender
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * Get date_of_birth value
     * @return person's date of birth in Date format
     */
    public Date getDate_of_birth() {
        return date_of_birth;
    }

    /**
     * Set new date_of_birth value
     * @param date_of_birth person's date of birth in Date format
     */
    public void setDate_of_birth(Date date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    /**
     * Find out the age of the person
     * @return age of the person
     */
    public int getAge() {
        return new Date().getYear() - getDate_of_birth().getYear();
    }

    /**
     * The method allows you to get information about the Human class object
     * @return String with information about person
     */
    @Override
    public String toString() {
        return "ID = " + ID +
                ", pas_series = " + pas_series +
                ", pas_number = " + pas_number +
                ", name = " + name +
                ", surname = " + surname +
                ", patronymic = " + patronymic +
                ", sex = " + sex +
                ", date_of_birth = " + date_of_birth;
    }
}