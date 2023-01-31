package operators;

import java.util.Scanner;

public class ShiftOperators {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a: ");
		int a = sc.nextInt();
		System.out.print("Enter b: ");
		int b = sc.nextInt();
		sc.close();
		
		//Shift Operators
		System.out.println("====================Shift Operators========================");
		System.out.println("a = "+a);
		System.out.println("Left Shift of a by "+b+" positions: "+(a<<b));	//a*2^n  where n=b
		System.out.println("a = "+a);
		System.out.println("Right Shift of a by "+b+" positions: "+(a>>b));	//a/2^n  where n=b
		System.out.println("=============================================================");

	}

}
