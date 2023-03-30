package com.sofkau.stepdefs;

import com.sofkau.setup.Configuration;
import com.sofkau.tasks.OpenHomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ChorizoPurchaseStepDef extends Configuration {
    private final Logger log = LoggerFactory.getLogger(ChorizoPurchaseStepDef.class);

    @Given("I went to Jumbo home page")
    public void iWentToJumboHomePage() {
        try {
            log.info("Init scenario");
            setupBrowser();
            theActorInTheSpotlight().wasAbleTo(
                    new OpenHomePage()
            );
        } catch (Exception e) {
            log.error("Wrong Setup provided");
            log.error(e.getMessage());
            log.error(String.valueOf(e.getCause()));
            Assertions.fail();
            quitDriver();
        }
    }

    @And("I logged in")
    public void iLoggedIn() {
        try {
            log.info("Logging");
            setupBrowser();
            theActorInTheSpotlight().wasAbleTo(
                    new OpenHomePage()
            );
        } catch (Exception e) {
            log.error("Wrong steps provided");
            log.error(e.getMessage());
            log.error(String.valueOf(e.getCause()));
            Assertions.fail();
            quitDriver();
        }
    }

    @And("I selected my address")
    public void iSelectedMyAddress() {
        try {
            log.info("Logging");
            setupBrowser();
            theActorInTheSpotlight().wasAbleTo(
                    new OpenHomePage()
            );
        } catch (Exception e) {
            log.error("Wrong steps provided");
            log.error(e.getMessage());
            log.error(String.valueOf(e.getCause()));
            Assertions.fail();
            quitDriver();
        }
    }

    @When("I am looking for Chorizo")
    public void iAmLookingForChorizo() {
        try {
            log.info("Logging");
            setupBrowser();
            theActorInTheSpotlight().attemptsTo(
                    new OpenHomePage()
            );
        } catch (Exception e) {
            log.error("Wrong steps provided");
            log.error(e.getMessage());
            log.error(String.valueOf(e.getCause()));
            Assertions.fail();
            quitDriver();
        }
    }

    @And("I select the cheapest Chorizo")
    public void iSelectTheCheapestChorizo() {
        try {
            log.info("Logging");
            setupBrowser();
            theActorInTheSpotlight().attemptsTo(
                    new OpenHomePage()
            );
        } catch (Exception e) {
            log.error("Wrong steps provided");
            log.error(e.getMessage());
            log.error(String.valueOf(e.getCause()));
            Assertions.fail();
            quitDriver();
        }
    }

    @And("I select {int} of the cheapest and {int} of the second cheapest Chorizo")
    public void iSelectQuantityOfTheCheapestAndSQuantityOfTheSecondCheapestChorizo(Integer quantity, Integer sQuantity) {
        try {
            log.info("Logging");
            setupBrowser();
            theActorInTheSpotlight().attemptsTo(
                    new OpenHomePage()
            );
        } catch (Exception e) {
            log.error("Wrong steps provided");
            log.error(e.getMessage());
            log.error(String.valueOf(e.getCause()));
            Assertions.fail();
            quitDriver();
        }
    }

    @Then("I will be redirected to the checkout page")
    public void iWillBeRedirectedToTheCheckoutPage() {
        try {
            theActorInTheSpotlight().should(
            );
            log.info("Test passed");
        } catch (Exception e) {
            log.error("Test failed");
            log.error(e.getMessage());
            log.error(String.valueOf(e.getCause()));
            quitDriver();
            Assertions.fail();
        } finally {
            log.info("Test completed");
            quitDriver();
        }
    }
}