package stepsDefinitions;

import io.cucumber.java.pt.Quando;
import pageObjects.SelectPage;

public class SelectSteps {
	
	SelectPage selectPage = new SelectPage();
	

	@Quando("^selecionar a opcao \"([^\"]*)\"$")
	public void selecionarAOpcao(String opcao) throws Throwable {
		selectPage.selecionarOpcaoOldSelect(opcao);
	}


	@Quando("^selecionar a opcao dinamica \"([^\"]*)\"$")
	public void selecionarAOpcaoDinamica(String opcao) throws Throwable {
		selectPage.selecionarDinamico(opcao);
	}

}
