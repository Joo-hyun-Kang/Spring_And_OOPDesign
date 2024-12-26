package jpabook.jpashop.domain;

import jakarta.persistence.*;

@Entity
public class CategoryItem {
    @Id
    @GeneratedValue
    long id;

    @ManyToOne
    @JoinColumn(name = "ITEM_ID")
    Item item;

    @ManyToOne
    @JoinColumn(name = "CATEGORY_ID")
    Category category;
}
