package pageObjects;

import static com.codeborne.selenide.Selenide.$;

import org.openqa.selenium.By;

import com.codeborne.selenide.SelenideElement;

public class SelectPage {
	
	//ELEMENTOS
	SelenideElement selectOld = $(By.id("oldSelectMenu"));
	SelenideElement selectDinamico = $(By.id("withOptGroup"));
	
	
	//METODOS (Intercacoes com os elementos)
	public void selecionarOpcaoOldSelect(String opcao) {
		selectOld.selectOption(opcao);
	}
	
	public void selecionarDinamico(String opcao) {
		selectDinamico.click();
		SelenideElement opcaoDinamica = $(By.xpath("//div[@class=' css-26l3qy-menu']//*[.='" + opcao + "']"));
		opcaoDinamica.click();
	}

}
