package chapter7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class OldNumbersTest {
        OldNumbers even;
    @BeforeEach
    void setUp() {even = new OldNumbers();}


  @Test
  public void testNumberIsEven(){
       int [] evenNumbers = even.findEvenNumbers(1,2,3,4,5,6,7,9);
       assertEquals("[2, 4, 6, 8]", Arrays.toString(evenNumbers));

    }
}