import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class RepositoryTest {

    Human owner = new Human(1, 1234, 123456, "Anton", "Smirnov", "Alexandrovich", "male", new Date(101, 0, 1));
    Internet_contract contract = new Internet_contract(10, 12, new Date(120, 0, 1), new Date(121, 6, 1), owner, 10);
    Repository rep;

    @BeforeEach
    void CreateRep() {
        rep = new Repository();
    }

    @Test
    void addContractTest() {
        rep.addContract(contract);
        String result = rep.getContract(10);
        assertEquals(contract.toString(), result);
    }

    @Test
    void getContractTest() {
        for(int i = 0; i < 10; i++)
        {
            contract = new Internet_contract(i, 10 + i, new Date(120, 0, 1), new Date(121, 6, 1), owner, 10);
            rep.addContract(contract);
            String result = rep.getContract(i);
            assertEquals(contract.toString(), result);
        }

    }

    @Test
    void deleteContractTest() {
        for(int i = 0; i < 10; i++) {
            contract = new Internet_contract(i, 10 + i, new Date(120, 0, 1), new Date(121, 6, 1), owner, 10);
            rep.addContract(contract);
        }
        rep.deleteContract(5);
        String result = rep.getContract(5);
        assertEquals("There is no such contract!", result);
    }

    @Test
    void getLengthTest() {
        for(int i = 0; i < 12; i++) {
            contract = new Internet_contract(i, 10 + i, new Date(120, 0, 1), new Date(121, 6, 1), owner, 10);
            rep.addContract(contract);
        }
        int result = rep.getLength();
        assertEquals(12, result);
    }
}