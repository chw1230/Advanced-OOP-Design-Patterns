package com.example.test;

import org.springframework.stereotype.Component;

@Component
class MyComponent {
    public String getStringFromComponent() { return "Hello from Component!"; }
}