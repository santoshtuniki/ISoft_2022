package statements;

import java.util.Scanner;

public class NestedIf_Condition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a: ");
		int a = sc.nextInt();
		System.out.print("Enter b: ");
		int b = sc.nextInt();
		sc.close();
		
		//NestedIf Condition
		System.out.println("====================NestedIf Condition========================");
		if(a>b) {
			System.out.println("a is greater than b");
			if(b!=0) {
				System.out.println(a+" / "+b+" = "+(a/b));
			}
			else {
				System.out.println("cannot divide a by b");
			}
		} else {
			System.out.println("a is lesser than or equal to b");
		}
		System.out.println("=============================================================");
	}

}
