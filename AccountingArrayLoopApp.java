
public class AccountingArrayLoopApp {

	public static void main(String[] args) {
		
		double valueOfSupply = Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double vat = valueOfSupply * vatRate;
		double total = valueOfSupply + vat;
		double expense = valueOfSupply * expenseRate;
		double income = valueOfSupply - expense;
		
				
		double[] dividendRates = new double[3];
		dividendRates[0] = 0.5;
		dividendRates[1] = 0.3;
		dividendRates[2] = 0.2;
		
//		double dividend1 = income * dividendRates[0];
//		double dividend2 = income * dividendRates[1];
//		double dividend3 = income * dividendRates[2];
		
		
		System.out.println("Value of supply : "+valueOfSupply);
		System.out.println("VAT : "+ vat );
		System.out.println("Total : "+ total );
		System.out.println("Expense : "+ expense );
		System.out.println("Income : "+ income );
		
//		System.out.println("Dividend 1 : "+ dividend1);
//		System.out.println("Dividend 2 : "+ dividend2);
//		System.out.println("Dividend 3 : "+ dividend3);
		
		/*
		  	AccountingArrayApp.java에서 배웠던 해당값들은 반복이 심함. 아래의 반복문을 통해 없애겠음.	
			
			1. int로 변수값을 지정해주고,
			2. while로 변수의 범위를 설정.
			3. while 안의 변수 i의 값을 +1시킴으로써 계속해서 커지게 만듦.
			
			배열과 반복문은 함께 쓰일 때 효과가 급증함. 같이 써 주도록 하자.
			
		*/
		
		int i = 0;
		while(i < dividendRates.length) {
			System.out.println("Dividend :" + (income * dividendRates[i]) );
			i = i+1;
		}
		
	}

}
