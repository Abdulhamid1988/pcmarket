package task2.projection;

import task2.entity.District;
import task2.entity.Region;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = District.class)
public interface CustomDistrict {
    Integer getId();

    String getName();

    Region getRegion();

}
