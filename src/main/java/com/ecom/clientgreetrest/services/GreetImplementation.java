package com.ecom.clientgreetrest.services;

import com.ecom.clientgreetrest.dtos.GreetDto;
import com.ecom.clientgreetrest.thirdPartyServices.GreetDtoThirdParty;
import com.ecom.clientgreetrest.thirdPartyServices.GreetFromThirdParty;
import org.springframework.stereotype.Service;

@Service
public class GreetImplementation implements Greet{

    private GreetFromThirdParty greetFromThirdParty;
    public GreetImplementation(GreetFromThirdParty greetFromThirdParty) {
        this.greetFromThirdParty = greetFromThirdParty;//
    }
    @Override
    public GreetDto greet(String name) {
        GreetDtoThirdParty greetDtoThirdParty = greetFromThirdParty.getGreeting(name);
        return convertToGreetDto(greetDtoThirdParty);
    }

    public static GreetDto convertToGreetDto(GreetDtoThirdParty greetDtoThirdParty) {
        GreetDto greetDto = new GreetDto();
        greetDto.setId(Math.toIntExact(greetDtoThirdParty.id()));
        greetDto.setName(greetDtoThirdParty.content());

        return greetDto;
    }
}
