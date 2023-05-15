package chapter6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreatestCommonDivisorTest {
    GreatestCommonDivisor divisor;
    @BeforeEach
    void setUp() { divisor = new GreatestCommonDivisor();}

    @Test
    public void findGreatestCommonDivisorTest(){
        assertEquals(2,divisor.greatestCommonDvisior(4, 10));
    }






}