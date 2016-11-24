package pl.saramak.usecases;

import java.util.List;

import pl.saramak.gateway.net.HttpGateway;
import pl.saramak.gateway.repo.OrderRepository;
import pl.saramak.gateway.repo.UserRepository;
import pl.saramak.gateway.repo.OrderRepository;
import pl.saramak.gateway.repo.UserRepository;
import pl.saramak.restaurant.model.order.Course;
import pl.saramak.restaurant.model.order.Order;
import pl.saramak.restaurant.model.user.User;

/**
 * Created by mario on 23.11.16.
 */

public class OrderUseCase {

    UserRepository userRepository;
    OrderRepository orderRepository;
    HttpGateway httpGateway;

    public OrderUseCase(UserRepository userRepository, OrderRepository orderRepository, HttpGateway httpGateway) {
        this.userRepository = userRepository;
        this.orderRepository = orderRepository;
        this.httpGateway = httpGateway;
    }

    public Order createNewOrder(User user, User waiter, User cooker) throws OrderException {
        List<User> users = userRepository.findUserByName(user.getName());
        if (users.size()!=1){
            throw new OrderException();
        }
        User user1 = users.get(0);
        Order order = orderRepository.createEmptyOrder(user1);
        order.orderBy = user1;
        order.crewBy = waiter;
        order.preparedBy = cooker;
        orderRepository.save(order);
        return order;
    }
    public Order addToOrderCourse(Order order, Course course){
        Order order1 = orderRepository.getOrder(order);
        order1.addCourse(course);
        orderRepository.save(order1);
        return order1;
    }

    public void sendOrderToKitchen(Order order) {
        httpGateway.sendToKitchen(order);
    }

    private class OrderException extends Exception {
    }
}
