import org.junit.jupiter.api.Test;

public class CarTest {
    class Car{

        boolean isCarOn;
        boolean isCarsDoorOpen;
        double tool;
        double arz;
        String brand;

        void roshan(){
            System.out.println("car is on");
            isCarOn = true;
        }
        void khamoosh(){
            System.out.println("car is off");
            isCarOn = false;
        }
        void darBazAst(){
            System.out.println("cars door is open");
            isCarsDoorOpen = true;
        }
        void darBasteAst(){
            System.out.println("cars door is closed");
            isCarsDoorOpen = false;
        }

        void move(){
          if(isCarOn && !isCarsDoorOpen){
              System.out.println("car is moving");
          }else{
              System.out.println("car is not moving");
          }
        }
    }
    
}
