package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_WebBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // instance of Chrome | Firefox | IE driver

		// Navigate to a website
		driver.get("https://www.flipkart.com/");

		// Mazimize current window
		driver.manage().window().maximize();

		// Using sleep() to suspend the code execution for some milliseconds
		Thread.sleep(4000); // 4000 milliSeconds = 4sec

		// Closes all browser windows and
		// Ends the WebDriver session.
		driver.quit();
	}

}
