package src.test.chapter7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraySumProductTest {
        ArraySumProduct array;
    @BeforeEach
    void setUp() {array = new ArraySumProduct();}
         int [] myArrays = {1, 2, -3, 5, 7};

   public int [] myArraysNumber(){
        int [] myArrays = {1, 2, -3, 5, 7};
        return myArrays;
    }
@Test
        public void testSumOfArraysNumber(){
        int sum = array.displaySumOfProduct(myArrays);
        assertEquals(12, sum);
        }
     @Test
     public void testProductOfArraysNumber(){
        int product = array.displayProductOfArray(myArrays);
        assertEquals(-210, product);
        }
       @Test
       public void testAverageOfArraysNumber(){
       double average = array.displayAverageOfArray(myArrays);
       assertEquals(2.4, average);
        }
}