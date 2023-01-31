package statements;

import java.util.Scanner;

public class ElseIf_Condition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a: ");
		int a = sc.nextInt();
		System.out.print("Enter b: ");
		int b = sc.nextInt();
		sc.close();
		
		//ElseIf Condition (2 conditions 3 statements)
		System.out.println("====================ElseIf Condition========================");
		if(a>b) {
			System.out.println(a+" is greater than "+b);
		} else if(a<b) {
			System.out.println(a+" is lesser than "+b);
		} else {
			System.out.println(a+" is Equal "+b);
		}
		System.out.println("=============================================================");

	}

}
