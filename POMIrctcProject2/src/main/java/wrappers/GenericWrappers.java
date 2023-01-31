package wrappers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.Platform;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import utils.Reporting;

public class GenericWrappers extends Reporting implements Wrappers {
	public RemoteWebDriver driver;
	public static Properties objprop;
	public Properties configprop;
	public String sURL;

	public GenericWrappers() {

		configprop = new Properties();
		try {
			configprop.load(new FileInputStream("./properties/config.properties"));
			sURL = configprop.getProperty("URL");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void loadObjects() {

		objprop = new Properties();
		try {
			objprop.load(new FileInputStream("./properties/object.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block

		} catch (IOException e) {
			// TODO Auto-generated catch block

		}
	}

	public void invokeApp(String browser, boolean flag) {
		invokeApp(browser, sURL, flag);
	}

	public void invokeApp(String browser, String url, boolean bflag) {
		// TODO Auto-generated method stub

		try {
			if (bflag) {

				DesiredCapabilities dc = new DesiredCapabilities();
				dc.setPlatform(Platform.WINDOWS);
				dc.setBrowserName(browser);
				driver = new RemoteWebDriver(new URL("http://192.168.1.19:4444/wd/hub"), dc);

			}
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
				driver = new ChromeDriver();

			} else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./drivers.geckodriver.exe");
				driver = new FirefoxDriver();
			} else if (browser.equalsIgnoreCase("ie")) {

				System.setProperty("webdriver.ie.driver", "./driver.iedriver.exe");
				driver = new InternetExplorerDriver();
			}
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			// System.out.println("The browser"+browser+"launched successfully with
			// Url"+url);
			reportStep("The browser" + browser + "launched successfully with Url" + url, "Pass");
		} catch (SessionNotCreatedException e) {
			// TODO Auto-generated catch block
			// System.err.println("The browser"+browser+"not launched due to session
			// error");
			reportStep("The browser" + browser + "not launched due to session error", "Fail");
		} catch (WebDriverException e) {
			// System.err.println("The browser"+browser+"not launched due to unknown
			// error");
			e.printStackTrace();
			reportStep("The browser" + browser + "not launched due to unknown error", "Fail");

		} catch (MalformedURLException e) {

		}
	}

	public void enterById(String idValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(idValue).sendKeys(data);
			// System.out.println("The element with idValue"+idValue+"is entered with
			// data"+data);
			reportStep("The element with idValue" + idValue + "is entered with data" + data, "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			// System.err.println("The element with idValue"+idValue+"is not available in
			// the DOM");
			reportStep("The element with idValue" + idValue + "is not available in the DOM", "Fail");
		} catch (ElementNotVisibleException e) {
			// System.err.println("The element with the idValue"+idValue+"is not visible in
			// the appication");
			reportStep("The element with the idValue" + idValue + "is not visible in the appication", "Fail");
		} catch (ElementNotInteractableException e) {
			// System.err.println("The element with the idValue"+idValue+"is not
			// interactable");
			reportStep("The element with the idValue" + idValue + "is not interactable", "Fail");
		} catch (StaleElementReferenceException e) {
			// System.err.println("The element with the idValue"+idValue+"is not stable in
			// the application");
			reportStep("The element with the idValue" + idValue + "is not stable in the application", "Fail");
		} catch (WebDriverException e) {
			// System.err.println("The element with idValue"+idValue+"is not entered with
			// data"+data+"due to unknown error");
			reportStep(
					"The element with idValue" + idValue + "is not entered with data" + data + "due to unknown error",
					"Fail");
		} finally {
			takeSnap();
		}
	}

	public void enterByName(String nameValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(nameValue).sendKeys(data);
			// System.out.println("The element with Namevalue"+nameValue+"is entered with
			// the data"+data);
			reportStep("The element with Namevalue" + nameValue + "is entered with the data" + data, "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			// System.err.println("The element with Namevalue"+nameValue+"is not available
			// in the DOM");
			reportStep("The element with Namevalue" + nameValue + "is not available in the DOM", "Fail");
		} catch (ElementNotVisibleException e) {
			// System.err.println("The element with Namevalue"+nameValue+"is not visible in
			// the application");
			reportStep("The element with Namevalue" + nameValue + "is not visible in the application", "Fail");
		} catch (ElementNotInteractableException e) {
			// System.err.println("The element with the Namevalue"+nameValue+"is not
			// interactable");
			reportStep("The element with the Namevalue" + nameValue + "is not interactable", "Fail");
		} catch (StaleElementReferenceException e) {
			// System.err.println("The element with the Namevalue"+nameValue+"is not stable
			// in the application");
			reportStep("The element with the Namevalue" + nameValue + "is not stable in the application", "Fail");
		} catch (WebDriverException e) {
			// System.err.println("The element with Namevalue"+nameValue+"is not entered
			// with the date"+data+"due to unknown error");
			reportStep("The element with Namevalue" + nameValue + "is not entered with the date" + data
					+ "due to unknown error", "Fail");
		}
	}

	public void enterByXpath(String xpathValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathValue).sendKeys(data);
			// System.out.println("The element with Xpathvalue"+xpathValue+"is entered with
			// the data"+data);
			reportStep("The element with Xpathvalue" + xpathValue + "is entered with the data" + data, "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			// System.err.println("The element with Xpathvalue"+xpathValue+"is not available
			// in the DOM");
			reportStep("The element with Xpathvalue" + xpathValue + "is not available in the DOM", "Fail");
		} catch (ElementNotVisibleException e) {
			// System.err.println("The element with Xpathvalue"+xpathValue+"is not visible
			// in the application");
			reportStep("The element with Xpathvalue" + xpathValue + "is not visible in the application", "Fail");
		} catch (ElementNotInteractableException e) {
			// System.err.println("The element with the Xpathvalue"+xpathValue+"is not
			// interactable");
			reportStep("The element with the Xpathvalue" + xpathValue + "is not interactable", "Fail");
		} catch (StaleElementReferenceException e) {
			// System.err.println("The element with the Xpathvalue"+xpathValue+"is not
			// stable in the application");
			reportStep("The element with the Xpathvalue" + xpathValue + "is not stable in the application", "Fail");
		} catch (WebDriverException e) {
			// System.err.println("The element with Xpathvalue"+xpathValue+"is not entered
			// with the date"+data+"due to unkowm error");
			reportStep("The element with Xpathvalue" + xpathValue + "is not entered with the date" + data
					+ "due to unkowm error", "Fail");
		}
	}

	public void verifyTitle(String title) {

		// TODO Auto-generated method stub
		try {
			String Actualtitle = driver.getTitle();
			if (Actualtitle.equalsIgnoreCase(title)) {
				// System.out.println("Actualtitle"+Actualtitle+ "is equals to expected
				// titile"+title);
				reportStep("Actualtitle" + Actualtitle + "is equals to expected titile" + title, "Pass");
			} else {
				// System.err.println("Actualtitle"+Actualtitle+ "is not equals to expected
				// titile"+title);
				reportStep("Actualtitle" + Actualtitle + "is not equals to expected titile" + title, "Fail");
			}
		} catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
			// System.err.println("The window target to be switched is not found for the
			// title"+title);
			reportStep("The window target to be switched is not found for the title" + title, "Fail");
		} catch (SessionNotCreatedException e) {
			// System.err.println("The Session is not created with the given title"+title);
			reportStep("The Session is not created with the given title" + title, "Fail");
		} catch (NoSuchSessionException e) {
			// System.err.println("The session is not found with the given title"+title);
			reportStep("The session is not found with the given title" + title, "Fail");
		} catch (WebDriverException e) {
			// System.err.println("Due to unknown error title is not verified");
			reportStep("Due to unknown error title is not verified", "Fail");
		}
	}

