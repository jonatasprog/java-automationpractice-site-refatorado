package verificationpoints;

import org.openqa.selenium.WebDriver;

import tasks.AddressTask;

public class AddressVerificationPoint {

	private AddressTask enderecoCompletoAddressTaskInstance;

	public AddressVerificationPoint(WebDriver driver) {
		this.enderecoCompletoAddressTaskInstance = new AddressTask(driver);
	}

//	public void validarEnderecoCompleto() {
//
//	
//	}

	
}
