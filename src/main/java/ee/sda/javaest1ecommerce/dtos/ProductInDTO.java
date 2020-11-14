package ee.sda.javaest1ecommerce.dtos;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ProductInDTO {

    String name;
    Integer price;
    Integer rating;
    String description;
    String picture;
}
