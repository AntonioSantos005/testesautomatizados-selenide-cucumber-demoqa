package stepsDefinitions;


import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.LoginPage;

public class LoginSteps {
	
	LoginPage loginPage = new LoginPage();
	
	@Quando("informar o campo usuario {string}")
	public void informarOCampoUsuario(String userName) {
		loginPage.escreverNoCampoUserName(userName);
	}
	
	@Quando("informar o campo senha {string}")
	public void informarOCampoSenha(String password) {
		loginPage.escreverNoCampoPassword(password);
	}
	
	@Quando("clicar no botao login")
	public void clicarNoBotaoLogin() {
		loginPage.clicarNoBotaoLogin();
	}
	
	@Entao("^o sistema apresenta a mensagem de usuario logado \"([^\"]*)\"$")
	public void oSistemaApresentaAMensagem(String userName) throws Throwable {
		loginPage.validarTextoUserName(userName);
	}

	@Entao("^o sistema apresenta a mensagem de erro de login \"([^\"]*)\"$")
	public void oSistemaApresentaAMensagemDeErroDeLogin(String txtLoginInvalido) throws Throwable {
		loginPage.validarMsgLoginInvalido(txtLoginInvalido);
	}

}
