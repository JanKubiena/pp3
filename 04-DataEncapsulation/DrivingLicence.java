public class DrivingLicence {
    public String name, surname, address, city, postalCode, category;
    public int issueYear, licenceNumber;

    public String displayLicence() {
        return "DrivingLicence [name=" + name + ", surname=" + surname + ", address=" + address + ", city=" + city
                + ", postalCode=" + postalCode + ", category=" + category + ", issueYear=" + issueYear
                + ", licenceNumber=" + licenceNumber + "]";
    }
}
