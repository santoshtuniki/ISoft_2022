package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locate_WebElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

//		WebElement element = driver.findElement(By.className("_2IX_2- VJZDxU"));	// Locate  the element
//		element.sendKeys("9381501701");		// use 'sendkeys(<value>)' to pass the value to the field

		// Enter Mobile Nummber
		WebElement element1 = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")); // Locate the element
		element1.sendKeys("9381501701"); // use 'sendkeys(<value>)' to pass the value to the field

//		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("password");		// Enter Password
//		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();	// Click Login button

		// Login page Close '✕' button
		// driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();

		Thread.sleep(4000);

		// Closes only the current window on which Selenium is running automated tests.
		// The WebDriver session, however, remains active.
		driver.close();
	}

}
