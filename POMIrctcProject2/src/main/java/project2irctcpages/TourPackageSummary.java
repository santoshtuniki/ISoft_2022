package project2irctcpages;

public class TourPackageSummary extends TourPassengerDetails {
	
	public TourPackageSummary clickOnIagree() {
		clickByXpath("//span[text()='I Agree']");
		return this;
		
	}
	public TourPackageSummary clickOnMakePayment() {
		clickByXpath("//button[text()='Make Payment']");
		return new PaymentGateway();
		
	}

}
