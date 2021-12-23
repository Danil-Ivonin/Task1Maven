import project.Human.Human;
import project.contract.Contract;
import project.contract.internet.Internet_contract;
import project.contract.mobile.Mobile_contract;
import project.repository.Repository;

import java.util.Comparator;
import java.util.Date;
import java.util.function.Predicate;


public class Main {

    public static void main(String[] args) {
        Human owner = new Human(1, 1234, 123456, "Anton", "Smirnov", "Alexandrovich", "male", new Date(101, 0, 1));
        Internet_contract contract = new Internet_contract(12, new Date(120, 0, 1), new Date(121, 6, 1), owner, 10);
        Repository rep = new Repository();
        rep.addContract(contract);

        owner = new Human(2, 1224, 124326, "Ivan", "Ivanov", "Ivanovich", "male", new Date(102, 1, 12));
        Mobile_contract contract1 = new Mobile_contract(10, new Date(120, 1, 1), new Date(121, 3, 12), owner, 200, 150, 30);
        rep.addContract(contract1);

        Mobile_contract contract2 = new Mobile_contract(11, new Date(120, 1, 1), new Date(121, 3, 12), owner, 200, 150, 30);
        rep.addContract(contract2);
        MyComp myComp = new MyComp();
        rep.SelectionSort(myComp);
        System.out.print(rep.toString());
    }

    public static class MyComp implements Comparator<Contract> {
        @Override
        public int compare(Contract c1, Contract c2) {
            return c1.getContract_number() - c2.getContract_number();
        }
    }
}