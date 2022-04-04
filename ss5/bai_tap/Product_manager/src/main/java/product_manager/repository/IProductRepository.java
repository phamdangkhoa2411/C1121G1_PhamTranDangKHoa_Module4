package product_manager.repository;

import product_manager.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> findAll();

    void save(Product product) ;

    Product findById(Integer id);

    void remove(Integer id);

    List<Product> searchByName(String name);
}
