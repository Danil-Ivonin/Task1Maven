import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class TV_contractTest {

    TV_contract contract;
    Human owner = new Human(1, 1234, 123456, "Anton", "Smirnov", "Alexandrovich", "male", new Date(101, 0, 1));

    @BeforeEach
    void CreateContract() {
        contract = new TV_contract(10, 12, new Date(120, 0, 1), new Date(121, 6, 1), owner, 200);
    }

    @Test
    void getNumber_of_channelTest() {
            int result = contract.getNumber_of_channel();
            assertEquals(200, result);
    }

    @Test
    void setNumber_of_channelTest() {
        contract.setNumber_of_channel(300);
        int result = contract.getNumber_of_channel();
        assertEquals(300, result);
    }

    @Test
    void testToStringTest() {
        String str = "ID = 10" +
                "\nContract number = 12" +
                "\nStart date = " + new Date(120, 0, 1) +
                "\nEnd date = " + new Date(121, 6, 1) +
                "\nOwner: " + owner.toString() +
                "\nChannel = 200";
        assertEquals(str, contract.toString());
    }
}