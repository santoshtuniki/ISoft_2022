package project2irctcpages;

public class TourPassengerDetails extends TourPackageBooking {
	
	public TourPassengerDetails enterFirstName1(String data) {
		enterByXpath("//input[@name='item.firstName'])", data);
		return this;
		
	}
	public TourPassengerDetails enterLastName1(String data) {
		enterByXpath("//input[@name='item.lastName']", data);
		return this;
		
	}
	public TourPassengerDetails enterAge1(String data) {
		enterByXpath("//input[contains(@class,'form-control font-14 px-0 text-center ng-pristine ng-invalid ng-touched')]", data);
		return this;
		
	}
	public TourPassengerDetails selectGender1(String data) {
		selectVisibileTextByXPath("//select[@name='item.gender']", data);
		return this;
		
	}
	public TourPassengerDetails enterFirstName2(String data) {
		enterByXpath("(//input[@name='item.firstName'])[2]", data);
		return this;
		
	}
	public TourPassengerDetails enterLastName2(String data) {
		enterByXpath("(//input[@name='item.lastName'])[2]", data);
		return this;
		
	}
	public TourPassengerDetails enterAge2(String data) {
		enterByXpath("(//input[contains(@class,'form-control font-14 px-0 text-center ng-pristine ng-invalid ng-touched')])[2]", data);
		return this;
		
	}
	public TourPassengerDetails selectGender2(String data) {
		selectVisibileTextByXPath("(//select[@name='item.gender'])[2]", data);
		return this;
		
	}
	public TourPassengerDetails enterFirstNameChild(String data) {
		enterByXpath("(//input[@name='item.firstName'])[3]", data);
		return this;
		
	}
	public TourPassengerDetails enterLastNameChild(String data) {
		enterByXpath("(//input[@name='item.lastName'])[3]", data);
		return this;
		
	}
	public TourPassengerDetails enterAgeChild(String data) {
		enterByXpath("(//input[contains(@class,'form-control font-14 px-0 text-center ng-pristine ng-invalid ng-touched')])[3]", data);
		return this;
		
	}
	public TourPassengerDetails selectGenderChild(String data) {
		selectVisibileTextByXPath("(//select[@name='item.gender'])[3]", data);
		return this;
		
	}
	public TourPackageBooking enterNomineeName(String data) {
		enterByXpath("//input[@name='nomineeName']", data);
		return this;
		
	}
	public TourPassengerDetails enterRelatioshipWithPassen(String data) {
		enterByXpath("//input[@name='RelationwithPassenger']", data);
		return this;
		
	}
	public TourPassengerDetails enterNomineeContactNo(String data) {
		enterByXpath("//input[@name='contactNo']", data);
		return this;
		
	}
	public TourPassengerDetails enterPhoneNo(String data) {
		enterByXpath("//input[@name='phoneNo']", data);
		return this;
		
	}
	public TourPassengerDetails enterFaxNo(String data) {
		enterByXpath("//input[@name='faxNo']", data);
		return this;
	
	}
	public TourPassengerDetails enterAddress(String data) {
		enterByXpath("//input[@name='address']", data);
		return this;
		
	}
	public TourPassengerDetails enterCity(String data) {
		enterByXpath("//input[@name='street']", data);
		return this;
		
	}
	public TourPassengerDetails enterState(String data) {
		selectVisibileTextByXPath("//select[@name='state']", data);
		return this;
		
	}
	public TourPassengerDetails selectIdType(String data) {
		selectVisibileTextByXPath("//select[@name='idcardType']", data);
		return this;
		
	}
	public TourPassengerDetails enterIdNo(String data) {
		enterByXpath("//input[@name='idcardno']", data);
		return this;
		
	}
	public TourPassengerDetails clickOnSubmit() {
		clickByXpath("//button[@type='submit']");
		return new TourPackageSummary();
		
	}


}
