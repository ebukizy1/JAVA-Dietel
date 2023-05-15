package assignment_femi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Even_5Test {
Even_5 evenNumber;
    @BeforeEach
    void setUp() { evenNumber = new Even_5();
    }

  @Test
  public void testEvenNumbers(){
        ArrayList<Integer> expect = new ArrayList<>();
        expect.add(2);
        expect.add(4);
        expect.add(6);
        expect.add(8);
        expect.add(10);
        int [] arr= {1, 2, 3, 4, 5,6, 7, 8, 9,10};
    ArrayList<Integer> result = evenNumber.findEvenNumbers(arr);
        assertEquals(expect, result);


    }
}