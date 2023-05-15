package chapter3;

public class ClockMain {
    public static void main(String[] args) {
        Clock clock = new Clock(68,45,68);
        System.out.println("my time in seconds is " + clock.getSeconds());
        System.out.println("my time in hour is "+ clock.getHour());
        System.out.println("my minute in minute " + clock.getMinute());
    }
}
