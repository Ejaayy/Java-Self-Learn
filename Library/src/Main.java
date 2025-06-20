import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.In);
        Menu menu = new Menu(scanner, 10);
        menu.run();
        scanner.close();

    }

}
