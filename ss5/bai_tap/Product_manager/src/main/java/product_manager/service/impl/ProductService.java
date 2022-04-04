package product_manager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import product_manager.model.Product;
import product_manager.repository.IProductRepository;
import product_manager.service.IProductService;

import java.util.List;

@Service
public class ProductService implements IProductService {

    @Autowired
    IProductRepository iProductRepository;

    @Override
    public List<Product> findAll() {

        return iProductRepository.findAll();
    }

    @Override
    public void save(Product product) {

        iProductRepository.save(product);
    }

    @Override
    public Product findById(Integer id) {
        return iProductRepository.findById(id);
    }

    @Override
    public void remove(Integer id) {
        iProductRepository.remove(id);
    }

    @Override
    public List<Product> searchByName(String name) {
        return iProductRepository.searchByName(name);
    }


}
