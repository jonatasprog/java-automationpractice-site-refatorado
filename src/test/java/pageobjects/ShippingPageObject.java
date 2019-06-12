package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShippingPageObject {

	private WebDriver driver;
	
	public ShippingPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement termsOfServicesCheckbox() {
		return this.driver.findElement(By.id("cgv"));
	}

	public WebElement proceedToCheckoutButton() {
		return this.driver.findElement(By.name("processCarrier"));
	}

}