package task2.projection;

import task2.entity.Comments;
import task2.entity.Product;
import task2.entity.User;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Comments.class)
public interface CustomComments {
    Integer getId();

    String getBody();

    User getUser();

    Product getProduct();

    Integer getNumberStars();
}
