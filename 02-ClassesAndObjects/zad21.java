public class zad21 {
     public static void main(String[] args) {
        double heightInCm = 185;

        double totalInches = heightInCm / 2.54;
        int feet = (int) (totalInches / 12);
        int inches = (int) (totalInches % 12);

        System.out.println("in cm: "+heightInCm+" i.e. "+feet+" feet "+inches+" inches ");
     }
}
