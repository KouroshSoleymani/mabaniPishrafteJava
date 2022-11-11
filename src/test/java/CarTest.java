import khodro.Car;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    void CarMustMoveWhenDoorsAreClosed() {

        Car benz = new Car("benz");
        Car volvo = new Car("volvo");


        boolean isCarMoving = benz.IsMoving();
        volvo.roshan();
        boolean isCarMoving1 = volvo.IsMoving();

        Assertions.assertFalse(isCarMoving);
        Assertions.assertTrue(isCarMoving1);

//        car.Car car = new car.Car();
//        car.roshan();
//        car.khamoosh();
//
//        System.out.println("is car on? " + car.isCarOn);
//
//        car.Car car1 = new car.Car("ferrari");
//        System.out.println(car1.brand);

    }


}