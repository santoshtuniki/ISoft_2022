package project2irctcpages;

public class Gallery extends Tourism {
	
	public Gallery clickOnBook1() {
		clickByXpath("//a[text()=' Book Now']");
		return new PacakageDescription();
		
	}

}
