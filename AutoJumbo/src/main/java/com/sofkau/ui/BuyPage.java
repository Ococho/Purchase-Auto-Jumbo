package com.sofkau.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BuyPage extends PageObject {
    public static Target CATEGORY = Target.the("Category section")
            .located(By.xpath("//*[text()='Categoría']/parent::div"));

    public static Target SELECTED_CATEGORY = Target.the("Lácteos, Huevos Y Refrigerados category")
            .located(By.xpath("//label[text()='Lácteos, Huevos Y Refrigerados']/parent::div"));

    public static Target ORDER_BY = Target.the("Order by button")
            .located(By.xpath("//span[text()='Ordenar por']/ancestor::button"));

    public static Target MINOR = Target.the("Lower price order")
            .located(By.xpath("//button[text()='Menor precio']"));

    public static Target BUY_BTTN = Target.the("Lower price Chorizo buy button")
            .located(By.xpath("(//span[text()='Comprar']/ancestor::button)[1]"));

    public static Target CART = Target.the("Cart button")
            .located(By.xpath("(//div[@role='presentation'])[1]"));

    public static Target CHECKOUT_BTTN = Target.the("Finalize purchase button")
            .located(By.xpath("//span[text()='FINALIZAR COMPRA']"));
}