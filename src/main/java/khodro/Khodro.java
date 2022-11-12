package khodro;

public abstract class Khodro {

    boolean isOn;

    public void roshan(){

        isOn = true;
    }
    public void khamoosh(){

        isOn = false;
    }
    public abstract boolean IsMoving();

    public abstract String getBrand();
}
