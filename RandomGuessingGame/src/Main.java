import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        //NUMBER GUESSING GAME

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int randomNumber = random.nextInt(1,11);

        System.out.println("Number guessing game");
        System.out.println("Guess a number between 1-10: ");

        do{
            System.out.print("Enter a number");
            guess = scanner.nextInt();
            attempts++;

            if(guess != randomNumber){
                System.out.println("Lmao wrong as shit");
            }
            else{
                System.out.println("Damn bro");
            }

        }while(guess != randomNumber && attempts < 3);
    }
}
