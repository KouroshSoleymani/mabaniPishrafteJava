package khodro;

public class Car extends Khodro implements Gearbox,SandoghDar {


        public Car(){

        }
        public Car(String brand){
            this.brand = brand;

        }

        String modelDande;
        int gonjayeshSandogh;
        boolean isDoorOpen;
        double tool;
        double arz;
        String brand;

    public Car(String brand, int gonjayeshSandogh, String modelDande) {
        this.brand = brand;
        this.gonjayeshSandogh = gonjayeshSandogh;
        this.modelDande =modelDande;
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

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public String typeDande() {
        return "automatic";
    }

    @Override
    public int gonjayesh() {
        return 100;
    }
}
