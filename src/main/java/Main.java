import khodro.Car;

import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static java.lang.System.*;

public class Main {
    public static void main(String[] args){

        for (int index = 0; index < args.length; index++) {

            out.println(args[index]);

        }

        String brand = args[0];
        String ginjayeshSandogh = args[1];
        String noeDande = args[2];


        Car car = new Car(brand, parseInt(ginjayeshSandogh),noeDande);


        car.roshan();
        car.darBasteAst();

        if(car.IsMoving()){
            out.println("car is moving");
        }else {
            out.println("car is not moving");
        }

        out.println(car.getBrand());

        Scanner scanner = new Scanner(in);

        out.println("whats ur name");
        String name = scanner.nextLine();

        out.println("whats ur age");
        String age = scanner.nextLine();

        out.println("whats ur city");
        String city = scanner.nextLine();

        out.println("my name is "+name+" and im "+age+" years old and i live in "+city);


    }
}
