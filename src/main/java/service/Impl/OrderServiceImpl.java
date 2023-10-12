package service.Impl;

import model.Order;
import repository.OrderRepository;
import service.OrderService;
import util.ApplicationContext;
import util.EntityManagerSingleton;

import javax.persistence.EntityManager;
import java.util.List;

public class OrderServiceImpl implements OrderService {

    private final EntityManager entityManager = EntityManagerSingleton.getInstanceEM();
    private final OrderRepository orderRepository = ApplicationContext.orderRepository;

    @Override
    public Order create(Order order) {
        return null;
    }

    @Override
    public Order update(Order order) {
        return null;
    }

    @Override
    public void delete(Order order) {

    }

    @Override
    public Order findById(Long id) {
        return null;
    }

    @Override
    public List<Order> findAll() {
        return null;
    }
}
