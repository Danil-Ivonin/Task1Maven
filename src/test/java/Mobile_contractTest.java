import project.Human.Human;
import project.contract.mobile.Mobile_contract;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class Mobile_contractTest {

    Mobile_contract contract;
    Human owner = new Human(1, 1234, 123456, "Anton", "Smirnov", "Alexandrovich", "male", new Date(101, 0, 1));

    @BeforeEach
    void CreateContract() {
        contract = new Mobile_contract(12, new Date(120, 0, 1), new Date(121, 6, 1), owner, 200, 150, 30);
    }

    @Test
    void getMinuteTest() {
        int result = contract.getMinute();
        assertEquals(200, result);
    }

    @Test
    void setMinuteTest() {
        contract.setMinute(250);
        int result = contract.getMinute();
        assertEquals(250, result);
    }

    @Test
    void getSmsTest() {
        int result = contract.getSms();
        assertEquals(150, result);
    }

    @Test
    void setSmsTest() {
        contract.setSms(100);
        int result = contract.getSms();
        assertEquals(100, result);
    }

    @Test
    void getInternetTest() {
        int result = contract.getInternet();
        assertEquals(30, result);
    }

    @Test
    void setInternetTest() {
        contract.setInternet(40);
        int result = contract.getInternet();
        assertEquals(40, result);
    }

    @Test
    void testToStringTest() {
        String str = "ID = 10" +
                "\nproject.contract.Contract number = 12" +
                "\nStart date = " + new Date(120, 0, 1) +
                "\nEnd date = " + new Date(121, 6, 1) +
                "\nOwner: " + owner.toString() +
                "\nInternet = 30" +
                "\nSms = 150" +
                "\nMinute = 200";
        assertEquals(str, contract.toString());
    }
}