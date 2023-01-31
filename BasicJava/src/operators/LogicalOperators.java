package operators;

import java.util.Scanner;

public class LogicalOperators {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a: ");
		int a = sc.nextInt();
		System.out.print("Enter b: ");
		int b = sc.nextInt();
		sc.close();
		
		//Logical Operators
		System.out.println("====================Logical Operators========================");
		if(a%2==0 && b%2==0) {
			System.out.println("Both of "+a+" and "+b+" are even");
		} else if (a%2!=0 && b%2!=0) {
			System.out.println("Both of "+a+" and "+b+" are odd");
		} else {
			System.out.println("Either of "+a+" or "+b+" is even");
		}
		System.out.println("=============================================================");
	}

}
