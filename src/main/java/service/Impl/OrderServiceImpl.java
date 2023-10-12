package service.Impl;

import model.MainService;
import model.Order;
import repository.OrderRepository;
import service.OrderService;
import util.ApplicationContext;
import util.EntityManagerSingleton;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
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
        EntityTransaction entityTransaction = entityManager.getTransaction();

        try {
            entityTransaction.begin();

            Order order = orderRepository.findById(id);

            entityTransaction.commit();
            return order;

        } catch (PersistenceException | IllegalStateException e) {

            entityTransaction.rollback();
            return null;
        }
    }

    @Override
    public List<Order> findAll() {
        EntityTransaction entityTransaction = entityManager.getTransaction();

        try {
            entityTransaction.begin();

            List<Order> orders = orderRepository.findAll();

            entityTransaction.commit();
            return orders;

        } catch (PersistenceException | IllegalStateException e) {

            entityTransaction.rollback();
            return null;
        }
    }
}
