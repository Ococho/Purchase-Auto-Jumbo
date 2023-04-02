package com.sofkau.stepdefs;

import com.sofkau.setup.Configuration;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.sofkau.questions.IsOrderDone.isOrderDone;
import static com.sofkau.questions.IsThereAValue.isThereAValue;
import static com.sofkau.tasks.AddToCart.addToCart;
import static com.sofkau.tasks.GoToAddress.goToAddress;
import static com.sofkau.tasks.GoToCheckout.goToCheckout;
import static com.sofkau.tasks.GoToLogin.goToLogin;
import static com.sofkau.tasks.GoToPay.goToPay;
import static com.sofkau.tasks.Login.login;
import static com.sofkau.tasks.OpenHomePage.openHomePage;
import static com.sofkau.tasks.OrderSearch.orderSearch;
import static com.sofkau.tasks.SearchChorizo.searchChorizo;
import static com.sofkau.tasks.SetAddress.setAddress;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.*;

public class ChorizoPurchaseStepDef extends Configuration {
    private final Logger log = LoggerFactory.getLogger(ChorizoPurchaseStepDef.class);

    @Given("I went to Jumbo home page")
    public void iWentToJumboHomePage() {
        try {
            log.info("Init scenario");
            setupBrowser();
            theActorInTheSpotlight().wasAbleTo(
                    openHomePage()
            );
        } catch (Exception e) {
            log.error("Wrong Setup provided");
            log.error(e.getMessage());
            log.error(String.valueOf(e.getCause()));
            quitDriver();
            Assertions.fail();
        }
    }

    @And("I logged in")
    public void iLoggedIn() {
        try {
            log.info("Logging");
            theActorInTheSpotlight().wasAbleTo(
                    goToLogin(),
                    login()
            );
        } catch (Exception e) {
            log.error("Wrong steps provided");
            log.error(e.getMessage());
            log.error(String.valueOf(e.getCause()));
            quitDriver();
            Assertions.fail();
        }
    }

    @And("I selected my address")
    public void iSelectedMyAddress() {
        try {
            log.info("Select address");
            theActorInTheSpotlight().wasAbleTo(
                    goToAddress(),
                    setAddress()
            );
        } catch (Exception e) {
            log.error("Wrong steps provided");
            log.error(e.getMessage());
            log.error(String.valueOf(e.getCause()));
            quitDriver();
            Assertions.fail();
        }
    }

    @When("I am looking for Chorizo")
    public void iAmLookingForChorizo() {
        try {
            log.info("Looking for Chorizo");
            theActorInTheSpotlight().attemptsTo(
                    searchChorizo(),
                    orderSearch()
            );
        } catch (Exception e) {
            log.error("Wrong steps provided");
            log.error(e.getMessage());
            log.error(String.valueOf(e.getCause()));
            quitDriver();
            Assertions.fail();
        }
    }

    @And("I select the cheapest Chorizo")
    public void iSelectTheCheapestChorizo() {
        try {
            log.info("Select cheapest Chorizo");
            theActorInTheSpotlight().attemptsTo(
                    addToCart(),
                    goToCheckout(),
                    goToPay()
            );
        } catch (Exception e) {
            log.error("Wrong steps provided");
            log.error(e.getMessage());
            log.error(String.valueOf(e.getCause()));
            quitDriver();
            Assertions.fail();
        }
    }

    @And("I select {int} of the cheapest and {int} of the second cheapest Chorizo")
    public void iSelectQuantityOfTheCheapestAndSQuantityOfTheSecondCheapestChorizo(Integer quantity, Integer sQuantity) {
        try {
            log.info("Select cheapest and second cheapest Chorizo");
            theActorInTheSpotlight().attemptsTo(

            );
        } catch (Exception e) {
            log.error("Wrong steps provided");
            log.error(e.getMessage());
            log.error(String.valueOf(e.getCause()));
            quitDriver();
            Assertions.fail();
        }
    }

    @Then("I will be redirected to the checkout page")
    public void iWillBeRedirectedToTheCheckoutPage() {
        try {
            theActorInTheSpotlight().should(
                    seeThat(isOrderDone(), equalTo("Resumen de la compra")),
                    seeThat(isThereAValue(), startsWith("$ "))
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