package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in");
		driver.manage().window().maximize();
		driver.findElementByXPath("//input[@id='buttonFromTo']").click();
		Thread.sleep(3000);
		String trainName = "GOLDN TEMPLE ML";
		
		WebElement table = driver.findElementByTagName("table");
		table.findElement(By.xpath("//a[contains(text(), '"+trainName+"')]")).click();
		
		

	}

}
