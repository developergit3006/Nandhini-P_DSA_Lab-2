package gl.denomination.calculator;

import java.util.Arrays;

public class DenominationCalculator {
	
	private Integer[] denominations;
	private int paymentAmount;
	
	public DenominationCalculator(Integer[] denominations, int paymentAmount) {
		this.denominations = denominations;
		this.paymentAmount = paymentAmount;
	}
	private void performSort() {
		MergeSort sorter = new MergeSort(denominations);
		sorter.mergeSort();
		System.out.println("Sorted array " + Arrays.toString(denominations));
	
	}
	public void calculate() {
	    performSort();
		int denominationIndex=0;
		int workingPaymentAmount=paymentAmount;
		int totalAmount=0;
		
		while(denominationIndex<denominations.length) {
			int denomination=denominations[denominationIndex];
			int noOfDenominations= workingPaymentAmount/denomination;
			int balanceAmount=workingPaymentAmount%denomination;
			
			if(noOfDenominations!=0) {
			System.out.printf("Denominations value %d, No of Times %d \r\n", denomination, noOfDenominations);
			System.out.println("Previous total " +totalAmount);
			totalAmount = totalAmount + (denomination * noOfDenominations);
			System.out.println("Current total " + totalAmount);
			
			}
			workingPaymentAmount=balanceAmount;
			if(workingPaymentAmount==0) {
				break;
			}
			
			denominationIndex++;	
		}
         if(workingPaymentAmount != 0) {
			
			System.out.println("Unable to provide the exact denominations");
			System.out.println("Remaining amount : " + workingPaymentAmount);
		} 
	}
	

}
