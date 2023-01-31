package operators;

import java.util.Scanner;

public class AssignmentOperators {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a: ");
		int a = sc.nextInt();
		System.out.print("Enter b: ");
		int b = sc.nextInt();
		sc.close();
		
		//Assignment Operators
		System.out.println("====================Assignment Operators========================");
		a+=b;
		System.out.println("a+=b => a="+a);
		a-=b;
		System.out.println("a-=b => a="+a);
		a*=b;
		System.out.println("a*=b => a="+a);
		
		if(b!=0) {
			a/=b;
			System.out.println("a/=b => a="+a);
			a%=b;
			System.out.println("a%=b => a="+a);
		} else {
			System.out.println("Invalid input of b");
		}
		System.out.println("=============================================================");
	}

}
