package Steps;

import org.openqa.selenium.WebDriver;

import Tasks.FillForm;
import Tasks.OpentTheBrowser;
import Tasks.ValidateName;
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

	@Given("Necesito buscar el formulario")
	public void queHemosEncontradoElFormulario() {
		fabian.wasAbleTo(Open.browserOn(new Home()));
		fabian.wasAbleTo(OpentTheBrowser.buscarForm());
	}

	@When("Halla llenado el fomulario")
	public void terminamosDeLlenarlo() {
		fabian.wasAbleTo(FillForm.fillForm());
		
	}

	@Then("Valido el campo del nombre")
	public void validaremosNuestroNombre() {				
		fabian.wasAbleTo(ValidateName.validateName());
		
		
		
	}
}
