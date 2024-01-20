package gl.denomination.calculator;

import java.util.Scanner;

public class Driver {
	
		public static void main(String[] args) {
			
			Integer[] denominations;
			int paymentAmount;	
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("Enter the number of currency denominations ");
			
			Integer denominationsSize = input.nextInt();
			
			denominations = new Integer[denominationsSize];
			
			for (int index = 0; index < denominationsSize; index ++) {
				
				
				System.out.printf("Enter the Denomination Value : %d / %d", 
						(index + 1), denominationsSize);
				System.out.println();
				
				denominations[index] = input.nextInt();
			}
			
			System.out.println("Enter the payment amount : ");
			
			paymentAmount = input.nextInt();
			
			DenominationCalculator calculator = 
					new DenominationCalculator(denominations, paymentAmount);
			
			calculator.calculate();
			input.close();
		}	
	}

