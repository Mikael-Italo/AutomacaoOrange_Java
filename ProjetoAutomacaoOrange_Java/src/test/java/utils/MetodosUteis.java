package utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import steps.Hooks;


public class MetodosUteis {

	//protected WebDriver driver;
	
	public void esperarElemento(WebElement elemento) {
		//driver = Hooks.getDriver();
		WebDriverWait wait = new WebDriverWait(Hooks.getDriver(), 10);
		wait.until(ExpectedConditions.visibilityOf(elemento));
	}
	
	public void selecionar(WebElement element, String texto) {
		//driver = Hooks.getDriver();
		Select sl = new Select(element);
		sl.selectByVisibleText(texto);
	}
}
