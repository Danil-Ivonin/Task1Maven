import project.Human.Human;
import project.contract.internet.Internet_contract;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class Internet_contractTest {

    Internet_contract contract;
    Human owner = new Human(1, 1234, 123456, "Anton", "Smirnov", "Alexandrovich", "male", new Date(101, 0, 1));

    @BeforeEach
    void CreateContract() {
        contract = new Internet_contract (12, new Date(120, 0, 1), new Date(121, 6, 1), owner, 10);
    }

    @Test
    void getIDTest() {
        int result = contract.getID();
        assertEquals(10, result);
    }

    @Test
    void setIDTest() {
        contract.setID(20);
        int result = contract.getID();
        assertEquals(20, result);
    }

    @Test
    void getContract_numberTest() {
        int result = contract.getContract_number();
        assertEquals(12, result);
    }

    @Test
    void setContract_numberTest() {
        contract.setContract_number(15);
        int result = contract.getContract_number();
        assertEquals(15, result);
    }

    @Test
    void getStart_dateTest() {
        Date result = contract.getStart_date();
        Date expected = new Date(120, 0, 1);
        assertEquals(expected, result);
    }

    @Test
    void setStart_dateTest() {
        Date start_date = new Date(119, 8, 13);
        contract.setStart_date(start_date);
        Date result = contract.getStart_date();
        assertEquals(start_date, result);
    }

    @Test
    void getEnd_dateTest() {
        Date result = contract.getEnd_date();
        Date expected = new Date(121, 6, 1);
        assertEquals(expected, result);
    }

    @Test
    void setEnd_dateTest() {
        Date end_date = new Date(122, 1, 23);
        contract.setEnd_date(end_date);
        Date result = contract.getEnd_date();
        assertEquals(end_date, result);
    }

    @Test
    void getOwnerTest() {
        Human h = contract.getOwner();
        assertEquals(owner, h);
    }

    @Test
    void setOwnerTest() {
        Human h = new Human(5, 3212, 143246, "Stepan", "Smirnov", "Vladimirovich", "male", new Date(102, 0, 2));
        contract.setOwner(h);
        Human o = contract.getOwner();
        assertEquals(o, h);
    }

    @Test
    void getSpeedTest() {
        int speed = contract.getSpeed();
        assertEquals(10, speed);
    }

    @Test
    void setSpeedTest() {
        contract.setSpeed(15);
        int speed = contract.getSpeed();
        assertEquals(15, speed);
    }

    @Test
    void testToStringTest() {
        String str = "ID = 10" +
                "\nproject.contract.Contract number = 12" +
                "\nStart date = " + new Date(120, 0, 1) +
                "\nEnd date = " + new Date(121, 6, 1) +
                "\nOwner: " + owner.toString() +
                "\nSpeed = 10";
        assertEquals(str, contract.toString());
    }
}