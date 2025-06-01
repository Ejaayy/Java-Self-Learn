import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        //JAVA BANKING PROGRAM

        //DECLARE VARIABLES
        double balance = 1000;
        boolean isRunning = true;
        int choice;

        while(isRunning){

            //DISPLAY MENU
            System.out.println("------------------");
            System.out.println("Banking Program");
            System.out.println("------------------");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("------------------");

            //GET AND PROCESS USERS CHOICE
            System.out.print("Enter choice (1-4): ");
            choice = scanner.nextInt();

            switch(choice){
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw();
                case 4 -> isRunning = false;
                default -> System.out.println("INVALID CHOICE");
            }
        }


        //EXIT MESSAGE
        scanner.close();
    }

    //showBalance()
    static void showBalance(double balance){
        System.out.printf("Your remaining balance is: $%.2f\n", balance);
    }

    //deposit()
    static double deposit(){
        double amount = 0;
        System.out.println("Enter mount to deposit: ");
        amount = scanner.nextDouble();

        if (amount < 0){
            System.out.println("Amount can't be negative");
            return 0;
        }
        else{
            System.out.printf("Note: Deposit of $%.2f has been made", amount);
            return amount;
        }


    }

    //withdraw()
    static double withdraw(){
        double amount;
        System.out.println("Enter amount to Withdraw: ");
        amount = scanner.nextDouble();

        if(amount < 0){
            System.out.println("Amount can't be negative");
            return 0;
        }
        else{
            System.out.printf("Withdrawal of $%.2f has been made", amount);
            return amount;
        }
    }
}
