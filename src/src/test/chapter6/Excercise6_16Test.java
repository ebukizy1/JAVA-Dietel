package src.test.chapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Excercise6_16Test {
        Excercise6_16 multiply;
    @org.junit.jupiter.api.BeforeEach
    void setUp() { multiply = new Excercise6_16();}

    @Test
    public void testIfIntegersIsMultipleOfTheOther(){
        assertEquals(true, multiply.isMultiple(20, 5));
    }
    @Test
    public void testMultipleIntegersIsMultipleOfTheOtherSecondNumber(){
        assertEquals(true, multiply.isMultiple(100, 2));
        assertEquals(false, multiply.isMultiple(13,7));
        assertEquals(true, multiply.isMultiple(65,5));
    }

}