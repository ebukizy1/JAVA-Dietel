package television;

public class Television {
    private boolean isOn;
    private int volume = 0;
    private int channel  ;



    public boolean isOn() {
    return isOn;
    }
    public void toggleOn() {
        isOn =!isOn;
    }
public int getVolume () {
    return volume;
}
    public void increaseVolume( ) {
        if(volume <= 30 && isOn == true)volume++;
        }
        public void decreaseVolume(){
        volume--;
        }
        public int channel() {
            return channel;
        }
    public void setChannel() {
        if (isOn == true)  channel++;
    }

    public String tvMode(int tvMode){
        if(tvMode ==  1){
            return "HDMI MODE";
        }else if(tvMode == 2) {
            return "USB MODE";
        }else if(tvMode == 3){
            return  "CAST MODE";
        }else{
             return "SET SCAN TV";
        }
    }



}
