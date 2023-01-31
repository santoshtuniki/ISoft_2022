package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();	 
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;		// creating a reference
		Thread.sleep(4000);
		
		// js.executeScript("window.scrollBy(x-pixels,y-pixels)");
		
		// vertical Scroll DOWN by 3000px
		js.executeScript("window.scrollBy(0,3000)");	
		Thread.sleep(4000);
		
		// vertical Scroll UP by 3000px
		js.executeScript("window.scrollBy(0,-3000)");	
		Thread.sleep(4000);
		
//		// horizontal Scroll RIGHT by 3000px
//		js.executeScript("window.scrollBy(3000,0)");	
//		Thread.sleep(4000);
//		
//		// horizontal Scroll LEFT by 3000px
//		js.executeScript("window.scrollBy(-3000,0)");	
//		Thread.sleep(4000);
//		
//		// Scroll RIGHT by 3000px & DOWN by 2000px
//		js.executeScript("window.scrollBy(3000,2000)");	
//		Thread.sleep(4000);
		
		driver.quit();	
		
	}

}
