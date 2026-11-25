package com.example.test;

import org.springframework.stereotype.Service;
import org.springframework.stereotype.Repository;
// @Autowired때문에 필요함
import org.springframework.beans.factory.annotation.Autowired; 

@Service
class MyService {
    private final MyRepository repository;
    @Autowired
    private MyComponent component; // 자동으로 MyComponent 객체가 주입됨

    public MyService(MyRepository repository) {
        this.repository = repository;
    }
    public String greet() {
        String s = component.getStringFromComponent();
        return s + "<br>Hello from Service, " + repository.getName();
    }
}
