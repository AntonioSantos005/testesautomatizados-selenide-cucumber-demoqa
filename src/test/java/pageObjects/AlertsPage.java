package pageObjects;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;

import org.openqa.selenium.By;

import com.codeborne.selenide.SelenideElement;

public class AlertsPage {
	
	//ELEMENTOS
	SelenideElement botaoConfirm = $(By.id("confirmButton"));
	SelenideElement result = $(By.id("confirmResult"));
	
	SelenideElement botaoAlertaTexto = $(By.id("promtButton"));
	SelenideElement resultAlertaTexto = $(By.id("promptResult"));
	
	public void clicarNoBotaoCornfirm() {
		botaoConfirm.click();
	}
	
	public void validarMsgResult(String msg) {
		result.shouldBe(exactText(msg));
	}
	
	public void clicarNoBotaoAlertaTexto() {
		botaoAlertaTexto.click();
	}
	
	public void validarMsgAlertaTexto(String msg) {
		resultAlertaTexto.shouldBe(exactText("You entered " + msg));
	}

}
