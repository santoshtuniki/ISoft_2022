package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

// All Annotations discussed 

public class Annotations {
  @Test
  public void testCase() {
	  System.out.println("This will a method");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This will execute beforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("This will execute afterMethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("This will execute beforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("This will execute afterClass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("This will execute beforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("This will execute afterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("This will execute beforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("This will execute afterSuite");
  }

}
