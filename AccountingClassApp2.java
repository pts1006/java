
// 왜 안 됨 씨발 것 ~> 같은 프로젝트 내에 똑같은 클래스명이 있으면 이렇게 오류가 뜸 + 파일명에 괄호는 안 쓰는게 좋을듯

class Accounting{
	public static double valueOfSupply;
	public static double vatRate;
	public static double expenseRate;
	
	public static void print() {
		System.out.println("Value of supply : "+valueOfSupply);
		System.out.println("VAT : "+ getVAT() );
		System.out.println("Total : "+ getTotal() );
		System.out.println("Expense : "+ getExpense() );
		System.out.println("Income : "+ getIncome() );
		System.out.println("Dividend 1 : "+ getDividend1());
		System.out.println("Dividend 2 : "+ getDividend2());
		System.out.println("Dividend 3 : "+ getDividend3());
	}

	private static double getDividend1() {
		return getIncome() * 0.5;
	}
	private static double getDividend2() {
		return getIncome() * 0.3;
	}
	private static double getDividend3() {
		return getIncome() * 0.2;
	}

	private static double getIncome() {
		return valueOfSupply - getExpense();
	}

	private static double getExpense() {
		return valueOfSupply * expenseRate;
	}

	private static double getTotal() {
		return valueOfSupply + getVAT();
	}

	private static double getVAT() {
		return valueOfSupply * vatRate;
	}
	
}

// 위의 클래스는, 저번 시간에 밑에 있던 것들을 이번 시간에 위로 옮김으로서 만든 것.

public class AccountingClassApp2 {

	public static void main(String[] args) {
		
		Accounting.valueOfSupply = 20000.0;
		Accounting.vatRate = 0.1;
		Accounting.expenseRate = 0.3;
		Accounting.print();
		/*
		 	클래스를 이용함으로써 소속을 명확히 했으므로
		 	아래와 같이 다른 취지의 코드와 섞이게 돼도 괜찮게 됨
		 	또한 public class 부분의 내용이 현격히 줄어들었음.
		 	(단, 변수값 앞에 위와 같이 Accounting.을 붙여야함.)
		
		 */ 
		// anotherVariable = ...;
		// anotherMethod = ...;
		
	}

}
