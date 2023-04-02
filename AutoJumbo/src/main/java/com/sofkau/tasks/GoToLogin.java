package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofkau.ui.HomePage.MY_ACCOUNT;

public class GoToLogin implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MY_ACCOUNT)
        );
    }

    public static GoToLogin goToLogin() {
        return new GoToLogin();
    }
}