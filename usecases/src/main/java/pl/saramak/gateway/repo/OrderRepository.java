package pl.saramak.gateway.repo;

import pl.saramak.restaurant.model.order.Order;
import pl.saramak.restaurant.model.user.User;

/**
 * Created by mario on 23.11.16.
 */
public interface OrderRepository {
    void save(Order order);

    Order createEmptyOrder(User user1);

    Order getOrder(Order order);
}
