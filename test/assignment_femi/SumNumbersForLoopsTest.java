package assignment_femi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumNumbersForLoopsTest {
    SumNumberswhileLoops sum;
    @BeforeEach
    void setUp() { sum = new SumNumberswhileLoops();}

  @Test
  public void TestSumOfIntegersWithWhileLoops(){
      int total =  sum.sumOfIntegers(5,10,5,5,5,10);

      assertEquals(40, total);
    }
    @Test
    public void TestSumOfIntegersWithArrays(){
        int [] arr = {10,20,30,40};
        int total =  sum.sumOfIntegers(arr);
        assertEquals(100, total);
    }


}