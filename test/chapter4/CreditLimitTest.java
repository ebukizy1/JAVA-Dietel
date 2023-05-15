package chapter4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditLimitTest {
    CreditLimit credit;

    @BeforeEach
    void setUp() {
        credit = new CreditLimit();
    }

    @Test
    public void calculateTheNewBalance() {
        credit.intialBalance(40000, 10000, 8000);
        assertEquals(42000, credit.newBalance());
    }

    @Test
    public void calculateFOrExceeded() {
        assertEquals("credit limit exceeded", credit.intialBalance(100, 50000, 1000));
    }


}