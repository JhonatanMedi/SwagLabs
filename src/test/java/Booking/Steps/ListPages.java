package Booking.Steps;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ListPages {
    private WebDriver driver;

    public ListPages(WebDriver driver) {
        this.driver = driver;
    }

    public void seachProduct(String products) {
        WebElement listProduct = driver.findElement(By.xpath("//*[text()='" + products + "']//..//..//..//button"));
        listProduct.click();
    }

}
