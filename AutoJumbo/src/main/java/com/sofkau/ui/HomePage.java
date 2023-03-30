package com.sofkau.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage extends PageObject {
    public static Target EX = Target.the("Ex")
            .located(By.xpath("Locator"));

    public static Target AMPLE = Target.the("Ample")
            .located(By.xpath("Locator"));
}