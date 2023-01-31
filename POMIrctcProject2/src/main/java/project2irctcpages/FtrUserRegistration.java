package project2irctcpages;

import wrappers.GenericWrappers;

public class FtrUserRegistration extends GenericWrappers {
	
	public FtrUserRegistration enterUserId(String data) {
		enterByXpath("//input[@id='userId']", data);
		return this;
		
	}
	public FtrUserRegistration enterPassword(String data) {
		enterByXpath("//input[@id='password']", data);
		return this;
		
	}
	public FtrUserRegistration enterConfirmPassword(String data) {
		enterByXpath("//input[@id='cnfPassword']", data);
		return this;
		
	}
	public FtrUserRegistration selectSecurityQuestion(String data) {
		selectVisibileTextByXPath("//select[@id='secQstn']", data);
		return this;
		
	}
	public FtrUserRegistration enterSecurityAnswer(String data) {
		enterByXpath("//input[@id='secAnswer']", data);
		return this;
		
	}
	public FtrUserRegistration clickDateOfBirth() {
		clickByXpath("//input[@id='dateOfBirth']");
		return this;
		
	}
	public FtrUserRegistration selectMoth(String data) {
		selectVisibileTextByXPath("//select[@class='ui-datepicker-month']", data);
		return this;
		
	}
	public FtrUserRegistration selectYear(String data) {
		selectVisibileTextByXPath("//select[@class='ui-datepicker-year']", data);
		return this;
		
	}
	public FtrUserRegistration clickDate(String data) {
		clickByXpath("//table/tbody/tr/td[@class=' ui-datepicker-week-end ']/a[text()='"+data+"']");
		return this;
		
	}
	public FtrUserRegistration clickGenderMale() {
		clickByXpath("//input[@value='M']");
		return this;
		
	}
	public FtrUserRegistration clickGenderFemale() {
		clickByXpath("//input[@value='F']");
		return this;
		
	}
	public FtrUserRegistration clickTransgender() {
		clickByXpath("//input[@value='T']");
		return this;
		
	}
	public FtrUserRegistration clickInstitution() {
		clickByXpath("//input[@value='I']");
		return this;
		
	}
	public FtrUserRegistration clickMarried() {
		clickByXpath("//input[@value='Married']");
		return this;
		
	}
	public FtrUserRegistration clickUnmarried() {
		clickByXpath("//input[@value='UnMarried']");
		return this;
		
	}
	public FtrUserRegistration enterEmailId(String data) {
		enterByXpath("//input[@id='email']", data);
		return this;
		
	}
	public FtrUserRegistration selectOccupation(String data) {
		selectVisibileTextByXPath("//select[@id='occupation']", data);
		return this;
		
	}
	public FtrUserRegistration enterFirstName(String data) {
		enterByXpath("//input[@id='fname']", data);
		return this;
		
	}
	public FtrUserRegistration enterMiddleName(String data) {
		enterByXpath("//input[@id='mname']", data);
		return this;
		
	}
	public FtrUserRegistration enterLastName(String data) {
		enterByXpath("//input[@id='lname']", data);
		return this;
		
	}
	public FtrUserRegistration selectNationality(String data) {
		selectVisibileTextByXPath("//select[@id='natinality']", data);
		return this;
	}
	public FtrUserRegistration 	enterFlatNo(String data) {
		enterByXpath("//input[@id='flatNo']", data);
		return this;
		
	}
	public FtrUserRegistration enterStreetName(String data) {
		enterByXpath("//input[@id='street']", data);
		return this;
		
	}
	public FtrUserRegistration enterAreaName(String data) {
		enterByXpath("//input[@id='area']", data);
		return this;
		 
		
	}
	public FtrUserRegistration selectCountry(String data) {
		selectVisibileTextByXPath("//select[@id='country']", data);
		return this;
		
	}
	public FtrUserRegistration enterMobileNumber(String data) {
		enterByXpath("//input[@id='mobile']", data);
		return this;
		
	}
	public FtrUserRegistration enterPincode(String data) {
		enterByXpath("//input[@id='pincode']", data);
		return this;
		
	}
	public FtrUserRegistration selectPostOffice(String data) {
		selectVisibileTextByXPath("//select[@id='postOffice']", data);
		return this;
		
	}
	public FtrUserRegistration clickCommunicationAddNo() {
		clickByXpath("(//input[@name='sameAddresses'])[2]");
		return this;
		
	}
	public FtrUserRegistration enterCommFlatNo(String data) {
		enterByXpath("//input[@name='flatNoOffice']", data);
		return this;
		
	}
	public FtrUserRegistration enterCommStreet(String data) {
		enterByXpath("//input[@name='streetOffice']", data);
		return this;
		
	}
	public FtrUserRegistration enterCommArea(String data) {
		enterByXpath("//input[@name='areaOffice']", data);
		return this;
		
	}
	public FtrUserRegistration selectCommCountry(String data) {
		selectVisibileTextByXPath("//select[@name='countryOffice']", data);
		return this;
		
	}
	public FtrUserRegistration enterCommMobileNo(String data) {
		enterByXpath("//input[@name='mobileOffice']", data);
		return this;
		
	}
	public FtrUserRegistration enterCommPincode(String data) {
		enterByXpath("//input[@name='pincodeOffice']", data);
		return this;
		
	}
	public FtrUserRegistration selectCommPostoffice(String data) {
		selectVisibileTextByXPath("//select[@id='postOfficeOffice']", data);
		return this;
		
	}
	

}










