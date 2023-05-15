package chapter6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestVoidTest {
    TestVoid test;
    @BeforeEach
    void setUp() {test = new TestVoid();}

    @Test
        public void testVoidMethodWithStudentGrade(){
       assertEquals("B", test.checkStudentGrade(85));
    }
}