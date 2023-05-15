package chapter7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentGradeTest {
        StudentGrade student;
    @BeforeEach
    void setUp() {    student= new StudentGrade(); }


    @Test
    public void testStudentGrade(){
        assertEquals("B", student.setStudentGrade(80));
    }
    @Test
    public void testStudentGradeAbove80(){
        assertEquals("A", student.setStudentGrade(90));
    }

    @Test
    public void testStudentGradeBelow50(){
        assertEquals("you failed the course", student.setStudentGrade(21));
    }

}