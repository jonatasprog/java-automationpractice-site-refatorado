package verificationpoints;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import framework.tools.Report;
import framework.tools.ScreenShot;
import framework.utils.PositionUtils;
import tasks.PaymentTask;
import tasks.SummaryTask;

public class PaymentVerificationPoint {
	private WebDriver driver;
	private PaymentTask paymentTaskInstance;
	private SummaryTask summaryTaskInstance;
	private PositionUtils position;

	public PaymentVerificationPoint(WebDriver driver) {
		this.paymentTaskInstance = new PaymentTask(driver);
		this.summaryTaskInstance = new SummaryTask(driver);
		this.driver = driver;
		this.position = new PositionUtils();
	}
	
	public void validarValorTotalDaCompra() {
		position.scrollTela(driver);
		if (this.paymentTaskInstance.capturarValorTotal()
				.equalsIgnoreCase(this.summaryTaskInstance.capturarValorTotal())) {
			Report.log(Status.PASS, "Valor da compra esta correto", ScreenShot.capture(driver));
		} else {
			Report.log(Status.FAIL, "Valor da compra esta errado", ScreenShot.capture(driver));
		}
	}


}
