package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConfirmOrderPageObject{

	private WebDriver driver;
	
	public ConfirmOrderPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement confirmOrderButton() {
		return this.driver.findElement(By.cssSelector("button[class='button btn btn-default button-medium']"));
	}

}