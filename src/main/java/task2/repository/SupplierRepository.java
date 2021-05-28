package task2.repository;

import task2.entity.Supplier;
import task2.projection.CustomSupplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "supplier", collectionResourceRel = "list_info",excerptProjection = CustomSupplier.class)
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {

}
