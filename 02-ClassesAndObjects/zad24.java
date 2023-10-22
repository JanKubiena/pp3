public class zad24 {
     public static void main(String[] args) {

        int hours = 12;
        int minutes = 27;
        int mfm = minutes + hours * 60;
        int sfm = mfm * 60;

        System.out.printf("%d:%d\n", hours, minutes);
        System.out.println("minutes from midnight: "+mfm);
        System.out.println("seconds from midnight: "+sfm);
     }
}