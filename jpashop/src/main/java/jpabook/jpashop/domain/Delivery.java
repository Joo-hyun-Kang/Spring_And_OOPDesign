package jpabook.jpashop.domain;

import jakarta.persistence.*;

@Entity
public class Delivery {
    @Id @GeneratedValue
    long id;

    @Embedded
    Address address;

    @Enumerated(EnumType.STRING)
    DeliveryStatus status;

    @OneToOne(mappedBy = "delivery")
    Order order;
}
