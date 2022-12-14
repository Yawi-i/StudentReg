package ie.atu;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class StudIDTest {

    StudID myStudID;

    @BeforeEach
    void setUp() {
        myStudID = new StudID("0012345","0012345");
    }

/*
    @Test
    public void testID(){
        myStudID.setID("0012345");
        assertEquals("0012345", myStudID.getID());
    }
*/
    @Test
    public void TestIDLength(){
        myStudID.setID("5012345");
        assertTrue(String.valueOf(myStudID.getID()).length() >= 7,"Student ID number should be 8 numbers long. Please re- enter ID");
    }

    @Test
    public void testreg(){
        myStudID.setReg("501234568");
        assertTrue(String.valueOf(myStudID.getReg()).length() >= 9,"Registration number should be 9 numbers long. Please re- enter ID");
    }

    @AfterEach
    void tearDown() {
    }
}