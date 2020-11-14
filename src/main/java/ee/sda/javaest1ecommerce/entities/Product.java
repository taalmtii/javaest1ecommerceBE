package ee.sda.javaest1ecommerce.entities;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
public class Product {

    @Id
    @GeneratedValue
    Long id;
    String name;
    Integer price;
    Integer rating;
    String description;
    String picture;
    @OneToMany(mappedBy = "product")
    List<Comment> comments;



}
