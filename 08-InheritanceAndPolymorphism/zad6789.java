public class zad6789 {
    public static void main(String[] args) {
        Book b1 = new Book("Adam Mickiewicz", "Pand Tadeusz");
        Ebook eb1 = new Ebook("Tolkien", "hobbit", "tolkien-hobbit.cos");
        Audiobook ab1 = new Audiobook("J.K Rowling", "Harry Potter", 136, 47);

        b1.display();
        eb1.display();
        ab1.display();
    }
}
