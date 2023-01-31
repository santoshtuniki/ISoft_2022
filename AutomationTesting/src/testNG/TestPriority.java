package testNG;

import org.testng.annotations.Test;

// priority Order of @Test

public class TestPriority {
	@Test(priority=5)
	public void Apple() {
		  System.out.println("This executes Apple");
	}
	  
	@Test(priority=6)
	public void Banana() {
		System.out.println("This executes Banana");
	}
	  
	@Test(priority=4)
	public void Strawberry() {
		System.out.println("This executes Strawberry");
	}
	  
	@Test(priority=2)
	public void Orange() {
		System.out.println("This executes Orange");
	}
	  
	@Test(priority=1)
	public void Guava() {
		System.out.println("This executes Guava");
	}
	  
	@Test(priority=3)
	public void Mango() {
		System.out.println("This executes Mango");
	}
}
