package chapter6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ButterflyStringTest {
ButterflyString string;

    @BeforeEach
    void setUp() {string = new ButterflyString();}

   @Test
   public void testButterflyString(){
    String butterfly =    string.butterflySring("emmanuel.");
    assertEquals("emmanuel.", butterfly);
    }
  @Test
  public void testTestIfStringStartWithCapitalLetters(){
        String name = string.checkFirstLetters("emmanuel.");
        assertEquals("Emmanuel.", name);

    }
}