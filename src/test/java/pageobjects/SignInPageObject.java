package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPageObject {

	private WebDriver driver;
	
	public SignInPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement emailTextfield() {
		return this.driver.findElement(By.id("email_create"));
	}
	
	public WebElement createAnAccountButton() {
		return this.driver.findElement(By.id("SubmitCreate"));
	}
	
}