package blog.service;

import blog.model.Category;

import java.util.List;

public interface ICategoryService {
    List<Category> findAllCategory();
}
