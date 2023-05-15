package chapter6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfIntTest {
        SumOfInt sumInt;
    @BeforeEach
    void setUp() {sumInt = new SumOfInt();
    }
  @Test
  public void testSumOfIntegers(){
      int sum =  sumInt. CheckIntegers(423);
      assertEquals(9, sum);
    }

    @Test
    public void testSumOfIntegersAbove10000(){
        int sum =  sumInt. CheckIntegers(423233);
        assertEquals(17, sum);
    }
}