package chapter2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MyClassTest {
            MyClass myClass;
    @BeforeEach
    void setUp() { myClass = new MyClass();}


 @Test
 public  void testGivenAnArray(){
        int [] arr = {1,2,3,4};
        int []  arr1 = {5,6, 7};
       int [] result = myClass.sortArray(arr, arr1);
       assertEquals(1234, Arrays.toString(result));



    }
}