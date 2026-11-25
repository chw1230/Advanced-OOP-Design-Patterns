package com.web.example.service;

import com.web.example.model.Customer;
import com.web.example.repository.CustomerRepository;
import java.util.List;

import org.springframework.stereotype.Service; // Stereotype

@Service  // 비즈니스 로직 계층
public class CustomerService {
    private final CustomerRepository repository;
    
    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }
    public void registerCustomer(Customer customer) {
        repository.save(customer);
    }
    public Customer getCustomer(Long id) {
        return repository.findById(id);
    }
    public List<Customer> getAllCustomers() {
        return repository.findAll();
    }
}
