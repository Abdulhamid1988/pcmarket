package task2.projection;

import task2.entity.Order;
import task2.entity.UserBasket;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Order.class)
public interface CustomOrder {
    Integer getId();
    String getDate();
    UserBasket getUserBasket();
    String getDetails();
}
