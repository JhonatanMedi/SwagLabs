package Booking.Pages;

import Booking.Steps.ButtonPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCardPage {

    private ButtonPages buttonPages;

    public ShoppingCardPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.buttonPages = new ButtonPages(driver);

    }

    public void delete(String deleteProducts) {
        buttonPages.btnRemove(deleteProducts);
    }
}
