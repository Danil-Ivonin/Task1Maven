import project.Human.Human;
import project.contract.Contract;
import project.contract.internet.Internet_contract;
import project.contract.mobile.Mobile_contract;
import project.repository.Repository;
import java.util.Date;
import java.util.function.Predicate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FiltreTest {
    Repository rep = new Repository();

    @Test
    void BubbleSortTest() {
        Human owner = new Human(1, 1234, 123456, "Anton", "Smirnov", "Alexandrovich", "male", new Date(101, 0, 1));
        Internet_contract contract = new Internet_contract(12, new Date(120, 0, 1), new Date(121, 6, 1), owner, 10);
        rep.addContract(contract);

        owner = new Human(2, 1224, 124326, "Ivan", "Ivanov", "Ivanovich", "male", new Date(102, 1, 12));
        Mobile_contract contract1 = new Mobile_contract(10, new Date(120, 1, 1), new Date(121, 3, 12), owner, 200, 150, 30);
        rep.addContract(contract1);

        Mobile_contract contract2 = new Mobile_contract(11, new Date(120, 1, 1), new Date(121, 3, 12), owner, 200, 150, 30);
        rep.addContract(contract2);

        Predicate<Contract> p = x -> x.getContract_number()>10;
        rep = rep.Filter(p);

        String result = rep.toString();
        String str = "--------------------------------\n" +
                "ID = 1\n" +
                "project.contract.Contract number = 12\n" +
                "Start date = Wed Jan 01 00:00:00 MSK 2020\n" +
                "End date = Thu Jul 01 00:00:00 MSK 2021\n" +
                "Owner: ID = 1, pas_series = 1234, pas_number = 123456, name = Anton, surname = Smirnov, patronymic = Alexandrovich, sex = male, date_of_birth = Mon Jan 01 00:00:00 MSK 2001\n" +
                "Speed = 10\n" +
                "--------------------------------\n" +
                "ID = 2\n" +
                "project.contract.Contract number = 11\n" +
                "Start date = Sat Feb 01 00:00:00 MSK 2020\n" +
                "End date = Mon Apr 12 00:00:00 MSK 2021\n" +
                "Owner: ID = 2, pas_series = 1224, pas_number = 124326, name = Ivan, surname = Ivanov, patronymic = Ivanovich, sex = male, date_of_birth = Tue Feb 12 00:00:00 MSK 2002\n" +
                "Internet = 30\n" +
                "Sms = 150\n" +
                "Minute = 200\n";

        assertEquals(str, result);
    }
}
