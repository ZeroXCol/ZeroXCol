package Tasks;

import org.openqa.selenium.Keys;
import UserInterface.Form;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class FillForm implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(
				Enter.theValue("Fabian Arturo").into(Form.FIRST_NAME),
				Enter.theValue("Martinez Huertas").into(Form.LAST_NAME),
				Enter.theValue("Fabihuertas@hotmail.com").into(Form.USER_EMAIL), 
				Click.on(Form.GENDER),
				Enter.theValue("3202006425").into(Form.MOBILE_NUMBER),
				Click.on(Form.DATE_OF_BIRTH),
				SelectFromOptions.byValue("1996").from(Form.DATE_OF_BIRTH_YEAR),
				SelectFromOptions.byValue("2").from(Form.DATE_OF_BIRTH_MONTH),
				Click.on(Form.DATE_OF_BIRTH_DAY),				
				Enter.theValue("Programacion").into(Form.SUBJECTS),				
				Click.on(Form.HOBBIES),
				Enter.theValue("CL100 #200-300").into(Form.CURRENT_ADDRESS),
				Click.on(Form.STATE),							
				Enter.theValue("Haryana").into(Form.STATE_LIST),
				Hit.the(Keys.ENTER).into(Form.STATE_LIST),
				Click.on(Form.CITY),
				Enter.theValue("Panipat").into(Form.CITY_LIST),
				Hit.the(Keys.ENTER).into(Form.CITY_LIST),
				Click.on(Form.BUTTON_SUBMIT)
				
				
				);

	}

	public static FillForm fillForm() {

		return Tasks.instrumented(FillForm.class);
	}
}
