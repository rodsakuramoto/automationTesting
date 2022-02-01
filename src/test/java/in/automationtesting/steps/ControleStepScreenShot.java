package in.automationtesting.steps;

import static in.automationtesting.core.DriverFactory.getDriver;
import java.io.IOException;

import in.automationtesting.core.ConfigScreenshot;
import cucumber.api.Scenario;
import cucumber.api.java.AfterStep;

import static in.automationtesting.core.Base.waitBase;
public class ControleStepScreenShot {
	@AfterStep
	public static void configValidaStep(Scenario cenario) throws IOException {
		waitBase(1);
		if(cenario.isFailed()){
			cenario.write("Evidência");
			cenario.embed(ConfigScreenshot.takeScreenShotAsByte(getDriver()), "image/png");
		}
	}
}
