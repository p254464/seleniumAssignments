package week3.day1;

public class BankInfo {
	public void savings() {
		System.out.println("Savings interest is 5%");
		
	}
	public void fixed() {
		System.out.println("Fixed Deposit Interest is 7%");
		
	}

	public void deposit() {
		System.out.println("Deposit Interest is 8%");
		
	}
	public static void main(String[] args) {
		BankInfo Bank=new BankInfo();
		Bank.deposit();
	}

}
