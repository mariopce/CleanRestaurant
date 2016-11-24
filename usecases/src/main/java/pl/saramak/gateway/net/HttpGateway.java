package pl.saramak.gateway.net;

import pl.saramak.restaurant.model.order.Order;

/**
 * Created by mario on 23.11.16.
 */
public interface HttpGateway {
    void sendToKitchen(Order order);
}
