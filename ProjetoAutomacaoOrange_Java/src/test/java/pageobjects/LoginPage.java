package pageobjects;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utils.MetodosUteis;

public class LoginPage extends MetodosUteis{

	protected WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (how = How.ID, using = "txtUsername")
	private WebElement inptUsuario;
	
	@FindBy (how = How.ID_OR_NAME, using = "txtPassword")
	private WebElement inptSenha;
	
	@FindBy (how = How.ID_OR_NAME, using = "btnLogin")
	private WebElement btnLogin;
	
	@FindBy (how = How.CLASS_NAME, using = "quickLaunge")
	private WebElement validaLoginDashboard;
	
	
	public void sendUsuario(String usuario) throws Exception {
		//esperarElemento(inptUsuario);
		Thread.sleep(2000);
		inptUsuario.sendKeys(usuario);
	}
	
	public void sendSenha(String senha) throws Exception {
		//esperarElemento(inptSenha);
		Thread.sleep(2000);
		inptSenha.sendKeys(senha);
	}
	
	public void clicarbtnLogin() throws Exception{
		//esperarElemento(btnLogin);
		Thread.sleep(2000);
		btnLogin.click();
	}
	
	public void validaLogin() throws Exception{
		//esperarElemento(validaLoginDashboard);
		assertTrue(validaLoginDashboard.isEnabled());
	}
	
	public void contextoLogin() throws Exception {
		sendUsuario("Admin");
		sendSenha("admin123");
		clicarbtnLogin();
	}
	
}