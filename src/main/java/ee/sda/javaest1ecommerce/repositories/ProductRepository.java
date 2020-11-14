package ee.sda.javaest1ecommerce.repositories;

import ee.sda.javaest1ecommerce.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
