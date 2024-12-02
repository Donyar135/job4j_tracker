package ru.job4j.stream;

public class Profile {
    private Address address;
    private String city;

    public Profile(Address address, String city) {
        this.address = address;
        this.city = city;
    }

    public Address getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }
}