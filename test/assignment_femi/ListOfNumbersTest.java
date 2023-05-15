package assignment_femi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ListOfNumbersTest {
        ListOfNumbers listOfNumbers;
    @BeforeEach
    void setUp() {  listOfNumbers = new ListOfNumbers();}

  @Test
  public void testListOfNumbers(){
      int [] result = listOfNumbers.getListOfNumbers(12345);
      assertEquals("[1, 2, 3, 4, 5]", Arrays.toString(result));


    }


}