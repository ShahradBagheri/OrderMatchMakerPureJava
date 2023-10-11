package repository;

import model.Customer;

import java.util.List;

public interface CustomerRepository {

    Customer create(Customer customer);

    Customer update(Customer customer);

    void delete(Customer customer);

    Customer findById(Long id);

    List<Customer> findAll();
}
