package ie.atu;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class PaymentTest {
private Payment myPayment;
    @BeforeEach
    void setUp() {
        myPayment = new Payment("AIBKIE23648562", "AIBK1234", "G001234567", 1200, 3000);
    }

    @Test
    void testIban(){assertEquals("AIBKIE23648562", myPayment.getIban());}

    @Test
    void testBic(){assertEquals("AIBK1234", myPayment.getBic());}

    @Test
    void testId(){assertEquals("G001234567", myPayment.getId());}

    @Test
    void testAmount(){assertEquals(1200, myPayment.getAmount());}

    @Test
    void testFee(){assertEquals(3000, myPayment.getFee());}

    @Test
    void testDue(){assertEquals(1800, myPayment.getDue(1200, 3000));}

    @AfterEach
    void tearDown() {
    }
}