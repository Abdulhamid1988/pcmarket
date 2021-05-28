package task2.repository;

import task2.entity.Category;
import task2.projection.CustomCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "category", collectionResourceRel = "list_info",excerptProjection = CustomCategory.class)
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
