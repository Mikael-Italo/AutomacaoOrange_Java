package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	public static WebDriver driver;
	
	@Before
	public void iniciarDriver() {
		 System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		   driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().deleteAllCookies();
		   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	
	@After
	public void fecharDriver() {
		driver.quit();
	}
	
	public static WebDriver getDriver() {
		 return driver;
	}
	
	
	
}
