package blog.service;

import blog.model.Blog;

import java.util.List;

public interface IBlogService {

    List<Blog> findAll();

    void save(Blog blog) ;

    Blog findById(Integer id);


    void remove(Integer id);
}
