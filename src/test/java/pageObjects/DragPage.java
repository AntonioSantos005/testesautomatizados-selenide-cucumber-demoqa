package pageObjects;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;

import org.openqa.selenium.By;

import com.codeborne.selenide.SelenideElement;

import static utils.Utils.*;

public class DragPage {
	
	//ELEMENTOS
	SelenideElement caixaArrastavel = $(By.id("draggable"));
	SelenideElement caixaEstatica = $(By.id("droppable"));
	
	
	public void arrastarESoltarCaixaNaOutra() {
		arrasTarESoltar(caixaArrastavel, caixaEstatica);
	}
	
	public void validarArrastarESoltar() {
		caixaEstatica.shouldHave(exactText("Dropped!"));
	}
	

}
