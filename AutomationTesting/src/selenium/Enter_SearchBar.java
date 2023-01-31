package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enter_SearchBar {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		// Login page Close '✕' button
		driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();
		
		// Enter Mobiles via Search box
		WebElement search = driver.findElement(By.xpath("//input[@class='_3704LK']"));
		search.sendKeys("Mobiles");
		search.sendKeys(Keys.ENTER);
		
		Thread.sleep(4000);
		driver.quit();

	}

}
