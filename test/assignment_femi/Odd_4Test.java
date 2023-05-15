package assignment_femi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Odd_4Test {
        Odd_4 odd;
    @BeforeEach
    void setUp() {odd = new Odd_4();}

  @Test
  public void testToPrintELementInOddPosition(){
        int[] expected = {1, 3, 5, 7, 9};
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9,10};
        ArrayList <Integer> expect = new ArrayList<>();
        expect.add(1);
        expect.add(3);
        expect.add(5);
        expect.add(7);
        expect.add(9);
          ArrayList<Integer> result = odd.printOddElement(arr);
          assertEquals(expect, result);


    }

}