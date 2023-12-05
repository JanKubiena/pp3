public class Book {
    String author, title;

    public Book(String author, String title){
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void display() {
        System.out.println("Book: author=" + author + ", title=" + title); 
    }
    
}
