package com.sofkau.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.sofkau.ui.CheckoutPage.TITLE;

public class IsOrderDone implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return TITLE.resolveFor(actor).getText();
    }

    public static IsOrderDone isOrderDone() {
        return new IsOrderDone();
    }
}