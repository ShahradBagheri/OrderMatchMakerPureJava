package repository.impl;

import model.Order;
import repository.OrderRepository;
import util.EntityManagerSingleton;

import javax.persistence.EntityManager;
import java.util.List;

public class OrderRepositoryImpl implements OrderRepository {

    private final EntityManager entityManager = EntityManagerSingleton.getInstanceEM();

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
