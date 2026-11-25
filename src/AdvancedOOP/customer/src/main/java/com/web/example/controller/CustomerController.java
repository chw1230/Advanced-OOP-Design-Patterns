package com.web.example.controller;

import com.web.example.model.Customer;
import com.web.example.service.CustomerService;
import java.util.List;

import org.springframework.web.bind.annotation.*; // REST API용
import org.springframework.stereotype.Controller; // Stereotype

@RestController // 프레젠테이션 계층
@RequestMapping("/customers")
public class CustomerController {
    private final CustomerService service;

    public CustomerController(CustomerService service) {
        this.service = service;
    }
    @PostMapping
    public String addCustomer(@RequestBody Customer customer) {
        service.registerCustomer(customer);
        return "Customer added successfully!";
    }
    @GetMapping("/{id}")
    public Customer getCustomer(@PathVariable Long id) {
        return service.getCustomer(id);
    }
    @GetMapping
    public List<Customer> getAllCustomers() {
        return service.getAllCustomers();
    }
}
