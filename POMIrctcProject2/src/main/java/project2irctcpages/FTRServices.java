package project2irctcpages;

import wrappers.GenericWrappers;

public class FTRServices extends GenericWrappers {
	
	public FtrUserRegistration clickNewUserSignup() {
		clickByXpath("//a[text()='New User? Signup']");
		return new FtrUserRegistration();
	}

}
