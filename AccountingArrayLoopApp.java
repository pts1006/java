
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
		  	AccountingArrayApp.java���� ����� �ش簪���� �ݺ��� ����. �Ʒ��� �ݺ����� ���� ���ְ���.	
			
			1. int�� �������� �������ְ�,
			2. while�� ������ ������ ����.
			3. while ���� ���� i�� ���� +1��Ŵ���ν� ����ؼ� Ŀ���� ����.
			
			�迭�� �ݺ����� �Բ� ���� �� ȿ���� ������. ���� �� �ֵ��� ����.
			
		*/
		
		int i = 0;
		while(i < dividendRates.length) {
			System.out.println("Dividend :" + (income * dividendRates[i]) );
			i = i+1;
		}
		
	}

}
