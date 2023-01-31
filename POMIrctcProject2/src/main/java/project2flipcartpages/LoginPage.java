package project2flipcartpages;

import wrappers.GenericWrappers;

public class LoginPage extends GenericWrappers {
	
	public LoginPage enterEmailId(String data) {
		enterByXpath("(//input[@type='text'])[2]", data);
		return this;
		
	}
	public LoginPage enterPassword(String data) {
		enterByXpath("//input[@type='password']", data);
		return this;
		
	}
	public LoginPage clickOnLogin() {
		clickByXpath("//span[text()='Login']");
		return new HomePage();
		
	}

}
