package com.example.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
// @Autowired때문에 필요함
import org.springframework.beans.factory.annotation.Autowired; 

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}

@RestController
class MyController {
    private final MyService service;

    public MyController(MyService service) { this.service = service; }
    @GetMapping("/hello")
    public String hello() { return service.greet(); }
}

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

@Repository
class MyRepository {
    public String getName() { return "Hello from Repository"; }
}

@Component
class MyComponent {
    public String getStringFromComponent() { return "Hello from Component!"; }
}