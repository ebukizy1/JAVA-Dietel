package scanFroastAc;
public class AirConditioner {
    private boolean isOn;
    private int temperature = 16;


    public boolean isOn() {
        return isOn;
    }
    public void toggleOn() {
            isOn = !isOn;
        }
    public int getTemperature() {
        return temperature;
    }
    public void increaseTemperature() {
        if(temperature <30  && isOn == true) temperature++;
    }
    public void decreaseTemperature() {
        temperature --;
    }
}

//    }
//    public void increaseTemperature(int number) {
//        temperature  ++;
//    }
//    public void decreaseTemperature(int number1) {
//        temperature--;
//    }
//    public int getTemperature() {
//        return temperature;
//    }
//    public void setTemperature(int temperature) {
//        if(temperature<=30) {
//            this.temperature = temperature;
//        }
//    }
//    public void setProductName(String name) {
//        this.name =name;
//    }
//    public String getProductName() {
//        return name;
//    }
//}




