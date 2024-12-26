package jpabook.jpashop.domain;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address {
    String city;
    String street;
    String zipcode;

    public Address(String city, String street, String zipcode) {
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }
}
