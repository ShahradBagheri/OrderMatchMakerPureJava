package service;

import model.Customer;
import model.User;

import java.util.List;

public interface CustomerService {

    Customer create(Customer customer);

    Customer update(Customer customer);

    void delete(Customer customer);

    Customer findById(Long id);

    List<Customer> findAll();

    Customer findByUser(User user);

    Customer changePassword(Customer customer,String password);
}
