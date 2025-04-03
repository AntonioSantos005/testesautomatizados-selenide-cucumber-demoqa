package utils;

import static com.codeborne.selenide.Selenide.*;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;

import com.codeborne.selenide.SelenideElement;

import io.cucumber.java.Scenario;

public class Utils {
	
	public static void aceitarAlerta() {
		Alert alertas = switchTo().alert();
		alertas.accept();
	}
	
	public static void recusarAlerta() {
		Alert alertas = switchTo().alert();
		alertas.dismiss();
	}
	
	public static void escreverNoAlertaEConfirmar(String msg) {
		Alert alertas = switchTo().alert();
		alertas.sendKeys(msg);
	}
	
	public static void arrasTarESoltar(SelenideElement from, SelenideElement to) {
		actions().dragAndDrop(from, to).build().perform();
	}
	
	public static void capturarScreenshot(Scenario scenario) {
		try {
			byte[] tempshot = screenshot(OutputType.BYTES);
			scenario.attach(tempshot, "image/png", scenario.getName());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
