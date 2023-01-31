package polymorphism;

public class Electronics {
	public void details(String name) {
		System.out.println("You would like to buy "+name);
	}
	
	public void details(String name, String brand) {
		System.out.println("You would like to buy "+name+" and brand is "+brand);
	}
	
	public void details(String name, String brand, String color) {
		System.out.println("You would like to buy "+name+" and brand is "+brand);
		System.out.println("Oh! so you like "+color+" color phone");
	}
	
	public void details(String name, String brand, String color ,String memory) {
		System.out.println("You would like to buy "+name+" and brand is "+brand);
		System.out.println("Oh! so you like "+color+" color phone");
		System.out.println("Okay and it should be one with the "+memory+" storage capacity");
	}
	
	public void details(String name, String brand, String color ,String memory, double size) {
		System.out.println("You would like to buy "+name+" and brand is "+brand);
		System.out.println("Oh! so you like "+color+" color phone");
		System.out.println("Okay and it should be one with the "+memory+" storage capacity");
		System.out.println("Cool! Finally it should be of "+size+" inches");
	}
}