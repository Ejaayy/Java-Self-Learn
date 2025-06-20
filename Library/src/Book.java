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
        System.out.println("Title: " + title + " | Author: " + author + " | Dewey Decimal: " + deweyDecimal
                       + " | Status: " + (this.isBorrowed ? "Borrowed" : "Available"));
    }

    public boolean isBorrowed(){
        return this.isBorrowed;
    }
    
    public String getTitle() {
        return title;
    }

    public int getDeweyDecimal() {
        return deweyDecimal;
    }

    public String getAuthor() {
        return author;
    }
}
