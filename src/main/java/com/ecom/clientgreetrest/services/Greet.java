package com.ecom.clientgreetrest.services;

import com.ecom.clientgreetrest.dtos.GreetDto;

public interface Greet {
    public GreetDto greet(String name);
}
