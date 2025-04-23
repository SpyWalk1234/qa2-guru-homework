package model;

public class AddressClient {
    private String city;
    private String street;
    private int houseNr;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouseNr() {
        return houseNr;
    }

    public void setHouseNr(int houseNr) {
        this.houseNr = houseNr;
    }

    public AddressClient(String city, String street, int houseNr) {
        this.city = city;
        this.street = street;
        this.houseNr = houseNr;
    }
}
