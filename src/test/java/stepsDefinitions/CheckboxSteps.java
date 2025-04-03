package stepsDefinitions;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.CheckboxPage;

public class CheckboxSteps {
	
	CheckboxPage checkboxPage = new CheckboxPage();
	
	@Quando("^expandir a pasta home$")
	public void expandirAPastaHome() throws Throwable {
		checkboxPage.clicarBotaoExpandirPastaHome();
	}

	@E("^expandir a pasta Downloads$")
	public void expandirAPastaDownloads() throws Throwable {
		checkboxPage.clicarBotaoExpandirPastaDownloads();
	}

	@E("^clicar no checkbox Word File$")
	public void clicarNoCheckboxWordFile() throws Throwable {
		checkboxPage.clicarCehckboxWordFile();
	}

	@E("^clicar no checkbox Excel File$")
	public void clicarNoCheckboxExcelFile() throws Throwable {
		checkboxPage.clicarCehckboxExcelFile();
	}

	@Entao("^o sistema apresenta a mensagem de arquivos selecionados \"([^\"]*)\"$")
	public void oSistemaApresentaAMensagemDeArquivosSelecionados(String msg) throws Throwable {
		checkboxPage.validarMsgArquivosSelecionados(msg);
	}

}
