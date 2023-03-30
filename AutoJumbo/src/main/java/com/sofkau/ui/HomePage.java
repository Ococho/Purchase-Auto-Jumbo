package com.sofkau.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage extends PageObject {
    public static Target MY_ACCOUNT = Target.the("My account")
            .located(By.xpath("//*[text()='Mi Cuenta']"));
}