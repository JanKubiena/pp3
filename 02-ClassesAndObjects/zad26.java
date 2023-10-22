public class zad26 {
    public static void main(String[] args) {

        Book b1 = new Book();
        Book b2 = new Book();
        
        b1.title = "Harry potter";
        b1.author = "J.K Rowlling";
        b1.pageNum = 350;

        b1.filpPagesFoward(75);
        b1.flipPagesBackward(25);
        b1.filpPagesFoward(350);

        System.out.println("Aktualna strona: "+b1.currentPage);
        
    }
}
