package jpabook.jpashop.domain;

import jakarta.persistence.*;

@Entity
public class OrderItem {
    @Id @GeneratedValue
    long id;

    @Column
    int orderPrice;

    @Column
    int count;

    @ManyToOne
    @JoinColumn(name="ORDER_ID")
    Order order;

    @ManyToOne
    @JoinColumn(name="ITEM_ID")
    Item item;
}
