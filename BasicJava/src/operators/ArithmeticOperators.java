package operators;

import java.util.Scanner;

public class ArithmeticOperators {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a: ");
		int a = sc.nextInt();
		System.out.print("Enter b: ");
		int b = sc.nextInt();
		sc.close();
		
		//Arithmetic Operators
		System.out.println("====================Arithmetic Operators========================");
		System.out.println(a+" + "+b+" = "+(a+b));
		System.out.println(a+" - "+b+" = "+(a-b));
		System.out.println(a+" x "+b+" = "+(a*b));
		if(b!=0) {
			System.out.println(a+" / "+b+" = "+(a/b));
			System.out.println(a+" % "+b+" = "+(a%b));
		} else {
			System.out.println("Invalid input b");
		}
		System.out.println("=============================================================");
	}

}
