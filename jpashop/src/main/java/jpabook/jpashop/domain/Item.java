package jpabook.jpashop.domain;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Item {
    @Id @GeneratedValue
    long id;

    @Column
    String name;

    @Column
    int price;

    @Column
    int stockQuantity;

    @OneToMany(mappedBy = "item")
    List<OrderItem> orderItems;

    @OneToMany(mappedBy = "item")
    List<CategoryItem> categoryItems;
}
