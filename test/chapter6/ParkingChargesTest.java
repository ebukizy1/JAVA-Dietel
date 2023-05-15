package chapter6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingChargesTest {
    ParkingCharges parking;
    @BeforeEach
    void setUp() {parking = new ParkingCharges();}

   @Test
   public void displayParkingCharges(){
        assertEquals(2.00, ParkingCharges.calculateCharges(3));
    }
 @Test
 public void checkForAbove24Cars(){
        assertEquals(16.0, ParkingCharges.calculateCharges(10));
    }
  @Test
  public void checkForAboveNegativeHours(){
        assertEquals(10.0, ParkingCharges.calculateCharges(24));
    }


}