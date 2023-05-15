package chapter6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Excerise6_17Test {
        Excerise6_17 divisible;
    @BeforeEach
    void setUp() {divisible = new Excerise6_17();}
    int [] myArray = {5,10, 15, 20, 2, 3, 40, 50, 60, 65, 100,};

    @Test
    public void testNumberIsDivisibleBy5(){
        assertEquals(true, divisible.isDivisible(myArray));
    }


    @Test
    public void checkNumberIsDivisibleBy5Test(){
        assertEquals(true, divisible.isDivisible2(445,55,60,20,80));
    }
}