package stepsDefinitions;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static utils.Utils.capturarScreenshot;

import commons.Browser;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	
	Browser browser = new Browser();
	
	@Before(order = 0, value = "@Login")
	public void setUpLogin() {
		browser.openPage("login");
	}
	
	@Before(order = 0, value = "@Checkbox")
	public void setUpCheckbox() {
		browser.openPage("checkbox");
	}
	
	@Before(order = 0, value = "@Buttons")
	public void setUpButton() {
		browser.openPage("buttons");
	}
	
	@Before(order = 0, value = "@Dynamic")
	public void setUpDynamic() {
		browser.openPage("dynamic-properties");
	}
	
	@Before(order = 0, value = "@ToolTip")
	public void setUpToolTip() {
		browser.openPage("tool-tips");
	}
	
	@Before(order = 0, value = "@Menu")
	public void setUpMenu() {
		browser.openPage("menu#");
	}
	
	@Before(order = 0, value = "@Select")
	public void setUpSelect() {
		browser.openPage("select-menu");
	}
	
	@Before(order = 0, value = "@Alerts")
	public void setUpAlerts() {
		//Selenide.open("https://demoqa.com/");
		browser.openPage("alerts");
	}
	
	@Before(order = 0, value = "@Drag")
	public void setUpDrag() {
		browser.openPage("droppable");
	}
	
	@After
	public void tearDown(Scenario scenario) throws InterruptedException {
		capturarScreenshot(scenario);
		closeWebDriver();		
	}
	
//	@AfterStep
//	public void tearDownStep(Scenario scenario) throws InterruptedException {
//		capturarScreenshot(scenario);;
//	}
}
