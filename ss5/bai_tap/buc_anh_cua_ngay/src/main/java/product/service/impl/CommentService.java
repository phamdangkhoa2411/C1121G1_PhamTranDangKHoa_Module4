package product.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import product.model.Comment;
import product.repository.ICommentRepository;
import product.service.ICommentService;

import java.util.List;

@Service
public class CommentService implements ICommentService {
    @Autowired
    private ICommentRepository iCommentRepository;

    @Override
    public void save(Comment comment) {
        this.iCommentRepository.save(comment);
    }

    @Override
    public List<Comment> findAllComment() {
        return iCommentRepository.findAllComment();
    }
}
