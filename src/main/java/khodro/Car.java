package khodro;

public class Car {


        public Car(){

        }
        public Car(String brand){
            this.brand = brand;

        }

        boolean isOn;
        boolean isDoorOpen;
        double tool;
        double arz;
        String brand;

        public void roshan(){

            isOn = true;
        }
        public void khamoosh(){

            isOn = false;
        }
        public void darBazAst(){

            isDoorOpen = true;
        }
        public void darBasteAst(){

            isDoorOpen = false;
        }

        public boolean IsMoving(){
            if(isOn && !isDoorOpen){

                return true;
            }else{

                return false;
            }
        }
}
