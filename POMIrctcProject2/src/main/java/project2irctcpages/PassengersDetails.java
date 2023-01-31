package project2irctcpages;

import wrappers.GenericWrappers;

public class PassengersDetails extends GenericWrappers {
	
	public PassengersDetails selectGstYes(String data) {
		selectVisibileTextByXPath("//select[@name='gstGet']", data);
		return this;
		
	}
	public PassengersDetails enterGstNo(String data) {
		enterByXpath("//input[@name='gstNo']", data);
		return this;
		
	}
	public PassengersDetails getErrorMessage(String data) {
		getTextByXpath("//span[text()='Please Enter Valid GSt number']");
		return this;
		
	}
	public PassengersDetails enterFirstPassengerName(String data) {
		enterByXpath("//input[contains(@class,'form-control font-14 px-1 ng-untouched ng-pristine ng-invalid')]", data);
		return this;
		
	}
	public PassengersDetails enterFirstPassengerAge(String data) {
		enterByXpath("//input[contains(@class,'form-control font-14 px-0 text-center ng-pristine ng-invalid ng-touched')]", data);
		return this;
		
	}
	public PassengersDetails selectFirstPassengerGender(String data) {
		selectVisibileTextByXPath("//select[contains(@class,'browser-default custom-select font-14 ng-pristine ng-invalid ng-touched')]", data);
		return this;
		
	}
	public PassengersDetails enterSecondpassengerName(String data) {
		enterByXpath("form-control font-14 px-1 ng-pristine ng-invalid ng-touched", data);
		return this;
		
	}
	public PassengersDetails enterSecondPassengerAge(String data) {
		enterByXpath("(//input[contains(@class,'form-control font-14 px-0 text-center ng-pristine ng-invalid ng-touched')])[2]", data);
		return this;
		
	}
	public PassengersDetails selectSecondPassengerGender(String data) {
		selectVisibileTextByXPath("(//select[contains(@class,'browser-default custom-select font-14 ng-pristine ng-invalid ng-touched')])[2]", data);
		return this;
		
	}
	public PassengersDetails enterThirdPassengerName(String data) {
		enterByXpath("(//input[contains(@class,'form-control font-14 px-1 ng-pristine ng-invalid ng-touched')])[2]", data);
		return this;
		
	}
	public PassengersDetails enterThirdPassengerAge(String data) {
		enterByXpath("(//input[contains(@class,'form-control font-14 px-0 text-center ng-pristine ng-invalid ng-touched')])[3]", data);
		return this;
		
	}
	public PassengersDetails selectThirdPassengerGender(String data) {
		selectVisibileTextByXPath("(//select[contains(@class,'browser-default custom-select font-14 ng-pristine ng-invalid ng-touched')])[3]", data);
		return this;
		
	}
	public PassengersDetails selectState(String data) {
		selectVisibileTextByXPath("//select[@name='state']", data);
		return this;
		
	}
	public SummaryDetails clickSubmit() {
		clickByXpath("//button[text()='Submit']");
		return new SummaryDetails();
		
	}

}











