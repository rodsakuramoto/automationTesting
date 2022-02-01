package in.automationtesting.core;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {
	private static WebDriver driver;

	private static ChromeOptions options;

	private  static HashMap<String, Object> chromePrefs = new HashMap<String, Object>();

	public static WebDriver getDriver() {
		if(driver == null) {
			options = new ChromeOptions();
			chromePrefs.put("profile.default_content_settings.popups", 0);
			chromePrefs.put("download.default_directory", Base.diretorioDownload);

			options.setExperimentalOption("prefs", chromePrefs);
			driver = new ChromeDriver(options);

			driver.manage().window().maximize();

		}
		return driver;
	}
	public static void killDriver() {
		if(driver != null) {
			driver.quit();
			driver = null; 
		}
	}

}
