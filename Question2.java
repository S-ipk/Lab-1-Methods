package Lab_1_Methods;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		
		Scanner scanner  =  new Scanner(System.in);
		
		System.out.println("Enter 2 numbers :  ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		
		love6(num1,num2);

	}
	
	public static void love6(int num1 , int num2) {
		
		if(num1 == 6 || num2 == 6) {
			System.out.println(true);
		}else if (num1+num2 == 6) {
			System.out.println(true);
		}else if (num1 - num2 ==6) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}

}
