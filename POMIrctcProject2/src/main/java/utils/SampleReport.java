package utils;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class SampleReport {
	@Test
	public void reporting() {
		
		ExtentReports report=new ExtentReports("./Reports/result.html",false);
		
		ExtentTest test=report.startTest("TC001", "To verify whether the user is able to perform IRCTC Registration");
		
		
		test.assignAuthor("Tejaswi");
		test.assignCategory("Smoke");
		
		test.log(LogStatus.PASS, "Application launched successfully");
		
		test.log(LogStatus.PASS, "Application launched successfully");
		test.log(LogStatus.PASS, "Application launched successfully");
		test.log(LogStatus.PASS, "Application launched successfully");
		test.log(LogStatus.PASS, "Application launched successfully");
		test.log(LogStatus.PASS, "Application launched successfully");
		test.log(LogStatus.PASS, "Application launched successfully");
		test.log(LogStatus.PASS, "Application launched successfully");
		test.log(LogStatus.PASS, "Application launched successfully");
		test.log(LogStatus.PASS, "Application launched successfully");
		test.log(LogStatus.PASS, "Application launched successfully");
		test.log(LogStatus.PASS, "Application launched successfully");
		test.log(LogStatus.PASS, "Application launched successfully");
		test.log(LogStatus.PASS, "Application launched successfully");
		test.log(LogStatus.PASS, "Application launched successfully");
		test.log(LogStatus.PASS, "Application launched successfully");
		test.log(LogStatus.PASS, "Application launched successfully");
		
		report.endTest(test);
		report.flush();
		
		
		
		
	}

}
