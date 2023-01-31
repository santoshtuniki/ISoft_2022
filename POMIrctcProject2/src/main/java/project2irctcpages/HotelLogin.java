package project2irctcpages;

public class HotelLogin extends HotelDetails {
	
	public HotelLogin enterUserName(String data) {
		enterByXpath("//input[@id='materialLoginFormEmail']", data);
		return this;
		
	}
	public HotelLogin enterPassword(String data) {
		enterByXpath("//input[@id='materialLoginFormPassword']", data);
		return this;
		
	}
	public HotelLogin enterGuestEmail(String data) {
		enterByXpath("(//input[@name='email'])[2]", data);
		return null;
		
	}
	public HotelLogin enterMobileNO(String data) {
		enterByXpath("//label[text()='Mobile No.*']", data);
		return this;
		
	}
	public HotelLogin clickOnUserSignIn() {
		clickByXpath("//button[text()='Sign in']");
		return this;
		
	}
	public HotelLogin clickOnGuestSignIn() {
		clickByXpath("(//button[text()='Sign in'])[2]");
		return new PassengerDetailsForHotel();
		
	}

}
