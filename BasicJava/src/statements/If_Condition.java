package statements;

import java.util.Scanner;

public class If_Condition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a: ");
		int a = sc.nextInt();
		sc.close();
		
		//if Condition (1 condition 1 statement)
		System.out.println("====================if Condition========================");
		if(a%2==0) {
			System.out.println("a is even");
		}
		System.out.println("=============================================================");
	}
}
