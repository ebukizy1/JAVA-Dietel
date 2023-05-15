package chapter3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class Clock2Test {
    Clock2 clock2 = new Clock2();


   @Test
   public void setHourTest(){
        clock2.setHour(23);
        clock2.getHour();
        assertEquals(23, clock2.getHour());
    }
    @Test
    public void TestiFHourWillStillEqualsTheISet(){
        clock2.setHour(12);
        clock2.getHour();
        assertEquals(12, clock2.getHour());
    }
    @Test
    public void setMinutes() {
       clock2.setMinutes();
       clock2.getMinutes();
       assertEquals(60, clock2.getMinutes());
    }


}