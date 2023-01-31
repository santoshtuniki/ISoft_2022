package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

// Default Suite

public class Framework {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
		
	  driver.get("https://www.flipkart.com/");
	  driver.manage().window().maximize();
	  
	  Thread.sleep(5000);
	  driver.quit();
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Entering the Chrome Browser");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Execution Completed");
  }

}
