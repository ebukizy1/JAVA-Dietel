package src.test.Task;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class taskSumNumsTest {
        taskSumNums task;
    @BeforeEach
    void setUp() {task = new taskSumNums();}

  @Test
  public void testSumOfTwoNumbers(){
       int[] storedValue =  task.findSumOfNumbers(12);
       assertEquals(1, Arrays.toString(storedValue));
    }

}