package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SummaryPageObject {

	private WebDriver driver;
	
	public SummaryPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement totalPriceSummaryLabel() {
		return this.driver.findElement(By.id("total_price"));
	}
	
	public WebElement productNameLabel() {
		return this.driver.findElement(By.cssSelector("p.product-name"));
	}
	
	public WebElement proceedToCheckoutButton() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement proceedToCheckoutButton = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//div[@id='center_column']//*[@title='Proceed to checkout']")));
		return proceedToCheckoutButton;
	}
	
}