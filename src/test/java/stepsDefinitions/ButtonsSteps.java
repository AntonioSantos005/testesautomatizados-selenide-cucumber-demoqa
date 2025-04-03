package stepsDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.ButtonsPage;

public class ButtonsSteps {
	
	ButtonsPage buttonsPage = new ButtonsPage();
	
	@Quando("^fizer um clique duplo no botao double click$")
	public void fizerUmCliqueDuploNoBotaoDoubleClick() throws Throwable {
		buttonsPage.cliqueDuploBotaoDoubleClick();
	}

	@Entao("^o sistema apresenta a mensagem de click duplo \"([^\"]*)\"$")
	public void oSistemaApresentaAMensagemDeClickDuplo(String msg) throws Throwable {
		buttonsPage.validarCliqueDuplo(msg);
	}

	@Quando("^fizer um clique com o direito no botao right click$")
	public void fizerUmCliqueComODireitoNoBotaoRightClick() throws Throwable {
		buttonsPage.cliqueComDireitoBotaoRightClick();
	}

	@Entao("^o sistema apresenta a mensagem de click com direito \"([^\"]*)\"$")
	public void oSistemaApresentaAMensagemDeClickComDireito(String msg) throws Throwable {
		buttonsPage.validarCliqueDireito(msg);
	}

}
