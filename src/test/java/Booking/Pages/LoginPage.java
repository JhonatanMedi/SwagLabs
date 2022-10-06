package Booking.Pages;

import Booking.Steps.ButtonPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private ButtonPages buttonPages;

    @FindBy(how = How.ID, using = "user-name")
    private WebElement txtUser;

    @FindBy(how = How.ID, using = "password")
    private WebElement txtpassword;

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.buttonPages = new ButtonPages(driver);
    }

    public void Login(String user, String password){
        txtUser.sendKeys(user);
        txtpassword.sendKeys(password);
        buttonPages.btnLogin();

    }
}
