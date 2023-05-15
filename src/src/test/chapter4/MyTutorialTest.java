package src.test.chapter4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyTutorialTest {
    encryption tutorial;

    @BeforeEach
    void setUp() {
        tutorial = new encryption();
    }

    @Test
    public void encryptDigit() {
        String encryptedDigit = tutorial.encryptDigit("4891");
        assertEquals("6815", encryptedDigit);
    }

    @Test
    public void decryptedDigit() {
        String decryptedDigit = tutorial.decryptedDigit("6815");
        assertEquals("4891", decryptedDigit);
    }


}






