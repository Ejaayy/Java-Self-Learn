import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Object = An entity that holds data (attributes / properties)
        //           and can perform actions (methods )
        //            It isa a reference data type

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        Car car = new Car();
        System.out.println(car.make);
        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.price);
        System.out.println(car.isRunning);
        car.start();
    }
}
