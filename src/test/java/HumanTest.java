import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {

    Human human;

    @BeforeEach
    void CreateHuman(){
        human = new Human(1, 1234, 123456, "Ivan", "Ivanov", "Ivanovich", "male", new Date(101, 0, 1));
    }

    @Test
    void getIDTest() {
        int result = human.getID();
        assertEquals(1, result);
    }

    @Test
    void setIDTest() {
        human.setID(2);
        int result = human.getID();
        assertEquals(2, result);
    }

    @Test
    void getPas_seriesTest() {
        int result = human.getPas_series();
        assertEquals(1234, result);
    }

    @Test
    void setPas_seriesTest() {
        human.setPas_series(1111);
        int result = human.getPas_series();
        assertEquals(1111, result);
    }

    @Test
    void getPas_numberTest() {
        int result = human.getPas_number();
        assertEquals(123456, result);
    }

    @Test
    void setPas_numberTest() {
        human.setPas_number(112233);
        int result = human.getPas_number();
        assertEquals(112233, result);
    }

    @Test
    void getNameTest() {
        String result = human.getName();
        assertEquals("Ivan", result);
    }

    @Test
    void setNameTest() {
        human.setName("Fedor");
        String result = human.getName();
        assertEquals("Fedor", result);
    }

    @Test
    void getSurnameTest() {
        String result = human.getSurname();
        assertEquals("Ivanov", result);
    }

    @Test
    void setSurnameTest() {
        human.setSurname("Fedorov");
        String result = human.getSurname();
        assertEquals("Fedorov", result);
    }

    @Test
    void getPatronymicTest() {
        String result = human.getPatronymic();
        assertEquals("Ivanovich", result);
    }

    @Test
    void setPatronymicTest() {
        human.setPatronymic("Fedorovich");
        String result = human.getPatronymic();
        assertEquals("Fedorovich", result);
    }

    @Test
    void getSexTest() {
        String  result = human.getSex();
        assertEquals("male", result);
    }

    @Test
    void setSexTest() {
        human.setSex("female");
        String result = human.getSex();
        assertEquals("female", result);
    }

    @Test
    void getDate_of_birthTest() {
        Date result = human.getDate_of_birth();
        assertEquals(new Date(101, 0, 1), result);
    }

    @Test
    void setDate_of_birthTest() {
        Date date_of_birth = new Date(100, 2, 13);
        human.setDate_of_birth(date_of_birth);
        Date result = human.getDate_of_birth();
        assertEquals(date_of_birth, result);
    }

    @Test
    void getAgeTest() {
        Date date_of_birth = human.getDate_of_birth();
        Date today = new Date();
        int expectedAge = today.getYear() - date_of_birth.getYear();
        int result = human.getAge();
        assertEquals(expectedAge, result);
    }

    @Test
    void testToStringTest() {
        String str = "ID = 1" +
                ", pas_series = 1234" +
                ", pas_number = 123456" +
                ", name = Ivan" +
                ", surname = Ivanov" +
                ", patronymic = Ivanovich" +
                ", sex = male" +
                ", date_of_birth = " + new Date(101, 0, 1);
        String result = human.toString();
        assertEquals(str, result);
    }
}