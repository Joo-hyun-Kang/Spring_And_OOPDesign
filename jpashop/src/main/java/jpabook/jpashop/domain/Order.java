package jpabook.jpashop.domain;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Order {
    @Id @GeneratedValue
    long id;

    @Column
    Date orderDate;

    @Enumerated(EnumType.STRING)
    OrderStatus status;

    @ManyToOne
    @JoinColumn(name="MEMBER_ID")
    Member member;

    @OneToOne
    @JoinColumn(name="DELIVERY_ID")
    Delivery delivery;

    @OneToMany(mappedBy = "order")
    List<OrderItem> orderItems;
}
