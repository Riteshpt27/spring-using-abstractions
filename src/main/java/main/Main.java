package main;

import configurations.ProjectConfiguration;
import models.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import proxies.impl.EmailCommentNotificationProxy;
import repositories.impl.DBCommentRepository;
import services.CommentService;

public class Main {
    public static void main(String[] args) {
        var applicationContext = new AnnotationConfigApplicationContext(ProjectConfiguration.class);
        var commentService = applicationContext.getBean(CommentService.class);

        var comment = new Comment();
        comment.setAuthor("Ritesh");
        comment.setText("Lorem Ipsum");

        commentService.publishComment(comment);
    }
}