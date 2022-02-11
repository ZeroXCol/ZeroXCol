package UserInterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://demoqa.com/")
public class Home extends PageObject {

	public static final Target FORMULARIO = Target.the("Button Formulario").locatedBy("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[3]/h5");
	public static final Target PRACTICE_FORM = Target.the("Button Formulario").locatedBy("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[2]/div");

}
