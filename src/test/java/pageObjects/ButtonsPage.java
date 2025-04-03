package pageObjects;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.WebDriverRunner.*;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import com.codeborne.selenide.SelenideElement;

public class ButtonsPage {
	
	//ELEMENTOS
	SelenideElement botaoDoubleClick = $(By.id("doubleClickBtn"));
	SelenideElement botaoRightClick = $(By.id("rightClickBtn"));
	SelenideElement msgDoubleClick = $(By.id("doubleClickMessage"));
	SelenideElement msgRightClick = $(By.id("rightClickMessage"));
	
	//METODOS (Intercacoes com os elementos)
	public void cliqueDuploBotaoDoubleClick() {
		botaoDoubleClick.doubleClick();
	}
	
	public void cliqueComDireitoBotaoRightClick() {
		botaoRightClick.contextClick();
	}
	
	public void validarCliqueDuplo(String msg) {
		msgDoubleClick.shouldHave(exactText(msg));
	}
	
	public void validarCliqueDireito(String msg) {
		msgRightClick.shouldHave(exactText(msg));
	}
	
	public void clicarEsegurar() {
		Actions acao = new Actions(getWebDriver());
		acao.clickAndHold(botaoRightClick).build().perform();
	}
	
	public void validarCliqueDuploTextoParcial(String msg) {
		msgDoubleClick.shouldHave(text(msg));
	}
	
	public void validarCliqueDireitoTextoParcial(String msg) {
		msgRightClick.shouldHave(text(msg));
	}
	
	public void validarCliqueDuploTextoVisivel() {
		msgDoubleClick.shouldBe(visible);
	}
	
	public void validarCliqueDireitoTextoExiste() {
		msgRightClick.shouldBe(exist);
	}
	
}
