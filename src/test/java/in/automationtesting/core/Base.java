package in.automationtesting.core;

import static in.automationtesting.core.DriverFactory.getDriver;

import java.io.File;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base{
	protected WebDriverWait wait = new WebDriverWait(getDriver(),10);
	protected WebDriverWait shortWait = new WebDriverWait(getDriver(),1);
	protected WebDriver driver;
	public static String diretorioDownload = System.getProperty("user.dir") + File.separator + "Downloads Robo" + File.separator;
	Actions builder = new Actions(getDriver());

	/*************************   METODOS   ****************************************/

	public void acessarEndereco(String endereco) {
		getDriver().get(endereco);
		wait.until(ExpectedConditions.jsReturnsValue("return document.readyState==\"complete\";"));
	}

	public void fecharBrowser() {
		getDriver().close();
	}

	public WebElement acharElemento(By by) {
		return getDriver().findElement(by);
	}

	public void apertarEnter() throws Exception {
		getDriver().switchTo().activeElement().sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.jsReturnsValue("return document.readyState==\"complete\";"));
	}	
	
	public static void waitBase(int intSegundo) {
		try {
			synchronized (getDriver()) {
				getDriver().wait(intSegundo * 1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clicar(By by) throws Exception{
		try {
			wait.until(ExpectedConditions.elementToBeClickable(by));
			getDriver().findElement(by).click();
			waitBase(1);
			wait.until(ExpectedConditions.jsReturnsValue("return document.readyState==\"complete\";"));
		}catch(Exception e){
			throw new Exception("Não foi possível localizar/clicar no elemento");
		}
	}

	public void escrever(By by, String texto) {
		wait.until(ExpectedConditions.elementToBeClickable(by));
		getDriver().findElement(by).sendKeys(texto);
		waitBase(1);
	}

	protected String geradorString() {
		String GERADORSTRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		StringBuilder gera = new StringBuilder();
		Random rnd = new Random();
		while (gera.length() < 13) { 
			int index = (int) (rnd.nextFloat() * GERADORSTRING.length());
			gera.append(GERADORSTRING.charAt(index));
		}
		String Str = gera.toString();
		return Str;
	}

	public Boolean elementoClicavel(By by) throws Exception {
		try {
			shortWait.until(ExpectedConditions.elementToBeClickable(by));
			return true;
		}catch(Exception e) {
			return false;
		}
	}

	public void passarMouseEmCima(By by) {
		builder.moveToElement(getDriver().findElement(by)).perform();
	}

	public  String obterTexto(By by) throws Exception {
		try {
			return getDriver().findElement(by).getText();
		}catch(Exception e) {
			throw new Exception("Não foi localizada a mensagem de sucesso");
		}
	}
}