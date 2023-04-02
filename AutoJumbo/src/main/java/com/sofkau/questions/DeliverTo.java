package com.sofkau.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.sofkau.ui.AccountPage.DELIVERY_METHOD;

public class DeliverTo implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return DELIVERY_METHOD.resolveFor(actor).getText();
    }

    public static DeliverTo deliverTo() {
        return new DeliverTo();
    }
}