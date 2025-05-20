//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Name: ");
        //println() adds new line after print
        //print() doesn't add this new line

        String name = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        //nextLine() reads whole line
        //next() reads until space, like scanf

        System.out.println("Hello " + name + "!");
        System.out.println("You are " + age + " years old");

        scanner.close();
    }
}