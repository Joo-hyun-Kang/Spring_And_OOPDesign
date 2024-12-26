package jpabook.jpashop.domain;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Category {
    @Id @GeneratedValue
    long id;

    @Column
    String name;

    @Column
    List<Category> child;

    @OneToMany(mappedBy = "category")
    List<CategoryItem> categoryItems;
}
