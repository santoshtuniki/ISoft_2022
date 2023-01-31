package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_MultipleConditions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		// Login page Close '✕' button
		driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();
		
		// Enter Mobiles category
		driver.findElement(By.xpath("//div[@class='xtXmba' and contains(text(),'Mobiles')]")).click();

		Thread.sleep(4000);
		driver.quit();
	}

}
