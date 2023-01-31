package pom.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import project2irctcpages.HomePage;
import wrappers.ProjectWrappers;
import project2irctcpages.Charter;

public class TC004 extends ProjectWrappers {
	@BeforeClass(groups="Functional")
	public void beforeClass() {
		testcaseName="TC004";
		testcaseDescription="IRCTC Saloon Mandatory Check";
		Author="Tejaswi";
		Category = "Smoke";
		browser="chrome";
		
		
	}
	@Test(groups="Functional")
	public void irctcSaloon(){
		
	new HomePage(driver, test)
	
	.clickOnStays()
	.clickOnLounge()
	.clickMenuBar()
	.clickCharter()
	.clickEnquiryForm()
	.enterNameOfApplicant("Tejaswi")
	.enterNameOfOrganization("Liberty")
	.enterAddress("karappakam, chennai")
	.enterMobileNo("25656589")
	.enterEmailId("tejaswialepati92@gmail.com")
    .selectRequestFor("Saloon Charter")
    .enterOriginatingStation("Chennai")
    .enterDestinationStation("Bangalore")
    .clickDateOfDeparture()
    .choosekDateOfdeparture("24-11-2019")
    .chooseDateOfArrival("29-11=2019")
    .enterNumberOfDays("3")
    .enterCoachDetails("3")
    .enterNoOfPassengers("3")
    .enterPurposeOfCharter("Nothing")
    .enterAdditionalServicesRequired("Nothing")
    .clickSubmit();
    
		
	}
	

}
