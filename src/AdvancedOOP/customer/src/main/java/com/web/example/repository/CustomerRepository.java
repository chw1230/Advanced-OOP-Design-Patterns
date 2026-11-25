package com.web.example.repository;

import com.web.example.model.Customer;
import java.util.*;

import org.springframework.stereotype.Repository; // Stereotype

@Repository  // DB 접근 계층
public class CustomerRepository {
    private Map<Long, Customer> customerDB = new HashMap<>();
    
    public void save(Customer customer) {
        customerDB.put(customer.getId(), customer);
    }
    public Customer findById(Long id) {
        return customerDB.get(id);
    }
    public List<Customer> findAll() {
        return new ArrayList<>(customerDB.values());
    }
}
