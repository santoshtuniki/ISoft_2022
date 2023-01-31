package operators;

import java.util.Scanner;

public class TernaryOperators {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a: ");
		int a = sc.nextInt();
		System.out.print("Enter b: ");
		int b = sc.nextInt();
		sc.close();
		
		//Ternary Operators
		System.out.println("====================Ternary Operators========================");
		if(a!=b) {
			int min=(a<b)?a:b;
			System.out.println("minimum of a & b = "+min);
		} else {
			System.out.println("Both a & b are equal");
		}
		System.out.println("=============================================================");

	}

}
