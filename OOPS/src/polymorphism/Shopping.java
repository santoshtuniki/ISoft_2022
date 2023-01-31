package polymorphism;

public class Shopping {

	public static void main(String[] args) {
		System.out.println("WELCOME to our shop");
		System.out.println();
		
		Electronics product = new Electronics();
		product.details("phone");
		System.out.println();
		product.details("phone","Redmi Note 8");
		System.out.println();
		product.details("phone","Redmi Note 8","Black");
		System.out.println();
		product.details("phone","Redmi Note 8","Black", "8GB");
		System.out.println();
		product.details("phone","Redmi Note 8","Black", "8GB", 6.5);
	}

}
