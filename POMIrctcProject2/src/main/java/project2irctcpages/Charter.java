package project2irctcpages;

import wrappers.GenericWrappers;

public class Charter extends GenericWrappers {
	public CharterDetails clickEnquiryForm() {
		clickByXpath("//a[@id='Enquiry-tab-just']");
		return new CharterDetails();
		
		}
	
}
