package ee.sda.javaest1ecommerce.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ProductInDTO {

    String name;
    Integer price;
    Integer rating;
    String description;
    String picture;
}
