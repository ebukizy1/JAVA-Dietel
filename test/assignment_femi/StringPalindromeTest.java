package assignment_femi;

import easterTask.Palindrome;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringPalindromeTest {
    StringPalindrome palindrome;
    @BeforeEach
    void setUp() { palindrome = new StringPalindrome();}


   @Test
   public void testStringIsPalindrome(){
      boolean reverse = palindrome.reverseString("civic");
      assertTrue(reverse);
    }
}