package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locate_WebElements {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://in.bookmyshow.com/");
		driver.manage().window().maximize();
		
		List<WebElement> element = driver.findElements(By.xpath("//span"));	//gives the List of elements with 'span' tag
		for(WebElement e:element)
		{
			System.out.println("Text value of Element:	"+e.getText());
			System.out.println("Tag name of Element:	"+e.getTagName());
		}
		
		Thread.sleep(3000);
		driver.quit();

	}

}
