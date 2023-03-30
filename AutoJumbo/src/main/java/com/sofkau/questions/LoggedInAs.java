package com.sofkau.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.sofkau.ui.HomePage.EX;

public class LoggedInAs implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return EX.resolveFor(actor).getText();
    }

    public static LoggedInAs loggedInAs() {
        return new LoggedInAs();
    }
}