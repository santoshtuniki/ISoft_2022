package pom.testcases;

import java.util.HashMap;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import project2irctcpages.HomePage;
import wrappers.ProjectWrappers;

public class TC001 extends ProjectWrappers {
	
	
	@BeforeClass(groups="Smoke")
	public void beforeClass() {
		testcaseName="TC001";
		testcaseDescription="IRCTC Registration";
		Author="Tejaswi";
		Category = "Smoke";
		browser="chrome";
		excelSheetName = "TC001";
		
		
	}

	@Test()
	public void irctcSignUp(){
		
	new HomePage(driver,test)
	.clickOnRegister()
	.enterUserName("")
	.enterPassword("Aadhya123")
	.enterConfirmPasword("Aadhya123")
	.clickOnSecurityQuastion()
	.chooseTheOption("What was the name of your first school?")
	.enterSecurityAnswer("zphs")
	.clickPreferredLanguage()
	.choosePreferresLanguage("English")
	.enterFirstName("Tejaswi")
	.enterMiddleName("Malepati")
	.enterLastName("Kumar")
	.clickGenderFemale()
	.clickOnDateOfBirth()
	.selectMonth("August")
	.selectYear("1992")
	.clickDate("28")
	.clickOccupation()
	.chooseOccupation("PROFESSIONAL")
	.clickMaritalStatusMarried()
	.enterEmail("tejaswimalepati98@gmail.com")
	.enterMobileNumber("7259281705")
	.clickNationality()
	.waitTime(5000)
	.selectNationality("India")
	.enterFlatNumber("F101")
	.enterStreet("Pushkin Street")
	.enterArea("Perumbakam")
	.enterPincode("600100")
    .tab()
	//.clickCity()
	.selectCity("Kanchipuram")
	//.clickPostOffice()
	.waitTime(5000)
	.selectPOstOffice("Medavakkam  S.O")
	.enterPhone("222222222")
	.clickNo()
	.enterOfficeFlatNo("F102")
	.enterOfficeStreet("Siruseri")
	.enterOfficeArea("Medavakam")
	.enterOfficePincode("600125")
	.tab()
	//.clickOfficeCity()
	.selectOfficeCity("Kanchipuram")
	//.clickOfficePostOffice()
	.selectOfficePostOffice("Manapakkam B.O")
	.enterOfficePhoneNo("5555555555");
	//.clickTermsAndCondition();
	
	
		
		
	}
	
	

}
