package project2irctcpages;

public class IrctcHotel extends Tourism {
	
	public IrctcHotel enterHotelNameOrCityName(String data) {
		enterByXpath("//input[@placeholder='Enter hotel name or city name']", data);
		return this;
		
	}
	public IrctcHotel clickOnCity() {
		clickByXpath("//strong[text()='City']");
		return this;
		
	}
	public IrctcHotel clickCheckinDate() {
		clickByXpath("//input[@placeholder='Check-in Date']");
		return this;
		
	}
	public IrctcHotel chooseCheckInDate(String data) {
		clickByXpath("//span[text()='"+data+"']");
		return this;
		
	}
	public IrctcHotel clickCheckOutDate() {
		clickByXpath("//input[@placeholder='Check-out Date']");
		return this;
		
	}
	public IrctcHotel enterCheckOutdate(String data) {
		enterByXpath("//span[text()='"+data+"']", data);
		return this;
		
	}
	public IrctcHotel clickOnGuests() {
		clickByXpath("//input[@name='guest']");
		return this;
		
	}
	public IrctcHotel selectRooms(String data) {
		selectVisibileTextByXPath("//select[@name='hotelRoom']", data);
		return this;
		
	}
	public IrctcHotel selectNoOfAdults(String data) {
		selectVisibileTextByXPath("//select[@name='hotelAdult']", data);
		return this;
		
	}
	public IrctcHotel selectNoOFChildren(String data) {
		selectVisibileTextByXPath("//select[@name='hotelChild']", data);
		return this;
		
	}
	public IrctcHotel clickOnDone() {
		clickByXpath("//button[text()='Done']");
		return this;
		
	}
	public IrctcHotel clickFindHotel() {
		clickByXpath("//div[contains(@class,'col-12 col-sm-12 col-md-12 col-lg-2 form-btn-find')]");
		return new ListOfHotels();
		
	}

}























