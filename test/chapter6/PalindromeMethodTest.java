package chapter6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeMethodTest {
        PalindromeMethod palindrome;
    @BeforeEach
    void setUp() {palindrome = new PalindromeMethod();}
   @Test
   public void reverseTest(){
        assertEquals(11211,palindrome.reverse(11211));
    }
@Test
public void testNegativeNumbers(){
        assertEquals(11211,palindrome.reverse(-11211));
}



}