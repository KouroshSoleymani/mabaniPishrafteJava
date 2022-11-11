package khodro;

public class Motor {
    boolean isOn;

    public void roshan(){

        isOn = true;
    }
    public void khamoosh(){

        isOn = false;
    }

    public boolean IsMoving() {
        if (isOn) {

            return true;
        } else {

            return false;
        }
    }
}
