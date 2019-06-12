package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProceedToCheckoutPageObject {

	private WebDriver driver;
	
	public ProceedToCheckoutPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement proceedToCheckoutButton() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement proceedToCheckoutButton = wait.until(ExpectedConditions
				.elementToBeClickable(By.cssSelector("a[title='Proceed to checkout']")));
		return proceedToCheckoutButton;
	}

}
