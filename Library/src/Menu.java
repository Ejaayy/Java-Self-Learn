import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    // Attributes and Properties

     public Library library;
     public ArrayList<Book> books;
     public Scanner scanner;

     // Methods

    public Menu(){
        this.scanner = new Scanner(System.in);
        this.books = new ArrayList<>();
    }

    public void run(){

        this.inputBooks();
        library = new Library(this.books);
        boolean isRunning = true;

        while(isRunning){
            int input;
            System.out.println("Welcome to the Library");
            System.out.println("-------------------------------------------");
            System.out.println("1. Borrow a Book");
            System.out.println("2. Return a Book");
            System.out.println("3. View Transaction Record");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");
            input = this.scanner.nextInt(); //Didn't take the \n
            scanner.nextLine(); //For input buffer
            System.out.println("\n-------------------------------------------");

            switch (input){
                case 1:
                    System.out.print("Input Book Name: ");
                    String borrowBook = scanner.nextLine();
                    System.out.print("Input Borrow Date [DD/MM/YYYY]: ");
                    String borrowDate = scanner.nextLine();
                    boolean borrowStatus = library.borrowBook(borrowBook, borrowDate);
                    if(borrowStatus){
                        System.out.println("Borrowing Successful!");
                    }
                    else{
                        System.out.println("Borrowing Failed!");
                    }
                    break;
                case 2:
                    System.out.print("Input Book Name: ");
                    String returnBook = scanner.nextLine();
                    System.out.print("Input return Date [DD/MM/YYYY]: ");
                    String returnDate = scanner.nextLine();
                    boolean returnStatus = library.returnBook(returnBook, returnDate);
                    if(returnStatus){
                        System.out.println("Return Successful!");
                    }
                    else{
                        System.out.println("Return Failed!");
                    }
                    break;
                case 3:
                    library.viewTransactionList();
                    break;
                case 4:
                    isRunning = false;
                    break;
            }

        }

        scanner.close();
    }

    public void inputBooks(){
        System.out.println("-----Book Initialization-----");
        System.out.print("How many books will you enter?: ");
        int inputCount = scanner.nextInt();

        for(int i = 0; i< inputCount; i++){
            scanner.nextLine(); //For input buffer
            System.out.print("Enter title: ");
            String bookTitle = scanner.nextLine();

            System.out.print("Enter Author: ");
            String authorName = scanner.nextLine();

            System.out.print("Enter DeweyDecimal: ");
            int deweyDecimal = scanner.nextInt();

            Book book = new Book(bookTitle, authorName, deweyDecimal);
            books.add(book);
            System.out.println("-------------------------");
        }

    }

}
