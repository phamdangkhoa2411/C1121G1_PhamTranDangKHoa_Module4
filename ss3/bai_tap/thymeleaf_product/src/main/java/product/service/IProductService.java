package product.service;

import product.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();

    void save(Product product );

     Product findById(int ma);

    void update(int ma, Product product  );

    void remove(int ma);

 List<Product> search(String name);

}

