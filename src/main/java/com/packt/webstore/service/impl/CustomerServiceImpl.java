package com.packt.webstore.service.impl;

import com.packt.webstore.domain.Customer;
import com.packt.webstore.domain.repository.CustomerRepository;
import com.packt.webstore.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private    CustomerRepository customerRepository;
    public List<Customer> getAllCustomers() {
        return customerRepository.getAllCustomers();
    }
}
