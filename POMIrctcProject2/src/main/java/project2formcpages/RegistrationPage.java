package project2formcpages;

public class RegistrationPage extends SignUpLinkPage {
	
	public RegistrationPage enterUserId(String data) {
		enterByXpath("//input[@id='u_id']", data);
		return this;
		
	}
	public RegistrationPage enterPassword(String data) {
		enterByXpath("//input[@id='u_pwd']", data);
		return this;
		
	}
	public RegistrationPage enterConfirmPassword(String data) {
		enterByXpath("//input[@id='u_repwd']", data);
		return this;
		
	}
	public RegistrationPage selectSecurityQ(String data) {
		selectVisibileTextByXPath("//select[@id='u_secques']", data);
		return this;
		
	}
	public RegistrationPage enterSecurityAns(String data) {
		enterByXpath("//input[@id='u_secans']", data);
		return this;
		
	}
	public RegistrationPage enterName(String data) {
		enterByXpath("//input[@id='u_name']", data);
		return this;
		
	}
	public RegistrationPage selectGender(String data) {
		selectVisibileTextByXPath("//select[@id='u_gender']", data);
		return this;
		
	}
	public RegistrationPage enterDateOfBirth(String data) {
		enterByXpath("//input[@id='u_dob']", data);
		return this;
		
	}
	public RegistrationPage enterDesignation(String data) {
		enterByXpath("//input[@id='u_designation']", data);
		return this;
	}
	public RegistrationPage enterEmailId(String data) {
		enterByXpath("//input[@id='u_emailid']", data);
		return this;
		
	}
	public RegistrationPage enterMobileNO(String data) {
		enterByXpath("//input[@id='u_mobile']", data);
		return this;
		
	}
	public RegistrationPage enterPhoneNo(String data) {
		enterByXpath("//input[@id='u_phone']", data);
		return this;
		
	}
	public RegistrationPage enterHotelName(String data) {
		enterByXpath("//input[@id='name']", data);
		return this;
		
	}
	public RegistrationPage enterCapacity(String data) {
		enterByXpath("//input[@id='capacity']", data);
		return this;
		
	}
	public RegistrationPage enterAddress(String data) {
		enterByXpath("//textarea[@id='address']", data);
		return this;
		
	}
	public RegistrationPage selectState(String data) {
		selectVisibileTextByXPath("//select[@id='state']", data);
		return this;
		
	}
	public RegistrationPage selectCity(String data) {
		selectVisibileTextByXPath("//select[@id='city_distr']", data);
		return this;
		
	}
	public RegistrationPage selectAccomodationType(String data) {
		selectVisibileTextByXPath("//select[@id='acco_type']", data);
		return this;
		
	}
	public RegistrationPage selectAccomodationGrade(String data) {
		selectVisibileTextByXPath("//select[@id='star_rat']", data);
		return this;
		
	}
	public RegistrationPage enterHotelEmail(String data) {
		enterByXpath("//input[@id='email']", data);
		return this;
		
	}
	public RegistrationPage enterHotelMobileNo(String data) {
		enterByXpath("//input[@id='mcontact']", data);
		return this;
		
	}
	public RegistrationPage enterphoneNo(String data) {
		enterByXpath("//input[@id='contact']", data);
		return this;
		
	}
	public RegistrationPage enterOwnerName1(String data) {
		enterByXpath("//input[@name='name_o']", data);
		return this;
		
	}
	public RegistrationPage enterOwnerAddress1(String data) {
		enterByXpath("//input[@name='address_o']", data);
		return this;
		
	}
	public RegistrationPage selectOwnerState1(String data) {
		selectVisibileTextByXPath("//select[@name='state_o']", data);
		return this;
		
	}
	public RegistrationPage selectOwnerCity1(String data) {
		selectVisibileTextByXPath("//select[@id='citydistr_o']", data);
		return this;
		
	}
	public RegistrationPage enterOwnerEmailId1(String data) {
		enterByXpath("//input[@name='emailid_o']", data);
		return this;
		
	}
	public RegistrationPage enterOwnerPhone1(String data) {
		enterByXpath("//input[@name='phoneno_o']", data);
		return this;
		
	}
	public RegistrationPage enterOwnerMobileNo1(String data) {
		enterByXpath("//input[@name='mobile_o']", data);
		return this;
		
	}
	public RegistrationPage clickOnAdd1() {
		clickByXpath("//input[@name='add']");
		return this;
		
	}
	public RegistrationPage enterOwnerName2(String data) {
		enterByXpath("//input[@name='name_o']", data);
		return this;
		
	}
	public RegistrationPage enterOwnerAddress2(String data) {
		enterByXpath("//input[@name='address_o']", data);
		return this;
		
	}
	public RegistrationPage enterOwnerState2(String data) {
		selectVisibileTextByXPath("//select[@name='state_o']", data);
		return this;
		
	}
	public RegistrationPage enterOwnerCity2(String data) {
		selectVisibileTextByXPath("//select[@id='citydistr_o']", data);
		return this;
		
	}
	public RegistrationPage enterOwnerEmailId2(String data) {
		enterByXpath("//select[@id='citydistr_o']", data);
		return this;
		
	}
	public RegistrationPage enterOwnerPhoneNo2(String data) {
		enterByXpath("//input[@name='phoneno_o']", data);
		return this;
		
	}
	public RegistrationPage enterOwnerMobileNo2(String data) {
		enterByXpath("//input[@name='mobile_o']", data);
		return this;
		
	}
	public RegistrationPage enterOwnerName3(String data) {
		enterByXpath("//input[@name='name_o']", data);
		return this;
		
	}
	public RegistrationPage enterOwnerAddress3(String data) {
		enterByXpath("//input[@name='address_o']", data);
		return this;
		
	}
	public RegistrationPage enterOwnerState3(String data) {
		selectVisibileTextByXPath("//select[@name='state_o']", data);
		return this;
		
	}
	public RegistrationPage enterOwnerCity3(String data) {
		selectVisibileTextByXPath("//select[@id='citydistr_o']", data);
		return this;
		
	}
	public RegistrationPage enterOwnerEmailId3(String data) {
		enterByXpath("//select[@id='citydistr_o']", data);
		return this;
		
	}
	public RegistrationPage enterOwnerPhoneNo3(String data) {
		enterByXpath("//input[@name='phoneno_o']", data);
		return this;
		
	}
	public RegistrationPage enterOwnerMobileNo3(String data) {
		enterByXpath("//input[@name='mobile_o']", data);
		return this;
		
	}
		public RegistrationPage clickOnSubmit() {
		clickByXpath("//input[@name='submitb']");
		return this;
		
	}
	

}





















