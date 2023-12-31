package repository.impl;

import model.Customer;
import repository.CustomerRepository;
import util.EntityManagerSingleton;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepository {

    private final EntityManager entityManager = EntityManagerSingleton.getInstanceEM();

    @Override
    public Customer create(Customer customer) {
        entityManager.persist(customer);
        return customer;
    }

    @Override
    public Customer update(Customer customer) {
        entityManager.merge(customer);
        return customer;
    }

    @Override
    public void delete(Customer customer) {
        entityManager.remove(customer);
    }

    @Override
    public Customer findById(Long id) {
        return entityManager.find(Customer.class,id);
    }

    @Override
    public List<Customer> findAll() {
        String jpql = "SELECT c FROM Customer c";
        TypedQuery<Customer> typedQuery = entityManager.createQuery(jpql, Customer.class);
        return typedQuery.getResultList();
    }

    @Override
    public Customer findByEmail(String email) {
        String hql = "SELECT c FROM Customer c WHERE c.user.email = :email";
        TypedQuery<Customer> typedQuery = entityManager.createQuery(hql, Customer.class);
        typedQuery.setParameter("email",email);
        return typedQuery.getSingleResult();
    }
}
