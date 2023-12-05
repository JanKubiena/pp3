import java.util.ArrayList;

public class Library {
    static ArrayList<Book> books = new ArrayList<>();

    public static void main(String[] args) {

        Book b1 = new Book("Adam Mickiewicz", "Pand Tadeusz");
        Ebook eb1 = new Ebook("Tolkien", "hobbit", "tolkien-hobbit.cos");
        Audiobook ab1 = new Audiobook("J.K Rowling", "Harry Potter", 136, 47);

        books.add(b1);
        books.add(eb1);
        books.add(ab1);

        for(Book i: books){
            i.display();
        }
    }
}
