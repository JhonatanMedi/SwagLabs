package Booking.Definitions;

import Booking.Pages.AddProduct;
import Booking.Pages.LoginPage;
import Booking.Pages.ShoppingCardPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import Booking.Steps.Conexion;
import io.cucumber.java.en.Given;



public class DefinitionsSteps {

	private WebDriver driver;
	private Conexion conexion = new Conexion();
	private LoginPage loginPage = new LoginPage(driver);
	private AddProduct addProduct = new AddProduct(driver);
	private ShoppingCardPage shoppingCardPage = new ShoppingCardPage(driver);

	

	@Given("^abrir el navegador$")
	public void abrir_navegador() {
		this.conexion = new Conexion();
		this.driver = this.conexion.abrirNavegador();

	}

	@And("^Diligencie el usuario (.*) y contraseña (.*)$")
	public void diligenciarLogin(String user, String password){
		this.loginPage = new LoginPage(driver);
		this.loginPage.Login(user, password);
	}

	@When("^busque el producto (.*)$")
	public void addProduct(String products){
		this.addProduct = new AddProduct(driver);
		this.addProduct.addProducto(products);
	}

	@Then("^se elimina el producto (.*)$")
	public void deleteProduct(String deleteProducts){
		this.shoppingCardPage = new ShoppingCardPage(driver);
		this.shoppingCardPage.delete(deleteProducts);
	}
}