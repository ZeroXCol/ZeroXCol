package Tasks;

import UserInterface.Carrito;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class EliminarProductos implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(

				Click.on(Carrito.ELIMINAR_PROD_CARRITO)
		);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static EliminarProductos eliminarProductos() {

		return Tasks.instrumented(EliminarProductos.class);
	}
}
