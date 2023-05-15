package chapterseven;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ReverseNumbersTest {
    int [] myArr = {20, 54, 67, 78, 90, 23, 54, 12, 77, 12, 98};
ReverseNumbers arr;
    @BeforeEach
    void setUp() { arr = new ReverseNumbers();}

    @Test
    public void findMaximumNumbersTest(){
      int maximum =  arr.findMaximumNumber(myArr);
      assertEquals(98, maximum);}
 @Test
 public void findMinimumNumbersTest(){
        int minimum = arr.findMinimumNumbers(myArr);
        assertEquals(12, minimum);
    }
    @Test
    public void findMaxAndMinTest(){
        int[] expected = {98, 12};
       int [] result = arr.findMaxAndMin(myArr);
       assertEquals(Arrays.toString(expected),Arrays.toString(result));
    }



}