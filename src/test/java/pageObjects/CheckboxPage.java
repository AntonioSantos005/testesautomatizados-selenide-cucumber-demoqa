package pageObjects;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

import org.openqa.selenium.By;

import com.codeborne.selenide.SelenideElement;

public class CheckboxPage {
	
	//ELEMENTOS
	SelenideElement botaoExpandirPastaHome = $(By.xpath("//span[.='Home']//button"));
	SelenideElement botaoExpandirPastaDownloads = $(By.xpath("//span[.='Downloads']//button"));
	SelenideElement checkboxWordFile = $(By.xpath("//label[@for='tree-node-wordFile']"));
	SelenideElement checkboxExcelFile = $(By.xpath("//label[@for='tree-node-excelFile']"));
	SelenideElement msgArquivosSelecionados = $(By.id("result"));
	
	
	//METODOS (Intercacoes com os elementos)
	public void clicarBotaoExpandirPastaHome() {
		botaoExpandirPastaHome.click();
	}
	
	public void clicarBotaoExpandirPastaDownloads() {
		botaoExpandirPastaDownloads.click();
	}
	
	public void clicarCehckboxWordFile() {
		checkboxWordFile.click();
	}
	
	public void clicarCehckboxExcelFile() {
		checkboxExcelFile.click();
	}
	
	public void validarMsgArquivosSelecionados(String msg) {
		msgArquivosSelecionados.shouldHave(exactText(msg));
	}

}
