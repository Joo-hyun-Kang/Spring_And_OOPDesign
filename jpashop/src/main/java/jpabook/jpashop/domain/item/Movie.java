package jpabook.jpashop.domain.item;

import jakarta.persistence.DiscriminatorValue;
import lombok.Getter;
import lombok.Setter;

@DiscriminatorValue("M")
@Getter @Setter
public class Movie extends Item {
    private String director;
    private String actor;
}
