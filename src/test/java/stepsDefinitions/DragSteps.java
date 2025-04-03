package stepsDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.DragPage;

public class DragSteps {

	DragPage dragPage = new DragPage();

	@Quando("^arrastar o elemento para o outro$")
	public void arrastarOElementoParaOOutro() throws Throwable {
		dragPage.arrastarESoltarCaixaNaOutra();
	}

	@Entao("^o sistema apresenta a mensagem soltou$")
	public void oSistemaApresentaAMensagemSoltou() throws Throwable {
		dragPage.validarArrastarESoltar();
	}

}
