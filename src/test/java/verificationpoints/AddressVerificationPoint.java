package verificationpoints;

import java.io.File;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import framework.datapools.CsvDatapool;
import framework.tools.Report;
import framework.tools.ScreenShot;
import framework.utils.PositionUtils;
import pageobjects.AddressPageObject;

public class AddressVerificationPoint {

	private AddressPageObject addressPageObjectInstance;
	private WebDriver driver;
	private String FILE_PATH_CONTATOS = System.getProperty("user.dir") + File.separator + "datapools" + File.separator
			+ "contatos.csv";
	public CsvDatapool datapoolContatos;
	private PositionUtils position;

	public AddressVerificationPoint(WebDriver driver) {
		this.datapoolContatos = new CsvDatapool(FILE_PATH_CONTATOS);
		this.addressPageObjectInstance = new AddressPageObject(driver);
		this.driver = driver;
		this.position = new PositionUtils();
	}

	public void validarEndereco() {
		position.scrollTela(driver);
		if (this.datapoolContatos.getValue("address")
				.equalsIgnoreCase(this.addressPageObjectInstance.enderecoTextfield().getText())) {
			Report.log(Status.PASS, "Endereco correto", ScreenShot.capture(this.driver));
			
		} else {
			Report.log(Status.FAIL, "Endereco incorreto", ScreenShot.capture(this.driver));
		}
	}
	
}
