package project2irctcpages;

import wrappers.GenericWrappers;

public class MakingPayment extends GenericWrappers {
	
	public MakingPayment getTransactionId() {
		getTextByXpath("//input[@type='text']");
		
		return this;
		
	}
	public MakingPayment getTransactionAmount() {
		getTextByXpath("(//input[@type='text'])[2]");
		return this;
		
		
	}

}
