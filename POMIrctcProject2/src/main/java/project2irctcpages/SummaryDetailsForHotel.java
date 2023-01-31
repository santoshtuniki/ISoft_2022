package project2irctcpages;

public class SummaryDetailsForHotel extends PassengerDetailsForHotel {
	
	public SummaryDetailsForHotel clickOnIagree() {
		clickByXpath("//label[contains(@class,'form-check-label')]");
		return this;
		
	}
	public SummaryDetailsForHotel clickOnMakePayment() {
		clickByXpath("//button[text()='Make Payment']");
		return this;
		
	}
	public SummaryDetailsForHotel clickOnVerify() {
		clickByXpath("//button[text()='Verify']");
		return this;
		
	}
	public SummaryDetailsForHotel getErrTextForOtp(String data) {
		getTextByXpath("//span[text()='otp field is required.']");
		return this;
		
	}

}
