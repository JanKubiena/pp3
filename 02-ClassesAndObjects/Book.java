public class Book {
    String title;
    String author;
    int pageNum;
    int currentPage = 0;

    void filpPagesFoward(int howMany) {
        currentPage = currentPage + howMany;

        if(currentPage > pageNum){
            currentPage = 0;
            System.out.println("Zamknieto ksiazke!");
        } else {
            System.out.println("Aktualna strona: "+currentPage);
        }
    }
    void flipPagesBackward(int howMany) {
        currentPage = currentPage - howMany;

        if(currentPage <= 0){
            currentPage = 0;
            System.out.println("Zamknieto ksiazke!");
        } else {
            System.out.println("Aktualna strona: "+currentPage);
        }
    }
}
