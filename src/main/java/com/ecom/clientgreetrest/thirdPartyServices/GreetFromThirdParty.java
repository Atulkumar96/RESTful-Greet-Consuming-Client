package com.ecom.clientgreetrest.thirdPartyServices;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GreetFromThirdParty {
    private GreetDtoThirdParty greetDtoThirdParty;
    RestTemplate restTemplate = new RestTemplate(); //

    public GreetDtoThirdParty getGreeting(String name){
        ResponseEntity<GreetDtoThirdParty> res = restTemplate.getForEntity("http://localhost:8081/greet?name={name}", GreetDtoThirdParty.class,name);
        return res.getBody();
    }
}
