package project2irctcpages;

import wrappers.GenericWrappers;

public class SummaryDetails extends GenericWrappers {
	
	public SummaryDetails verifyEmailId(String data) {
		
		verifyTextByXpath("(//label[text()='Email ID:']/following::span)[1]",data);
		return this;
		
	}
	public SummaryDetails verifyMobileNo(String data) {
		
		verifyTextByXpath("(//label[text()='Mobile No.:']/following::span)[1]", data);
		return this;
		
	}
	
	
	
	public SummaryDetails clickIagreeTandC() {
		clickByXpath("//span[text()='I Agree']");
		return this;
		
	}
	public MakingPayment clickMakePayment() {
		clickByXpath("//button[text()='Make Payment']");
		return new MakingPayment();
		
	}
	

}
