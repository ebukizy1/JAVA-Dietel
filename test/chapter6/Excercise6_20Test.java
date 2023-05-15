package chapter6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Excercise6_20Test {
        Excercise6_20 year;
    @BeforeEach
    void setUp() {year = new Excercise6_20();}

   @Test
   public void testGetUserInputToGetLeapYear(){
        assertEquals(true,year.isLeapYear(2020));



    }

}