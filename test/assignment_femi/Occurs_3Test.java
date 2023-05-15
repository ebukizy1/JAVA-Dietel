package assignment_femi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Occurs_3Test {
        Occurs_3 occurs;
    @BeforeEach
    void setUp() { occurs = new Occurs_3();}

    @Test
    public void testOccuranceOfElement(){
        int [] arr = {1, 2, 3, 4, 3, 3,2, 4, 5,4, 3,2, 5, 6, 7,6, 7, 7, 8, 9,8, 9};
      int count =   occurs.occursElement(arr, 4);
        assertEquals(3, count);
    }
}