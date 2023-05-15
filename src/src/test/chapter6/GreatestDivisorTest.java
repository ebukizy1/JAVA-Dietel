package src.test.chapter6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreatestDivisorTest {
        GreatestDivisor divisor;
    @BeforeEach
    void setUp() { divisor = new GreatestDivisor();}

  @Test
  public void testGreatestCommonDivisor(){
       int gcd = divisor.findGreatestDivisor(45, 65 );
       assertEquals(5, gcd);
    }
    @Test
    public void testGreatestCommonDivisorOtherNumbers(){
        int gcd = divisor.findGreatestDivisor(43, 43);
        assertEquals(43, gcd);
    }

}