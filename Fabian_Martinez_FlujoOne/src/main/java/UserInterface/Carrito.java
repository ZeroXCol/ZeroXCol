package UserInterface;

import net.serenitybdd.screenplay.targets.Target;

public class Carrito {
	
	
	
	
	public static final Target ELIMINAR_PROD_CARRITO = Target.the("Eliminar Prod del Carrito").locatedBy("//*[@id=\"page-34\"]/div/div[1]/form/table/tbody/tr[1]/td[1]/a");
	public static final Target CAMPO_VALOR_TOTAL_CARRITO = Target.the("Valor total de carrito").locatedBy("//*[@id=\"page-34\"]/div/div[1]/div[2]/div/table/tbody/tr[3]/td/strong");
	


}
