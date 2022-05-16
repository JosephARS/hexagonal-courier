package com.globant.courier.glober.example;

import com.globant.courier.glober.infrastructure.rest.ExampleController;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.web.client.RestTemplate;


public class ExampleFunctionalTest {

    @Autowired
    TestRestTemplate restTemplate;

    int givenNumber;

    @Given("Functional the Maker has chosen a number {int}")
    public void functional_the_maker_has_chosen_a_number(Integer int1) {
        givenNumber = int1;
    }
    @Then("Functional the Maker is asked {string} if breaker guessed {int}")
    public void functional_the_maker_is_asked_if_breaker_guessed(String string, Integer int1) {


        System.out.println("------------------------------------------");
        System.out.println(restTemplate.getForEntity("/" + int1 +"/" + givenNumber,String.class).getBody());
    }


}
