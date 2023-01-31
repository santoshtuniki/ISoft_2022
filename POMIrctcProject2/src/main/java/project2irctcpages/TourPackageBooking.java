package project2irctcpages;

public class TourPackageBooking extends PacakageDescription {
	
	public TourPackageBooking selectStartingDate(String data) {
		selectVisibileTextByXPath("//select[@name='country']", data);
		return this;
		
	}
	public TourPackageBooking selectBoardingStation(String data) {
		selectVisibileTextByXPath("//select[@name='boardst']", data);
		return this;
		
	}
	public TourPackageBooking clickOnContinue() {
		clickByXpath("//button[text()='Continue']");
		return this;
		
	}
	public TourPackageBooking selectRoom(String data) {
		selectVisibileTextByXPath("//select[contains(@class,'browser-default custom-select font-14 ng-pristine ng-valid ng-touched')]", data);
		return this;
		
	}
	public TourPackageBooking clickOnBook() {
		clickByXpath("//button[text()='Book']");
		return new TourPassengerDetails();
		
	}

}
