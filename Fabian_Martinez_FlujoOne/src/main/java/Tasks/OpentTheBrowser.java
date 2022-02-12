package Tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;

@DefaultUrl("http://practice.automationtesting.in/shop/")
public class OpentTheBrowser implements Task {

	@Override
	@Step("Abre el navegador")
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(Open.relativeUrl("http://practice.automationtesting.in/shop/"));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static OpentTheBrowser Navega() {

		return Tasks.instrumented(OpentTheBrowser.class);
	}

}
