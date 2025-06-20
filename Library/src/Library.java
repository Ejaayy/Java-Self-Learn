import java.util.ArrayList;

public class Library {

    // Attributes / Properties
    public ArrayList<Book> books;
    public ArrayList<Transaction> transactionRecord;

    public Library(ArrayList<Book> books){
        this.books = books;
        transactionRecord = new ArrayList<>();
    }

    public Book searchBook(String bookTitle){

        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(bookTitle)) {
                return book;
            }
        }

        return null;
    }

    public boolean borrowBook(String bookTitle, String inputDate){

        Book foundBook = searchBook(bookTitle);

        if(foundBook != null && !foundBook.isBorrowed()){
            foundBook.setBorrowed(true);
            Date date = new Date(inputDate);
            Transaction transaction = new Transaction(foundBook, date, "BORROW");
            transactionRecord.add(transaction);
            return true;
        }
        else{
            return false;
        }
    }

    public boolean returnBook(String bookTitle, String inputDate){

        Book foundBook = searchBook(bookTitle);

        if(foundBook != null && foundBook.isBorrowed()){
            foundBook.setBorrowed(false);
            Date date = new Date(inputDate);
            Transaction transaction = new Transaction(foundBook, date, "RETURN");
            transactionRecord.add(transaction);
            return true;
        }
        else{
            return false;
        }
    }

    public void viewTransactionList(){
        System.out.println();
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println("Transaction Type     | Title               | Author              | Dewey Decimal |   Date");
        System.out.println("----------------------------------------------------------------------------------------------");
        for (int i = transactionRecord.size() - 1; i >= 0; i--) {
            transactionRecord.get(i).viewTransaction();
        }
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println();
    }



}
