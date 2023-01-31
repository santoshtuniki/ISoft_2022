package project2irctcpages;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers {
	
	public  HomePage(RemoteWebDriver Driver,ExtentTest Test) {
		this.driver=Driver;
		this.test=Test;
	}
	
	public   Registration clickOnRegister(){
		clickByXpath(objprop.getProperty("HomePage.clickOnRegister"));
		return new Registration(driver,test);
		
	}
	public HomePage clickOnStays(){
		clickByXpath(objprop.getProperty("HomePage.clickOnStays"));
		
		return this;	
	}	
	public Tourism clickOnLounge(){
		clickByXpath("//*[ text()='Lounge' ]");
		return new Tourism();
		}
		
	
	}
	