	public void verifyTextById(String id, String text) {
		// TODO Auto-generated method stub
		try {
			String Text1 = driver.findElementById(id).getText();

			if (text.equalsIgnoreCase(Text1)) {
				// System.out.println("Text actual text"+Text1+"is euals to the expected
				// text"+text);
				reportStep("Text actual text" + Text1 + "is euals to the expected text" + text, "Pass");
			} else {
				// System.out.println("Text actual text"+Text1+"is not euals to the expected
				// text"+text);
				reportStep("Text actual text" + Text1 + "is not euals to the expected text" + text, "Pass");
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			// System.err.println("The element with id"+id+"is not available in the DOM");
			reportStep("The element with id" + id + "is not available in the DOM", "Fail");
		} catch (ElementNotVisibleException e) {
			// System.err.println("The element with id"+id+"is not visible in the
			// appication");
			reportStep("The element with id" + id + "is not visible in the appication", "Fail");
		} catch (ElementNotInteractableException e) {
			// System.err.println("The element with the Id"+id+"is not interactable");
			reportStep("The element with the Id" + id + "is not interactable", "Fail");
		} catch (StaleElementReferenceException e) {
			// System.err.println("The element with the Id"+id+"is not stable in the
			// application");
			reportStep("The element with the Id" + id + "is not stable in the application", "Fail");
		} catch (WebDriverException e) {
			// System.err.println("The element with the Id"+id+"is not verifying the text
			// due to unknown error");
			reportStep("The element with the Id" + id + "is not verifying the text due to unknown error", "Fail");
		}
	}

	public void verifyTextByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		try {
			String Text2 = driver.findElementByXPath(xpath).getText();

			if (text.contains(Text2)) {
				// System.out.println("Text actual text"+Text2+"is euals to the expected
				// text"+text);
				reportStep("Text actual text" + Text2 + "is euals to the expected text" + text, "Pass");
			} else {
				// System.out.println("Text actual text"+Text2+"is not euals to the expected
				// text"+text);
				reportStep("Text actual text" + Text2 + "is not euals to the expected text" + text, "Pass");
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			// System.err.println("The element with Xpathvalue"+xpath+"is not available in
			// the DOM");
			reportStep("The element with Xpathvalue" + xpath + "is not available in the DOM", "Fail");
		} catch (ElementNotVisibleException e) {
			// System.err.println("The element with Xpathvalue"+xpath+"is not visible in the
			// appication");
			reportStep("The element with Xpathvalue" + xpath + "is not visible in the appication", "Fail");
		} catch (ElementNotInteractableException e) {
			// System.err.println("The element with the Xpathvalue"+xpath+"is not
			// interactable");
			reportStep("The element with the Xpathvalue" + xpath + "is not interactable", "Fail");
		} catch (StaleElementReferenceException e) {
			// System.err.println("The element with the Xpathvalue"+xpath+"is not stable in
			// the application");
			reportStep("The element with the Xpathvalue" + xpath + "is not stable in the application", "Fail");
		} catch (WebDriverException e) {
			// System.err.println("The element with the Xpathvalue"+xpath+"is not verifying
			// the text due to unknown error");
			reportStep("The element with the Xpathvalue" + xpath + "is not verifying the text due to unknown error",
					"Fail");
		}
	}

	public void verifyTextContainsByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		try {
			String Text3 = driver.findElementById(xpath).getText();

			if (text.contains(Text3)) {
				// System.out.println("The actual text"+Text3+"contains the expected
				// text"+text);
				reportStep("The actual text" + Text3 + "contains the expected text" + text, "Pass");
			} else {
				// System.out.println("The actual text"+Text3+"is not contains the expected
				// text"+text);
				reportStep("The actual text" + Text3 + "is not contains the expected text" + text, "Pass");
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			// System.err.println("The element with Xpathvalue"+xpath+"is not available in
			// the DOM");
			reportStep("The element with Xpathvalue" + xpath + "is not available in the DOM", "Fail");
		} catch (ElementNotVisibleException e) {
			// System.err.println("The element with Xpathvalue"+xpath+"is not visible in the
			// appication");
			reportStep("The element with Xpathvalue" + xpath + "is not visible in the appication", "Fail");
		} catch (ElementNotInteractableException e) {
			// System.err.println("The element with the Xpathvalue"+xpath+"is not
			// interactable");
			reportStep("The element with the Xpathvalue" + xpath + "is not interactable", "Fail");
		} catch (StaleElementReferenceException e) {
			// System.err.println("The element with the Xpathvalue"+xpath+"is not stable in
			// the application");
			reportStep("The element with the Xpathvalue" + xpath + "is not stable in the application", "Fail");
		} catch (WebDriverException e) {
			// System.err.println("The element with the Xpathvalue"+xpath+"is not verifying
			// the text due to unknown error");
			reportStep("The element with the Xpathvalue" + xpath + "is not verifying the text due to unknown error",
					"Fail");
		}

	}

	public void clickById(String id) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(id).click();
			// System.out.println("The element with Id"+id+"is clicking the button");
			reportStep("The element with Id" + id + "is clicking the button", "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			// System.err.println("The element with id"+id+"is not available in the DOM");
			reportStep("The element with id" + id + "is not available in the DOM", "Fail");
		} catch (ElementNotVisibleException e) {
			// System.err.println("The element with id"+id+"is not visible in the
			// appication");
			reportStep("The element with id" + id + "is not visible in the appication", "Fail");
		} catch (ElementNotInteractableException e) {
			// System.err.println("The element with the id"+id+"is not interactable");
			reportStep("The element with the id" + id + "is not interactable", "Fail");
		} catch (StaleElementReferenceException e) {
			// System.err.println("The element with the id"+id+"is not stable in the
			// application");
			reportStep("The element with the id" + id + "is not stable in the application", "Fail");
		} catch (WebDriverException e) {
			// System.err.println("The element with Id"+id+"is not clicking the button due
			// to unknown error");
			reportStep("The element with Id" + id + "is not clicking the button due to unknown error", "Fail");
		}

	}

