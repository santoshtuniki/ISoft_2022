package pom.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import project2irctcpages.GuestUserLogin;
import project2irctcpages.HomePage;
import wrappers.ProjectWrappers;

public class TC002 extends ProjectWrappers{

	@BeforeClass(groups="Smoke")
	public void beforeClass(){
	testcaseName="TC002";
	testcaseDescription="IRCTC Accommodatins";
	Author="Tejaswi";
	Category = "Smoke";
	browser="Chrome";
	}
	@Test(groups="Smoke")
	public void irctcAccommodations(){
		
		new HomePage(driver,test)
		
		
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
	   .enterFirstPassengerName("Barath Kumar")
	   .enterFirstPassengerAge("31")
	   .selectFirstPassengerGender("Male")
	   .enterSecondpassengerName("Tejaswi Barath")
	   .enterSecondPassengerAge("27")
	   .selectSecondPassengerGender("Female")
	   .enterThirdPassengerName("Aadhya Barath")
	   .enterThirdPassengerAge("12")
	   .selectThirdPassengerGender("Female")
	   .selectState("ANDHRA PRADESH")
	   .clickSubmit()
	   .verifyEmailId("tejaswimalepati92@gmail.com")
	   .verifyMobileNo("7259281705")
	   .clickIagreeTandC()
	   .clickMakePayment()
	   .getTransactionId()
	   .getTransactionAmount();
	   
	   
		
		
		
		
		
	}
	
	}

	

