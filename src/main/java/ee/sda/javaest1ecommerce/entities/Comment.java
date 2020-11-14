package ee.sda.javaest1ecommerce.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Comment {

    @Id
    @GeneratedValue
    Long id;
    String comment;

    @ManyToOne
    @JoinColumn(name = "product_id")
    Product product;

}
