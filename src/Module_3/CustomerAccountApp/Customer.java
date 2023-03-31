package Module_3.CustomerAccountApp;public class Customer {

    private String name;
    private String address;
    private String city;
    private String zip;

    public Customer() {
        this("", "", "", "");
    }

    public Customer(String name, String address, String city, String zip) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.zip = zip;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "\tName: " + name + "\n\tAddress: " + address + "\n\tCity: " + city + "\n\tZip: " + zip;
    }
}

