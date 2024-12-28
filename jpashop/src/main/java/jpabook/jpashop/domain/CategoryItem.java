package jpabook.jpashop.domain;

import jakarta.persistence.*;
import jpabook.jpashop.domain.item.Item;

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
