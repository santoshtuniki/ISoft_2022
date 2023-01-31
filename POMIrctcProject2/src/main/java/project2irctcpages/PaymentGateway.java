package project2irctcpages;

public class PaymentGateway extends TourPackageSummary {

	public PaymentGateway getTransactionId(String data) {
		getTextByXpath("//input[@readonly='readonly']");
		return this;
		
	}
	public PaymentGateway getTransactionAmount(String data) {
		getTextByXpath("(//input[@type='text'])[2]");
		return this;
		
	}
}
