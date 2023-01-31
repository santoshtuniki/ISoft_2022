package statements;

import java.util.Scanner;

public class Switch_Case {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a: ");
		int a = sc.nextInt();
		System.out.print("Enter b: ");
		int b = sc.nextInt();
		System.out.println("Enter following option to perform Arithemtic operation between a and b: \n 1: Addition \n 2: Subtraction \n 3: Multiplication \n 4: Quotient \n 5: Remainder");
		System.out.print("Please Enter your choice: ");
		int choice = sc.nextInt();
		sc.close();
		
		//Switch_Case
		System.out.println("====================Switch_Case========================");
		switch(choice) {
		case 1:
			System.out.println(a+" + "+b+" = "+(a+b));
			break;
		case 2:
			System.out.println(a+" - "+b+" = "+(a-b));
			break;
		case 3:
			System.out.println(a+" x "+b+" = "+(a*b));
			break;
		case 4:
			if(b!=0) {
				System.out.println(a+" / "+b+" = "+(a/b));
			} else {
				System.out.println("Invalid input b");
			}
			break;
		case 5:
			if(b!=0) {
				System.out.println(a+" % "+b+" = "+(a%b));
			} else {
				System.out.println("Invalid input b");
			}
			break;
		default:
			System.out.println("Enter valid choice");
		}
		System.out.println("=============================================================");
	}
}
