package tasks;

import org.openqa.selenium.WebDriver;

import pageobjects.InformationsPageObject;

public class InformationsTask {
	private InformationsPageObject informationsPageObjectInstance;

	public InformationsTask(WebDriver driver) {
		this.informationsPageObjectInstance = new InformationsPageObject(driver);
	}

	public void preencherFormularioERegistrar(String firstName, 
											  String lastName, 
											  String password, 
											  String address, 
											  String city,
											  String state,
											  String zipCode,
											  String country,
											  String mobile,
											  String alias) 
	{
		this.informationsPageObjectInstance.firstNameTextfield().sendKeys(firstName);
		this.informationsPageObjectInstance.lastNameTextfield().sendKeys(lastName);
		this.informationsPageObjectInstance.passwordTextfield().sendKeys(password);
		this.informationsPageObjectInstance.addressTextfield().sendKeys(address);
		this.informationsPageObjectInstance.cityTextfield().sendKeys(city);
		this.informationsPageObjectInstance.stateCombobox().selectByVisibleText(state);
		this.informationsPageObjectInstance.zipCodeTextfield().sendKeys(zipCode);
		this.informationsPageObjectInstance.countryCombobox().selectByVisibleText(country);
		this.informationsPageObjectInstance.mobileTextfield().sendKeys(mobile);
		this.informationsPageObjectInstance.aliasTextfield().clear();
		this.informationsPageObjectInstance.aliasTextfield().sendKeys(alias);
		this.informationsPageObjectInstance.registerButton().click();
	}
	
}
