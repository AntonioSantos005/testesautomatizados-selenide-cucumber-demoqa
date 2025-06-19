package pageObjects;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.DragAndDropOptions.to;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

import com.codeborne.selenide.SelenideElement;

public class DragPage {
	
	//ELMENTOS
	private SelenideElement caixaMovel = $("#draggable");
	private SelenideElement caixaFixa = $("#droppable");
	
	//METODOS
	public void arrastarESoltarCaixa() {
		sleep(1500);
		caixaMovel.dragAndDrop(to(caixaFixa).usingSeleniumActions());
	}
	
	public void validarCaixaFixaTexto(String texto) {
		caixaFixa.shouldBe(exactText(texto));
	}
	
}
