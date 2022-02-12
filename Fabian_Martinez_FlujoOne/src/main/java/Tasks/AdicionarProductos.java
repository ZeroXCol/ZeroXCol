package Tasks;

import UserInterface.Home;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class AdicionarProductos implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(

				Click.on(Home.DOMINAR_JAVA_SCRIPT_BTN),
				Click.on(Home.ALGORIMO_ESTRUCT_DATOS_BTN), 
				Click.on(Home.CARRITO_COMPRAS_BTN),
				Click.on(Home.CARRITO_COMPRAS_BTN)

		);

	}

	public static AdicionarProductos adicionarProductos() {

		return Tasks.instrumented(AdicionarProductos.class);
	}
}
