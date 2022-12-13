package ie.atu;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class StudIDTest {

    StudID myStudID;

    @BeforeEach
    void setUp() {
        myStudID = new StudID(null,null);
    }

    @Test
    public void TestIDLength(){
        myStudID.setID("568423");
        assertTrue(String.valueOf(myStudID.getID()).length() <5,"ID should be 6 numbers or more");
    }

    @Test
    public void TestIDLengthFail() {
        assertThrows(IllegalArgumentException.class,
                () -> {
                    myStudID.setID("45678");
                });
    }
    @AfterEach
    void tearDown() {
    }
}