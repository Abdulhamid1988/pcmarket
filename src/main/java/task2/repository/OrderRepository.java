package task2.repository;

import task2.entity.Order;
import task2.projection.CustomOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "order", collectionResourceRel = "list_info",excerptProjection = CustomOrder.class)
public interface OrderRepository extends JpaRepository<Order, Integer> {

}
