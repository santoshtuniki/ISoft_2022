package project2irctcpages;

public class HotelDetails extends ListOfHotels {
	
	public HotelDetails clickContinueToBook() {
		clickByXpath("//button[contains(@class,'btn btn-primary-custom btn-primary m-0 btn-lg')]");
		return  new HotelLogin();
		
	}

}
