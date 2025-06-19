package stepsDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.DragPage;

public class DragSteps {

	DragPage dragPage = new DragPage();

	@Quando("eu arrastar a caixa sobre a outra")
	public void euArrastarACaixaSobreAOutra() {
		dragPage.arrastarESoltarCaixa();
	    
	}
	@Entao("a caixa apresenta o texto {string}")
	public void aCaixaApresentaOTexto(String texto) {
		dragPage.validarCaixaFixaTexto(texto);
	}

}
