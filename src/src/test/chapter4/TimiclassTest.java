package src.test.chapter4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimiclassTest {
    enrpytionPractice timi;

    @BeforeEach
    void setUp() {
        timi = new enrpytionPractice();
    }

    @Test
    public void encrypt() {
        String encryptedDigit = timi.encrypt("0236");
        assertEquals("0379", encryptedDigit);
    }

    @Test
    public void decrypt() {
        String decryptedDigit = timi.decrypted("0379");
        assertEquals("0236", decryptedDigit);
    }


}