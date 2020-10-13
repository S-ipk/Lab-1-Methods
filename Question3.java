package Lab_1_Methods;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		
		Scanner input  = new Scanner(System.in);
        
		System.out.println("Please provide a number: ");
		int number = input.nextInt();
		
		specialEleven(number);
	
	}
	
	private static void specialEleven(int number) {
		
		if (number % 11 == 1) {
			System.out.println(true);
		}else if (number % 11 == 0) {
			System.out.println(true);
		}else {
		    System.out.println(false);
		}
		
		
	}

}
