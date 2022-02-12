package Questions;

import UserInterface.Carrito;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.Actor;

public class ValidatarTotal implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		
	        
			String valorTotalCarrito = Carrito.CAMPO_VALOR_TOTAL_CARRITO.resolveFor(actor).getText();								
			valorTotalCarrito = valorTotalCarrito.substring(1);
			System.out.println("***********************"+valorTotalCarrito+"**********************");
			
			double valorTotalCarritoD = Double.parseDouble(valorTotalCarrito);
			
			if (valorTotalCarritoD < 400) {
				System.out.println("-------------------------El valor total del carrito es inferior a 400-------------------------------------");
				
			}			
			
			

	}

	public static ValidatarTotal validatarTotal() {

		return Tasks.instrumented(ValidatarTotal.class);
	}

}
