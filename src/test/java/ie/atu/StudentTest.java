package ie.atu;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    Student myStudent;

    @BeforeEach
    void setUp() {
        myStudent = new Student(null,null,null,0);
    }

    @Test
    void TestNameLength(){
      myStudent.setName("Jo");
      assertTrue(String.valueOf(myStudent.getName()).length() >=2,"Name should be 2 letters or more");
    }

    @Test
    void TestNameLengthFail() {
        assertThrows(IllegalArgumentException.class,
                () -> {
                    myStudent.setName("J");
                });
    }

    @Test
    void TestPhoneLength(){
        myStudent.setPhone("0123456789");
        assertTrue(String.valueOf(myStudent.getPhone()).length() >= 7,"Phone should be 10 numbers or more");
    }

    @Test
    void TestPhoneLengthFail(){
        assertThrows(IllegalArgumentException.class,
                () -> {
                    myStudent.setPhone("012345678");
                });
    }

    @Test
    void TestAgePass() {
        myStudent.setAge(16);
        assertTrue(myStudent.getAge() >= 16, "Age must be over 16");
    }

    @Test
    void TestAgeFail() {
        assertThrows(IllegalArgumentException.class,
                () -> {
                    myStudent.setAge(15);
                });
    }
/*
    @Test
    void TestEmailPass() {
        myStudent.setEmail("mail@mail.com");
        int a = myStudent.getEmail().indexOf('@');
        assertTrue(a != -1,"Invalid Email");
    }

    @Test
    void TestEmailFail() {
        assertThrows(IllegalArgumentException.class,
                () -> {
                    myStudent.setEmail("mail.com");
                });
    }
*/
    @AfterEach
    void tearDown() {
    }
}