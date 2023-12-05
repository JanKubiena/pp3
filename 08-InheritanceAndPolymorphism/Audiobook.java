public class Audiobook extends Book {
    private int minutes, seconds;

    public Audiobook(String author, String title, int minutes, int seconds) {
        super(author, title);
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public void display() {
        System.out.println("Audiobook: minutes=" + minutes + ", seconds" + seconds + ", author=" + author + ", title=" + title);
    }
}
