package myExamplesTutorial;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClassWorkTest {
    ClassWork classWork;

    @BeforeEach
    void setUp() {
        classWork = new ClassWork();
    }


    @Test
    public void promptUserName() {
        assertEquals("hello emma", classWork.promptUserName("emma"));
    }


}

