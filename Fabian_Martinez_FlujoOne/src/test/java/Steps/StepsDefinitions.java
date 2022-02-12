package Steps;

import org.openqa.selenium.WebDriver;

import Questions.ValidatarTotal;
import Tasks.AdicionarProductos;
import Tasks.EliminarProductos;
import Tasks.OpentTheBrowser;
import UserInterface.Home;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;

public class StepsDefinitions {
	private Actor fabian = Actor.named("Fabian");

	
	
	@Managed(driver = "chrome")
	private WebDriver browser;

	@Before
	public void abrirNavegador() {
		fabian.can(BrowseTheWeb.with(browser));
	}

	@Given("El cliente ingresa a la pagina de prueba")
	public void elClienteIngresaALaPaginaDePrueba() {
		fabian.wasAbleTo(Open.browserOn(new Home()));
		fabian.wasAbleTo(OpentTheBrowser.Navega());
		
	}

	@When("Adiciona productos al carrito")
	public void adicionaProductosAlCarrito() {
		fabian.wasAbleTo(AdicionarProductos.adicionarProductos());
		fabian.wasAbleTo(EliminarProductos.eliminarProductos());
		
		
	}

	@Then("Valido el valor total del carrito")
	public void validoElValorTotalDelCarrito() {			
		fabian.wasAbleTo(ValidatarTotal.validatarTotal());
		
		
		
	
		
		
	}
}
