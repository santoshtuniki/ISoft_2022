package project2irctcpages;

import wrappers.GenericWrappers;

public class CharterDetails extends GenericWrappers {
	
	public CharterDetails enterNameOfApplicant(String data) {
		enterByXpath("//input[@name='name']", data);
		return this;
		
	}
	public CharterDetails enterNameOfOrganization(String data) {
		enterByXpath("//input[@name='organization']", data);
		return this;
		
	}
	public CharterDetails enterAddress(String data) {
		enterByXpath("//input[@name='address']", data);
		return this;
		
	}
	public CharterDetails enterMobileNo(String  data) {
		enterByXpath("//input[@name='mobile']", data);
		return this;
		
	}
	public CharterDetails enterEmailId(String data) {
		enterByXpath("//input[@name='email']", data);
		return this;
		
	}
	public CharterDetails selectRequestFor(String data) {
		selectVisibileTextByXPath("//select[@name='requestFor']", data);
		return this;
		
	}
	public CharterDetails enterOriginatingStation(String data) {
		enterByXpath("//input[@name='originStation']", data);
		return this;
		
	}
	public CharterDetails enterDestinationStation(String data) {
		enterByXpath("//input[@name='destnStation']", data);
		return null;
		
	}
	public CharterDetails clickDateOfDeparture() {
		clickByXpath("//input[@name='checkInDate']");
		return this;
		
	}
	public CharterDetails choosekDateOfdeparture(String data) {
		clickByXpath("//span[text()='"+data+"']");
		return this;
		
		
	}
	public CharterDetails clickDateOfArrival() {
		clickByXpath("//input[@name='checkOutDate']");
		return this;
		
		
	}
	public CharterDetails chooseDateOfArrival(String data) {
		clickByXpath("(//span[text()='"+data+"'])[2]");
		return null;
		
	}
	public CharterDetails enterNumberOfDays(String data) {
		enterByXpath("//input[@name='durationPeriod']", data);
		return this;
		
	}
	public CharterDetails enterCoachDetails(String data) {
		enterByXpath("//input[@name='coachDetails']", data);
		return this;
		
	}
	public CharterDetails enterNoOfPassengers(String data) {
		enterByXpath("//input[@name='numPassenger']", data);
		return this;
		
	}
	public CharterDetails enterPurposeOfCharter(String data) {
		enterByXpath("//textarea[@name='charterPurpose']", data);
		return this;
		
	}
	public CharterDetails enterAdditionalServicesRequired(String data) {
		enterByXpath("//textarea[@name='services']", data);
		return this;
		
	}
	public CharterDetails clickSubmit() {
		clickByXpath("//button[text()='Submit']");
		return this;
		
	}


}
