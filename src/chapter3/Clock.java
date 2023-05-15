package chapter3;
public class Clock {
    private int hour;
    private int minute;
    private int seconds;
    public Clock(int hour, int minute, int seconds){
        if (hour > 23)hour = 0;
        else if (hour < 0) hour = 0;
        this.hour=hour;
        if (minute >= 60 || minute < 0) minute = 0;
        this.minute=minute;
        if(seconds>60 || seconds <0)seconds= 0;
        this.seconds=seconds;
    }
    public void setHour(int hour) {
        if (hour > 23) hour = 0;
        else if (hour < 0) hour = 0;
        this.hour = hour;
    }
    public int getHour() {
        return hour;
    }
    public void setMinute(int minute) {
        if (minute >= 60 || minute < 0) minute = 0;
        this.minute = minute;
    }
    public int getMinute() {
        return minute;
    }
    public void setSeconds(int seconds) {
        if(seconds>60 || seconds <0)seconds= 0;
    this.seconds=seconds;
    }
    public int getSeconds() {
    return seconds;
    }
    public void displayTime(){
        System.out.println("my time is " + hour +":" + minute + ":" + seconds+" ");
    }

}