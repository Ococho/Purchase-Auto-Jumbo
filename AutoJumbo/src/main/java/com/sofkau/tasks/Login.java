package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.io.FileInputStream;
import java.util.Properties;

import static com.sofkau.ui.AccountPage.*;

public class Login implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        Properties properties = new Properties();
        try {
            FileInputStream in;
            in = new FileInputStream("src/test/resources/valores.properties");
            properties.load(in);
            in.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(
                Click.on(POP_UP),
                Enter.theValue(properties.get("EMAIL").toString()).into(EMAIL),
                Enter.theValue(properties.get("PASSWORD").toString()).into(PASSWORD),
                Click.on(ENTER_BTTN)
        );
    }

    public static Login login() {
        return new Login();
    }
}