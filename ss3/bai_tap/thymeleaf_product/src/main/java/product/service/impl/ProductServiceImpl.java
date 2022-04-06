package product.service.impl;

import product.model.Product;
import product.service.IProductService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements IProductService {
    private static final Map<Integer, Product> products = new HashMap<>();

    static {
        products.put(1, new Product(1, "xe may", "40.000.000", "2 bánh", "honda"));
        products.put(2, new Product(2, "xe moto", "400.000.000", "2 bánh", "honda"));
        products.put(3, new Product(3, "xe oto", "4.000.000.000", "mui trần", "BMW"));
        products.put(4, new Product(4, "xe tải ", "400.000.000", "3.5 tấn", "huyndai"));
        products.put(5, new Product(5, "xe bò ", "4.000.000", "3.5 tấn", "huyndai"));

    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getMa(), product);
    }

    @Override
    public Product findById(int ma) {
        Product product = new Product();
        for (Product product1 : products.values()){
            if(product1.getMa()==ma){
                product =product1;
            }
        }
        return product;
    }

    @Override
    public void update(int ma, Product product) {
        products.put(ma, product);
    }

    @Override
    public void remove(int ma) {
        products.remove(ma);
    }

    @Override
    public List<Product> search(String name) {
        List<Product> productList = new ArrayList<>(findAll());
        List<Product> products = new ArrayList<>();
        for (Product product : productList) {
            if (product.getTen().contains(name)) {
                products.add(product);
            }
        }
        return products;
    }
}
