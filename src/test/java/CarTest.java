import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    void CarMustMoveWhenDoorsAreClosed() {

        Car benz = new Car("benz");
        Car volvo = new Car("volvo");


        boolean isCarMoving = benz.IsCarMoving();
        volvo.roshan();
        boolean isCarMoving1 = volvo.IsCarMoving();

        Assertions.assertFalse(isCarMoving);
        Assertions.assertTrue(isCarMoving1);

//        Car car = new Car();
//        car.roshan();
//        car.khamoosh();
//
//        System.out.println("is car on? " + car.isCarOn);
//
//        Car car1 = new Car("ferrari");
//        System.out.println(car1.brand);

    }

    class Car{

        Car(){
            System.out.println("there is a car whith no data");
        }
        Car(String brand){
            this.brand = brand;

        }

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

        boolean IsCarMoving(){
          if(isCarOn && !isCarsDoorOpen){
              System.out.println("car is moving");
              return true;
          }else{
              System.out.println("car is not moving");
              return false;
          }
        }
    }

}
