package project2irctcpages;

import wrappers.GenericWrappers;

public class Tourism extends GenericWrappers {
	
	public Tourism clickStationName() {
		clickByXpath("//select[@name='city']");
		return this;
		
		}
	public Tourism selectStationName(String data) {
		enterByXpath("//option[text()='Select']", data);
		return this;
		
	}
	public Tourism clickNoOfPassengers() {
		clickByXpath("//select[@name='selPassangers']");
		return this;
		
	}
	public Tourism selectNoOfPassengers(String data) {
		clickByXpath("//option[text()='"+data+"']");
		return this;
		
	}
	public Tourism clickCheckInDate() {
		clickByXpath("//input[@name='acservicecheckindate']");
		return this;
		
	}
	public Tourism clickForwordArrow() {
		clickByXpath("//i[contains(@class,'fa fa-angle-right')]");
		return this;
		
		}
	public Tourism selectCheckInDate(String data) {
		clickByXpath("//span[text()='"+data+"']");
		return this;
		
	}
	
	public Tourism selectCheckInTime(String data) {
		selectVisibileTextByXPath("//select[@name='checkInTime']",data);
		return this;
		
	}
	
   public Tourism selectDuration(String data) {
	   clickByXpath("//select[@name='checkOutTime']");
	return this;
	
}
   public GuestUserLogin clickBook() {
	   clickByXpath("//button[text()='Book']");
	return new GuestUserLogin();
	
}
   public Tourism clickMenuBar() {
	clickByXpath("//i[@class='fas fa-bars']");
	return this;
}
   public FTRServices clickBookYourCoatch() {
	   clickByXpath("//a[text()='Book Your Coach/Train']");
	return new FTRServices();
	
}
   public Charter clickCharter() {
	   clickByXpath("//a[text()='Charter']");
	return new Charter();
	
}
   public Gallery clickHillRailways() {
	clickByXpath("//a[text()='Hill Railways']");
	return  new Gallery();
}
   public IrctcHotel clickIrctcHotels() {
	   clickByXpath("//div[contains(@class,'Search_list_icon hotel')]");
	return new IrctcHotel();
	
}
   
}








