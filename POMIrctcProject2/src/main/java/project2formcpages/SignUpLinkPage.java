package project2formcpages;

import wrappers.GenericWrappers;

public class SignUpLinkPage extends GenericWrappers {

	public SignUpLinkPage clickOnSignUp() {
		clickByXpath("//a[text()='Sign Up (Registration)']");
		return new RegistrationPage();
		
	}
	
}
