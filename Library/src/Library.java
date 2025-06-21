import java.util.ArrayList;

public class Library {

    // Attributes / Properties

    public ArrayList<Book> books;
    public ArrayList<Transaction> transactionRecord;

    // Methods

    public Library(ArrayList<Book> books){
        this.books = books;
        transactionRecord = new ArrayList<>();
    }

    public Book searchBook(String bookTitle){

        // Loop for searching the Library based on Book Title
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(bookTitle)) {
                return book;
            }
        }

        return null;
    }

    public boolean borrowBook(String bookTitle, String inputDate){

        //Finding the book  in library
        Book foundBook = searchBook(bookTitle);

        //Checks status of the Book if it exists / isBorrowed
        if(foundBook != null && !foundBook.isBorrowed()){
            foundBook.setBorrowed(true);
            Transaction transaction = new Transaction(foundBook, inputDate, "BORROW");
            transactionRecord.add(transaction);
            return true;
        }
        else{
            return false;
        }
    }

    public boolean returnBook(String bookTitle, String inputDate){

        //Finding the book  in library
        Book foundBook = searchBook(bookTitle);

        //Checks status of the Book if it exists / isBorrowed
        if(foundBook != null && foundBook.isBorrowed()){
            foundBook.setBorrowed(false);
            Transaction transaction = new Transaction(foundBook, inputDate, "RETURN");
            transactionRecord.add(transaction);
            return true;
        }
        else{
            return false;
        }
    }

    public void viewTransactionList(){

        //UI for viewing the Transaction Record
        System.out.println();
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println("Transaction Type     | Title               | Author              | Dewey Decimal |   Date");
        System.out.println("----------------------------------------------------------------------------------------------");

        /*
        Loops through the transaction list starting from the end so that
        the most recent transaction will first show up
        */
        for (int i = transactionRecord.size() - 1; i >= 0; i--) {
            transactionRecord.get(i).viewTransaction();
        }

        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println();
    }
}
