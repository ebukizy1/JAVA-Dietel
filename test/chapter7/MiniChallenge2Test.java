package chapter7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MiniChallenge2Test {
    int [] arr = {12, 34, 56, 76, 78, 12, 44, 22, 55, 66, 77, 88, 99, 90 ,11, 223};

MiniChallenge2 min;
    @BeforeEach
    void setUp() {min = new MiniChallenge2();}
  @Test
  public void testMinimumNumbers(){
       int returnValue = min.findMin(23, 34, 67, 89, 65, 12, 45, 67, 43, 23);
       assertEquals(12, returnValue);
    }
   @Test
   public void testMinimumValueOfArray(){
          assertEquals(11, min.findMin(arr));
    }
}