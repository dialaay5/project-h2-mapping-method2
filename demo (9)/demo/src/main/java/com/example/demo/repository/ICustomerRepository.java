package com.example.demo.repository;

import com.example.demo.model.Customer;

import java.util.List;

public interface ICustomerRepository {

    int createCustomer(Customer customer);

    void updateCustomer(Customer customer, Integer id);

    void deleteCustomer(Integer id);

    List<Customer> getAllCustomers();

    Customer getCustomerById(Integer id);

}
