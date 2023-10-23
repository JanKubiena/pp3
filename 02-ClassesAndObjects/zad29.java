public class zad29 {
    public static void main(String[] args) {

        Counter c1 = new Counter();
        Counter c2 = new Counter();

        c1.increseBy10();
        c1.increseBy10();
        c1.increseBy1();
        c1.increseBy1();
        c1.increseBy1();
        System.out.println("Licznik 1 wynosi: "+c1.value);

        c2.decreseBy10();
        c2.decreseBy10();
        c2.decreseBy10();
        c2.decreseBy10();
        c2.decreseBy10();
        c2.increseBy1();
        c2.increseBy1();
        c2.increseBy1();
        System.out.println("Licznik 2 wynosi: "+c2.value);

    }
}
