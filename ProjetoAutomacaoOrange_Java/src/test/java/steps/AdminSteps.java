package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pageobjects.AdminPage;
import pageobjects.LoginPage;

public class AdminSteps {
	
	AdminPage ad = new AdminPage(Hooks.getDriver());
	LoginPage l = new LoginPage(Hooks.getDriver());
	
	@Dado("^que o usuario esteja logado$")
	public void que_o_usuario_esteja_logado() throws Throwable {  
	    l.contextoLogin();
	}

	@Quando("^o usuario acionar o menu Admin$")
	public void o_usuario_acionar_o_menu_Admin() throws Throwable {
	    ad.clicarMenuAdmin();
	}

	@Quando("^informar o campo de busca Username como \"([^\"]*)\"$")
	public void informar_o_campo_de_busca_Username_como(String arg1) throws Throwable {
	    ad.sendUsuario(arg1);
	   
	}

	@Quando("^informar o campo de busca User Role como \"([^\"]*)\"$")
	public void informar_o_campo_de_busca_User_Role_como(String arg1) throws Throwable {
	    ad.sendUserRole(arg1);
	}

	@Quando("^informar o campo de busca Employee Name como \"([^\"]*)\"$")
	public void informar_o_campo_de_busca_Employee_Name_como(String arg1) throws Throwable {
	    ad.sendEmploye(arg1);
	}

	@Quando("^informar o campo de busca Status como \"([^\"]*)\"$")
	public void informar_o_campo_de_busca_Status_como(String arg1) throws Throwable {
	    ad.sendStatus(arg1);
	}

	@Quando("^clicar no botao Search$")
	public void clicar_no_botao_Search() throws Throwable {
	    ad.clicarSearch();
	}

	@Entao("^o sistema devera apresentar lista com o resultado da busca de acordo com os filtros$")
	public void o_sistema_devera_apresentar_lista_com_o_resultado_da_busca_de_acordo_com_os_filtros() throws Throwable {
	   ad.validaLinkUsuario();
	}
}
