package tasks;

import org.openqa.selenium.WebDriver;

import pageobjects.AddressPageObject;

public class AddressTask {
	private AddressPageObject addressPageObjectInstance;

	public AddressTask(WebDriver driver) {
		this.addressPageObjectInstance = new AddressPageObject(driver);
	}
	
	public void capturarEndereco (String endereco,
										  String cidade,
										  String estado,
										  String zipCode,
										  String pais) 
	{
		this.addressPageObjectInstance.enderecoTextfield().getText();
		this.addressPageObjectInstance.cidadeEstadoZipCodeTextfield().getText();
		this.addressPageObjectInstance.cidadeEstadoZipCodeTextfield().getText();
		this.addressPageObjectInstance.cidadeEstadoZipCodeTextfield().getText();
		this.addressPageObjectInstance.paisTextfield().getText();
		
	}

	public void clicarBotaoProceedToCheckout() {
		this.addressPageObjectInstance.proceedToCheckoutButton().click();
	}

}
