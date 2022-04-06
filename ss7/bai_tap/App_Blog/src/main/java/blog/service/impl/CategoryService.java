package blog.service.impl;

import blog.model.Category;
import blog.repository.ICategoryRepository;
import blog.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryService implements ICategoryService {
    @Autowired
    private ICategoryRepository iCategoryRepository ;

    @Override
    public List<Category> findAllCategory() {
        return iCategoryRepository.findAll();
    }
}
