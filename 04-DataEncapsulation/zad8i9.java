public class zad8i9 {
    public static void main(String[] args) {
        
        DrivingLicence dl = new DrivingLicence();
        dl.name = "Jack";
        dl.surname = "Smith";
        dl.address = "al. Jana Pawla II 49";
        dl.city = "Sosnowiec";
        dl.postalCode = "69-532";
        dl.category = "B2";
        dl.issueYear = 2027;
        dl.licenceNumber = 123456;

        System.out.println(dl.displayLicence());
    }
}
