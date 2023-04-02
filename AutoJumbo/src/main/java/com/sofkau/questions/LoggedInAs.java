package com.sofkau.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.sofkau.ui.AccountPage.EMAIL_STARTED;

public class LoggedInAs implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return EMAIL_STARTED.resolveFor(actor).getText();
    }

    public static LoggedInAs loggedInAs() {
        return new LoggedInAs();
    }
}