package UserInterface;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://practice.automationtesting.in/shop/")
public class Home extends PageObject {

	public static final Target ALGORIMO_ESTRUCT_DATOS_BTN = Target.the("Add Car").locatedBy("//*[@id=\"content\"]/ul/li[5]/a[2]");
	public static final Target CARRITO_COMPRAS_BTN = Target.the("Botón Carrito").locatedBy("//*[@id=\"wpmenucartli\"]/a/span[1]");
	public static final Target DOMINAR_JAVA_SCRIPT_BTN = Target.the("Add Car").locatedBy("//*[@id=\"content\"]/ul/li[6]/a[2]");
	//public static final Target RUBY_SELENIO_LEE_MAS_BTN = Target.the("Add Car").locatedBy("//*[@id=\"content\"]/ul/li[7]/a[2]/font/font");
	

}
