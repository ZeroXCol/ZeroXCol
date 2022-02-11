package Tasks;

import UserInterface.Home;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;

@DefaultUrl("https://demoqa.com/")
public class OpentTheBrowser implements Task {

	@Override
	@Step("Abre el navegador")
	public <T extends Actor> void performAs(T actor) {
		

	        
			actor.attemptsTo(Open.relativeUrl("https://demoqa.com/"));
			actor.attemptsTo(Click.on(Home.FORMULARIO), 
			Click.on(Home.PRACTICE_FORM));
	  

	}

	public static OpentTheBrowser buscarForm() {

		return Tasks.instrumented(OpentTheBrowser.class);
	}

}
