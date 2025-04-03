package pageObjects;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

import org.openqa.selenium.By;

import com.codeborne.selenide.SelenideElement;

public class MenuPage {
	
	//ELEMENTOS
	SelenideElement menuNivel1 = $(By.xpath("//a[.='Main Item 2']"));
	SelenideElement menuNivel2 = $(By.xpath("//a[.='SUB SUB LIST »']"));
	SelenideElement menuNivel3 = $(By.xpath("//a[.='Sub Sub Item 1']"));
	
	//METODOS (Intercacoes com os elementos)
	public void acessarMenuNivel3() {
		menuNivel1.hover();
		menuNivel2.hover();
	}
	
	public void validarMenuNivel3() {
		menuNivel3.shouldBe(visible);
	}
	
	
	
}
