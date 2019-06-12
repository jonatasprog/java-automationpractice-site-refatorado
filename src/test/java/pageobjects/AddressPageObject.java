package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddressPageObject {

	private WebDriver driver;
	
	public AddressPageObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement enderecoTextfield() {
		return this.driver.findElement(By.cssSelector("li[class='address_address1 address_address2']"));

	}
	
	public WebElement cidadeEstadoZipCodeTextfield() {
		return this.driver.findElement(By.cssSelector("li[class='address_city address_state_name address_postcode']"));
	}
	
	public WebElement paisTextfield() {
		return this.driver.findElement(By.cssSelector("li[class='address_country_name']"));
	}

	public WebElement proceedToCheckoutButton() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement proceedToCheckoutButton = wait.until(ExpectedConditions
				.elementToBeClickable(By.cssSelector("button[name='processAddress']")));
		return proceedToCheckoutButton;
	}

}