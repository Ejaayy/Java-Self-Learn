import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    // Attributes and Properties

     public Library library;
     public ArrayList<Book> books;
     public Scanner scanner;

     // Methods
    public Menu(Scanner scanner, int numBooks){
        this.scanner = scanner;
        this.books = new ArrayList<>();
    }
+
    public void run(){

    }

    public void inputBooks(){
        System.out.print("How many books will you enter?: ");
        int inputCount = scanner.nextInt();
        for(int i = 0; i< inputCount; i++){

        }
    }

}
