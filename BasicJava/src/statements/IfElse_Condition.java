package statements;

import java.util.Scanner;

public class IfElse_Condition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a: ");
		int a = sc.nextInt();
		sc.close();
		
		//ifElse Condition (1 condition 2 statements)
		System.out.println("====================ifElse Condition========================");
		if(a%2==0) {
			System.out.println("a is even");
		} else {
			System.out.println("a is odd");
		}
		System.out.println("=============================================================");

	}

}
