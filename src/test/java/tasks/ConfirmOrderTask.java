package tasks;

import org.openqa.selenium.WebDriver;

import pageobjects.ConfirmOrderPageObject;

public class ConfirmOrderTask {

	private ConfirmOrderPageObject confirmOrderPageObjectInstance;

	public ConfirmOrderTask(WebDriver driver) {
		this.confirmOrderPageObjectInstance = new ConfirmOrderPageObject(driver);
	}

	public void clicarBotaoConfirmOrder() {
		this.confirmOrderPageObjectInstance.confirmOrderButton().click();
	}

}