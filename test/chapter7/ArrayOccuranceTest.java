package chapter7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayOccuranceTest {
            ArrayOcc array;
    @BeforeEach
    void setUp() { array = new ArrayOcc();}



  @Test
  public void checkOcuranceInAnArrayElementTest(){
        assertEquals(3,array.checkOccurance(1));
    }
    @Test
    public void checkOcuranceAnArrayElementTest(){
        assertEquals(2,array.checkOccurance(4));
    }
    @Test
    public void checkOcuranceInArrayElementTest(){
        assertEquals(5,array.checkOccurance(6));
    }

}