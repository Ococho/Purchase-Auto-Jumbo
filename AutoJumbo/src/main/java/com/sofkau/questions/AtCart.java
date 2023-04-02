package com.sofkau.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.sofkau.ui.CartPage.CART_TITLE;

public class AtCart implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return CART_TITLE.resolveFor(actor).getText();
    }

    public static AtCart atCart() {
        return new AtCart();
    }
}