	public void clickByClassName(String classVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByClassName(classVal).click();
			// System.out.println("The element with ClassName"+classVal+"is clicking the
			// button");
			reportStep("The element with ClassName" + classVal + "is clicking the button", "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			// System.err.println("The element with ClassName"+classVal+"is not available in
			// the DOM");
			reportStep("The element with ClassName" + classVal + "is not available in the DOM", "Fail");
		} catch (ElementNotVisibleException e) {
			// System.err.println("The element with ClassName"+classVal+"is not visible in
			// the appication");
			reportStep("The element with ClassName" + classVal + "is not visible in the appication", "Fail");
		} catch (ElementNotInteractableException e) {
			// System.err.println("The element with the ClassName"+classVal+"is not
			// interactable");
			reportStep("The element with the ClassName" + classVal + "is not interactable", "Fail");
		} catch (StaleElementReferenceException e) {
			// System.err.println("The element with the ClassName"+classVal+"is not stable
			// in the application");
			reportStep("The element with the ClassName" + classVal + "is not stable in the application", "Fail");
		} catch (WebDriverException e) {
			// System.err.println("The element with ClassName"+classVal+"is not clicking the
			// button due to unknown error");
			reportStep("The element with ClassName" + classVal + "is not clicking the button due to unknown error",
					"Fail");
		}
	}

