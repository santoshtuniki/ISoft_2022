package project2flipcartpages;

public class HomePage extends LoginPage {
	
	public HomePage enterProductNameOnSearch(String data) {
		enterByXpath("//input[@class='LM6RPg']",data);
		return this;
		
	}
	public HomePage clickOnSearch() {
		clickByXpath("//button[@type='submit']");
		return new Products();
		
	}
	

}