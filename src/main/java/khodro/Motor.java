package khodro;

public class Motor extends Khodro{


    public boolean IsMoving() {
        if (isOn) {

            return true;
        } else {

            return false;
        }
    }

    @Override
    public String getBrand() {
        return "Motor";
    }
}
