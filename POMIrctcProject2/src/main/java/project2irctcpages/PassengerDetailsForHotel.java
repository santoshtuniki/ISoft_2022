package project2irctcpages;

public class PassengerDetailsForHotel extends HotelLogin {
	
	
	public PassengerDetailsForHotel selectTitle(String data) {
		selectVisibileTextByXPath("//select[@name='title']", data);
		return this;
		
	}
	public PassengerDetailsForHotel enterFirstName(String data) {
		enterByXpath("//input[@name='firstName']", data);
		return this;
		
	}
	public PassengerDetailsForHotel enterLastName(String data) {
		enterByXpath("//input[@name='lastName']", data);
		return this;
		
	}
	public PassengerDetailsForHotel enterMobileNo(String data) {
		enterByXpath("(//input[@name='mobileNo'])[2]", data);
		return this;
		
		
	}
	public PassengerDetailsForHotel selectGstNo(String data) {
		selectVisibileTextByXPath("//select[@name='gst']", data);
		return this;
		
	}
	public PassengerDetailsForHotel enterGstNo(String data) {
		enterByXpath("//input[@name='gstNumber']", data);
		return this;
		
	}
	public PassengerDetailsForHotel enterCompanyName(String data) {
		enterByXpath("//input[@name='companyName']", data);
		return this;
		
	}
	public PassengerDetailsForHotel enterCompanyAddress(String data) {
		enterByXpath("//input[@name='companyAddress']", data);
		return this;
		
	}
	
	public PassengerDetailsForHotel getTheErrTextForGst(String data) {
		getTextByXpath("//span[text()='Please Enter Valid GSt number']");
		return this;
		
	}
	public PassengerDetailsForHotel clickOnGo() {
		clickByXpath("//button[text()='Go']");
		return new SummaryDetailsForHotel();
		
	}

}
