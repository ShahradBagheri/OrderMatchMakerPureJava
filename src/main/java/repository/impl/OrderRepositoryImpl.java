package repository.impl;

import model.Offer;
import model.Order;
import repository.OrderRepository;
import util.EntityManagerSingleton;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class OrderRepositoryImpl implements OrderRepository {

    private final EntityManager entityManager = EntityManagerSingleton.getInstanceEM();

    @Override
    public Order create(Order order) {
        entityManager.persist(order);
        return order;
    }

    @Override
    public Order update(Order order) {
        entityManager.merge(order);
        return order;
    }

    @Override
    public void delete(Order order) {
        entityManager.remove(order);
    }

    @Override
    public Order findById(Long id) {
        return entityManager.find(Order.class,id);
    }

    @Override
    public List<Order> findAll() {
        String jpql = "SELECT o FROM Order o";
        TypedQuery<Order> typedQuery = entityManager.createQuery(jpql, Order.class);
        return typedQuery.getResultList();
    }
}
