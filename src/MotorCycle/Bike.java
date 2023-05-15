package MotorCycle;

public class Bike {
    private boolean turnOn;
     private int accelerate;
    private boolean status;
     int speed;



    public void isOn() {
        status = true;
    }
    public boolean turnOn() {
        return status;
    }
    public void isOff() {
        status = false;
    }
    public void accelerate(int gear1) {
        if (gear1 > 0) {
            if (gear1 < 20)
                gear1 = speed + 1;
        }
    }
    public int getSpeed() {
        return speed;
    }
//    public int accelerate() {
//        if (gear <= 20) gear1++;
//        return gear1;
//    }
}
