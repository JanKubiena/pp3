public class DrivingLicence2 {
    private String name, surname, address, city, postalCode, category;
    private int issueYear, licenceNumber;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        String output = name.substring(0,1).toUpperCase() + name.substring(1);
        this.name = output;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getPostalCode() {
        return postalCode;
    }
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public int getIssueYear() {
        return issueYear;
    }
    public void setIssueYear(int issueYear) {
        if (issueYear >= 1980 && issueYear <= 2023) {
            this.issueYear = issueYear;
        } 
    }
    public int getLicenceNumber() {
        return licenceNumber;
    }
    public void setLicenceNumber(int licenceNumber) {
        this.licenceNumber = licenceNumber;
    }

    public String toString() {
        return "Driving licence data: name=" + name + ", surname=" + surname + ", address=" + address + ", city=" + city
                + ", postalCode=" + postalCode + ", category=" + category + ", issueYear=" + issueYear
                + ", licenceNumber=" + licenceNumber;
    } 
}
