package project2flipcartpages;

public class ProductDetails extends Products {
	
	public ProductDetails enterPincode(String data) {
		enterByXpath("//input[@id='pincodeInputId']", data);
		return this;
		
	}
	public ProductDetails clickOnAddToCart() {
		clickByXpath("//button[contains(@class,'_2AkmmA _2Npkh4 _2MWPVK')]	");
		return new ViewCart();
		
	}
	public ProductDetails clickOnBook() {
		clickByXpath("//button[contains(@class,'_2AkmmA _2Npkh4 _2kuvG8 _7UHT_c')]");
		return null;
		
	}

}
