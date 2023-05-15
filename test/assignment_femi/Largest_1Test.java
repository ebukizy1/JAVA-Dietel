package assignment_femi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Largest_1Test {

    Largest_1 largest;
    @BeforeEach
    void setUp() { largest =  new Largest_1();}


 @Test
 public void testFindLargestNumber(){
        int [] arrays ={1, 2, 3, 4, 5,6, 7, 8, 9,10, 2, 5, 7, 4};
       int maximum =  largest.findLargestNumber(arrays);
       assertEquals(10, maximum);
    }


}