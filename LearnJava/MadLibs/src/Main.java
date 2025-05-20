import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //MAD LIBS Game

        Scanner scanner = new Scanner(System.in);

        String adjective1;
        String noun1;

        adjective1 = scanner.nextLine();
        noun1 = scanner.nextLine();

        System.out.println("Today I went to a" + adjective1 + "zoo.");
        System.out.println("In an exhibit, I saw a " + noun1 + '.');

        scanner.close();
    }
}