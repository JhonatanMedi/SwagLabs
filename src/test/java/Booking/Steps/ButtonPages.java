package Booking.Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ButtonPages {

    private WebDriver driver;

    @FindBy(how = How.ID, using = "login-button")
    private WebElement btnLogin;

    @FindBy(how = How.ID, using = "shopping_cart_container")
    private WebElement btnCar;


    public ButtonPages(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void btnLogin() {
        btnLogin.isDisplayed();
        btnLogin.click();
    }

    public void btnCar() {
        btnCar.isDisplayed();
        btnCar.click();
    }

    public void btnRemove(String deleteProducts) {
        WebElement deleteProduct = driver.findElement(By.xpath("//*[text()='" + deleteProducts + "']"));
        deleteProduct.click();

        WebElement remove = driver.findElement(By.xpath("//*[text()='Remove']"));
        remove.click();


    }
}
