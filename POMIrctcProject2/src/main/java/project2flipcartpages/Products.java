package project2flipcartpages;

public class Products extends HomePage {
	
	public Products clickOnFirstProduct() {
		clickByXpath("//div[@class='_3wU53n']");
		return new ProductDetails();
		
	}

}