	public void clickByName(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(name).click();
			// System.out.println("The element with namevalue"+name+"is clicking the
			// button");
			reportStep("The element with namevalue" + name + "is clicking the button", "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			// System.err.println("The element with namevalue"+name+"is not available in the
			// DOM");
			reportStep("The element with namevalue" + name + "is not available in the DOM", "Fail");
		} catch (ElementNotVisibleException e) {
			// System.err.println("The element with namevalue"+name+"is not visible in the
			// appication");
			reportStep("The element with namevalue" + name + "is not visible in the appication", "Fail");
		} catch (ElementNotInteractableException e) {
			// System.err.println("The element with the namevalue"+name+"is not
			// interactable");
			reportStep("The element with the namevalue" + name + "is not interactable", "Fail");
		} catch (StaleElementReferenceException e) {
			// System.err.println("The element with the name"+name+"is not stable in the
			// application");
			reportStep("The element with the name" + name + "is not stable in the application", "Fail");
		} catch (WebDriverException e) {
			// System.err.println("The element with namevalue"+name+"is not clicking the
			// button due to unknown error");
			reportStep("The element with namevalue" + name + "is not clicking the button due to unknown error", "Fail");
		}
	}

	public void clickByLink(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();
			// System.out.println("The element with linktextValue"+name+"is clicking the
			// button");
			reportStep("The element with linktextValue" + name + "is clicking the button", "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			// System.err.println("The element with linktextValue"+name+"is not available in
			// the DOM");
			reportStep("The element with linktextValue" + name + "is not available in the DOM", "Fail");
		} catch (ElementNotVisibleException e) {
			// System.err.println("The element with linktextValue"+name+"is not visible in
			// the appication");
			reportStep("The element with linktextValue" + name + "is not visible in the appication", "Fail");
		} catch (ElementNotInteractableException e) {
			// System.err.println("The element with the linktextValue"+name+"is not
			// interactable");
			reportStep("The element with the linktextValue" + name + "is not interactable", "Fail");
		} catch (StaleElementReferenceException e) {
			// System.err.println("The element with the linktextValue"+name+"is not stable
			// in the application");
			reportStep("The element with the linktextValue" + name + "is not stable in the application", "Fail");
		} catch (WebDriverException e) {
			// System.err.println("The element with linktextValue"+name+"is not clicking the
			// button due to unknown error");
			reportStep("The element with linktextValue" + name + "is not clicking the button due to unknown error",
					"Fail");
		}
	}

	public void clickByLinkNoSnap(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();
			// System.out.println("The element with linktextvalue"+name+"is clicking the
			// button");
			reportStep("The element with linktextvalue" + name + "is clicking the button", "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			// System.err.println("The element with linktextvalue"+name+"is not available in
			// the DOM");
			reportStep("The element with linktextvalue" + name + "is not available in the DOM", "Fail");
		} catch (ElementNotVisibleException e) {
			// System.err.println("The element with linktextvalue"+name+"is not visible in
			// the appication");
			reportStep("The element with linktextvalue" + name + "is not visible in the appication", "Fail");
		} catch (ElementNotInteractableException e) {
			// System.err.println("The element with the linktextvalue"+name+"is not
			// interactable");
			reportStep("The element with the linktextvalue" + name + "is not interactable", "Fail");
		} catch (StaleElementReferenceException e) {
			// System.err.println("The element with the linktextvalue"+name+"is not stable
			// in the application");
			reportStep("The element with the linktextvalue" + name + "is not stable in the application", "Fail");
		} catch (WebDriverException e) {
			// System.err.println("The element with linktextvalue"+name+"is not clicking the
			// button due to unkown error");
			reportStep("The element with linktextvalue" + name + "is not clicking the button due to unkown error",
					"Fail");
		}
	}

