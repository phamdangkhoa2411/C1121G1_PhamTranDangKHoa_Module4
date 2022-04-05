package product.service;

import product.model.Comment;

import java.util.List;

public interface ICommentService {
    void save(Comment comment);

    List<Comment> findAllComment();
}
