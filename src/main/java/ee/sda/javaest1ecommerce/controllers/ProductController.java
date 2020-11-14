package ee.sda.javaest1ecommerce.controllers;

import ee.sda.javaest1ecommerce.dtos.ProductInDTO;
import ee.sda.javaest1ecommerce.dtos.ProductOutDTO;
import ee.sda.javaest1ecommerce.entities.Product;
import ee.sda.javaest1ecommerce.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "*")
@RequiredArgsConstructor
@RestController
@RequestMapping("/product")
public class ProductController {

    final ProductService service;

    @GetMapping("/all")
    List<ProductOutDTO> getAllProducts(){
        List<ProductOutDTO> productOutDTOS = new ArrayList<>();
        Iterable<Product> productIterable = service.getAllProducts();
        productIterable.forEach(product -> {
            ProductOutDTO dto = ProductOutDTO.builder()
                    .description(product.getDescription())
                    .name(product.getName())
                    .price(product.getPrice())
                    .rating(product.getRating())
                    .build();
            productOutDTOS.add(dto);
        });
        return productOutDTOS;
    }

    @PostMapping("/create")
    ProductOutDTO createProduct(@RequestBody ProductInDTO productInDTO){
        return service.save(productInDTO);
    }

}
