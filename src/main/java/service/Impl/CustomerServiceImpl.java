package service.Impl;

import model.Customer;
import model.User;
import repository.CustomerRepository;
import service.CustomerService;
import util.ApplicationContext;
import util.EntityManagerSingleton;

import javax.persistence.*;
import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository = ApplicationContext.customerRepository;
    private final EntityManager entityManager = EntityManagerSingleton.getInstanceEM();

    @Override
    public Customer create(Customer customer) {

        EntityTransaction entityTransaction = entityManager.getTransaction();

        try {
            entityTransaction.begin();

            customerRepository.create(customer);

            entityTransaction.commit();
            return customer;
        } catch (PersistenceException | IllegalStateException e) {

            entityTransaction.rollback();
            return null;
        }
    }

    @Override
    public Customer update(Customer customer) {

        EntityTransaction entityTransaction = entityManager.getTransaction();

        try {
            entityTransaction.begin();

            customerRepository.update(customer);

            entityTransaction.commit();
            return customer;
        } catch (PersistenceException | IllegalStateException e) {

            entityTransaction.rollback();
            return null;
        }
    }

    @Override
    public void delete(Customer customer) {

        EntityTransaction entityTransaction = entityManager.getTransaction();

        try {
            entityTransaction.begin();

            customerRepository.delete(customer);

            entityTransaction.commit();
        } catch (PersistenceException | IllegalStateException e) {

            entityTransaction.rollback();
        }
    }

    @Override
    public Customer findById(Long id) {

        EntityTransaction entityTransaction = entityManager.getTransaction();

        try {
            entityTransaction.begin();

            Customer customer = customerRepository.findById(id);

            entityTransaction.commit();
            return customer;

        } catch (PersistenceException | IllegalStateException e) {

            entityTransaction.rollback();
            return null;
        }
    }

    @Override
    public List<Customer> findAll() {
        return null;
    }

    @Override
    public Customer changePassword(Customer customer, String password) {

        EntityTransaction entityTransaction = entityManager.getTransaction();

        customer.getUser().setPassword(password);

        try {
            entityTransaction.begin();

            customerRepository.update(customer);

            entityTransaction.commit();
            return customer;
        } catch (PersistenceException | IllegalStateException e) {
            entityTransaction.rollback();
            return null;
        }
    }
}
