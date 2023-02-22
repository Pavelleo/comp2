import javax.naming.TimeLimitExceededException;

public class Book {

    // Your variables declaration here
    private String author, title;
    private int year;

    public Book(String author, String title, int year) {
        // Your code here
        this.author = author;
        this.title = title;
        this.year = year;
    }

    public String getAuthor() {
        // Your code here
        return this.author;
    }

    public String getTitle() {
        // Your code here
        return this.title;
    }

    public int getYear() {
        // Your code here
        return this.year;
    }

    public boolean equals(Book other) {
        // Your code here
        if (this.author == other.getAuthor() && this.title == other.getTitle() && this.year == other.getYear()) {
            return true;
        } else
            return false;
    }

    public String toString() {
        // Your code here
        return this.author + ":" + this.title + " (" + this.year + ")";
    }
}