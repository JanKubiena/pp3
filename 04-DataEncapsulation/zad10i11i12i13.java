public class zad10i11i12i13 {
    public static void main(String[] args) {

        DrivingLicence2 dl = new DrivingLicence2();
        dl.setName("jack");
        dl.setSurname("Smith");
        dl.setAddress("al. Jana Pawla II 49");
        dl.setCity("Sosnowiec");
        dl.setPostalCode("69-532");
        dl.setCategory("B2");
        dl.setIssueYear(2021);
        dl.setLicenceNumber(123456);

        System.out.println(dl.toString());

        dl.setIssueYear(1970);
        System.out.println(dl.getIssueYear());


    }
}
