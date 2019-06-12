package tasks;

import org.openqa.selenium.WebDriver;

import pageobjects.ShippingPageObject;

public class ShippingTask {
	private ShippingPageObject shippingPageObjectInstance;

	public ShippingTask(WebDriver driver) {
		this.shippingPageObjectInstance = new ShippingPageObject(driver);
	}

	public void aceitarTermsOfService() {
		this.shippingPageObjectInstance.termsOfServicesCheckbox().click();
		this.shippingPageObjectInstance.proceedToCheckoutButton().click();
	}

}
