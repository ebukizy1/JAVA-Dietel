//package assignment_femi;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import java.util.ArrayList;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class ConcatenateTwoArrayTest {
//    ConcatenateTwoArray concatenate;
//    @BeforeEach
//    void setUp() { concatenate = new ConcatenateTwoArray();}
//
//
//  @Test
//  public void testConcatenatedArrays(){
//        ArrayList<Character> expected = new ArrayList<> ();
//        expected.add('1');
//        expected.add('2');
//        expected.add('3');
//        expected.add('a');
//        expected.add('b');
//        expected.add('c');
//        int [] arr = {1, 2, 3};
//        char [] arrays = {'a', 'b', 'c'};
//
//        ArrayList<Character> result = concatenate.ConcatenatingTwoArrays(arr, arrays);
//        assertEquals( expected, result);
//
//
//  }
//
//
//}