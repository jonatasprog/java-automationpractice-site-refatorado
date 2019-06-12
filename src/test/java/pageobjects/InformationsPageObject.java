package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class InformationsPageObject {

	private WebDriver driver;
	
	public InformationsPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement firstNameTextfield() {
		return this.driver.findElement(By.id("customer_firstname"));
	}

	public WebElement lastNameTextfield() {
		return this.driver.findElement(By.id("customer_lastname"));
	}

	public WebElement passwordTextfield() {
		return this.driver.findElement(By.id("passwd"));
	}

	public WebElement addressTextfield() {
		return this.driver.findElement(By.id("address1"));
	}

	public WebElement cityTextfield() {
		return this.driver.findElement(By.id("city"));
	}

	public Select stateCombobox() {
		return new Select (this.driver.findElement(By.id("id_state")));
	}

	public WebElement zipCodeTextfield() {
		return this.driver.findElement(By.id("postcode"));
	}

	public Select countryCombobox() {
		return new Select (this.driver.findElement(By.id("id_country")));
	}

	public WebElement mobileTextfield() {
		return this.driver.findElement(By.id("phone_mobile"));
	}

	public WebElement aliasTextfield() {
		return this.driver.findElement(By.id("alias"));
	}

	public WebElement registerButton() {
		return this.driver.findElement(By.id("submitAccount"));
	}

}