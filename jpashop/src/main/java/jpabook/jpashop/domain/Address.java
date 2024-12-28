package jpabook.jpashop.domain;

import jakarta.persistence.Embeddable;
import lombok.Getter;

@Embeddable
@Getter
public class Address {
    String city;
    String street;
    String zipcode;

    //`@Embeddable`はdefault constructorを`public`、 `protected`すべき
    // JPA標準の決まり（JPAがreflexなど技術に使うため）
    protected Address() {}

    public Address(String city, String street, String zipcode) {
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }
}
