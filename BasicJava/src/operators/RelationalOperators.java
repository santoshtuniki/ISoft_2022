package operators;

import java.util.Scanner;

public class RelationalOperators {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a: ");
		int a = sc.nextInt();
		System.out.print("Enter b: ");
		int b = sc.nextInt();
		sc.close();
		
		//Relational Operators
		System.out.println("====================Relational Operators========================");
		if(a>b) {
			System.out.println(a+" is greater than "+b);
		} else if(a<b) {
			System.out.println(a+" is lesser than "+b);
		} else {
			System.out.println(a+" is Equal "+b);
		}
		
		if(a%2==0 ) {
			System.out.println(a+" is an even Integer");
		} else {
			System.out.println(a+" is a odd Integer");
		}
		
		if(b%2!=0 ) {
			System.out.println(b+" is a odd Integer");
		} else {
			System.out.println(b+" is an even Integer");
		}
		System.out.println("=============================================================");

	}

}
