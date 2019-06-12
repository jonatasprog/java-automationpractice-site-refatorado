package tasks;

import org.openqa.selenium.WebDriver;

import pageobjects.ProceedToCheckoutPageObject;

public class ProceedToCheckoutTask {
	private ProceedToCheckoutPageObject proceedToCheckoutPageObjectInstance;

	public ProceedToCheckoutTask(WebDriver driver) {
		this.proceedToCheckoutPageObjectInstance = new ProceedToCheckoutPageObject(driver);
	}

	public void clicarBotaoProceedToCheckout() {
		this.proceedToCheckoutPageObjectInstance.proceedToCheckoutButton().click();
	}
	
}
	
