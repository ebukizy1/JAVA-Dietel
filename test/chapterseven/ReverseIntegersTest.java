package chapterseven;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ReverseIntegersTest {
        ReverseIntegers reverse;
    @BeforeEach
    void setUp() {reverse = new ReverseIntegers();}

   @Test
   public void testReverseIntegers(){
      int [] newValue = reverse.reverseIntegers(12, 331, 442, 443,338,224, 113, 339, 22);
        assertEquals(111, Arrays.toString(newValue));
    }
}