package Booking.Pages;

import Booking.Steps.ButtonPages;
import Booking.Steps.ListPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;

public class AddProduct {

    private ListPages listPages;
    private ButtonPages buttonPages;

    public AddProduct(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.listPages = new ListPages(driver);
        this.buttonPages = new ButtonPages(driver);
    }

    public void addProducto(String products) {
        listPages.seachProduct(products);
        buttonPages.btnCar();

    }
}
