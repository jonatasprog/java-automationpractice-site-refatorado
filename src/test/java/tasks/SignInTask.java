package tasks;

import org.openqa.selenium.WebDriver;

import pageobjects.SignInPageObject;

public class SignInTask {
	private SignInPageObject signInPageObjectInstance;

	public SignInTask(WebDriver driver) {
		this.signInPageObjectInstance = new SignInPageObject(driver);
	}

	public void criarConta(String email) {
		this.signInPageObjectInstance.emailTextfield().sendKeys(email);
		this.signInPageObjectInstance.createAnAccountButton().click();
	}
	
}
