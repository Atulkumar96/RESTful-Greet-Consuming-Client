package com.ecom.clientgreetrest.controllers;

import com.ecom.clientgreetrest.dtos.GreetDto;
import com.ecom.clientgreetrest.services.Greet;
import com.ecom.clientgreetrest.services.GreetImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

    private final GreetImplementation greetImplementation;
    //private Greet greet;

    public GreetController(GreetImplementation greetImplementation) {
        this.greetImplementation = greetImplementation;
    }

    @GetMapping("/ourCustomerGreet")
    public GreetDto getGreet(@RequestParam(value = "name", defaultValue = "our customer") String name) {
        return greetImplementation.greet(name);
    }
}
