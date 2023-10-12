package service;

import model.Customer;

public interface CustomerService {

    Customer signup(Customer customer);

    void changePassword(Customer customer,String password);
}
