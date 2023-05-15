package assignment_femi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Reverse_2Test {
    Reverse_2 reverse;
    @BeforeEach
    void setUp() {
    reverse = new Reverse_2();}

  @Test
  public void testReverseAnArray(){
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int [] newValue = reverse.reverseBalance(arr);
        assertEquals("[9, 8, 7, 6, 5, 4, 3, 2, 1]", Arrays.toString(newValue));

    }
}