package pageObjects;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;

import org.openqa.selenium.By;

import com.codeborne.selenide.SelenideElement;

public class LoginPage {
	
	//ELEMENTOS
	SelenideElement campoUserName = $(By.id("userName"));
	SelenideElement campoPassword = $(By.id("password"));
	SelenideElement botaoLogin = $(By.id("login"));
	SelenideElement textoUserName = $(By.id("userName-value"));
	SelenideElement textoLoginInvalido = $(By.id("name"));
	
	//METODOS (Intercacoes com os elementos)
	public void escreverNoCampoUserName(String userName) {
		campoUserName.sendKeys(userName);
	}
	
	public void escreverNoCampoPassword(String password) {
		campoPassword.sendKeys(password);
	}
	
	public void clicarNoBotaoLogin() {
		botaoLogin.click();
	}
	
	public void validarTextoUserName(String userName) {
//		assertEquals("AntonioSantos", textoUserName.getText());
		textoUserName.shouldHave(exactText(userName));
	}
	
	public void validarMsgLoginInvalido(String txtLoginInvalido) {
		textoLoginInvalido.shouldHave(exactText(txtLoginInvalido));
	}

}
