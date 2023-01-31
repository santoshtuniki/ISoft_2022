package pom.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import project2irctcpages.HomePage;
import wrappers.GenericWrappers;
import wrappers.ProjectWrappers;

public class TC005 extends ProjectWrappers{
	
	@BeforeClass(groups="Regression")
	public void beforeClass() {
		testcaseName="TC005";
		testcaseDescription="IRCTC GST validation";
		Author="Tejaswi";
		Category = "Smoke";
		browser="chrome";
		
		
	}
	
	
	@Test(groups="Regression")
	public void irctcGstvalidation(){
		
		new HomePage(driver, test)
		
		.clickOnStays()
		.clickOnLounge()
		.selectStationName("VISAKHAPATNAM")
		.selectNoOfPassengers("3")
		.clickCheckInDate()
		.selectCheckInDate("30")
		.selectCheckInTime("04:00")
		.selectDuration("08:00")
		.clickBook()
	   .clickGuestUserLogin()
	   .enterEmailId("tejaswimaleti92@gmail.com")
	   .enterMobileNo("7259281705")
	   .clickLogin()
	   .selectGstYes("Yes")
	   .enterGstNo("1235689")
	   .enterFirstPassengerName("Barath")
	   .enterFirstPassengerAge("32")
	   .selectFirstPassengerGender("Male")
	   .enterSecondpassengerName("Tejaswi")
	   .enterSecondPassengerAge("28")
	   .selectSecondPassengerGender("Female")
	   .enterThirdPassengerName("Aadhya")
	   .enterThirdPassengerAge("12")
	   .selectThirdPassengerGender("Female")
	   .selectState("ANDHRA PRADESH")
	   .clickSubmit();
		
		
		
	}
	
	

}
