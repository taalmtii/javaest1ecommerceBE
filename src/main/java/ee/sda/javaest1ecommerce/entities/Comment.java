package ee.sda.javaest1ecommerce.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter
public class Comment {

    String comment;

    @ManyToOne
    @JoinColumn(name = "product_id")
    Product product;

}
