package model;

public class Address {
    private String zip;
    private String city;
    private String street;
    private String house;
    private String appartment;

    public Address(String zip, String city, String street, String house, String appartment) {
        this.zip = zip;
        this.city = city;
        this.street = street;
        this.house = house;
        this.appartment = appartment;
    }

    public String getZip() {
        return zip;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getHouse() {
        return house;
    }

    public String getAppartment() {
        return appartment;
    }

    @Override
    public String toString() {
        return String.format("Address [zip=%s, city=%s, street=%s, house=%s, appartment=%s]", zip, city, street, house, appartment);
    }
}