	public void clickByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();
			// System.out.println("The element with Xpathvalue"+xpathVal+"is clicking the
			// button");
			reportStep("The element with Xpathvalue" + xpathVal + "is clicking the button", "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			// System.err.println("The element with Xpathvalue"+xpathVal+"is not available
			// in the DOM");
			reportStep("The element with Xpathvalue" + xpathVal + "is not available in the DOM", "Fail");
		} catch (ElementNotVisibleException e) {
			// System.err.println("The element with Xpathvalue"+xpathVal+"is not visible in
			// the appication");
			reportStep("The element with Xpathvalue" + xpathVal + "is not visible in the appication", "Fail");
		} catch (ElementNotInteractableException e) {
			// System.err.println("The element with the Xpathvalue"+xpathVal+"is not
			// interactable");
			reportStep("The element with the Xpathvalue" + xpathVal + "is not interactable", "Fail");
		} catch (StaleElementReferenceException e) {
			// System.err.println("The element with the Xpathvalue"+xpathVal+"is not stable
			// in the application");
			reportStep("The element with the Xpathvalue" + xpathVal + "is not stable in the application", "Fail");
		} catch (WebDriverException e) {
			// System.err.println("The element with Xpathvalue"+xpathVal+"is ot clicking the
			// button due to unknown error");
			reportStep("The element with Xpathvalue" + xpathVal + "is ot clicking the button due to unknown error",
					"Fail");
		}
	}

	public void clickByXpathNoSnap(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();
			// System.out.println("The element with Xpathvalue"+xpathVal+"is clicking the
			// button");
			reportStep("The element with Xpathvalue" + xpathVal + "is clicking the button", "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			// System.err.println("The element with Xpathvalue"+xpathVal+"is not available
			// in the DOM");
			reportStep("The element with Xpathvalue" + xpathVal + "is not available in the DOM", "Fail");
		} catch (ElementNotVisibleException e) {
			// System.err.println("The element with Xpathvalue"+xpathVal+"is not visible in
			// the appication");
			reportStep("The element with Xpathvalue" + xpathVal + "is not visible in the appication", "Fail");
		} catch (ElementNotInteractableException e) {
			// System.err.println("The element with the Xpathvalue"+xpathVal+"is not
			// interactable");
			reportStep("The element with the Xpathvalue" + xpathVal + "is not interactable", "Fail");
		} catch (StaleElementReferenceException e) {
			// System.err.println("The element with the Xpathvalue"+xpathVal+"is not stable
			// in the application");
			reportStep("The element with the Xpathvalue" + xpathVal + "is not stable in the application", "Fail");
		} catch (WebDriverException e) {
			// System.err.println("The element with Xpathvalue"+xpathVal+"is not clicking
			// the button due to unknown error");
			reportStep("The element with Xpathvalue" + xpathVal + "is not clicking the button due to unknown error",
					"Fail");
		}
	}

	public String getTextById(String idVal) {
		// TODO Auto-generated method stub
		try {
			String Reqtext = driver.findElementById(idVal).getText();
			// System.out.println(Reqtext);
			reportStep(Reqtext, "Pass");
			// System.out.println("The element with Id"+idVal+"is getting the text");
			reportStep("The element with Id" + idVal + "is getting the text", "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			// System.err.println("The element with Id"+idVal+"is not available in the
			// DOM");
			reportStep("The element with Id" + idVal + "is not available in the DOM", "Fail");
		} catch (ElementNotVisibleException e) {
			// System.err.println("The element with Id"+idVal+"is not visible in the
			// appication");
			reportStep("The element with Id" + idVal + "is not visible in the appication", "Fail");
		} catch (ElementNotInteractableException e) {
			// System.err.println("The element with the Id"+idVal+"is not interactable");
			reportStep("The element with the Id" + idVal + "is not interactable", "Fail");
		} catch (StaleElementReferenceException e) {
			// System.err.println("The element with the Id"+idVal+"is not stable in the
			// application");
			reportStep("The element with the Id" + idVal + "is not stable in the application", "Fail");
		} catch (WebDriverException e) {
			// System.err.println("The element with id value"+ idVal+ "is not getting the
			// text due to unknown error");
			reportStep("The element with id value" + idVal + "is not getting the text due to unknown error", "Fail");
		}
		return idVal;

	}

	public String getTextByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			String Requiredtext = driver.findElementByXPath(xpathVal).getText();
			// System.out.println(Requiredtext);
			reportStep(Requiredtext, "Pass");
			System.out.println("The element with Xpathvalue" + xpathVal + "is getting the text");
			reportStep("The element with Xpathvalue" + xpathVal + "is getting the text", "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			// System.err.println("The element with Xpathvalue"+xpathVal+"is not available
			// in the DOM");
			reportStep("The element with Xpathvalue" + xpathVal + "is not available in the DOM", "Fail");
		} catch (ElementNotVisibleException e) {
			// System.err.println("The element with Xpathvalue"+xpathVal+"is not visible in
			// the appication");
			reportStep("The element with Xpathvalue" + xpathVal + "is not visible in the appication", "Fail");
		} catch (ElementNotInteractableException e) {
			// System.err.println("The element with the Xpathvalue"+xpathVal+"is not
			// interactable");
			reportStep("The element with the Xpathvalue" + xpathVal + "is not interactable", "Fail");
		} catch (StaleElementReferenceException e) {
			// System.err.println("The element with the Xpathvalue"+xpathVal+"is not stable
			// in the application");
			reportStep("The element with the Xpathvalue" + xpathVal + "is not stable in the application", "Fail");
		} catch (WebDriverException e) {
			// System.err.println("The element with Xpathvalue"+ xpathVal+ "is not getting
			// the text due to unknown error");
			reportStep("The element with Xpathvalue" + xpathVal + "is not getting the text due to unknown error",
					"Fail");
		}
		return xpathVal;
	}

	public void selectVisibileTextById(String id, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement element = driver.findElementById(id);
			Select element1 = new Select(element);
			element1.selectByVisibleText(value);
			// System.out.println("The element with Id"+id+"is selecting the text"+value);
			reportStep("The element with Id" + id + "is selecting the text" + value, "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			// System.err.println("The element with Id"+id+"is not available in the DOM");
			reportStep("The element with Id" + id + "is not available in the DOM", "Fail");
		} catch (ElementNotVisibleException e) {
			// System.err.println("The element with Id"+id+"is not visible in the
			// appication");
			reportStep("The element with Id" + id + "is not visible in the appication", "Fail");
		} catch (ElementNotInteractableException e) {
			// System.err.println("The element with the Id"+id+"is not interactable");
			reportStep("The element with the Id" + id + "is not interactable", "Fail");
		} catch (StaleElementReferenceException e) {
			// System.err.println("The element with the Id"+id+"is not stable in the
			// application");
			reportStep("The element with the Id" + id + "is not stable in the application", "Fail");
		} catch (WebDriverException e) {
			// System.err.println("The element with Id"+ id+ "is not selecting the text due
			// to unknown error");
			reportStep("The element with Id" + id + "is not selecting the text due to unknown error", "Fail");
		}
	}

	public void selectIndexById(String id, int value) {
		// TODO Auto-generated method stub
		try {
			WebElement element2 = driver.findElementById(id);
			Select element3 = new Select(element2);
			element3.selectByIndex(value);
			System.out.println("The element with Id" + id + "is selecting the text" + value);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with Id" + id + "is not available in the DOM");
		} catch (ElementNotVisibleException e) {
			System.err.println("The element with Id" + id + "is not visible in the appication");
		} catch (ElementNotInteractableException e) {
			System.err.println("The element with the Id" + id + "is not interactable");

		} catch (StaleElementReferenceException e) {
			System.err.println("The element with the Id" + id + "is not stable in the application");
		} catch (WebDriverException e) {
			System.err.println("The element with Id" + id + "is not selecting the text due to unknown error");
		} finally {
			takeSnap();
		}
	}

	public void switchToParentWindow() {
		// TODO Auto-generated method stub
		try {
			Set<String> Allwindows = driver.getWindowHandles();
			for (String ParentWindow : Allwindows) {
				driver.switchTo().window(ParentWindow);
				break;
			}
			System.out.println("Driver is Switched to parent window successfully");
			reportStep("Driver is Switched to parent window successfully", "Pass");
		} catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
			System.err.println("The parent window target to be switched is not found");

		} catch (SessionNotCreatedException e) {
			System.err.println("The Session is not created for the parent window");
		} catch (NoSuchSessionException e) {
			System.err.println("The session is not found for the parent window");
		} catch (WebDriverException e) {
			System.err.println("Due to unknown error driver is not switched to parent window");
		} finally {
			takeSnap();
		}
	}

	public void switchToLastWindow() {
		// TODO Auto-generated method stub
		try {
			Set<String> Wind1 = driver.getWindowHandles();
			for (String Wind2 : Wind1) {
				driver.switchTo().window(Wind2);
			}
			// System.out.println("Driver is Switched to last window successfully");
			reportStep("Driver is Switched to last window successfully", "Pass");
		} catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
			// System.err.println("The last window target to be switched is not found");
			reportStep("The last window target to be switched is not found", "Fail");
		} catch (SessionNotCreatedException e) {
			// System.err.println("The Session is not created for the last window");
			reportStep("The Session is not created for the last window", "Fail");
		} catch (NoSuchSessionException e) {
			// System.err.println("The session is not found for the last window");
			reportStep("The session is not found for the last window", "fail");
		} catch (WebDriverException e) {
			// System.err.println("Due to unknown error driver is not switched to last
			// window");
			reportStep("Due to unknown error driver is not switched to last window", "Fail");
		}
	}

	public void acceptAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().accept();
			System.out.println("Accepted the Alert successfully in the Alert box");
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			System.err.println("There is no alert to interact with in the pertucular instance");
		} catch (ElementNotInteractableException e) {
			System.err.println("The Alert is not inreractable");
		} catch (StaleElementReferenceException e) {
			System.err.println("The Alert in the appication is not stable");
		} catch (WebDriverException e) {
			System.err.println("Not accepted the Alert due to unknown error");
		} finally {
			takeSnap();
		}

	}

	public void dismissAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().dismiss();
			System.out.println("Dismiss the Alert successfully in the Alert box");
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			System.err.println("There is no alert to interact with in the pertucular instance");
		} catch (ElementNotInteractableException e) {
			System.err.println("The Alert is not inreractable");
		} catch (StaleElementReferenceException e) {
			System.err.println("The Alert in the appication is not stable");
		} catch (WebDriverException e) {
			System.err.println("Not dismiss the Alert due to unknown error");
		} finally {
			takeSnap();
		}
	}

	public String getAlertText() {
		// TODO Auto-generated method stub
		String alerttext = "";
		try {
			driver.switchTo().alert().getText();
			System.out.println("Got the text from the Alert box successfully");
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			System.err.println("There is no alert to interact with in the pertucular instance");
		} catch (ElementNotInteractableException e) {
			System.err.println("The Alert is not inreractable");
		} catch (StaleElementReferenceException e) {
			System.err.println("The Alert in the appication is not stable");
		} catch (WebDriverException e) {
			System.err.println("Not dismiss the Alert due to unknown error");
		}
		return alerttext;

	}

	int i = 1;

	public long takeSnap() {
		// TODO Auto-generated method stub

		long snapNumber = 1000000l;
		try {

			// snapNumber = System.currentTimeMillis();
			snapNumber = (long) Math.floor(Math.random() * 100000 + 100000l);
			File temp = driver.getScreenshotAs(org.openqa.selenium.OutputType.FILE);
			File dest = new File("./screesnshots/snap" + snapNumber + ".png");
			FileUtils.copyFile(temp, dest);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("Input/Output file operation issue");

		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			System.err.println("The browser got closed due to unknown error");
		}
		return snapNumber;

	}

	public void closeBrowser() {
		// TODO Auto-generated method stub
		try {
			driver.close();
			// System.out.println("Browser got closed successfully");
			reportStep("Browser got closed successfully", "Pass");
		} catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
			// System.err.println("There is no such window to close at this instance ");
			reportStep("There is no such window to close at this instance ", "Fail");
		} catch (WebDriverException e) {
			// System.err.println("The window not closed due to unknown error");
			reportStep("The window not closed due to unknown error", "Fail");
		}
	}

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		try {
			driver.quit();
			// System.out.println("All Browsers are closed successfully");
			reportStep("All Browsers are closed successfully", "Pass", true);
		} catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
			// System.err.println("There is no such windows to close at this instance ");
			reportStep("There is no such windows to close at this instance ", "Fail");
		} catch (WebDriverException e) {
			// System.err.println("All the windows are not closed due to unknown error");
			reportStep("All the windows are not closed due to unknown error", "Fail");
		}
	}

	public void waittime(long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void selectVisibileTextByXPath(String Xpath, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement element2 = driver.findElementByXPath(Xpath);
			Select element3 = new Select(element2);
			element3.selectByVisibleText(value);
			// System.out.println("The element with Xpathvalue"+Xpath+"is selecting the
			// text"+value);
			reportStep("The element with Xpathvalue" + Xpath + "is selecting the text" + value, "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			// System.err.println("The element with Xpathvalue"+Xpath+"is not available in
			// the DOM");
			reportStep("The element with Xpathvalue" + Xpath + "is not available in the DOM", "Fail");
		} catch (ElementNotVisibleException e) {
			// System.err.println("The element with Xpathvalue"+Xpath+"is not visible in the
			// appication");
			reportStep("The element with Xpathvalue" + Xpath + "is not visible in the appication", "Fail");
		} catch (ElementNotInteractableException e) {
			// System.err.println("The element with the Xpathvalue"+Xpath+"is not
			// interactable");
			reportStep("The element with the Xpathvalue" + Xpath + "is not interactable", "Fail");
		} catch (StaleElementReferenceException e) {
			// System.err.println("The element with the Xpathvalue"+Xpath+"is not stable in
			// the application");
			reportStep("The element with the Xpathvalue" + Xpath + "is not stable in the application", "Fail");
		} catch (WebDriverException e) {
			System.err
					.println("The element with Xpathvalue" + Xpath + "is not selecting the text due to unknown error");
			reportStep("The element with Xpathvalue" + Xpath + "is not selecting the text due to unknown error",
					"Fail");
		}
	}

	public void selectVisibileTextByName(String Name, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement item = driver.findElementByName(Name);
			Select itemtoselect = new Select(item);
			itemtoselect.selectByVisibleText(value);
			System.out.println("The element with Name" + Name + "is selecting the text" + value);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with Name" + Name + "is not available in the DOM");
		} catch (ElementNotVisibleException e) {
			System.err.println("The element with Name" + Name + "is not visible in the appication");
		} catch (ElementNotInteractableException e) {
			System.err.println("The element with the Name" + Name + "is not interactable");

		} catch (StaleElementReferenceException e) {
			System.err.println("The element with the Name" + Name + "is not stable in the application");
		} catch (WebDriverException e) {
			System.err.println("The element with Name" + Name + "is not selecting the text due to unknown error");
		} finally {
			takeSnap();
		}

	}

	public void enterByIdTab(String idValue) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(idValue).sendKeys(Keys.TAB);
			System.out.println("The element with idValue" + idValue + "is moving to next element with the input");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with idValue" + idValue + "is not available in the DOM");
		} catch (ElementNotVisibleException e) {
			System.err.println("The element with idValue" + idValue + "is not visible in the application");
		} catch (ElementNotInteractableException e) {
			System.err.println("The element with the idValue" + idValue + "is not interactable");
		} catch (StaleElementReferenceException e) {
			System.err.println("The element with the idValue" + idValue + "is not stable in the application");
		} catch (WebDriverException e) {
			System.err.println("The element with idValue" + idValue + "is not moving to next element with the input");
		} finally {
			takeSnap();
		}
	}

	public void enterTabByXpath(String Xpath) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(Xpath).sendKeys(Keys.TAB);
			// System.out.println("The element with Xpathvalue"+Xpath+"is moving to next
			// element");
			reportStep("The element with Xpathvalue" + Xpath + "is moving to next element", "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			// System.err.println("The element with Xpathvalue"+Xpath+"is not available in
			// the DOM");
			reportStep("The element with Xpathvalue" + Xpath + "is not available in the DOM", "Fail");
		} catch (ElementNotVisibleException e) {
			// System.err.println("The element with Xpathvalue"+Xpath+"is not visible in the
			// application");
			reportStep("The element with Xpathvalue" + Xpath + "is not visible in the application", "Fail");
		} catch (ElementNotInteractableException e) {
			// System.err.println("The element with the Xpathvalue"+Xpath+"is not
			// interactable");
			reportStep("The element with the Xpathvalue" + Xpath + "is not interactable", "Fail");
		} catch (StaleElementReferenceException e) {
			// System.err.println("The element with the Xpathvalue"+Xpath+"is not stable in
			// the application");
			reportStep("The element with the Xpathvalue" + Xpath + "is not stable in the application", "Fail");
		} catch (WebDriverException e) {
			// System.err.println("The element with Xpathvalue"+Xpath+"is not moving to next
			// element");
			reportStep("The element with Xpathvalue" + Xpath + "is not moving to next element", "Fail");
		}
	}

	public String getAttributeValueByXpath(String xpathVal, String value) {
		// TODO Auto-generated method stub
		try {
			String valueatt = driver.findElementByXPath(xpathVal).getAttribute(value);
			System.out.println(valueatt);
			System.out.println("The element with Xpathvalue" + xpathVal + "is getting the text");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with Xpathvalue" + xpathVal + "is not available in the DOM");
		} catch (ElementNotVisibleException e) {
			System.err.println("The element with Xpathvalue" + xpathVal + "is not visible in the appication");
		} catch (ElementNotInteractableException e) {
			System.err.println("The element with the Xpathvalue" + xpathVal + "is not interactable");

		} catch (StaleElementReferenceException e) {
			System.err.println("The element with the Xpathvalue" + xpathVal + "is not stable in the application");
		} catch (WebDriverException e) {
			System.err
					.println("The element with Xpathvalue" + xpathVal + "is not getting the text due to unknown error");
		}
		return value;
	}

	public void enterByNameTab(String NameValue) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(NameValue).sendKeys(Keys.TAB);
			System.out.println("The element with NameValue" + NameValue + "is moving to next element with the input");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with NameValue" + NameValue + "is not available in the DOM");
		} catch (ElementNotVisibleException e) {
			System.err.println("The element with NameValue" + NameValue + "is not visible in the application");
		} catch (ElementNotInteractableException e) {
			System.err.println("The element with the NameValue" + NameValue + "is not interactable");
		} catch (StaleElementReferenceException e) {
			System.err.println("The element with the NameValue" + NameValue + "is not stable in the application");
		} catch (WebDriverException e) {
			System.err
					.println("The element with NameValue" + NameValue + "is not moving to next element with the input");
		} finally {
			takeSnap();
		}
	}

	public void enterByClassName(String ClassName, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByClassName(ClassName).sendKeys(data);
			System.out.println("The element with ClassValue" + ClassName + "is entered with the data" + data);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with ClassValue" + ClassName + "is not available in the DOM");
		} catch (ElementNotVisibleException e) {
			System.err.println("The element with ClassValue" + ClassName + "is not visible in the application");
		} catch (ElementNotInteractableException e) {
			System.err.println("The element with the ClassValue" + ClassName + "is not interactable");
		} catch (StaleElementReferenceException e) {
			System.err.println("The element with the ClassValue" + ClassName + "is not stable in the application");
		} catch (WebDriverException e) {
			System.err.println("The element with ClassValue" + ClassName + "is not entered with the date" + data
					+ "due to unknown error");
		} finally {
			takeSnap();
		}

	}

	public void enterTabByClassName(String ClassName) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByClassName(ClassName).sendKeys(Keys.TAB);
			System.out.println("The element with ClassName" + ClassName + "is moving to next element with the input");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with ClassName" + ClassName + "is not available in the DOM");
		} catch (ElementNotVisibleException e) {
			System.err.println("The element with ClassName" + ClassName + "is not visible in the application");
		} catch (ElementNotInteractableException e) {
			System.err.println("The element with the ClassName" + ClassName + "is not interactable");
		} catch (StaleElementReferenceException e) {
			System.err.println("The element with the ClassName" + ClassName + "is not stable in the application");
		} catch (WebDriverException e) {
			System.err
					.println("The element with ClassName" + ClassName + "is not moving to next element with the input");
		} finally {
			takeSnap();
		}

	}

	public void selectIndexValueByName(String Name, int value) {
		// TODO Auto-generated method stub
		try {
			WebElement element2 = driver.findElementByName(Name);
			Select element3 = new Select(element2);
			element3.selectByIndex(value);
			System.out.println("The element with Namevalue" + Name + "is selecting the text");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with Namevalue" + Name + "is not available in the DOM");
		} catch (ElementNotVisibleException e) {
			System.err.println("The element with Namevalue" + Name + "is not visible in the appication");
		} catch (ElementNotInteractableException e) {
			System.err.println("The element with the Namevalue" + Name + "is not interactable");

		} catch (StaleElementReferenceException e) {
			System.err.println("The element with the Namevalue" + Name + "is not stable in the application");
		} catch (WebDriverException e) {
			System.err.println("The element with Namevalue" + Name + "is not selecting the text due to unknown error");
		} finally {
			takeSnap();
		}
	}
}
