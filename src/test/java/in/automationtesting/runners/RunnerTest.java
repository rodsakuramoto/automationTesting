package in.automationtesting.runners;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import in.automationtesting.core.DriverFactory;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features  = "src/test/resources/features",
		glue = {"in.automationtesting.steps"},		
		monochrome = true,
		tags ="@teste",
		plugin = {"pretty", "html:target/relatorios/htmls/automationtesting","json:target/relatorios/htmls/automationtesting/CucumberReport.json"}, 
		snippets = SnippetType.CAMELCASE,
		dryRun = false,
		strict = false
		)
public class RunnerTest {
	@AfterClass
	public static void finaliza() {
		DriverFactory.killDriver();
	}	
}

