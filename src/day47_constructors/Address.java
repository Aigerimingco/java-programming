package day47_constructors;

public class Address {
    private String street, city, state, zipcode, country = "USA";

    public Address() {
        System.out.println("Address constructor");
        street = " 123 unknown street";
        city = "java";
        state = "WS";
        zipcode = "00000";
    }


    public String toString() {
        return street + ", " + city + ", " + state + " " + zipcode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}