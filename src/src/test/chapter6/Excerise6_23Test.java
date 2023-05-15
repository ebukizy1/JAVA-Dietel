package src.test.chapter6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Excerise6_23Test {
        Excerise6_23 palindrome;
    @BeforeEach
    void setUp() { palindrome =  new Excerise6_23();}

    @Test
    public void testNumberIsAPalindrome(){
       assertEquals(11211, palindrome.CheckPalindrome(11211));


    }
}