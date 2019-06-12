package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaymentPageObject{

	private WebDriver driver;
	
	public PaymentPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement paymentMethodLink() {
		return this.driver.findElement(By.partialLinkText("Pay by bank wire"));
	}
	
	public WebElement totalPricePaymentLabel() {
		return this.driver.findElement(By.cssSelector("#total_price"));
	}
	
	

}