package src.test.chapter7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Maximum_MinumumTest {
    Maximum_Minumum max;
    @BeforeEach
    void setUp() {  max = new Maximum_Minumum();}
    int [] myArray = { 34, 54, 56, 67, 68, 54, 89, 50, 123, 67, 85, 45, 0};

@Test
    public void testMaximumNumber(){
        assertEquals( "1230",max.getMaximumResult(myArray));



    }
}