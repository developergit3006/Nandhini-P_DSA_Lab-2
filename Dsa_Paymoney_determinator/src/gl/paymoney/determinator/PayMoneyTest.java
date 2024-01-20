package gl.paymoney.determinator;

import java.util.Arrays;

public class PayMoneyTest {
	
	public static void main(String[] args) {
		test1();
		test2();
		
	}
	
	static void test1() {
		
		PayMoneyTargetDeterminator determinator= new PayMoneyTargetDeterminator();
		
		determinator.transactionList= new Integer[] {20, 21, 31};
		determinator.dailyTargetValue=21;
		System.out.printf("For transactionsList %s and for daily target %d ", Arrays.toString(determinator.transactionList), 
				determinator.dailyTargetValue);
		System.out.println();
		determinator.determineTarget();
	}

    static void test2() {
		
		PayMoneyTargetDeterminator determinator= new PayMoneyTargetDeterminator();
		
		determinator.transactionList= new Integer[] {25, 22, 40};
		determinator.dailyTargetValue=500;
		System.out.printf("For transactionsList %s and for daily target %d ", Arrays.toString(determinator.transactionList), 
				determinator.dailyTargetValue);
		System.out.println();
		determinator.determineTarget();
	}

}
