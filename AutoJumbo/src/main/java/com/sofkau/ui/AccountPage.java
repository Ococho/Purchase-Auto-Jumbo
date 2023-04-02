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
            .located(By.xpath("//*[@placeholder='Ingrese su contrase\u00f1a ']"));

    public static Target ENTER_BTTN = Target.the("Enter button")
            .located(By.xpath("//span[text()='Entrar']/ancestor::button[@type='submit']"));

    public static Target EMAIL_STARTED = Target.the("User email")
            .located(By.xpath("//label[text()='E-mail']/following-sibling::div[contains(text(),'@gmail.com')]"));

    public static Target SEARCH_BOX = Target.the("Search box")
            .located(By.xpath("//input[@placeholder='\u00BFQu\u00E9 est\u00E1s buscando?']"));

    public static Target DELIVERY_METHOD = Target.the("Delivery method selector")
            .located(By.xpath("(//div[contains(@class,'tiendasjumboqaio-delivery-modal-3-x-containerTrigger')])[2]"));

    public static Target DEPARTMENT = Target.the("Department field")
            .located(By.xpath("//div[text()='Departamento']"));

    public static Target E_DEPARTMENT = Target.the("Exact department field")
            .located(By.xpath("//div[text()='ANTIOQUIA']"));

    public static Target CITY = Target.the("Exact city field")
            .located(By.xpath("//div[text()='Ciudad']"));

    public static Target E_CITY = Target.the("City field")
            .located(By.xpath("//div[text()='Medell\u00EDn']"));

    public static Target ADDRESS = Target.the("Address field")
            .located(By.xpath("//input[@placeholder='Direcci\u00F3n']"));

    public static Target CONFIRM_BTTN = Target.the("Confirm button")
            .located(By.xpath("//div[text()='Confirmar']/parent::button[@type='button']"));
}