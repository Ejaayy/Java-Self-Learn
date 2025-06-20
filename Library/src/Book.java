public class Book {

    // Attributes and properties
    private String title;
    private String author;
    private int deweyDecimal;
    private boolean isBorrowed;

    // Methods
    public Book(String title, String author, int dewey){
        this.title = title;
        this.author = author;
        this.deweyDecimal = dewey;
        this.isBorrowed = false;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    public void viewBook(){

    }
}
