package pageObjects;

import static com.codeborne.selenide.Condition.interactable;
import static com.codeborne.selenide.Selenide.$;

import java.time.Duration;

import org.openqa.selenium.By;

import com.codeborne.selenide.SelenideElement;

public class DynamicPage {
	
	//ELEMENTOS
	SelenideElement botaoEnableAfter = $(By.id("enableAfter"));
	SelenideElement botaoVisibleAfter = $(By.id("visibleAfter"));
	
	
	
	//METODOS (Intercacoes com os elementos)
	public void clicarBotaoEnableAfter() {
		botaoEnableAfter.shouldBe(interactable, Duration.ofSeconds(10)).click();
	}
	

}
