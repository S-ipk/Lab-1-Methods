package Lab_1_Methods;

import java.util.Scanner;

public class question4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a temperature : ");
		
		int temperature = input.nextInt();
		System.out.println("is it summer?  ");
		boolean isSummer = input.nextBoolean();
        
		deerPlay(temperature,isSummer);
	}

	private static void deerPlay(int temperature , boolean isSummer) {
		
		if (isSummer) {
			if (temperature > 60 && temperature < 100) {
				System.out.println(true);
			}else {
				System.out.println(false);
			}
		}else {
			if (temperature > 60 && temperature < 90) {
				System.out.println(true);
			}else {
				System.out.println(false);
			}
			
			
		}
		
	}

}
