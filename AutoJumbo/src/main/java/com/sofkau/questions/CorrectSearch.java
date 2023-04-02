package com.sofkau.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.sofkau.ui.BuyPage.SEARCH;

public class CorrectSearch implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return SEARCH.resolveFor(actor).getText();
    }

    public static CorrectSearch correctSearch() {
        return new CorrectSearch();
    }
}