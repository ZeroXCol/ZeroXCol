package Tasks;

import UserInterface.Table;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class ValidateName implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		
	        
			String nombre = Table.TABLE.resolveFor(actor).getText();
			System.out.println("***********************"+nombre+"**********************");
			
			actor.attemptsTo(WaitUntil.the(Table.TABLE, WebElementStateMatchers.isVisible()).forNoMoreThan(20).seconds());
			

	}

	public static ValidateName validateName() {

		return Tasks.instrumented(ValidateName.class);
	}

}
