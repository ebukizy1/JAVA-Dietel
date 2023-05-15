package chapter6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PerfectNumbersTest {
        PerfectNumbers perfectNum;
    @BeforeEach
    void setUp() {perfectNum = new PerfectNumbers();}

    @Test
    public void testPerfectNumbers(){
        assertTrue(perfectNum.isPerfectNumbers(6));
    }
   @Test
   public void testPerfectNumbersAbove1000(){
        assertTrue(perfectNum.isPerfectNumbers(8128));
    }
    @Test
    public void testPerfectNumbersAboveMillion(){
        assertTrue(perfectNum.isPerfectNumbers(33550336	));
    }
    @Test
    public void testPerfectNumbers1000(){
        assertFalse(perfectNum.isPerfectNumbers(1000));
    }

}