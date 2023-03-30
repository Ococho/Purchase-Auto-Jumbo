package com.sofkau.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AccountPage extends PageObject {
    public static Target POP_UP = Target.the("Not now button")
            .located(By.xpath("//*[text()='Ahora no']"));

    public static Target EMAIL = Target.the("Email field")
            .located(By.xpath("//*[@placeholder='Ej.: ejemplo@mail.com']"));

    public static Target PASSWORD = Target.the("Password field")
            .located(By.xpath("//*[@placeholder='Ingrese su contraseña ']"));

    public static Target ENTER_BTTN = Target.the("Enter button")
            .located(By.xpath("//*[@type='submit']/descendant::text()"));

    public static Target EMAIL_STARTED = Target.the("User email")
            .located(By.xpath("//label[text()='E-mail']/following-sibling::div"));

    public static Target SEARCH_BOX = Target.the("Search box")
            .located(By.xpath("//input[@placeholder='¿Qué estás buscando?']"));

    public static Target DELIVERY_METHOD = Target.the("Delivery method selector")
            .located(By.xpath("//p[text()='Configura']/parent::div"));

    public static Target DEPARTMENT = Target.the("Department field")
            .located(By.xpath("//div[text()='Departamento']"));

    public static Target ADDRESS = Target.the("Address field")
            .located(By.xpath("//input[@placeholder='Dirección']"));

    public static Target CONFIRM_BTTN = Target.the("Confirm button")
            .located(By.xpath("//div[text()='Confirmar']/parent::button[@type='button']"));
}