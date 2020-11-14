package ee.sda.javaest1ecommerce.dtos;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ProductOutDTO {

    String name;
    Integer price;
    Integer rating;
    String description;

}
