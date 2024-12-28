package jpabook.jpashop.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Member {
    @Id @GeneratedValue
    @Column(name = "member_id")
    private long id;

    private String name;

    @Embedded
    private Address address;

    //mappedByはリーレーションの持ち主ではなく、orderクラスのmember変数を向いていると
    @OneToMany(mappedBy = "member")
    private List<Order> orders = new ArrayList<>();
}
