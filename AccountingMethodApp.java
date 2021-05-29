
public class AccountingMethodApp {
// 메소드를 이용해 정리한 것인데, 어떻게 변한 건지는 AccountingApp.java와 비교해서 알아 볼 것.
	public static double valueOfSupply;
	public static double vatRate;
	public static double expenseRate;

	public static void main(String[] args) {
		
		valueOfSupply = 10000.0;
		vatRate = 0.1;
		expenseRate = 0.3;
		print();
		//여기서 만약 수익이 필요하다.) 그럼 이 자리에 getIncome(); 라는 메소드를 호출함으로서 수익을 가져올 수 있다.
		
	}

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
