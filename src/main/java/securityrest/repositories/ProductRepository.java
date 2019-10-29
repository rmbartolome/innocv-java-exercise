package securityrest.repositories;

import securityrest.models.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, String> {
	
	@Override
    void delete(Product deleted);
}
