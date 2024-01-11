package steps;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pageobjects.LoginPage;

public class LoginSteps {
	WebDriver driver;

	@Dado("^que o usuario esteja na pagina principal do sistema$")
	public void que_o_usuario_esteja_na_pagina_principal_do_sistema() throws Throwable {
	  driver = Hooks.getDriver();
	  Thread.sleep(1000);
	}

	@Quando("^informar o campo Username como \"([^\"]*)\"$")
	public void informar_o_campo_Username_como(String arg1) throws Throwable {
		LoginPage login = new LoginPage(driver);
		login.sendUsuario(arg1);
	}

	@Quando("^informar o campo Password como \"([^\"]*)\"$")
	public void informar_o_campo_Password_como(String arg1) throws Throwable {
		LoginPage login = new LoginPage(driver);
		login.sendSenha(arg1);
	}

	@Quando("^clicar no botao Login$")
	public void clicar_no_botao_Login() throws Throwable {
		LoginPage login = new LoginPage(driver);
	    login.clicarbtnLogin();
	}

	@Entao("^o sistema devera autorizar o login, exibindo a pagina contendo o Dashboard$")
	public void o_sistema_devera_autorizar_o_login_exibindo_a_pagina_contendo_o_Dashboard() throws Throwable {
		LoginPage login = new LoginPage(driver);
		 login.validaLogin();
	}
}
