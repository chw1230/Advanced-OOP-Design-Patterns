package com.example.test;

import org.springframework.stereotype.Repository;

@Repository
class MyRepository {
    public String getName() { return "Hello from Repository"; }
}
