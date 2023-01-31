package operators;

import java.util.Scanner;

public class BitwiseOperators {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a: ");
		int a = sc.nextInt();
		System.out.print("Enter b: ");
		int b = sc.nextInt();
		System.out.print("Enter c: ");
		int c = sc.nextInt();
		sc.close();
		
		//Bitwise Operators
		System.out.println("====================Bitwise Operators========================");
		System.out.println(a<b||a++<c);	//true || true = true
		System.out.println("a = "+a);	//because second condition is not checked
		System.out.println(a<b|a++<c);	//true | true = true
		System.out.println("a = "+a);	//because second condition is checked
		System.out.println("=============================================================");
	}

}
