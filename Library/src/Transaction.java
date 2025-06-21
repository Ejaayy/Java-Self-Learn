public class Transaction {

    // Properties / Attributes

    private Book book;
    private Date date;
    private String transactionType;

    // Method

    public Transaction(Book book, String inputDate, String transactionType){

        //Initializes transaction details, when a new transaction is made
        this.book = book;
        this.date = new Date(inputDate);
        this.transactionType = transactionType;
    }

    public void viewTransaction(){
        //UI for viewing a transaction, showing all the details
        System.out.println(String.format("%-21s| %-20s| %-20s| %-14d| %s",
                transactionType,
                book.getTitle(),
                book.getAuthor(),
                book.getDeweyDecimal(),
                date.getStringFormat()));
    }

}
