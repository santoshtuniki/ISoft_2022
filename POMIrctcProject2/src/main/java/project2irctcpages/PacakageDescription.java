package project2irctcpages;

public class PacakageDescription extends Gallery {
	
	public PacakageDescription clickOnBook() {
		clickByXpath("//a[contains(@class,'btn btn-md btn-primary btn-rounded waves-effect waves-light m-0 font-14')]");
		return new TourPackageBooking();
		
	}

}
