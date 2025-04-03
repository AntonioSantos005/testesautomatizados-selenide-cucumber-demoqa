package stepsDefinitions;

import io.cucumber.java.pt.Quando;
import pageObjects.DynamicPage;

public class DynamicSteps {
	
	DynamicPage dynamicPage = new DynamicPage();

	@Quando("^clicar no botao enable after$")
	public void clicarNoBotaoEnableAfter() throws Throwable {
		dynamicPage.clicarBotaoEnableAfter();
	}

}
