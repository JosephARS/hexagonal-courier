package com.globant.courier.glober.example;

import com.globant.courier.glober.domain.ports.services.IExampleService;
import com.globant.courier.glober.domain.usecases.ExampleService;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;

public class ExampleTest {

    @Autowired
    private ExampleService exampleService;

    int num;

    @Given("the Maker has chosen a number {int}")
    public void the_maker_has_chosen_a_number(int num1) {

        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();

        num = num1;

    }
    @Then("the Maker is asked {string} if breaker guessed {int}")
    public void the_maker_is_asked_if_breaker_guessed_or_not(String result, int numExpected) {

            Assertions.assertEquals(result, exampleService.guessNumber(numExpected, num));

    }


}
