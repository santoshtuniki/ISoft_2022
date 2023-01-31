package pom.testcases;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import project2irctcpages.HomePage;
import wrappers.ProjectWrappers;

public class TC003 extends ProjectWrappers {

	@BeforeClass(groups="Functional")
	public void beforeClass(){
	testcaseName="TC003";
	testcaseDescription="IRCTC FTRservices";
	Author="Tejaswi";
	Category = "Smoke";
	browser="Chrome";
	}
	
	@Test(groups="Functional")
	public void irctcFtrServices(){
		
		new HomePage(driver,test)
		.clickOnStays()
		.clickOnLounge()
		.clickMenuBar()
		.clickBookYourCoatch()
		.clickNewUserSignup()
		.enterUserId("Tejaswi92")
		.enterPassword("Aadhya12@")
		.enterConfirmPassword("Aadhya12@")
		.selectSecurityQuestion("What is your pet name?")
		.enterSecurityAnswer("Jimmy")
		.clickDateOfBirth()
		.selectMoth("Aug")
		.selectYear("1992")
		.clickDate("28")
		.clickGenderFemale()
		.clickMarried()
		.enterEmailId("Tejaswimalepati92@gmail.com")
		.selectOccupation("Professional")
		.enterFirstName("Teju")
		.enterMiddleName("Barath")
		.enterLastName("Kumar")
		.selectNationality("Indian")
		.enterFlatNo("F101")
		.enterStreetName("Pushkin Street")
		.enterAreaName("Perumbakam")
		.selectCountry("India")
		.enterMobileNumber("7259284125")
		.enterPincode("600100")
		.selectPostOffice("Medavakkam  S.O")
		.clickCommunicationAddNo()
		.enterCommFlatNo("F102")
		.enterCommStreet("Amman Koil Street")
		.enterCommArea("Kuttambakam")
		.enterCommMobileNo("7878787878")
		.enterCommPincode("600125")
		.selectCommPostoffice("Mugalivakkam S.O");
		
		
		
		
	}
	
}
