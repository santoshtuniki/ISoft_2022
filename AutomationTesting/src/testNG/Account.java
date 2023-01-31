package testNG;

import org.testng.annotations.Test;

// @Test executed based on dependsOnMethods

public class Account {
  @Test
  public void AccountCreation() {
	  System.out.println("Account has been created");
  }
  
  @Test(dependsOnMethods = {"AccountCreation"})
  public void AccountUpdation() {
	  System.out.println("Account has been updated");
  }
  
  @Test(dependsOnMethods = {"AccountUpdation"})
  public void AccountManipulation() {
	  System.out.println("Account has been manipulated");
  }
  
  @Test(dependsOnMethods = {"AccountManipulation"})
  public void AccountVerification() {
	  System.out.println("Account has been verified");
  }
  
  @Test(dependsOnMethods = {"AccountVerification"})
  public void AccountDeletion() {
	  System.out.println("Account has been deleted");
  }
  
}
