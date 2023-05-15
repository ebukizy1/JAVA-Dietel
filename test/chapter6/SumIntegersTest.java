package chapter6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumIntegersTest {
        SumIntegers sum;
    @BeforeEach
    void setUp() {sum = new SumIntegers();}

    @Test
    public void testTheSumOfNumbers(){
        assertEquals(8,sum.addSumOfIntegers(512));
    }
    @Test
    public void testTheSumOfFourDigitNumbers(){
        assertEquals(15, sum.addSumOfIntegers(12345));


    }


}