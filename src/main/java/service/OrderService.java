package service;

import model.Order;

import java.util.List;

public interface OrderService {


    Order create(Order order);

    Order update(Order order);

    void delete(Order order);

    Order findById(Long id);

    List<Order> findAll();

    boolean validPrice(Order order);
}
