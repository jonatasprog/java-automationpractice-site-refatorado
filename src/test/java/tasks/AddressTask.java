package tasks;

import org.openqa.selenium.WebDriver;

import pageobjects.AddressPageObject;

public class AddressTask {
	private AddressPageObject addressPageObjectInstance;

	public AddressTask(WebDriver driver) {
		this.addressPageObjectInstance = new AddressPageObject(driver);
	}
	
	public void capturarEndereco (String endereco) 
	{
		this.addressPageObjectInstance.enderecoTextfield().getText();		
	}

	public void clicarBotaoProceedToCheckout() {
		this.addressPageObjectInstance.proceedToCheckoutButton().click();
	}

}
