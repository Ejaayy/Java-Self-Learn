public class Transaction {

    // Properties / Attributes

    private Book book;
    private Date date;
    private String transactionType;

    // Method

    public Transaction(Book book, Date date, String transactionType){
        this.book = book;
        this.date = date;
        this.transactionType = transactionType;
    }

    public void viewTransaction(){

        System.out.println(String.format("%-21s| %-20s| %-20s| %-14d| %s",
                transactionType,
                book.getTitle(),
                book.getAuthor(),
                book.getDeweyDecimal(),
                date.getStringFormat()));
    }


}
