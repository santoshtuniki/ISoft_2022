package project2irctcpages;



import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class Registration extends GenericWrappers  {
	
	public  Registration(RemoteWebDriver Driver,ExtentTest Test) {
		
		this.driver=Driver;
		this.test=Test;
		
	}
	
	public Registration enterUserName(String data){
		enterByXpath("//*[@id='userName' ]", data);
		return this;
	}
	public Registration enterPassword(String data){
		enterByXpath("//*[@id='usrPwd' ]", data);
		
		return this;
		}
	public Registration enterConfirmPasword(String data){
		enterByXpath("//*[@id='cnfUsrPwd' ]", data);
		return this;
		}
	public Registration clickOnSecurityQuastion(){
		clickByXpath("//label[text()='Select Security Question']");
		
		return this;
	}
	public Registration chooseTheOption(String data){
		clickByXpath("//span[text()='"+data+"']");
		return this;
		} 
    public Registration enterSecurityAnswer(String data){
		enterByXpath("//input[@placeholder='Security Answer']", data);
    	
    	return this;
    }
    public Registration clickPreferredLanguage(){
		
    	clickByXpath("//label[text()='Select Preferred Language']");
    	return this;
    
}
public Registration choosePreferresLanguage(String data){
	clickByXpath("//span[text()='"+data+"']");
	
	return this;
	
}
public Registration enterFirstName(String data){
	enterByXpath("//input[@id='firstName']", data);
	
	return this;
}
public Registration enterMiddleName(String data){
	
	enterByXpath("//input[@id='middleName']", data);
	return this;
}
public Registration enterLastName(String data){
	
	enterByXpath("//input[@id='lastname']", data);
	return this;
}
public Registration clickGenderMale(){
	
	clickByXpath("//input[@id='M']");
	return this;
}
public Registration clickGenderFemale(){
	clickByXpath("//input[@id='F']");
	return this;
	
}
public Registration clickGenderTransgender(){
	clickByXpath("//input[@id='T']");
	return this;
}
public Registration clickOnDateOfBirth(){
	
	clickByXpath("//input[@autocomplete='off']");
	return this;
}
public Registration selectMonth(String data){
	
	selectVisibileTextByXPath("//select[contains(@class,'ui-datepicker-month ng-tns-c14-10 ng-star-inserted')]", data);
	return this;
}
public Registration selectYear(String data){
	selectVisibileTextByXPath("//select[contains(@class,'ui-datepicker-year ng-tns-c14-10 ng-star-inserted')]", data);
	return this;
	
}
public Registration clickDate(String data){
	
	clickByXpath("//table/tbody/tr/td[@class='ng-tns-c14-10 ng-star-inserted']/a[text()='"+data+"']");
	return this;
}
public Registration clickOccupation(){
	
	clickByXpath("//label[text()='Select Occupation']");
	return this;
}
public Registration chooseOccupation(String data) {
	clickByXpath("//span[text()='"+data+"']");
	return this;
}
public Registration clickMaritalStatusMarried() {
	clickByXpath("//input[@id='M']");
	return this;
	
}
public Registration clickMaritalStatusUnmarried() {
	clickByXpath("//input[@value='U']");
	return this;
}
public Registration enterEmail(String data) {
	enterByXpath("//input[@id='email']", data);
	return this;
	
}
public Registration enterMobileNumber(String data) {
	enterByXpath("//input[@id='mobile']", data);
	return this;
}
public Registration clickNationality() {
	clickByXpath("//select[@formcontrolname='nationality']");
	return this;
	
}
public Registration selectNationality(String data) {
	selectVisibileTextByXPath("//select[@formcontrolname='nationality']",data);
	
	return this;
	
}
public Registration enterFlatNumber(String data) {
	enterByXpath("//textarea[@id='resAddress1']", data);
	return this;
	
}
public Registration enterStreet(String data) {
	enterByXpath("//textarea[@id='resAddress2']", data);
	return this;
	
}
public Registration enterArea(String data) {
	enterByXpath("//textarea[@id='resAddress3']", data);
	return this;
	
}
public Registration enterPincode(String data) {
	enterByXpath("//input[@name='resPinCode']", data);
	return this;
	
}
public Registration clickCity() {
	clickByXpath("//select[@formcontrolname='resCity']");
	return this;
	
}
public Registration selectCity(String data) {
	clickByXpath("//option[@value='"+data+"']");
	return this;
	
}
public Registration clickPostOffice(String data) {
	selectVisibileTextByXPath("//select[@formcontrolname='resPostOff']",data);
	return this;
	
}
public Registration selectPOstOffice(String data) {
	selectVisibileTextByXPath("//select[@formcontrolname='resPostOff']",data);
	return this;
	
}
public Registration enterPhone(String data) {
	enterByXpath("//input[@id='resPhone']", data);
	return this;
	
}
public Registration clickYes() {
	clickByXpath("//label[text()='Yes']");
	return this;
	
}
public Registration clickNo(){
	clickByXpath("//input[@value='N']");
	return this;
}
public Registration enterOfficeFlatNo(String data) {
	enterByXpath("(//textarea[contains(@name,'offAddress')])[1]", data);
	return this;
	
}
public Registration enterOfficeStreet(String data) {
	enterByXpath("(//textarea[contains(@name,'offAddress')])[2]", data);
	return this;
	
}
public Registration enterOfficeArea(String data) {
	enterByXpath("(//textarea[contains(@name,'offAddress')])[3]", data);
	return this;
	
}
public Registration enterOfficePincode(String data) {
	enterByXpath("//input[@id='offPinCode']", data);
	return this;
	
}
public Registration clickOfficeCity(String data) {
	selectVisibileTextByXPath("//select[@formcontrolname='offCity']",data);
	return this;
	
}
public Registration selectOfficeCity(String data) {
	selectVisibileTextByXPath("//select[@formcontrolname='offCity']",data);
	return this;
	
}
public Registration clickOfficePostOffice() {
	clickByXpath("//select[@formcontrolname='offPostOff']");
	return this;
	
}
public Registration selectOfficePostOffice(String data) {
	selectVisibileTextByXPath("//select[@formcontrolname='offPostOff']",data);
	return this;
	
}
public Registration enterOfficePhoneNo(String data) {
	enterByXpath("//input[@id='offPhone']", data);
	return this;
	
}
public Registration clickTermsAndCondition() {
	clickByXpath("//input[@formcontrolname='termCondition']");
	return this;
	
}
public Registration clickRegister() {
	clickByXpath("//b[text()='REGISTER']");
	return this;
	
}
public Registration waitTime(long arg0) {
	
	waittime(arg0);
	return this;
	
}
public Registration tab() {
	enterTabByXpath("/html/body");
	return this;
	
}
}











