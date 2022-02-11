package UserInterface;

import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;

public class Form {
	
	
	public static final Target FIRST_NAME = Target.the("Campo First Name").located(By.id("firstName"));
	public static final Target LAST_NAME = Target.the("Campo Last Name").located(By.id("lastName"));
	public static final Target USER_EMAIL = Target.the("Campo User Email").located(By.id("userEmail"));
	public static final Target GENDER = Target.the("Radio Button Gender").locatedBy("//*[@id=\"genterWrapper\"]/div[2]/div[1]");
	public static final Target MOBILE_NUMBER = Target.the("Campo Mobile Number").located(By.id("userNumber"));
	public static final Target DATE_OF_BIRTH = Target.the("Campo Date Of Birth").located(By.id("dateOfBirthInput"));
	public static final Target DATE_OF_BIRTH_YEAR = Target.the("Seleccionar Año").locatedBy("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select");
	public static final Target DATE_OF_BIRTH_MONTH = Target.the("Seleccionar Mes").locatedBy("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select");
	public static final Target DATE_OF_BIRTH_DAY = Target.the("Seleccionar Dia").locatedBy("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[6]");
	public static final Target SUBJECTS = Target.the("Campo Subjects").located(By.id("subjectsInput"));
	public static final Target HOBBIES = Target.the("Check Box Hobbies").locatedBy("//*[@id=\"hobbiesWrapper\"]/div[2]/div[3]");
	public static final Target CURRENT_ADDRESS = Target.the("Direccion Local").located(By.id("currentAddress"));
	public static final Target STATE = Target.the("Select List State").located(By.id("state"));
	public static final Target STATE_LIST = Target.the("Select State").locatedBy("//*[@id=\"react-select-3-input\"]");
	public static final Target CITY = Target.the("Select State City").located(By.id("city"));
	public static final Target CITY_LIST = Target.the("Select State City").locatedBy("//*[@id=\"react-select-4-input\"]");
	public static final Target PANIPAT = Target.the("Select City").located(By.id("css-yk16xz-control"));
	public static final Target BUTTON_SUBMIT = Target.the("Button Submit").located(By.id("submit"));
	public static final Target TABLE = Target.the("Tabla Datos").located(By.id("modal-content"));
	
	
	

}
