package project2irctcpages;

public class ListOfHotels extends IrctcHotel {

	public ListOfHotels clickOnBook() {
		clickByXpath("//button[text()='Book']");
		return new HotelDetails();
		
	}
}
