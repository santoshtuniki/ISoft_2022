package wrappers;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import utils.DataProvider_POM;


public class ProjectWrappers extends GenericWrappers {

	public String browser;
	public String excelSheetName;
	
	@BeforeSuite(groups={"Smoke", "Functional", "Regression"})
	public void beforeSuit() {
		startReport();
	}
	@BeforeTest(groups={"Smoke", "Functional", "Regression"})
	public void beforeTest() {
		loadObjects();
	}
	
	@BeforeMethod(groups={"Smoke", "Functional", "Regression"})
	public void beforeMethod(){
		startTestcase(testcaseName, testcaseDescription);
		invokeApp(browser, true);
	}
	
	@AfterMethod(groups={"Smoke", "Functional", "Regression"})
	public void afterMethod(){
	closeAllBrowsers();
	}
	
	@AfterClass(groups={"Smoke", "Functional", "Regression"})
	public void afterClass() {
	endTest();	
	}
	@AfterTest(groups={"Smoke", "Functional", "Regression"})
	public void afterTest() {
		//Reserved
	}
	@AfterSuite(groups={"Smoke", "Functional", "Regression"})
	public void afterSuite() {
		endReport();
	}
	
	@DataProvider(name="fetchData")
	public String[][] fetchData() throws IOException{
		return DataProvider_POM.getData(excelSheetName);
		
	}

}
