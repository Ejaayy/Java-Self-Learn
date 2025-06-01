import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        //SHOPPING CART PROGRAM

        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("What item would you like to buy? ");
        item = scanner.nextLine();

        System.out.print("What is the price of this item? ");
        price = scanner.nextDouble();

        System.out.print("How many would you like?");
        quantity = scanner.nextInt();

        total = price * quantity;

        System.out.println("Your order is " + quantity + " " + item);
        System.out.printf("%.3f", total);
        //System.out.println("Your total is " + currency + total);

        scanner.close();
    }
}
