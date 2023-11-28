public class zad6 {
    public static void main(String[] args) {
        Writer w = new Writer("kowalski", "jan", "barok");
        Book b = new Book("Harry Potter", 250, w);

        b = null;
    }
}
