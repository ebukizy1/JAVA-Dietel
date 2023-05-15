package src.test.chapter6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class primeNumbersTest {
            primeNumbers prime;
    @BeforeEach
    void setUp() {prime = new primeNumbers();}

   @Test
   public void testPrimeNumbers(){
    assertEquals(1, prime.primeNumbersCheck(97));
    }
    @Test
    public void testPrimeNumbersAbove1000(){
        assertEquals(1, prime.primeNumbersCheck(9973));
    }
}