package verificationpoints;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import framework.tools.Report;
import framework.tools.ScreenShot;
import tasks.PaymentTask;

public class PaymentVerificationPoint {
	private WebDriver driver;
	private PaymentTask paymentTaskInstance;

	public PaymentVerificationPoint(WebDriver driver) {
		this.paymentTaskInstance = new PaymentTask(driver);
		this.driver = driver;
	}
	
	public void validarValorTotalDaCompra() {
		if (this.paymentTaskInstance.capturarValorTotal()
				.equalsIgnoreCase(this.paymentTaskInstance.capturarValorTotal())) {
			Report.log(Status.PASS, "Valor da compra está correto", ScreenShot.capture(driver));
		} else {
			Report.log(Status.FAIL, "Valor da compra está errado", ScreenShot.capture(driver));
		}
	}


}
