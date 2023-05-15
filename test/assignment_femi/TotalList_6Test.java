package assignment_femi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TotalList_6Test {
TotalList_6 total;
    @BeforeEach
    void setUp() { total = new TotalList_6();}


   @Test
   public void testRunningTotalOfList(){
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
       int sum =  total.getTotalList(arr);
       assertEquals(45, sum);
    }
}