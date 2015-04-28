package training.printing;

/**
 * Created by sczerwinski on 2015-04-27.
 */
public class Machine implements Imachine {

    protected boolean isOn;
    public Machine(boolean isOn){
        this.isOn=isOn;
    }
    public void turnOn(){
        isOn=true;
//        System.out.println("Machine is on");
    }
    public void turnOff(){
        isOn=false;
    }

    @Override
    public boolean isOn() {
        return isOn;
    }
}
