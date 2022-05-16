package com.globant.courier.glober.infrastructure.rest;

import com.globant.courier.glober.domain.ports.services.IExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class ExampleController {

    @Autowired
    IExampleService exampleService;

    @GetMapping("{expectedNum}/{guessedNum}")
    public String getNumberGuess(@PathVariable("expectedNum") int expectedNum,
                                 @PathVariable("guessedNum") int guessedNum){
        return exampleService.guessNumber(expectedNum, guessedNum);
    }





}
