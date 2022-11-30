package ie.atu;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    Student myStudent;

    @BeforeEach
    void setUp() {
    }

    @Test
    void TestNameLength(){
        myStudent = new Student("Ye", "phone", "mail", 0);
        assertTrue(Student.Name() >= 2, "Name should be 2 letters or more");
    }

    @Test
    void TestNameLengthFail() {
        myStudent = new Student("Y", "phone", "mail", 0);
        assertThrows(IllegalArgumentException.class,
                () -> {
                    myStudent.Name();
                });
    }


    @AfterEach
    void tearDown() {
    }
}