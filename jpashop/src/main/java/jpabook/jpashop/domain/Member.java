package jpabook.jpashop.domain;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Member {
    @Id @GeneratedValue
    long id;

    @Column
    String name;

    @Embedded
    Address address;

    @OneToMany(mappedBy = "member")
    List<Order> orders = new ArrayList<>();
}
