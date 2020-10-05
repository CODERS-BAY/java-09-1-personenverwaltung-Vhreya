package com.codersbay;

public class Address {
    public String street;
    public int houseNumber;
    public String city;
    public int postCode;

    public Address( String city, String street, int houseNumber,  int postCode){
        this.street = street;
        this.houseNumber = houseNumber;
        this.city = city;
        this.postCode = postCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", houseNumber=" + houseNumber +
                ", city='" + city + '\'' +
                ", postCode=" + postCode +
                '}';
    }
}
