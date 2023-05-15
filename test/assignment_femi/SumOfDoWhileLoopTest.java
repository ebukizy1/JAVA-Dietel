package assignment_femi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfDoWhileLoopTest {
        SumOfDoWhileLoop sum;
    @BeforeEach
    void setUp() { sum = new SumOfDoWhileLoop();}

   @Test
   public void testDoWhileLoops(){
        int total =sum.sumOfList(10, 20, 30, 40);
        assertEquals(100, total);
    }
    @Test
    public void testDoWhileLoopsWithArray(){
        int [] arr = {10, 20, 30, 40};
        int total =sum.sumOfList(arr);
        assertEquals(100, total);
    }
}