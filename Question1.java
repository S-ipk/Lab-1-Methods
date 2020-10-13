package Lab_1_Methods;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a word : ");
		String name = scanner.next();
		System.out.println("Enter a number : ");
		int number = scanner.nextInt();
		
		stringTimes(name,number);

	}

	private static void stringTimes(String name , int number) {
		
		for (int i = 1; i <= number; i++) {
			
			System.out.print(name);
		}
		
	}

}
