package Rurnners;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;



@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features ="src/test/resources/Features",
		glue = "Steps",
		snippets = SnippetType.CAMELCASE
		)
public class AcceptanceTest {
	

}
