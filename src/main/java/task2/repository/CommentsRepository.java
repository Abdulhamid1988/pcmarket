package task2.repository;

import task2.entity.Comments;
import task2.projection.CustomComments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "comments", collectionResourceRel = "list_info",excerptProjection = CustomComments.class)
public interface CommentsRepository extends JpaRepository<Comments, Integer> {

}
