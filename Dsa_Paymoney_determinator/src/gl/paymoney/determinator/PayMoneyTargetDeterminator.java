package gl.paymoney.determinator;

import java.util.Scanner;

public class PayMoneyTargetDeterminator {
	
	Integer[] transactionList;
	Integer dailyTargetValue;
	Scanner input;
	
	public PayMoneyTargetDeterminator() {
		input = new Scanner(System.in);
	}
	
	private void collectTransactionList() {
		
		System.out.println("Transaction List:");
		System.out.println("Please Enter the Size Of the Transaction List:");
		
		Integer transactionListSize = input.nextInt();
		transactionList= new Integer[transactionListSize];
		
		for(int index=0;index<transactionListSize;index++) {
			
		System.out.printf("Enter the transaction value : %d / %d ", (index + 1), transactionListSize);
        System.out.println();
			
	    transactionList[index] = input.nextInt();
		}
			
	}

	private void collectdailyTarget() {
		System.out.println("Daily target...");
		System.out.println("Enter the value for daily target: ");
		dailyTargetValue = input.nextInt();
		
	}
	
	public void determine() {
		collectTransactionList();
		collectdailyTarget();
		determineTarget();
		
	}
	
	void determineTarget() {
		
		int sumOfTransactionValues =0;
		boolean dailyTargetAchieved=false;
		int counter = 0;
		
		for(int index=0;index<transactionList.length;index++) {
			
			counter++;
			int transactionValue= transactionList[index];
			sumOfTransactionValues = sumOfTransactionValues+transactionValue;
			
			System.out.printf("Current sum of transaction values: %d", sumOfTransactionValues);
			System.out.println();
			
			if(sumOfTransactionValues>=dailyTargetValue) {
				dailyTargetAchieved=true;
				break;
			}
		}
		
		if(dailyTargetAchieved) {
			System.out.printf("Daily Target of %d is achieved after %d transactions", dailyTargetValue, counter);
			System.out.println();
		}
		else {
			System.out.printf("Daily Target of %d is not achieved", dailyTargetValue);
			System.out.println();
		}
	}
}