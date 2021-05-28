package task2.projection;

import task2.entity.Article;
import task2.entity.Attachment;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Article.class)
public interface CustomArticle {
    Integer getId();
    String getTitle();
    String getDescription();
    String getUrlLink();
    Attachment getAttachment();
}
