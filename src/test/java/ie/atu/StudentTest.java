package ie.atu;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    Student myStudent;

    @BeforeEach
    void setUp() {
    }

    @Test
    void TestNameLength(){
        myStudent = new Student("Ye", "phone", "mail", 0);
        assertTrue(myStudent.Name() >=2,"Name should be 2 letters or more");
    }

    @Test
    void TestNameLengthFail() {
        myStudent = new Student("Y", "phone", "mail", 0);
        assertThrows(IllegalArgumentException.class,
                () -> {
                    myStudent.Name();
                });
    }

    @Test
    void TestPhoneLength(){
        myStudent = new Student("name", "0123456789", "mail", 0);
        assertTrue(myStudent.Phone() >= 7,"Phone should be 7 characters or more");
    }

    @Test
    void TestPhoneLengthFail(){
        myStudent = new Student("name", "1234", "mail", 0);
        assertThrows(IllegalArgumentException.class,
                () -> {
                    myStudent.Phone();
                });
    }

    @Test
    void TestAgePass() {
        myStudent = new Student("name", "phone", "mail", 16);
        assertTrue(myStudent.Age() >= 16, "Age must be over 16");
    }

    @Test
    void TestAgeFail() {
        myStudent = new Student("name", "phone", "mail", 0);
        assertThrows(IllegalArgumentException.class,
                () -> {
                    myStudent.Age();
                });
    }

    @Test
    void TestEmailPass(){
        myStudent = new Student("name", "phone", "mail@mail.ie", 0);
    }

    @Test
    void TestEmailFail(){
        myStudent = new Student("name", "phone", "iamasleep.idk", 0);
    }


    @AfterEach
    void tearDown() {
    }
}