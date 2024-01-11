package pageobjects;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import steps.Hooks;
import utils.MetodosUteis;

public class AdminPage extends MetodosUteis{
	
WebDriver driver = Hooks.getDriver();
	
	public AdminPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy (how = How.ID_OR_NAME, using = "menu_admin_viewAdminModule")
	private WebElement menuAdmin;
	
	@FindBy (how = How.ID_OR_NAME, using = "searchSystemUser_userName")
	private WebElement sendUsername;

	@FindBy (how = How.ID_OR_NAME, using = "searchSystemUser_userType")
	private WebElement sendUserRole;
	
	@FindBy (how = How.ID_OR_NAME, using = "searchSystemUser_employeeName_empName")
	private WebElement sendEmploye;
	
	@FindBy (how = How.ID_OR_NAME, using = "searchSystemUser_status")
	private WebElement sendStatus;
	
	@FindBy (how = How.ID_OR_NAME, using = "searchBtn")
	private WebElement btnSearch;
	
	
	public void clicarMenuAdmin() throws Exception{
		Thread.sleep(1000);
		menuAdmin.click();
	}
	
	String usuario;
	public void sendUsuario(String username) throws Exception{
		usuario = username;
		Thread.sleep(1000);
		sendUsername.clear();
		sendUsername.sendKeys(username);
	}
	
	public void sendUserRole(String tipo) throws Exception{
		Thread.sleep(1000);
		selecionar(sendUserRole, tipo);
	}
	
	public void sendEmploye(String employe) throws Exception{
		Thread.sleep(1000);
		sendEmploye.sendKeys(employe);
	}
	
	public void sendStatus(String stat) throws Exception{
		Thread.sleep(1000);
		selecionar(sendStatus, stat);
	}
	
	public void clicarSearch() throws Exception{
		Thread.sleep(1000);
		btnSearch.click();
	}
	
	public void validaLinkUsuario() throws Exception{
		Thread.sleep(2000);
		WebElement linkUsuario = (WebElement) driver.findElement(By.linkText(usuario));
		assertTrue(linkUsuario.isDisplayed());
	}
	
}
