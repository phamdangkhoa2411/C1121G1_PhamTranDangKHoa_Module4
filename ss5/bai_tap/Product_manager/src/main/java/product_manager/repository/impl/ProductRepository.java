package product_manager.repository.impl;

import org.springframework.stereotype.Repository;
import product_manager.model.Product;
import product_manager.repository.BaseRepository;
import product_manager.repository.IProductRepository;

import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository implements IProductRepository {
    @Override
    public List<Product> findAll() {
        TypedQuery<Product> typedQuery =
                BaseRepository.entityManager.createQuery("select p from product p", Product.class);
        return typedQuery.getResultList();
    }

    @Override
    public void save(Product product) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        if (product.getId() == null) {
            BaseRepository.entityManager.persist(product);
        } else {
            BaseRepository.entityManager.merge(product);
        }
        entityTransaction.commit();
    }

    @Override
    public Product findById(Integer id) {
        return BaseRepository.entityManager.find(Product.class, id);
    }

    @Override
    public void remove(Integer id) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.remove(this.findById(id));
        entityTransaction.commit();
    }

    @Override
    public List<Product> searchByName(String name) {

            List<Product> productList = new ArrayList<>(findAll());
            List<Product> products = new ArrayList<>();
            for (Product product : productList) {
                if (product.getName().contains(name)) {
                    products.add(product);
                }
            }
            return products;
    }

}
