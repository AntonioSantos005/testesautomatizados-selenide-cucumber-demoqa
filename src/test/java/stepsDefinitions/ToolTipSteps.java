package stepsDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.ToolTipPage;

public class ToolTipSteps {
	
	ToolTipPage toolTipPage = new ToolTipPage();

	@Quando("^colocar o mouse em cima do botao hover$")
	public void colocarOMouseEmCimaDoBotaoHover() throws Throwable {
		toolTipPage.colocarMouseNoBotaoHover();
	}

	@Entao("^o sistema apresenta a mensagem o tooltip \"([^\"]*)\"$")
	public void oSistemaApresentaAMensagemOTooltip(String text) throws Throwable {
		toolTipPage.validarTextoToolTip(text);
	}


}
