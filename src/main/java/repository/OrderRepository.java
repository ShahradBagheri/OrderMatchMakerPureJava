package repository;

import model.Order;

import java.util.List;

public interface OrderRepository {

    Order create(Order order);

    Order update(Order order);

    void delete(Order order);

    Order findById(Long id);

    List<Order> findAll();
}
