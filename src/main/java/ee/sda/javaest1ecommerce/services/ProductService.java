package ee.sda.javaest1ecommerce.services;

import ee.sda.javaest1ecommerce.dtos.ProductInDTO;
import ee.sda.javaest1ecommerce.dtos.ProductOutDTO;
import ee.sda.javaest1ecommerce.entities.Product;
import ee.sda.javaest1ecommerce.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ProductService {

    final ProductRepository repository;

    public Iterable<Product> getAllProducts(){
        return repository.findAll();
    }

    public ProductOutDTO save(ProductInDTO productInDTO){
        Product product = new Product();
                product.setName(productInDTO.getName());
                product.setDescription(productInDTO.getDescription());
                product.setPrice(productInDTO.getPrice());
                product.setRating(productInDTO.getRating());
        repository.save(product);
        return ProductOutDTO.builder()
                .rating(product.getRating())
                .price(product.getPrice())
                .name(product.getName())
                .description(product.getDescription())
                .build();
    }
}
