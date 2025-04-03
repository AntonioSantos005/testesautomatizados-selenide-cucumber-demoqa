package pageObjects;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

import org.openqa.selenium.By;

import com.codeborne.selenide.SelenideElement;

public class ToolTipPage {
	
	//ELEMENTOS
	SelenideElement botaoHover = $(By.id("toolTipButton"));
	SelenideElement toolTip = $(By.xpath("//div[@class='tooltip-inner']"));
	
	
	//METODOS (Intercacoes com os elementos)
	public void colocarMouseNoBotaoHover() {
		botaoHover.hover();
	}
	
	public void validarTextoToolTip(String text) {
		toolTip.shouldBe(exactText(text));
	}
	

}
