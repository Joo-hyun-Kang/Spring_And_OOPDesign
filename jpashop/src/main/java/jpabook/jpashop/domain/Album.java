package jpabook.jpashop.domain;

import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Album extends Item {
    String artist;
    String ets;
}
