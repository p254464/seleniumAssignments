package week3.day1;

public class AxisBank extends BankInfo{
	public void deposit() {
		System.out.println("Deposit Interest in Axis is 9%");
		
	}

	public static void main(String[] args) {
		AxisBank Axis=new AxisBank();
		Axis.deposit();
		Axis.fixed();
		Axis.savings();
		

	}

}
