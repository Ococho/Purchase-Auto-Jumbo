package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofkau.ui.CartPage.CHECKBOX;
import static com.sofkau.ui.CartPage.CHECKOUT_BTTN;

public class GoToPay implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CHECKBOX),
                Click.on(CHECKOUT_BTTN)
        );
    }

    public static GoToPay goToPay() {
        return new GoToPay();
    }
}