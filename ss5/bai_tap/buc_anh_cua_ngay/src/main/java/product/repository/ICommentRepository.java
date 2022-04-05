package product.repository;

import product.model.Comment;

import java.util.List;

public interface ICommentRepository {
    void save(Comment comment);

    List<Comment> findAllComment();
}
