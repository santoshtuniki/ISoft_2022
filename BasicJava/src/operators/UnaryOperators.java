package operators;

import java.util.Scanner;

public class UnaryOperators {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a: ");
		int a = sc.nextInt();
		sc.close();
		
		//Unary Operators
		System.out.println("====================Unary Operators========================");
		System.out.println("a = "+a);
		System.out.println("Post Increment of a: "+(a++));	//First assign value, then increment
		System.out.println("a = "+a);
		System.out.println("Pre Increment of a: "+(++a));	//First increment, then assign value		
		System.out.println("a = "+a);
		System.out.println("Post Decrement of a: "+(a--));	//First assign value, then decrement
		System.out.println("a = "+a);
		System.out.println("Pre Decrement of a: "+(--a));	//First decrement, then assign value
		System.out.println("=============================================================");

	}

}
