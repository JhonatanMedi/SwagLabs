package Booking.Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import net.thucydides.core.annotations.Step;

public class Conexion {

	private WebDriver driver;

	@Before
	@Step
	public WebDriver abrirNavegador() {
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.saucedemo.com/");

		return this.driver;

	}
	

}
