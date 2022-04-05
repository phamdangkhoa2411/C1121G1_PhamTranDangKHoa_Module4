package product.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import product.model.Comment;
import product.repository.BaseRepository;
import product.repository.ICommentRepository;

import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.List;


@Repository
public class CommentRepository implements ICommentRepository {
@Autowired
    BaseRepository baseRepository ;


    @Override
    public void save(Comment comment) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.persist(comment);
        entityTransaction.commit();
    }

    @Override
    public List<Comment> findAllComment() {
        TypedQuery typedQuery = BaseRepository.entityManager.createQuery("select c from comment as c", Comment.class);
        return typedQuery.getResultList();
    }
}
