package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderConfirmationPageObject {

	private WebDriver driver;
	
	public OrderConfirmationPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement orderCompleteMessage() {
		return this.driver.findElement(By.cssSelector("p[class='cheque-indent']"));
	}

}