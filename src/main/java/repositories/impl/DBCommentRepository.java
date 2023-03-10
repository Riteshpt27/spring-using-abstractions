package repositories.impl;

import models.Comment;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import repositories.CommentRepository;

@Repository
public class DBCommentRepository implements CommentRepository {
    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment: " + comment.getText());
    }
}
