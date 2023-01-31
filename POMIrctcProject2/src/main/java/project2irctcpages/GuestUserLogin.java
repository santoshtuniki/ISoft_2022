package project2irctcpages;

import wrappers.GenericWrappers;

public class GuestUserLogin extends GenericWrappers {

	public GuestUserLogin clickGuestUserLogin() {
		clickByXpath("//a[contains(@class,'nav-link font-14 active')]");
		return this;
		
	}
	public GuestUserLogin enterEmailId(String data) {
		enterByXpath("//input[@name='email']", data);
		return this;
	}
	public GuestUserLogin enterMobileNo(String data) {
		enterByXpath("//input[@name='mobileNo']", data);
		return this;
		
	}
	public PassengersDetails clickLogin() {
		clickByXpath("//button[@type='submit']");
		return new PassengersDetails();
		
	}
}
